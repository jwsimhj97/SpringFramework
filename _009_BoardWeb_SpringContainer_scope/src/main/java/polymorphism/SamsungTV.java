package polymorphism;

public class SamsungTV implements TV {
	
	//������ �����
	public SamsungTV() {
		System.out.println("====> SamsungTV ��ü ����");
	}
	
	//initMethod() �ʱ�ȭ �۾� ����
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��...");
	}
	
	//destroyMethod() ��ü ������ ó���� ����
		public void destroyMethod() {
			System.out.println("��ü ������ ó���� ����...");
		}
	
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
	}
}
