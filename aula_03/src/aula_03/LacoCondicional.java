package aula_03;

import java.util.Scanner;

public class LacoCondicional {
					
		static Scanner leia = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			int A;
			int B;
			int C;
			
			
			System.out.println("Valor de A: ");
			A=leia.nextInt();
			
			System.out.println("Valor de B ");
			B=leia.nextInt();
			
			System.out.println("Valor de C: ");
			C=leia.nextInt();
			
			int soma = A+B;
			
			if (soma > C) {
	            System.out.println(A + " + " + B + " = " + soma + " > " + C);
	            System.out.println("A Soma de A + B é Maior do que C");
	        } else if (soma < C) {
	            System.out.println(A + " + " + B + " = " + soma + " < " + C);
	            System.out.println("A Soma de A + B é Menor do que C");
	        } else {
	            System.out.println(A + " + " + B + " = " + soma + " = " + C);
	            System.out.println("A Soma de A + B é Igual a C");
}
		}
}

