package RemoteControl;

public class RemoteControl_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		
		//rc 변수에 Television 객체를 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(8);
		rc.setVolume(-1);
		rc.turnOff();
		
		//rc 변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
	}

}
