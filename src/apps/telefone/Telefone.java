package apps.telefone;

public class Telefone implements AparelhoTelefonico {

	@Override
	public void ligar() {
			System.out.println("Telefone: FAZENDO LIGACAO");		
	}

	@Override
	public void atender() {
		System.out.println("Telefone: ATENDENDO LIGACAO");		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Telefone: INICIANDO CORREIO DE VOZ");		
	}

}
