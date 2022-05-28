package listadeatividade;

import java.util.Scanner;

public class ex2 {

	public static void main ( String [] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		double A,B;
		
		System.out.println("Digite um numero ");
		A = entrada.nextDouble();
		
		System.out.println("Digite a potencia ");
		B = entrada.nextDouble();
		
		double R = Math.pow(A, B);
		
		
		System.out.println("potencia " + R );
		
	}
}
