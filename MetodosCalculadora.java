package CalculadoraRefeita;

public class MetodosCalculadora {
	private double  num1;
	private double  num2;
	
	
	
	// Get eu recupero esse valor
	public double getNum1() {
		return num1;
	}

	//set eu adiciono um valor
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
		
	double soma(double num1, double num2){
		return num1 + num2;			
	}

	public double soma() {
		double soma = num1 + num2;
		return soma;
	}

	double subtrair(double num1, double num2){
		return num1 - num2;
	}
	public double subtrair() {
		double subtrair = num1 - num2;
		return subtrair;
	}
	
	double multiplicacao(double num1, double num2){
		return num1 * num2;
	}
	public double multiplicacao() {
		double multiplicacao = num1 * num2;
		return multiplicacao;
	}
	
	double divisao(double num1, double num2){
		return num1 / num2;
	}
	public double divisao() {
		double divisao = num1 / num2;
		return divisao;
	}

}
