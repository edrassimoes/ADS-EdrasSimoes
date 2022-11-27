package state.artigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArtigoTest {

	@Test
	void deveArtigoTransitarDeRascunhoAteAprovado() {

		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		ZzzArtigo artigo = new ZzzArtigo();
		
		
		//1. Rascunho > Revisando
		seguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertEquals("REVISANDO", artigo.getEstado());
		
		//2. Revisando > Aprovado
		seguranca.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		
		assertEquals("APROVADO", artigo.getEstado());
		
		//imprime o historico
		artigo.getLogHistorico().forEach(System.out::println);

	}

}
