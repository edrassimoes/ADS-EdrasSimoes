package Strategy.frete;

public class ServicoFreteSedex implements Fretavel {
	
	@Override
	public double calcularValor(double pesoEmKg) {

		// sedex

		if (pesoEmKg < 10.0) {
			return 50.00;
		} else if (pesoEmKg < 20.00) {
			return 70.00;
		} else {
			return 90.00;
		}

	}

}
