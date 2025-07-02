package player;

public class SmartPhone implements VideoPlayer, MusicPlayer {

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone tocando musica");
	}

	@Override
	public void pauseMusic() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone pausando a musica");	
	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone parando a musica");
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone reproduzindo o video");
	}

	@Override
	public void pauseVideo() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone pausando o video");
	}

	@Override
	public void stopVideo() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone parando o video");
	}

}
