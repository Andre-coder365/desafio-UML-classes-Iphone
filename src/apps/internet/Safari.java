package apps.internet;

public class Safari implements NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Safari: EXIBINDO PAGINA WEB");		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Safari: ADICIONANDO NOVA ABA WEB");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Safari: ATUALIZANDO PAGINA WEB");		
	}
}

