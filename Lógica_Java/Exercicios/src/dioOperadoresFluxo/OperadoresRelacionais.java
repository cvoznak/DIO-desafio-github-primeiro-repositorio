package dioOperadoresFluxo;

//Classe de exemplo para o exerc�cio da Aula 1 de Operadores l�gicos e relacionais, controle de fluxo e blocos.

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int i1 = 10;
		int i2 = 20;
		float f1 = 4.5f;
		float f2 = 3.5f;
		double d1 = 59.6d;
		char c1 = 'x';
		char c2 = 'y';
		String s1 = "Fuluno";
		String s2 = "Fulano";
		String s3 = "Cicrano";
		boolean b1 = true;
		boolean b2 = false;
		
		long l1 = 1597L;
		long l2 = 8997L;
		byte y1 = 1;
		short h1 = 25;
		
		System.out.println("i1 == i2 " + (i1 == i2));
		System.out.println("i1 != i2 " + (i1 != i2));
		System.out.println("i1 > i2 " + (i1 > i2));
		System.out.println("i1 <= i2 " + (i1 <= i2));
		
		System.out.println();
		
		System.out.println("f1 == f2 " + (f1 == f2));
		System.out.println("f1 != f2 " + (f1 != f2));
		System.out.println("f1 >= f2 " + (f1 >= f2));
		System.out.println("f1 < f2 " + (f1 < f2));
		
		System.out.println();
		
		System.out.println("c1 == c2 " + (c1 == c2));
		System.out.println("c1 != c2 " + (c1 != c2));
		System.out.println("c1 > c2 " + (c1 > c2));
		System.out.println("c1 <= c2 " + (c1 <= c2));
		
		System.out.println();
		
		System.out.println("s1 == s2 " + (s1 == s2));
		System.out.println("s1 == s3 " + (s1 == s3));
		System.out.println("s1 != s2 " + (s1 != s2));
		//System.out.println(s1 >= s2); compara��o de grandeza de Strings n�o � poss�vel
		//System.out.println(s1 < s2); compara��o de grandeza de Strings n�o � poss�vel
		
		System.out.println();
		
		System.out.println("b1 == b2 " + (b1 == b2));
		System.out.println("b1 != b2 " + (b1 != b2));
		//System.out.println(b1 > b2); compara��o de grandeza de boolean n�o � poss�vel
		//System.out.println(b1 <= i1); compara��o de grandeza de boolean n�o � poss�vel
		
		System.out.println();
		
		System.out.println("i2 > f1 " + (i2 > f1));
		System.out.println("d1 == h1 " + (d1 == h1));
		//System.out.println(s2 != c1); N�o � poss�vel comparar String com Char
		//System.out.println(s3 != i1); N�o poss�vel comparar String com Interger
		
		System.out.println();
		
		System.out.println("l1 == i2 " + (l1 == i2));
		System.out.println("l2 >= i1 " + (l2 >= i1));
		System.out.println("y1 != h1 " + (y1 != h1));
		
		
		
		
		
		
		

	}

}
