package listadeexercicio;

import java.util.*;

public class ex17 {

public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);

    int a,b,c,d,soma1;



    System.out.println("Digite o valor de a");
    a = entrada.nextInt();
    System.out.println("Digite o valor de b");
    b = entrada.nextInt();
    System.out.println("Digite o valor de c");
    c = entrada.nextInt();
    System.out.println("Digite o valor de d");
    d = entrada.nextInt();
    
    soma1 = d + c;


    if ((b > c) && (d >a) && (soma1 > a ) && (soma1 > b ) && (c > 1) && ( d > 1) && (a%2 == 0)){

    System.out.println("valores aceitos");

                        }else { 

                            System.out.println("valores nao aceitos");
                        
                            }
 
}









}




