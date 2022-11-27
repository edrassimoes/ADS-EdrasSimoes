package state.artigo;

import java.time.LocalDate;

public class EstadoRevisando implements Estado {
	
	public Artigo artigo;

	public EstadoRevisando(Artigo artigo) {
		this.artigo = artigo;
	}

	@Override
	public void publicar() {
		
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		if(seguranca.ehUsuarioModerador()) {
			//this.estado = "APROVADO";
			this.artigo.transitarEstadoPara(new EstadoAprovado(artigo));
			this.artigo.getLogHistorico().add("Transitando para APROVADO em " + LocalDate.now());
			return;
		} else {
			throw new RuntimeException("Usuario não tem permissão para publicar");
		}
		
	}

	@Override
	public void reprovar() {
		
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		if(seguranca.ehUsuarioModerador()) {
			//this.estado = "RASCUNHO";
			this.artigo.transitarEstadoPara(new EstadoRascunho(artigo));
			this.artigo.getLogHistorico().add("Tansitado para RASCUNHO em + " + LocalDate.now());
			return;
		} else {
			throw new RuntimeException("Usuario não tem permissão para reprovar");
		}
		
	}

}
