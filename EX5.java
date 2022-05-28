package listadeexercicio;

import java.util.Scanner;

public class EX5 {

	public static void main ( String [] args) {
		
	Scanner entrada = new Scanner (System.in); 
	
	int L,total;
	
	System.out.println("Digite um numero ");
	L = entrada.nextInt();
	
	
	
	
	total = ( L + L + L + L  );
	
	System.out.println( " A SOMA DOS LADOS DE UM QUADRADO COM UM PERIMETRO DE " + L + " é " +  total);

	}
}
	

