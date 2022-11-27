package templatemethod.relatorio.refatorado;

import java.util.List;

import template.method.relatorio.intro.ServicoDeRelatorio;

public class GeradorRelatorioVendasAnuais extends GeradorRelatorioTemplate {
	
	private Integer ano;
	
	
	public GeradorRelatorioVendasAnuais(Integer ano) {
		this.ano = ano;
		
	}

	@Override
	public List<String> getConteudo() {
		List<String> vendasAnual = ServicoDeRelatorio.getInstance().getVendasAnual(ano);
		return vendasAnual;		
	}
}
