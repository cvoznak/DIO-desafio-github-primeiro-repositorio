package dioOperadoresFluxo;

// Classe de exemplo para o exerc�cio da aula 2 de operadores l�gicos.

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("b1 && b2 " + (b1 && b2));
		System.out.println("b1 && b3 " + (b1 && b3));
		
		System.out.println();
		
		System.out.println("b2 || b3 " + (b2 || b3));
		System.out.println("b2 || b4 " + (b2 || b4));
		
		System.out.println();
		
		System.out.println("b1 ^ b3 " + (b1 ^ b3));
		System.out.println("b4 ^ b1 " + (b4 ^ b3));
		

	}

}
