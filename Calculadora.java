package CalculadoraRefeita;
import java.util.Scanner;



public class Calculadora {

	public static void main(String[] args) throws Exception {
		// Declaro o Scanner como entrada atraves do in , ou seja , como entrada de
		// dados atraves do teclado
		Scanner in = new Scanner(System.in);
		System.out.println("Digite 1 para somar: ");
		System.out.println("Digite 2 para subtrair: ");
		System.out.println("Digite 3 para multiplicar: ");
		System.out.println("Digite 4 para dividir: ");
		System.out.println("_________________________");
		// Aqui ele pega o numero ou valor digitado e executa a proxima ação.
		int i = in.nextInt();
		// a partir daqui eu coloco duas condições onde peço o numero para as operações
		// serem feitas
		System.out.println("Digite o primeiro numero:");
		double num1 = in.nextDouble();
		System.out.println("Digite o segundo numero:");
		double num2 = in.nextDouble();
		double resultado = 0;
			
		invocandoOperadores(i, num1, num2, resultado);
	
		}
	public static void invocandoOperadores(int i, double num1, double num2, double resultado) throws Exception {
		MetodosCalculadora total = new MetodosCalculadora();
		OperacoesCalculadora valor = new OperacoesCalculadora();
		//set eu adiciono o valor / atribuindo valor na variavel no meu metodo
		valor.setNum1(num1);
		valor.setNum2(num2);
		total.setNum1(valor.getNum1());
		total.setNum2(valor.getNum2());
		
		switch (i) {
		case 1:
			resultado = total.soma();
			break;
		case 2:
			resultado = total.subtrair();
			break;
		case 3:
			resultado = total.multiplicacao();
			break;
		case 4:
			resultado = total.divisao();
			break;
		default:
			throw new Exception("valor invalido");
		}
		
		System.out.println(resultado);
	}
	}


// aqui declaro a condição usando o laço do if e else.
