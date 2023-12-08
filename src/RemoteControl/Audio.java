package RemoteControl;

public class Audio implements RemoteControl{
	private int volume;
	private int memoryVolume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	public void setVolume(int volume){
		if(volume>= RemoteControl.Max_Volume) {
			this.volume = RemoteControl.Max_Volume;
		} else if(volume <= RemoteControl.Min_Volume) {
			this.volume = RemoteControl.Min_Volume;
		} else {
			this.volume = volume;
		}
		System.out.printf("볼륨이 [%d]로 바뀌었습니다.\n", this.volume);
	}
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.Min_Volume);
		} else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume);
		}
	}
}
