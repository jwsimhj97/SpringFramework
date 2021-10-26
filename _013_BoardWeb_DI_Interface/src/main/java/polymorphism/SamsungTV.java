package polymorphism;

public class SamsungTV implements TV {
	//�ҴϽ���Ŀ ��ü ����
	private Speaker speaker;
	private int price;
	
	//������ �����
	public SamsungTV() {
		System.out.println("====> SamsungTV ��ü(1) ����");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("====> SamsungTV ��ü(2) ����");
		this.speaker = speaker; // �� ��ü�� �߰����־��⶧���� �ڵ����� �ҴϽ���Ŀ�� �־���
	}
	
	public SamsungTV(Speaker speaker, int price){
		System.out.println("====> SamsungTV ��ü(3) ����");
		this.speaker = speaker; // �� ��ü�� �߰����־��⶧���� �ڵ����� �ҴϽ���Ŀ�� �־���
		this.price = price; //�ҴϽ���Ŀ�� 0��°, ������ 1��° �ε����� ��
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
		System.out.println("SamsungTV---���� �Ҵ�. (���� : " + price + ")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}
	
	public void volumeUp() {
//		speaker = new SonySpeaker();
		speaker.volumeUp();
//		System.out.println("SamsungTV---�Ҹ� �ø���.");
	}
	
	public void volumeDown() {
//		speaker = new SonySpeaker();
		speaker.volumeDown();
//		System.out.println("SamsungTV---�Ҹ� ������.");
	}
}
