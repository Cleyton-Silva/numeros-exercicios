package listadeexercicio;

import java.util.Scanner;

public class ex8 {

public static void main ( String [] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		int a,b,c,d,total,m�dia;
		
		
	
	
	System.out.println("Descubra a m�dia aritim�tica de 4 numeros  ");
	
	System.out.println("numero 1  ");
	a = entrada.nextInt();
	
	System.out.println("numero 2  ");
	
	b = entrada.nextInt();
	
	System.out.println(" numero 3 ");
	
	c = entrada.nextInt(); 
	
	System.out.println(" numero 4 ");

	d = entrada.nextInt();

	
	
	
	m�dia = (a + b + c + d / 4);
	
	
	System.out.println( " a m�dia artitim�tica dos numeros � " + m�dia );
}
}

