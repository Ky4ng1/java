package aula_02;

import java.util.Scanner;

public class ABONOSALARIO {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//S corresponde a variável Salário e A abono.
		float S;
		float A;
		
		System.out.println("Digite o Salário: ");
		S= leia.nextFloat();
		
		System.out.println("Digite o Abono :");
		A = leia.nextFloat();
		
		System.out.println("Seu novo Salário é :" + (S+A));
		
	}
}
