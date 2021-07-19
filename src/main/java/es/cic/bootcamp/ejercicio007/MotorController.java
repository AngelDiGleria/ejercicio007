package es.cic.bootcamp.ejercicio007;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotorController {
	
	MotorService ms = new MotorService();
	
	@GetMapping("/electrico")
	public int devolverElectrico() {
		return ms.arrancarElectrico();
	}
	
	@GetMapping("/combustion")
	public int devolverCombustion() {
		return ms.arrancarCombustion();
	}
	
	@GetMapping("/arranque")
	public String arrancar() throws PotenciaException {
		return ms.arrancarCoche();
	}
	

}
