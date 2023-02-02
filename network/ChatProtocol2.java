package network;

public class ChatProtocol2 {

	//ID, CHAT, CHATALL, MESSAGE, CHATLIST
	
	//(Client->Server) ID:aaa
	//(Server->Client) CHATLIST:aaa;bbb;ccc;홍길동
	public static final String ID = "ID";
	
	//(C->S) CHAT:받는아이디;메시지 ex)CHAT:bbb;밥먹자
	//(S->C) CHAT:보내는아이디;메시지 ex)CHAT:aaa;밥먹자
	public static final String CHAT = "CHAT";
	
	//(C->S)CHATALL:메시지
	//(S->C)CHATALL:[보내는아이디]메시지
	public static final String CHATALL = "CHATALL";
	
	//(C->S)MESSAGE:받는아이디;쪽지내용 ex)MESSAGE:bbb;밥먹자
	//(S->C)MESSAGE:보내는아이디;쪽지내용 ex)MESSAGE:aaa;밥먹자
	public static final String MESSAGE = "MESSAGE";
	
	//(S->C) CHATLIST:aaa;bbb;ccc;홍길동;
	public static final String CHATLIST = "CHATLIST";
	
	public static final String MODE = ":";
}