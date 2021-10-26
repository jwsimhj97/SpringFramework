package polymorphism;

public class SamsungTV implements TV {
	//�ҴϽ���Ŀ ��ü ����
	SonySpeaker speaker;
	
	
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
		speaker = new SonySpeaker();
		speaker.volumeUp();
//		System.out.println("SamsungTV---�Ҹ� �ø���.");
	}
	
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
//		System.out.println("SamsungTV---�Ҹ� ������.");
	}
}
