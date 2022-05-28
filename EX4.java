package listadeatividade;

import java.util.Scanner;

public class EX4 {

public static void main ( String [] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		double A,B,total,inteiro;
		
		System.out.println("Digite um numero ");
		A = entrada.nextDouble();
		
		total = (A + 1);
		
		System.out.println("Digite  ");
		B = entrada.nextDouble();
		
		inteiro = (B + 1);
		
		System.out.println(total + " e "  + inteiro  );
		
	}
	
}
