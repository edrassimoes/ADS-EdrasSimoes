package Strategy.frete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraFreteTest {

    @Test
	void deveCalcularFreteParaDHL() {
		
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteDHL = new ServicoFreteDHL();
		double valorObtido = calculadora.calcular(servicoFreteDHL,10.0);
        	double valorEsperado = 100.0;
		
		assertEquals(valorObtido, valorEsperado);		
	}

    @Test
    void deveCalcularFreteParaSedex() {
		
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteSedex = new ServicoFreteSedex();
		double valorObtido = calculadora.calcular(servicoFreteSedex,15.0);
        	double valorEsperado = 70.0;
		
		assertEquals(valorObtido, valorEsperado);			
	}

    @Test
    void deveCalcularFreteParaJadLog() {
		
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteJadLog = new ServicoFreteJadLog();
		double valorObtido = calculadora.calcular(servicoFreteJadLog,40.0);
        	double valorEsperado = 150.0;
		
		assertEquals(valorObtido, valorEsperado);			
	}
    
    @Test
    void deveCalcularFreteParaFedEx() {
		
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteFedEx = new ServicoFreteFedEx();
		double valorObtido = calculadora.calcular(servicoFreteFedEx,40.0);
        	double valorEsperado = 150.0;
		
		assertEquals(valorObtido, valorEsperado);			
	}

    /*
    @Test
    void deveLancarExceptionParaServicoDesconhecido(){
        try{
			CalculadoraFrete calculadora = new CalculadoraFrete();
		    double valorObtido = calculadora.calcular("desconhecido",40.0);
            
			fail("Devia ter lançado exception");
			
		}catch (IllegalStateException e){
			e.printStackTrace();
		}
    }*/
}
