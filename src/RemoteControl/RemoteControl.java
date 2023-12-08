package RemoteControl;

public interface RemoteControl {
	//public 추상 메소드
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
	void setMute(boolean mute);
	
	// 상수 필드
	int Max_Volume = 10;
	int Min_Volume = 0;
	
}
