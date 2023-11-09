package aula_02;

import java.util.Scanner;

public class Operadores {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero1 = 10, numero2 =20;
		String nome = "Karol";
		int idade=24;
		
		float media = 2.456789f;
		
		int tamanho;
		
		System.out.println(" A soma do número 1 com o número 2 é: " +(numero1+numero2));
		System.out.println(" Meu nome é " + nome + " e eu tenho " + idade + " anos.");
		System.out.printf(" A média final da %s é %.2f", nome,media);
		System.out.println("Digite o tamanho: ");
		tamanho = leia.nextInt();
		
		System.out.println("o valor digitado foi: "+ tamanho);
		
	}


}
