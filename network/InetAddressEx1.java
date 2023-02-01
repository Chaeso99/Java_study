package network;

import java.net.InetAddress;

public class InetAddressEx1 {

	public static void main(String[] args) {
		try {
			//ip 및 도메인 객체화
			InetAddress add = InetAddress.getLocalHost();
			System.out.println("Host name : "+ add.getHostName()); //DESKTOP-FFS5E59
			System.out.println("Host Address : "+ add.getHostAddress()); //ip주소:113.198.238.101
			add = InetAddress.getByName("auction.co.kr");
			
			System.out.println("auction address : " + add.getHostAddress());
			InetAddress adds[] = InetAddress.getAllByName("naver.com");
			for (int i = 0; i < adds.length; i++) {
				System.out.println("naver : " + adds[i]);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}