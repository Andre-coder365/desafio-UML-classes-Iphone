package usuario;

import celular.Iphone;
import apps.internet.NavegadorInternet;
import apps.musica.MusicPlayer;
import apps.musica.ReprodutorMusical;
import apps.internet.Safari;

public class Usuario {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.ligar();
	
		ReprodutorMusical mp = new MusicPlayer();
		mp.tocar();
		
		NavegadorInternet sf = new Safari();
		sf.exibirPagina();		
		
	}

}
