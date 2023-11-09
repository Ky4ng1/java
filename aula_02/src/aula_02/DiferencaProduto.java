package aula_02;

import java.util.Scanner;

public class DiferencaProduto {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//N1,N2,N3 e N4, Correspondem aos valores do produto.
		float N1;
		float N2;
		float N3;
		float N4;
		
		System.out.println("Produto 1 valor: ");
		N1=leia.nextFloat();
		
		System.out.println("Produto 2 valor: ");
		N2=leia.nextFloat();
		
		System.out.println("Produto 3 valor: ");
		N3=leia.nextFloat();
		
		System.out.println("Produto 4 valor: ");
		N4=leia.nextFloat();
		
		System.out.println("Diferença de: "+((N1*N2)-(N3*N4)));
		
	}

}
