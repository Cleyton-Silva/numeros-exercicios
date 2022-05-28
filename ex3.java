
package listadeatividade;

import java.util.Scanner;

public class ex3 {

public static void main ( String [] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		int A,B,TOTAL;
		
		
		System.out.println("Digite um numero ");
		A = entrada.nextInt();
		
		double R = Math.pow(A, 2);
		
		System.out.println( A + " elevado a " + " 2 " + " = " + R );
		
		System.out.println("Digite um numero ");
		B = entrada.nextInt();
		
		double G = Math.pow(B, 2);
		
		System.out.println( B + " elevado a " + " 2 " + " = " + G );
		
		 TOTAL = ( A*A + B*B) ;
		
		System.out.println("SOMA TOTAL " + TOTAL);
		
	}
	
}
