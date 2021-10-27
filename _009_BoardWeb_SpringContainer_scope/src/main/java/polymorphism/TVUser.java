package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//0. applicationCon���ٰ� bin��ü ����
		
		//1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
	
		//2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Look Up)�Ѵ�.
		// lookup�ϴ� ���� �����̵Ǽ� �츮�� ���� ��ü�� ����ְԵ� (��ü�� ����ϱ����� ����)
		
		//lazy-init Ư¡ �˾ƺ���
		
		//1�� ���
		//TV tv = (TV)factory.getBean("tv"); // �ּ�ó�� �� ��� ���� �� �ƹ��͵� �ȶ�
		// ������� ��û�� ���� ������
		
		//2�� ���
//		TV tv = (TV)factory.getBean("tv");
		//����κ� �ּ� ���� �� �����ϸ� ��ü ������ ���� �� �� ���� 
		//������� ��û�� �־��� ������ ��ü�� �� ������ ����
		
		//scope�� singleton���� ���� �� �ϳ��� ��ü�� ����
		//prototype���� ���� �� ��û���� ���� ��ŭ ���� ������
		TV tv1 = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv");
		TV tv3 = (TV)factory.getBean("tv");
		
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		//3. Spring �����̳ʸ� �����Ѵ�.
		factory.close(); //�����̳ʿ� �Բ� ��ü�� ������
	}
}
