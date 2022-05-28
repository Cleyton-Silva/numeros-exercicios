package listadeexercicio;

import java.util.*;

public class ex18 {

public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);

    int a,b,c,soma1;

    System.out.println("lados de um triangulo");

    System.out.println("Digite o valor de a de um  triangulo");
    a = entrada.nextInt();
    System.out.println("Digite o valor de b");
    b = entrada.nextInt();
    System.out.println("Digite o valor de c");
    c = entrada.nextInt();
    
    


if ((a > b + c)){

    System.out.println("NAO FORMA TRIÂNGULO");

}else if ((a * a == b * b + c * c)) { 

    System.out.println("TRIÂNGULO RETÂNGULO");

}else if ((a * a > b * b + c * c)) { 

    System.out.println("TRIÂNGULO OBTUSÂNGULO");

} else if ((a * a < b * b + c * c)) { 

    System.out.println("TRIÂNGULO ACUTÂNGULO");
 
} else if ((a == b ) && ( a == c)) { 

    System.out.println("TRIÂNGULO EQUILÁTERO");
 
}else if ((a != b ) && ( a == c) || (c != a ) && ( c == b)|| (b != c) && (b == a)) { 

    System.out.println("TRIÂNGULO ISÓSCELES");
 
}








}
}