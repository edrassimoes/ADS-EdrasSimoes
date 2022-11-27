package templatemethod.relatorio.refatorado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeradorRelatorioTemplateTest {

	@Test
	void deveGerarRelatorioVendasMensaisPeloTemplate() {
		
		GeradorRelatorioTemplate template = new GeradorRelatorioVendasMensais(2022,10);
		
		String pagina = template.criarPagina();
		
		System.out.println(pagina);		
	}
	
	@Test
	void deveGerarRelatorioVendasAnuaisPeloTemplate() {
		
		GeradorRelatorioTemplate template = new GeradorRelatorioVendasAnuais(2022);

		String pagina = template.criarPagina();

		System.out.println(pagina);
	}
}
