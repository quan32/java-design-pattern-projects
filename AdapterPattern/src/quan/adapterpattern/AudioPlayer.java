package quan.adapterpattern;

public class AudioPlayer implements MediaPlayer{
	private MediaAdapter mediaAdapter;

	public void play(String type, String name) {
		if(type.equalsIgnoreCase("Mp3")) {
			new Mp3Player().playMp3(name);
		} else {
			mediaAdapter = new MediaAdapter(type);
			mediaAdapter.play(type,name);
		}
	}
	
}
