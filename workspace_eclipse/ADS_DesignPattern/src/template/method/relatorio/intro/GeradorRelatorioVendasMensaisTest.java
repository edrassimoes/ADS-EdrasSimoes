package template.method.relatorio.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeradorRelatorioVendasMensaisTest {

	@Test
	void deveGerarRelatorioVendasMensais() {
		GeradorRelatorioVendasMensais gerador = new GeradorRelatorioVendasMensais();
		
		String pagina = gerador.criarPagina(2022, 10);
		
		System.out.println(pagina);	
	}
}
