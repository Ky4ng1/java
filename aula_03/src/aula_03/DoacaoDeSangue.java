package aula_03;

import java.util.Scanner;

public class DoacaoDeSangue {
		static Scanner leia = new Scanner(System.in);
	
	    public static void main(String[] args) {
	    	
	    	String nomeDoador;
	    	int idadeDoador;
	    	boolean primeiraDoacao;
	    	
	      
	        System.out.println("Digite seu Nome: ");
	        nomeDoador = leia.nextLine();

	       
	        System.out.println("Digite sua Idade : ");
	        idadeDoador = leia.nextInt();

	        
	        System.out.print("Primeira doação de sangue? ");
	        primeiraDoacao = leia.nextBoolean();

	     
	        if (idadeDoador >= 18 && idadeDoador <= 69) {
	            if (idadeDoador >= 60 && idadeDoador <= 69 && primeiraDoacao) {
	                System.out.println(nomeDoador + " não está apto para doar sangue!");
	            } else {
	                System.out.println(nomeDoador + " está apto para doar sangue!");
	            }
	        } else {
	            System.out.println(nomeDoador + " não está apto para doar sangue!");
	        }
	    }
	}
	

