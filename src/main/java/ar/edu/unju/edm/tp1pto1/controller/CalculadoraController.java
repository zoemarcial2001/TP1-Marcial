package ar.edu.unju.edm.tp1pto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.tp1pto1.model.Calculadora;

@Controller
public class CalculadoraController {

	@Autowired
	Calculadora unaCalculadora;
	
	@GetMapping ({"/calculadora"})
	public String cargaCalculadora(Model model){
		return "calculadora";
	}
	

	@GetMapping("/ejecutarsuma")
	public ModelAndView getCalculoSuma(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {

		unaCalculadora.setNum1(Integer.valueOf(num1));
		unaCalculadora.setNum2(num2);

		int resultadoSuma = unaCalculadora.sumar();

		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoSuma", resultadoSuma);

		return modelView;
	}
	
	@GetMapping("/ejecutarresta")
	public ModelAndView getCalculoResta(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {

		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);

		int resultadoResta = unaCalculadora.restar();

		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoResta", resultadoResta);

		return modelView;
	}
	
	@GetMapping("/ejecutarmultiplicacion")
	public ModelAndView getCalculoMultiplicacion(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {

		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);

		int resultadoMultiplicacion = unaCalculadora.multiplicar();

		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoMultiplicacion", resultadoMultiplicacion);

		return modelView;
	}
	
	@GetMapping("/ejecutardivision")
	public ModelAndView getCalculoDivision(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {

		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);

		float resultadoDivision = unaCalculadora.dividir();

		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoDivision", resultadoDivision);

		return modelView;
	}
}
