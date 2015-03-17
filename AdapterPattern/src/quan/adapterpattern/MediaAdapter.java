package quan.adapterpattern;

public class MediaAdapter implements MediaPlayer{

	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String type) {
		if(type.equalsIgnoreCase("Mp4")) {
			advancedMediaPlayer = new Mp4Player();
		} else {
			advancedMediaPlayer = new VlcPlayer();
		}
	}
	
	public void play(String type, String name) {
		if(type.equalsIgnoreCase("Mp4")) {
			advancedMediaPlayer.playMp4(name);
		} else {
			advancedMediaPlayer.playVlc(name);
		}
	}
}
