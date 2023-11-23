package Calculadora;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		int escolha;
		int repeticao = 1;
		
		Scanner scan = new Scanner(System.in);
		
		do{
		
			
			System.out.println("Ola, esse e o sistema de calculadora do Gabs!\n\nInforme qual a operacao que deseja realizar:\n1 - Adicao\n2 - Multiplicacao\n3 - Subtracao\n4 - Divisao\n");
			escolha = scan.nextInt();
		
			switch(escolha) {
			
			case 1:
				Adicao add = new Adicao();
				add.acrescentar();
				break;
			case 2:
				Multiplicacao mult = new Multiplicacao();
				mult.multiplicar();
				break;
			case 3:
				Subtracao sub = new Subtracao();
				sub.subtrair();
				break;
			case 4:
				Divisao div = new Divisao();
				div.dividir();
				break;
			}
			
			System.out.println("Deseja Utilizar novamente a ferramenta?\n1 - Sim\n2 - Nao\n");
			repeticao =  scan.nextInt();
			
		}while(repeticao != 2); {
			System.out.println("Obrigado por utilizar nossa ferramenta!");
		}
		
	}
	
}
