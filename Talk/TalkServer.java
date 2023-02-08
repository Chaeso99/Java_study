package Talk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class TalkServer
{
	Vector<ClientThread3> vc;
	ServerSocket server;
	int port = 8003;
	TalkMgr mgr;

	public TalkServer() 
	{
		try 
		{
			vc = new Vector<ClientThread3>();
			server = new ServerSocket(port);
			mgr = new TalkMgr();
		} 
		catch (Exception e) 
		{
			System.err.println("Error in Server");
			e.printStackTrace();
			System.exit(1);
		}
		System.out.println("****************************************");
		System.out.println("*Welcome Talk Server 1.0...");
		System.out.println("*Ŭ���̾�Ʈ ������ ��ٸ��� �ֽ��ϴ�.");
		System.out.println("****************************************");
		try 
		{
			while (true) 
			{
				Socket sock = server.accept();
				ClientThread3 ct = new ClientThread3(sock);
				ct.start();
				vc.addElement(ct);
			}
		} 
		catch (Exception e) 
		{
			System.err.println("Error in Socket");
			e.printStackTrace();
		}
	}

	public void sendAllMessage(String msg) 
	{
		for (int i = 0; i < vc.size(); i++) 
		{
			ClientThread3 ct = vc.elementAt(i);
			ct.sendMessage(msg);
		}
	}

	public void removeClient(ClientThread3 ct) 
	{
		vc.remove(ct);
	}

	// ���ӵ� ��� id ����Ʈ ���� ex) aaa;bbb;ccc;ddd;ȫ�浿;
	public String getIdList() 
	{
		String ids = "";
		for (int i = 0; i < vc.size(); i++) 
		{
			ClientThread3 ct = vc.get(i);
			ids += ct.id + ";";
		}
		return ids;
	}

	// �Ű����� id������ ClientThread3�� �˻�
	public ClientThread3 findClient(String id) 
	{
		ClientThread3 ct = null;
		for (int i = 0; i < vc.size(); i++) 
		{
			ct = vc.get(i);
			if (ct.id.equals(id)) 
			{// �Ű����� id�� Client�� id�� ���ٸ�...
				break;
			}
		} // --for
		return ct;
	}// --findClient

	class ClientThread3 extends Thread 
	{
		Socket sock;
		BufferedReader in;
		PrintWriter out;
		String id = "�͸�";

		public ClientThread3(Socket sock) 
		{
			try 
			{
				this.sock = sock;
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter((sock.getOutputStream()), true);
				System.out.println(sock + " ���ӵ�...");
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

		@Override
		public void run() 
		{
			try 
			{
				while (true) 
				{
					String line = in.readLine();
					if (line == null)
						break;
					else
						routine(line);
				}
			} 
			catch (Exception e) 
			{
				removeClient(this);
				System.err.println(sock + "[" + id + "] ������...");
			}
		}

		public void routine(String line) 
		{
			System.out.println("line:" + line);
			int idx = line.indexOf(TalkProtocol.MODE);
			String cmd = line.substring(0, idx); 
			String data = line.substring(idx + 1); 
			
			if (cmd.equals(TalkProtocol.ID)) 
			{
				idx = data.indexOf(';');
				cmd = data.substring(0, idx);
				data = data.substring(idx+1);
				if(mgr.loginChk(cmd, data))
				{
					ClientThread3 ct = findClient(cmd);
					if(ct!=null&&ct.id.equals(cmd))
					{
						sendMessage(TalkProtocol.ID+TalkProtocol.MODE+"C"); 
					}
					else
					{
						id = cmd;
						sendMessage(TalkProtocol.ID+TalkProtocol.MODE+"T"); 
						sendAllMessage(TalkProtocol.CHATLIST+TalkProtocol.MODE
								+getIdList()); 
						sendAllMessage(TalkProtocol.CHATALL+TalkProtocol.MODE
								+"["+id+"] ���� �����Ͽ����ϴ�."); 
					}
				}
				else
				{
					sendMessage(TalkProtocol.ID+TalkProtocol.MODE+"F"); 
				}
			} 
			else if (cmd.equals(TalkProtocol.CHAT)) 
			{
				idx = data.indexOf(';');
				cmd= data.substring(idx);
				data = data.substring(idx + 1);
	
				ClientThread3 ct = findClient(cmd);
				if (ct != null) 
				{
					ct.sendMessage(TalkProtocol.CHAT + TalkProtocol.MODE 
							+ "[" + id + "(S)]" + data);
																			
					sendMessage(TalkProtocol.CHAT + TalkProtocol.MODE 
							+ "[" + id + "(S)]" + data); 
				} 
				else 
				{
					sendMessage(TalkProtocol.CHAT + TalkProtocol.MODE + "[" + cmd + "]���� �����ڰ� �ƴմϴ�.");
				}

			} 
			else if (cmd.equals(TalkProtocol.CHATALL)) 
			{
				sendAllMessage(TalkProtocol.CHATALL + TalkProtocol.MODE + "[" + id + "]" + data);
			} 
			else if (cmd.equals(TalkProtocol.MESSAGE)) 
			{
				idx = data.indexOf(';');
				cmd = data.substring(0, idx);
				data = data.substring(idx+1);
				ClientThread3 ct = findClient(cmd);
				if(ct!=null) 
				{
					MessageBean3 bean = new MessageBean3();
					bean.setFid(id);
					bean.setTid(cmd);
					bean.setMsg(data);
					mgr.insertMsg(bean);
					ct.sendMessage(TalkProtocol.MESSAGE+
							TalkProtocol.MODE+id+";"+data);
				}
				else 
				{
					sendMessage(TalkProtocol.CHAT+
							TalkProtocol.MODE+"["+cmd+"]���� �����ڰ� �ƴմϴ�");
				}
			}
			else if (cmd.equals(TalkProtocol.MSGLIST)) 
			{
				Vector<MessageBean3> vlist = mgr.getMsgList(id);
				String str = "";
				
				for (int i = 0; i < vlist.size(); i++) 
				{
					MessageBean3 bean = vlist.get(i);
					str+=bean.getFid()+',';
					str+=bean.getTid()+',';
					str+=bean.getMsg()+';';
				}
				sendMessage(TalkProtocol.MSGLIST+TalkProtocol.MODE+str);
			}
		}

		public void sendMessage(String msg) 
		{
			out.println(msg);
		}
	}

	public static void main(String[] args) 
	{
		new TalkServer();
	}
}
