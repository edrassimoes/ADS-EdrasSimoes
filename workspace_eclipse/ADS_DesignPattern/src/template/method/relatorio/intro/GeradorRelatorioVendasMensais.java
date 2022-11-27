package template.method.relatorio.intro;

import java.util.List;

public class GeradorRelatorioVendasMensais {
	
	private String getCabecalho(){
		
		String cabecalho = "Empresa My" + '\n' + "----------";
		
		return cabecalho;
	}
	
	private String getRodape(){
		
		String rodape = "------------------------------" + '\n' + "* Propriedade particular - Uso confidencial";
		
		return rodape;
		
	}
	
	private List<String> getConteudo(Integer ano, Integer mes){

        List<String> conteudo = ServicoDeRelatorio.getInstance().getVendasMensal(ano,mes);

        return conteudo;

    }
	
	public String criarPagina(Integer ano, Integer mes) {
		String cabecalho = getCabecalho();
		List<String> conteudo = getConteudo(ano,mes);
		String rodape = getRodape();
		
		StringBuffer bufferPagina = new StringBuffer();
		
		for(String linha : conteudo) {
			bufferPagina.append('\n');
			bufferPagina.append(linha);			
		}
		bufferPagina.append('\n');
		
		bufferPagina.append(rodape);
		
		return bufferPagina.toString();	
		
	}
	
	
}
