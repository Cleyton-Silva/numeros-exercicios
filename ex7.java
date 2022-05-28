package listadeexercicio;

import java.util.Scanner;

public class ex7 {

		public static void main ( String [] args) {
			
		Scanner entrada = new Scanner (System.in); 
		
		int a,b,c,total;
		double total1;
		int total2,total3,total4,total5,total6;
		
		
                                          
                                           ///  triangulo retangulo //////
		
		System.out.println("Digite um numero que determinara a base e a altura de um triagulo retangulo ");
		System.out.println("valor da Base do triagulo retangulo ");
		a = entrada.nextInt();
		System.out.println("valor da altura do triangulo retangulo ");
		b = entrada.nextInt();		
		                                
		total = ( a * b / 2);
		
		System.out.println( " A área do triângulo retângulo é " +  total);
		
		System.out.println( );
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	                                         
	                                         /// valor da area de um circulo///
	                                         
		System.out.println("Digite o valor do raio de um circulo para descobrir a area dele usando a formula A=π.R² ");
		System.out.println("valor do raio ");
		c = entrada.nextInt();
		
		total1 = (3.14159 * c * c);
		
		System.out.println( );
		
		System.out.println( " A área do circulo é " +  total1);
		
		System.out.println( );
		

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		                                       ///// area do trapézio //////
		
		System.out.println("Digite o valor da primeira base do trapazeio ");
		a = entrada.nextInt();
		System.out.println("Digite o valor da segunda base do trapazeio ");
		b = entrada.nextInt();
		System.out.println("Digite o valor da altura do trapazeio ");
		c = entrada.nextInt();
		
		total3 = (a + b * c / 2);
		
		
		System.out.println( " A area do trapézio é" +  total3);
		
		System.out.println( );
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		                              ////////////// lado de um quadrdo /////////

		System.out.println("Digite o valor do AREA do quadrado para descobrir seu LADO ");
		b = entrada.nextInt();
		System.out.println(Math.sqrt(b));
		
		total5 = (b);
		
		System.out.println( " O LADO DE UMA AREA " + b + " É " +  total5);

		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		                                 ////// area de um retangulo ///////
		
		System.out.println("Digite o valor da BASE do retangulo ");
		b = entrada.nextInt();
		System.out.println("Digite o valor da ALTURA  do retangulo ");
		a = entrada.nextInt();
		
		total5 = (a*b);
		
		System.out.println( " a AREA do retangulo " + " É " + total5);
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		                       //////// valor do perinmetro de um retangulo ///////
		
		System.out.println("Descubra o valor do perimetro de um retangulo com o valor da base e sua altura ");
		System.out.println("Digite o valor da BASE do retangulo ");
		b = entrada.nextInt();
		System.out.println("Digite o valor da ALTURA  do retangulo ");
		a = entrada.nextInt();
		
		total6 = (a + a + b + b);
		
		System.out.println( " a AREA do retangulo " + " É " + total6);
		
		
		
		
		
		
		
		}
	}
	

