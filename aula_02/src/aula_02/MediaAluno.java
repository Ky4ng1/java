package aula_02;

import java.util.Scanner;

public class MediaAluno {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//N1,N2,N3 e N4, Correspondem a Nota do Aluno.
		float N1;
		float N2;
		float N3;
		float N4;
		
		System.out.println("Digite a primeira Nota: ");
		N1=leia.nextFloat();
		
		System.out.println("Digite a segunda Nota: ");
		N2=leia.nextFloat();
		
		System.out.println("Digite a Terceira Nota: ");
		N3=leia.nextFloat();
		
		System.out.println("Digite a Ultima Nota: ");
		N4=leia.nextFloat();
		
		System.out.println("Sua média final é: " + ((N1+N2+N3+N4)/4));
		
	}

}
