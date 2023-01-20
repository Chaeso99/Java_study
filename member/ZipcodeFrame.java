package member;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ZipcodeFrame extends MFrame
implements ActionListener{

	JLabel label;
	JButton searchBtn, selectBtn;
	List list;
	TextField tf;
	JPanel p1,p2;
	MemberMgr mgr;
	DialogBox err;
	
	public ZipcodeFrame() {
		super(300,500);
		setTitle("ZipcodeFrame");
		mgr = new MemberMgr();
		p1=new JPanel();
		p1.setBackground(Color.LIGHT_GRAY);
		p1.add(label = new JLabel ("도로명 : ",label.CENTER));
		p1.add(tf = new TextField("밤고개로",15));
		p1.add(searchBtn = new JButton("검색"));
		tf.addActionListener(this);
		searchBtn.addActionListener(this);
		//////////////////////////////////////
		list = new List();
		list.addActionListener(this); //List는 더블클릭하면 액션이벤트임
		//////////////////////////////////////
		p2=new JPanel();
		p2.add(selectBtn = new JButton("선택"));
		selectBtn.addActionListener(this);
		p2.setBackground(Color.LIGHT_GRAY);
		add(p1,BorderLayout.NORTH);
		add(list,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		tf.requestFocus();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==tf||obj==searchBtn)
		{
			if(list.getItemCount()!=0) {removeAll();}
			Vector<ZipcodeBean> vlist = mgr.zipcodeSearch(tf.getText());
			//System.out.println(vlist.size());
			if(vlist.isEmpty())
			{
				if(err==null)
					err = new DialogBox(this, "검색 결과가 없습니다.", "알림");
				else
					err.setVisible(true);
			}
			else
			{
				for (int i = 0; i < vlist.size(); i++) {
					ZipcodeBean bean = vlist.get(i);
					String str = bean.getZipcode() + " ";
					str += bean.getArea1() + " ";
					str += bean.getArea2() + " ";
					str += bean.getArea3() + " ";
					list.add(str);
				}
			}
		}else if(obj==list) {
			//더블클릭하면 호출한 Frame으로 주소 전달
		}
	}
	
	public static void main(String[] args) {
		new ZipcodeFrame();
	}
}
