package listadeexercicio;

import java.util.Scanner;

public class ex12 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		float L,R;
		
		System.out.println("Digite o valor da AREA do quadrado ");
		L = entrada.nextInt();
		
		System.out.println("Digite o valor do RAIO do circulo ");
		R = entrada.nextInt();
		
		if (L < R) {
			
			System.out.println("Circulo com RAIO MAIOR que area");
			
		}else  { 
			
			System.out.println("Quadrado com AREA MAIOR que raio");
	
		
		}
	
}
}