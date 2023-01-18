package awt;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.Console;
import java.awt.event.ItemListener;

public class Choice_Ex3 extends MFrame
implements ItemListener{

	Choice name, star;
	String ms[] = {"�� ��","�� ��","�̹�ȣ","�����","����","������"};
	String fs[] = {"��ƶ�","�̿���","���ϴ�","��ä��","�� ��","�迬��"};
	
	public Choice_Ex3() {
		name = new Choice();
		name.add("���ڿ�����");
		name.add("���ڿ�����");
		star = new Choice();
//		for (int i = 0; i < ms.length; i++) {
//			star.add(ms[i]);
//		}
		inputItem(star, ms);
		add(name);
		add(star);
		name.addItemListener(this);
	}
	
	public void inputItem(Choice c, String item[])
	{
		c.removeAll(); //���� ������ ����
		
		//������ �߰�
		for (int i = 0; i < item.length; i++) {
			c.add(item[i]);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		//�������� name�� "���ڿ�����" ���� �˻�->���ڿ����� ��� inputItem
		if (name.getSelectedItem().equals("���ڿ�����")) {
			inputItem(star, ms);
		} 
		//�������� name�� "���ڿ�����" ���� �˻�->���ڿ����� ��� inputItem
		else if (name.getSelectedItem().equals("���ڿ�����")) {
			inputItem(star, fs);
		}
	}

	public static void main(String[] args) {
		new Choice_Ex3();
	}

}
