package dioMetodos;

//Classe utilizada para resolu��o do exerc�cio da aula 1 de m�todos - Calculadora de quatro opera��es.

public class Calculadora {

	public static void soma(double numero1, double numero2) {
		
		double resultado = numero1 + numero2;
		
		System.out.println("A soma de " + numero1 + " mais " + numero2 + " � " + resultado);
	}
	
	public static void subtracao(double numero1, double numero2) {
		
		double resultado = numero1 - numero2;
		
		System.out.println("A subtra��o de " + numero1 + " menos " + numero2 + " � " + resultado);
	}
	
	public static void multiplicacao(double numero1, double numero2) {
		
		double resultado = numero1 * numero2;
		
		System.out.println("A multiplica��o de " + numero1 + " vezes " + numero2 + " � " + resultado);
	}
	
	public static void divisao(double numero1, double numero2) {
		
		double resultado = numero1 / numero2;
		
		System.out.println("A divis�o de " + numero1 + " por " + numero2 + " � " + resultado);
		
	}

}
