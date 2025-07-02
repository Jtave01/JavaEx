package player;

public class Computer implements VideoPlayer, MusicPlayer {

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Computador tocando musica");
	}

	@Override
	public void pauseMusic() {
		// TODO Auto-generated method stub
		System.out.println("Computador pausando a musica");	
	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println("COmputador parando a musica");
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("Computador reproduzindo o video");
	}

	@Override
	public void pauseVideo() {
		// TODO Auto-generated method stub
		System.out.println("Computador pausando o video");
	}

	@Override
	public void stopVideo() {
		// TODO Auto-generated method stub
		System.out.println("Computador parando o video");
	}

}
