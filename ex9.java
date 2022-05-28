package listadeexercicio;

import java.util.Scanner;

public class ex9 {
	
	public static void main ( String [] args) {
	Scanner entrada = new Scanner (System.in); 
	
	
	String funcionario1,funcionario2,funcionario3;
	
	int horastrabalhadas,saláriototal;
	
	boolean A = true;
	

	System.out.println("Digite o cadastro do funcionario :");
	
	System.out.println(" Exemplo (1 , 2 OU 3 ) ");
	
	String cadastro = entrada.next();
	
	
	
	switch (cadastro) {
	
	case "1":
	
	
		System.out.println();
		
		System.out.println(" Funcionario " + 1 + " recebe 20 reais por horas trabalhadas " );
		
		System.out.println();
		
		System.out.println("FICHA DO FUNCIONARIO 1");

		System.out.println();
		
		
		horastrabalhadas = entrada.nextInt();
		
		saláriototal = ( horastrabalhadas * 20);
		
		System.out.println(" Sálario total do funcionario " + saláriototal);
		
		break;
	
		
		
	case "2":
		
        System.out.println();
		
		System.out.println("FICHA DO FUNCIONARIO 2");
		System.out.println();
		
		System.out.println(" Funcionario " + 2 + " recebe 16 reais por horas trabalhadas "   );
		System.out.println();

        System.out.println(" Determine as horas trabalhadas:  " );
        
        System.out.println();
		
		horastrabalhadas = entrada.nextInt();
		
		saláriototal = ( horastrabalhadas * 16);
		
		System.out.println(" Sálario total do funcionario " + saláriototal );
		
		break;
		
	case "3":
	
		
		
		System.out.println();
		System.out.println("FICHA  DO FUNCIONARIO 3 " );
		System.out.println();
		
		System.out.println(" Funcionario " + 3 + " recebe 18 reais por horas trabalhadas "   );
		System.out.println();
		
        System.out.println(" Determine as horas trabalhadas:  " );
       
        
        System.out.println();
        
		horastrabalhadas = entrada.nextInt();
		
		saláriototal = ( horastrabalhadas * 18);
		
		System.out.println(" Sálario total do funcionario " + saláriototal );
		
		
		break;
		
		
		
	default:
	System.out.println("Escolha inválida!");

	
	break;

	
	}
	





	

	
}
}

