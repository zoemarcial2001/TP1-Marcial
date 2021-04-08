package ar.edu.unju.edm.tp1pto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.tp1pto1.model.Calculador;

@Controller
public class CalculadorController {

	@Autowired
	Calculador unCalculador;
	
	@GetMapping("/calculoSuma")
	public ModelAndView getCalculoSuma(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") int num2){
		
		unCalculador.setNum1(Integer.valueOf(num1));
		unCalculador.setNum2(num2);
		
		int resultadoSuma = unCalculador.sumar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoSuma", resultadoSuma);
		
		return modelView;
	}
}
