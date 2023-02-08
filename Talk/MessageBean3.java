package Talk;

public class MessageBean3 
{
	private int no; //번호(자동증가)
	private String fid; //보낸 아이디
	private String tid; //받은 아이디
	private String msg; //내용
	private String mdate; //날짜
	
	public int getNo() 
	{
		return no;
	}
	public void setNo(int no) 
	{
		this.no = no;
	}
	
	public String getFid() 
	{
		return fid;
	}
	public void setFid(String fid) 
	{
		this.fid = fid;
	}
	
	public String getTid() 
	{
		return tid;
	}
	public void setTid(String tid) 
	{
		this.tid = tid;
	}
	
	public String getMsg() 
	{
		return msg;
	}
	public void setMsg(String msg) 
	{
		this.msg = msg;
	}
	
	public String getMdate() 
	{
		return mdate;
	}
	public void setMdate(String mdate) 
	{
		this.mdate = mdate;
	}
}
