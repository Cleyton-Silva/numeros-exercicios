package listadeexercicio;

import java.util.Scanner;

public class ex6 {
	

	public static void main ( String [] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		int a,b,total,total1;
		
		
	
	
	System.out.println("Descubra a raiz de quadrada de dois numeros  ");
	a = entrada.nextInt();
	System.out.println(Math.sqrt(a));
	b = entrada.nextInt();
	System.out.println(Math.sqrt(b));
	
	
	total = (a);
	total1 = (b);
	
	System.out.println( " A RAIZ QUADRDA DE  " + a + " É " +  total + " A RAIZ QUADRDA DE  " + b + " É " +  total1);
}
}