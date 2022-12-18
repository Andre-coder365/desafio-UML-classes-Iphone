package celular;

import apps.internet.NavegadorInternet;
import apps.musica.ReprodutorMusical;
import apps.telefone.AparelhoTelefonico;



public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Iphone: EXIBINDO PAGINA WEB");		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Iphone: ADICIONANDO NOVA ABA WEB");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Iphone: ATUALIZANDO PAGINA WEB");				
	}

	@Override
	public void tocar() {
		System.out.println("Iphone: TOCAR MUSICA");		
	}

	@Override
	public void pausar() {
		System.out.println("Iphone: PAUSAR MUSICA");		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Iphone: SELECIONAR MUSICA");		
	}

	@Override
	public void ligar() {
		System.out.println("Iphone: FAZENDO LIGACAO");		
	}

	@Override
	public void atender() {
		System.out.println("Iphone: ATENDENDO LIGACAO");		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iphone: INICIANDO CORREIO DE VOZ");		
	}
}
