package apps.musica;

public class MusicPlayer implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("MusicPlayer: TOCANDO MUSICA");		
	}

	@Override
	public void pausar() {
		System.out.println("MusicPlayer: PAUSANDO MUSICA");		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("MusicPlayer: SELECIONANDO MUSICA");		
	}
}
