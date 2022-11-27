package template.method.relatorio.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeradorRelatorioVendasAnuaisTest {

	@Test
	void deveGerarRelatorioVendasAnuais() {
		GeradorRelatorioVendasAnuais gerador = new GeradorRelatorioVendasAnuais();
		
		String pagina = gerador.criarPagina(2022);
		
		System.out.println(pagina);	
	}

}
