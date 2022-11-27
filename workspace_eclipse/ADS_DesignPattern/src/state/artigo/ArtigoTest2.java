package state.artigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArtigoTest2{

	@Test
	void deveArtigoTransitarDeRascunhoAteAprovado() {

		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		Artigo artigo = new Artigo();
		
		
		//1. Rascunho > Revisando
		seguranca.setUsuarioCorrente("AUTOR");
		artigo.onPublicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		//2. Revisando > Aprovado
		seguranca.setUsuarioCorrente("MODERADOR");
		artigo.onReprovar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRascunho);
		
		//imprime o historico
		artigo.getLogHistorico().forEach(System.out::println);

	}

}
