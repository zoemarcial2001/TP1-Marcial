package ar.edu.unju.edm.tp1pto1.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

	private int num1;
	private int num2;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	
	public int sumar() {
		int suma;
		suma=num1+num2;
		return suma;
	}
	
	public float dividir() {
		float division=0;
		if (num2==0) {
			System.out.println("El segundo numero no puede ser 0");
		}
		else {
			division=num1/num2;
		}
		return division;
	}
	
	public int multiplicar() {
		int multiplicacion;
		multiplicacion=num1*num2;
		return multiplicacion;
	}
	
	public int restar() {
		int resta;
		resta=num1-num2;
		return resta;
	}

	public Calculadora (int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}



	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num1;
		result = prime * result + num2;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (num1 != other.num1)
			return false;
		if (num2 != other.num2)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Calculador [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	
}
