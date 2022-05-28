package listadeexercicio;

import java.util.Scanner;

public class ex10 {

	public static void main ( String [] args) {
		Scanner entrada = new Scanner (System.in); 
		
		
		String funcionario1,funcionario2,funcionario3;
		
		double vendas,comissao,vendasmaiscomissao,salario1,salario2,salario3,salariototal;
		
		salario1 = 1300;
		salario2 = 1500;
		salario3 = 2000;
		

		System.out.println("Digite o nome do vendendor :");
		
		System.out.println(" Exemplo (Carlos , Marcos OU Julio ) ");
		
		String cadastro = entrada.next();
		
		
		
		switch (cadastro) {
		
		case "Carlos":
		case "carlos":
		
		
			System.out.println();
			
			
			System.out.println("FICHA DO Carlos");
			
			System.out.println();
			
			System.out.println(" Salario fixo 1,300 reais por mês " );
			
			System.out.println();
			System.out.println("comissão : 15% ");
			System.out.println();
			
			System.out.println(" Declare o valor de vendas do vendedor carlos no Mês");
			
			
			vendas = entrada.nextInt();
			
			vendasmaiscomissao = ( vendas * 0.15 );
			
			salariototal = (vendasmaiscomissao + salario1);
			
			System.out.println(" Sálario somado com a comissao " + "R$" + salariototal);
			
			break;
		
			
			
		case "Marcos":
		case "marcos":	
			
            System.out.println("FICHA DO Marcos");
			
			System.out.println();
			
			System.out.println(" Salario fixo 1,500 reais por mês " );
			
			System.out.println();
			System.out.println("comissão : 15% ");
			System.out.println();
			
			System.out.println(" Declare o valor de vendas do vendedor carlos no Mês");
			
			
			vendas = entrada.nextInt();
			
			vendasmaiscomissao = ( vendas * 0.15 );
			
			salariototal = (vendasmaiscomissao + salario2);
			
			System.out.println(" Sálario somado com a comissao " + "R$" + salariototal);
			
			break;
			
		case "Julio":
		case "julio":
			
			
           System.out.println("FICHA DO Julio");
			
			System.out.println();
			
			System.out.println(" Salario fixo 2,000 reais por mês " );
			
			System.out.println();
			System.out.println("comissão : 15% ");
			System.out.println();
			
			System.out.println(" Declare o valor de vendas do vendedor carlos no Mês");
			
			
			vendas = entrada.nextInt();
			
			System.out.println();
			
            vendasmaiscomissao = ( vendas * 0.15 );
			
			salariototal = (vendasmaiscomissao + salario3);
			
			System.out.println(" Sálario somado com a comissao " + "R$" + salariototal);
			
			
			break;
			
			
			
		default:
		System.out.println("Escolha inválida!");

		
		break;

		
		}
		





		

		
	}
	}

	

