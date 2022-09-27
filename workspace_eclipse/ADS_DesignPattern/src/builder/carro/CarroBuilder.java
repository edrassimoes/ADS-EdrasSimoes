package builder.carro;

import javax.management.loading.PrivateClassLoader;

public class CarroBuilder {
	
	private Carro carro;
	
	//Construtor
	public CarroBuilder() {
		carro = new Carro();
	}
	
	public void buildPortas(Porta[] portas) {
		carro.setPortas(portas);
	}
	
	public void buildMotor(Motor motor) {
		carro.setMotor(motor);
	}
	
	public void buildComputadorBordo(ComputadorBordo cBordo) {
		carro.setComputadorBordo(cBordo);
	}
	
	public void buildFreioABS(FreioABS abs) {
		carro.setFreioABS(abs);
	}

	public Carro getCarro() {
		return carro;
	}
	
	private void validarPortas() {
		if (carro.getPortas() ==  null) {
			throw new IllegalStateException("Carro deve ter portas");
		}
	
	int numeroDePortas = carro.getPortas().length;
	
	if (numeroDePortas != 2 && numeroDePortas != 4) {
		throw new IllegalStateException("Numero de portas invalido: " + numeroDePortas);
		
	}
	
		
	
	}

}
