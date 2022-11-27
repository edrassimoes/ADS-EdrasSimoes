package Strategy.frete;

public class CalculadoraFrete {
	
	// ANTES DE REFATORAR
	
	/*public double calcularValor(String servico, double pesoEmKg) {
		
		//sedex
		if(servico.equals("sedex")) {
			if(pesoEmKg < 10.0) {
				return 50.00;
			} else if (pesoEmKg < 20.00) {
				return 70.00;
			}else {
				return 90.00;
			}
		}
		
		// dhl
		if(servico.equals("dhl")) {
			if(pesoEmKg < 20.00) {
				return 100.00;
			}else {
				return 90.00;
			}
		}
		
		// jadlog
		if(servico.equals("jadlog")) {
			if(pesoEmKg < 30.00) {
				return 0.00;
			}else {
				return 150.00;
			}
		}
		
		throw new RuntimeException("Serviço desconhecido: " + servico);

	}	*/
	
	public double calcular (Fretavel fretavel, double pesoemKg) {
		return fretavel.calcularValor(pesoemKg);
		}
	}
}