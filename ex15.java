package listadeexercicio;

import java.util.Scanner;

public class ex15 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		int A,B,C; 
		 int CALCULO1,CALCULO2,CALCULO3,CALCULO4;
		  int CALCULOFINAL,CALCULOFINAL2;
		
		System.out.println("BHASKARA");
		
		System.out.println();
		
		System.out.println("  B ± (RAIZ)B2 − 4 * A * C");
		System.out.println("____________________________");
		
		       System.out.println("       2 * A ");
		
		System.out.println();
		
		System.out.println("Digite o valor de A ");
		A = entrada.nextInt();
		
		System.out.println("Digite o valor de B ");
		B = entrada.nextInt();
		
		System.out.println("Digite o valor de C ");
		C = entrada.nextInt();
		
		
		CALCULO1 = 2 * A;
		
		CALCULO2 = B * B - 4 * A * C; 
		
		System.out.println(Math.sqrt(CALCULO2));
		
		CALCULO3 = -B + CALCULO2;
		
		CALCULOFINAL = CALCULO3 / CALCULO1;
		
		
		CALCULO4 = -B - CALCULO2;
		
		CALCULOFINAL2 = CALCULO4 / CALCULO1;
		 
		
		if ((CALCULO1 == 0) || (CALCULO2 == 0)) {
			
			System.out.println("impossivel calcular ou numero negativo ");
			
		}else { 
			
			
			System.out.println("x' = " + CALCULOFINAL );
			
			System.out.println("x'' = " + CALCULOFINAL2 );
	
         
	
		}

}
}
