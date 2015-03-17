package quan.adapterpattern;

public class Mp4Player implements AdvancedMediaPlayer{

	public void playMp4(String name) {
		System.out.println("Mp4Player::"+ name);
	}
	
	public void playVlc(String name){}
	
}
