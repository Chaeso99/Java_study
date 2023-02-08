package Talk;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TalkClient extends JFrame 
implements ActionListener, Runnable 
{
	JPanel p1, p2;
	JButton  listBtn, msgBtn, saveBtn,  sendBtn;
	JTextField sendTf;
	TextArea ta;
	List chatList;
	Socket sock;
	BufferedReader in;
	PrintWriter out;
	String title = "Talk 1.0";
	String listTitle = "*****CHAT LIST*****";
	boolean flag = false;
	String id;
	String label[] = {"MLIST", "MESSAGE","SEND","SAVE"};
	MsgAWT3 msgAWT3;
	public TalkClient(BufferedReader in, PrintWriter out, String id) 
	{
		setSize(450, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.in=in;
		this.out=out;
		this.id=id;
		setTitle("Talk1.0"+":"+id);
		ta = new TextArea();
		ta.setBackground(Color.WHITE);
		ta.setForeground(Color.BLACK);
		ta.setEditable(false);
		add(BorderLayout.CENTER, ta);
		///////////////////////////////////////////
		p1 = new JPanel(); //ȭ�� ���� �г�
		p1.setBackground(new Color(100,200,100)); 
		p1.add(saveBtn = new JButton("Save")); //ȭ�� ���� save ��ư
		///////////////////////////////////////////
		p2 = new JPanel(); //ȭ�� �Ʒ��� �г�
		p2.setBackground(new Color(100,200,100));
		p2.add(new Label("CHAT ",Label.CENTER));
		p2.add(sendTf= new JTextField("",15)); //ȭ�� �Ʒ��� �ؽ�Ʈ �ʵ�
		p2.add(sendBtn = new JButton("SEND"));	 //ȭ�� �Ʒ��� send ��ư
		///////////////////////////////////////////
		sendTf.addActionListener(this);
		sendTf.addActionListener(this);
		saveBtn.addActionListener(this);
		sendBtn.addActionListener(this);
		///////////////////////////////////////////
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);
		setVisible(true);
		validate();
	}
	
	public void run() 
	{
		try 
		{
			while(true) 
			{
				String line = in.readLine();
				if(line==null)
					 break;
				else
					routine(line);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}//--run
	
	public void actionPerformed(ActionEvent e) 
	{
		Object obj = e.getSource();
		if(obj==saveBtn/*save*/) 
		{
			String content = ta.getText();
			//1970��1��1�� ~������� 1/1000�� ������ ���
			long fileName = System.currentTimeMillis();
			try 
			{
				FileWriter fw = new FileWriter("Talk/"+fileName+".txt");
				fw.write(content);
				fw.close();
				ta.setText("");
				new MDialog(this, "Save", "��ȭ������ �����Ͽ����ϴ�.");
			}
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}
		else if(obj==listBtn) 
		{
			sendMessage(TalkProtocol.MSGLIST+TalkProtocol.MODE+id);
		}
		else if(obj==msgBtn/*message*/) 
		{
			int i = chatList.getSelectedIndex();
			if(i==-1||i==0) 
			{
				new MDialog(this, "�˸�", "���̵� �����ϼ���.");
			}
			else 
			{
				new Message("TO");
			}
		}
		else if(obj==sendBtn ||obj==sendTf) 
		{
			String str = sendTf.getText().trim();
			if(filterMgr(str)) 
			{
				new MDialog(this, "���", "�Է��Ͻ� ���ڴ� �������Դϴ�.");
				return;
			}
			else 
			{
				if(str.length()==0)
				{
					return; //������ �������� �ʰ� �޼��� ��������
				}
			sendMessage(TalkProtocol.CHATALL+TalkProtocol.MODE+str);
			ta.append("["+id+"]: "+str+"\n");
			sendTf.setText("");
			sendTf.requestFocus();
			}
		}
	}//--actionPerformed

	public void routine(String line) 
	{
		int idx = line.indexOf(TalkProtocol.MODE);
		String cmd = line.substring(0, idx);
		String data = line.substring(idx+1);
		if(cmd.equals(TalkProtocol.CHATLIST)) 
		{
			chatList.removeAll();
			chatList.add(listTitle);
			StringTokenizer st = new StringTokenizer(data, ";");
			while(st.hasMoreTokens()) 
			{
				chatList.add(st.nextToken());
			}
		}
		else if(cmd.equals(TalkProtocol.CHAT)||cmd.equals(TalkProtocol.CHATALL))
		{
			ta.append(data+"\n");
		}
		else if(cmd.equals(TalkProtocol.MESSAGE))
		{
			idx = data.indexOf(';');
			cmd = data.substring(0,idx);
			data = data.substring(idx+1);
			new Message("FROM", cmd, data);
		}
		else if(cmd.equals(TalkProtocol.MSGLIST))
		{
			msgAWT3 = new MsgAWT3(this, data);
		}
	}//--routine
	
	public void sendMessage(String msg) 
	{
		out.println(msg);
	}

	public boolean filterMgr(String msg)
	{
		boolean flag = false;//false�̸� ������ �ƴ�
		String str[] = {"�ٺ�","������","����","�ڹ�","java"};
		//msg : ���� ȣȣ ����
		StringTokenizer st = new StringTokenizer(msg);//�����ϸ� �����ڴ� ����
		String msgs[] = new String[st.countTokens()];
		for (int i = 0; i < msgs.length; i++) 
		{
			msgs[i] = st.nextToken();
		}
		for (int i = 0; i < str.length; i++) 
		{
			if(flag) break;//ù��° for�� ��������.
			for (int j = 0; j < msgs.length; j++) 
			{
				if(str[i].equalsIgnoreCase(msgs[j])) 
				{
					flag = true;
					break; //�ι�° for�� ��������.
				}//if
			}//for2
		}//for1
		return flag;
	}
	
	class Message extends Frame implements ActionListener 
	{

		Button send, close;
		TextField name;
		TextArea ta;
		String mode;// to/from
		String id;

		public Message(String mode) 
		{
			setTitle("����������");
			this.mode = mode;
			id = chatList.getSelectedItem();
			layset("");
			validate();
		}
		public Message(String mode, String id, String msg) 
		{
			setTitle("�����б�");
			this.mode = mode;
			this.id = id;
			layset(msg);
			validate();
		}
		public void layset(String msg) {
			 addWindowListener(new WindowAdapter() 
			 {
				   public void windowClosing(WindowEvent e) 
				   {
				    dispose();
				   }
			});
			Panel p1 = new Panel();
			p1.add(new Label(mode, Label.CENTER));
			name = new TextField(id, 20);
			p1.add(name);
			add(BorderLayout.NORTH, p1);
			
			ta = new TextArea("");
			add(BorderLayout.CENTER, ta);
			ta.setText(msg);
			Panel p2 = new Panel();
			if (mode.equals("TO")) 
			{
				p2.add(send = new Button("send"));
				send.addActionListener(this);
			}
			p2.add(close = new Button("close"));
			close.addActionListener(this);
			add(BorderLayout.SOUTH, p2);
			
			setBounds(200, 200, 250, 250);
			setVisible(true);
		}

		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==send)
			{
				sendMessage(TalkProtocol.MESSAGE+
						":"+id+";"+ ta.getText());
			}
			setVisible(false);
			dispose();
		}
	}

	class MDialog extends Dialog implements ActionListener
	{
		Button ok;
		TalkClient ct3;
		
		public MDialog(TalkClient ct3,String title, String msg) 
		{
			super(ct3, title, true);
			this.ct3 = ct3;
			 //////////////////////////////////////////////////////////////////////////////////////////
			   addWindowListener(new WindowAdapter() 
			   {
			    public void windowClosing(WindowEvent e) 
			    {
			     dispose();
			    }
			   });
			   /////////////////////////////////////////////////////////////////////////////////////////
			   setLayout(new GridLayout(2,1));
			   Label label = new Label(msg, Label.CENTER);
			   add(label);
			   add(ok = new Button("Ȯ��"));
			   ok.addActionListener(this);
			   layset();
			   setVisible(true);
			   validate();
		}
		
		public void layset() 
		{
			int width = 200;
			int height = 100;
			setSize(width, height);
			setLocationRelativeTo(ct3);
			setVisible(true);
		}

		public void actionPerformed(ActionEvent e) 
		{
			sendTf.setText("");
			dispose();
		}
	}
}
