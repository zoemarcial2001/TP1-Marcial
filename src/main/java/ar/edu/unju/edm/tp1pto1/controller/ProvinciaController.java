package ar.edu.unju.edm.tp1pto1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class ProvinciaController {
	
	@GetMapping ({"/provincia"})
	
	public String cargaProvincia() {
		return "provincia";
	}
	

}
