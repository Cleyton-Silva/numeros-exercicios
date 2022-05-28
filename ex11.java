package listadeexercicio;
  
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		float numero;
		
		System.out.println("Digite um numero ");
		numero = entrada.nextInt();
		
		if ( numero <= 0) {
			
			System.out.println("numero negativo");
			
		}else  { 
			
			System.out.println("numero positivo");
	
		
		}
		
	}
	
}
