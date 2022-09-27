package builder.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderTest {

	@Test
	void deveConstruirUmCarroPeloBuilder() {
		
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		Motor motor1 = new Motor();
		ComputadorBordo computadorBordo = new ComputadorBordo();
		FreioABS freioABS = new FreioABS();
		
		//Builder
		CarroBuilder carroBuilder = new CarroBuilder();
		carroBuilder.buildPortas(portas);
		carroBuilder.buildMotor(motor1);
		carroBuilder.buildComputadorBordo(computadorBordo);
		carroBuilder.buildFreioABS(freioABS);
		
		//Teste
		Carro carroConstruido = carroBuilder.getCarro();
		
		assertNotNull(carroConstruido);
		assertNotNull(carroConstruido.getPortas());
		assertNotNull(carroConstruido.getMotor());
		assertNotNull(carroConstruido.getComputadorBordo());
		assertNotNull(carroConstruido.getFreioABS());
		
		
	}

}
