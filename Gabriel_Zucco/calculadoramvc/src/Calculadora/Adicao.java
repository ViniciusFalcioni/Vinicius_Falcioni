package Calculadora;

import java.util.Scanner;

public class Adicao {
	
	Scanner scan = new Scanner(System.in);
	
	float num1;
	float num2;
	float result;
	
	void acrescentar() {
		
		System.out.println("Por favor, informe o primeiro numero:");
		num1 = scan.nextFloat();
		
		System.out.println("\nAgora, informe o segundo numero:");
		num2 = scan.nextFloat();
		
		result = num1 + num2;
		
		System.out.println("Resultado = " + result);
		
	}
	
}
