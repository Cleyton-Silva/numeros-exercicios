package listadeexercicio;

import java.util.Scanner;

public class ex13 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		float N1,N2,CALCULO1,CALCULO2; 
		
		System.out.println("Digite um valor ");
		N1 = entrada.nextInt();
		
		System.out.println("Digite outro valor  ");
		N2 = entrada.nextInt();
		
		if (N1 > N2) {
			
			CALCULO1 = N1 / N2;
			
			System.out.println("VALOR " + N1 + " DIVIDO POR " + N2 + " RESULTADO : " + CALCULO1);
			
		}else if ( N2 > N1){ 
			
			CALCULO2 = N2 / N1;
			
			System.out.println("VALOR " + N2 + " DIVIDO POR " + N1 + " RESULTADO : " + CALCULO2);
	
		}
		}
	
}
