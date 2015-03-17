package quan.adapterpattern;

public class VlcPlayer implements AdvancedMediaPlayer{

	public void playVlc(String name) {
		System.out.println("VlcPlayer::"+name);
	}
	
	public void playMp4(String name){}
}
