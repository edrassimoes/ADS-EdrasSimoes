package builder.carro;

public class Carro {
	
	//Atributos
	
	private Porta[] portas;
	
	private Motor motor;
	
	private ComputadorBordo computadorBordo;
	
	private FreioABS freioABS;
	
	//Getter & Setter

	public Porta[] getPortas() {
		return portas;
	}

	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public ComputadorBordo getComputadorBordo() {
		return computadorBordo;
	}

	public void setComputadorBordo(ComputadorBordo computadorBordo) {
		this.computadorBordo = computadorBordo;
	}

	public FreioABS getFreioABS() {
		return freioABS;
	}

	public void setFreioABS(FreioABS freioABS) {
		this.freioABS = freioABS;
	}
	
	

}
