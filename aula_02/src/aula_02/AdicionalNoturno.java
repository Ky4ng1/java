package aula_02;

import java.util.Scanner;

public class AdicionalNoturno {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/* Indice Variáveis
		 * SB = Salário Bruto;
		 * AN = Adicional Noturno;
		 * HE = Horas Extras;
		 * D = Descontos;
		 */
		
		float SB;
		float AN;
		float HE;
		float D;
		
		System.out.println("Digite seu salário Bruto: ");
		SB=leia.nextFloat();
		
		System.out.println("Digite o adicional Noturno:");
		AN=leia.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		HE=leia.nextFloat();
		
		System.out.println("Digite os descontos: ");
		D=leia.nextFloat();
		
		System.out.println("Salário liquido: "+(SB+AN+(HE*5)-D));
		
	}
}
