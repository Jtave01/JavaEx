package main;
import player.*;
public class Main {
		public static void main(String[] agrs) {
		
			runMusic(new Computer());
			runVideo(new Computer()); 
	}
		
		public static void runVideo(VideoPlayer videoplayer) {
			videoplayer.playVideo();
		}
		public static void runMusic(MusicPlayer musicplayer) {
			musicplayer.playMusic();
		}
}
