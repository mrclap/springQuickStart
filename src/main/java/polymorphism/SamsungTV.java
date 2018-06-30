package polymorphism;

public class SamsungTV implements TV{
	private SonySpeaker speaker;
	private int price;
	
	public void initMethod() {
		System.out.println("SamsungTV---객체 초기화 작업 처리...");
	}
	
	public void destoryMethod() {
		System.out.println("SamsungTV---객체 삭제 전 처리할 로직...");
	}
	
	public SamsungTV() {
		System.out.println("==> SamsungTV(1)--- 객체 생성");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("==> SamsungTV(2)--- 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("==> SamsungTV(3)--- 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---전원을 켠다. (가격 : " + price + ")");
		
	}
	public void powerOff() {
		System.out.println("SamsungTV---전원을 끈다");
	}
	public void volumeUp() {
		speaker.volumUp();
//		System.out.println("SamsungTV---소리를 올린다");
	}
	public void volumeDown() {
		speaker.volumeDown();
//		System.out.println("SamsungTV---소리를 내린다");
	}
}
