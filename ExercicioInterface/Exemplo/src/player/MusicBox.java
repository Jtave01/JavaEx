package player;

public class MusicBox implements MusicPlayer {

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("A box esta tocando musica");

	}

	@Override
	public void pauseMusic() {
		// TODO Auto-generated method stub
		System.out.println("A box esta pausando musica");
	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println("A box esta parando musica");
	}

}
