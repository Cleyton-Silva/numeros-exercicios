package listadeatividade;

import java.util.Scanner;



public class ex1 {

	public static void main ( String [] args) {
		
	Scanner entrada = new Scanner (System.in); 
	
	int N1,N2,total;
	
	System.out.println("Digite um numero ");
	N1 = entrada.nextInt();
	
	System.out.println("Digite outro numero ");
	N2 = entrada.nextInt();
	
	
	total = ( N1 + N2 );
	
	System.out.println("total " + N1 + " + " + N2 + " = " +  total);

	}
}
