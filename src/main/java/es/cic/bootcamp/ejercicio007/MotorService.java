package es.cic.bootcamp.ejercicio007;

import org.springframework.stereotype.Service;

import es.cic.bootcamp.ejercicio007.PotenciaException;

@Service
public class MotorService {
	private int potenciaelectrico;
	private int potenciacombustion;
	

	public int arrancarElectrico() {
		return (int) (Math.random() * (40 - 5) + 5);
		
	}
	
	public int arrancarCombustion() {
		return (int) (Math.random() * (40 - 5) + 5);
	}
	
	
	
	public String arrancarCoche() throws PotenciaException {
		potenciaelectrico = arrancarElectrico();
		potenciacombustion = arrancarCombustion();
		if(potenciaelectrico<20) {
			if(potenciaelectrico + potenciacombustion < 20) {
				throw new PotenciaException("ERROR DE ARRANQUE - La potencia no alcanza a 20 entre los dos motores. -->"
						+ potenciaelectrico + " /// " + potenciacombustion);
			} else {
				int potenciafinal = (potenciaelectrico + potenciacombustion) /7;
				return "ARRANCA EL COCHE. Con una potencia de " 
						+ potenciafinal
						+ " / Las potencia obtenida ha sido de [ "
						+ potenciaelectrico
						+ " ] del motor electrico y [ "
						+ + potenciacombustion
						+ " ] del motor de combustion";
			}
		}else {
			int potenciafinal = potenciaelectrico /7;
			return "ARRANCA EL COCHE. Con una potencia de " 
					+ potenciafinal 
					+ " / Las potencia obtenida ha sido de [ "
					+ potenciaelectrico
					+ " ] del motor electrico";
		}
	}
	
	
	
	
	
	
}

