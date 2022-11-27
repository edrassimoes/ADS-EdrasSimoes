package Strategy.frete;

public class ServicoFreteFedEx implements Fretavel {
	
	@Override
	public double calcularValor(double pesoEmKg) {
		
		if(pesoEmKg < 20.0) {
			return 0.0;
		}
		if(pesoEmKg <= 39.9) {
			return 45.0;
		}
		
		return 75.00;
	}

}
