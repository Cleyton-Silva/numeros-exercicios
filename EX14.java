package listadeexercicio;

import java.util.Scanner;

public class EX14 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		float N1,N2,N3,CALCULO1,CALCULO2; 
		
		System.out.println("Digite o valor da AREA do quadrado ");
		N1 = entrada.nextInt();
		
		System.out.println("Digite o valor do RAIO do circulo ");
		N2 = entrada.nextInt();
		
		System.out.println("Digite o valor do RAIO do circulo ");
		N3 = entrada.nextInt();
		
		if ((N1 > N2) || (N1 > N3)) {
			
			System.out.println("VALOR " + N1 + " MAIOR ");
			
		}else if ((N2 > N1) || (N2 > N3)){ 
			
			
			System.out.println("VALOR " + N2 + " MAIOR ");
	
         }else if ((N3 > N1) || (N3 > N2)){ 
			
			
			System.out.println("VALOR " + N3 + " MAIOR ");
	
		}
		}
	
}
