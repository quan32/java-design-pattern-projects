package quan.adapterpattern.test;

import quan.adapterpattern.AudioPlayer;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("Vlc", "quan.vlc");
	}
}
