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

    System.out.println("NAO FORMA TRI�NGULO");

}else if ((a * a == b * b + c * c)) { 

    System.out.println("TRI�NGULO RET�NGULO");

}else if ((a * a > b * b + c * c)) { 

    System.out.println("TRI�NGULO OBTUS�NGULO");

} else if ((a * a < b * b + c * c)) { 

    System.out.println("TRI�NGULO ACUT�NGULO");
 
} else if ((a == b ) && ( a == c)) { 

    System.out.println("TRI�NGULO EQUIL�TERO");
 
}else if ((a != b ) && ( a == c) || (c != a ) && ( c == b)|| (b != c) && (b == a)) { 

    System.out.println("TRI�NGULO IS�SCELES");
 
}








}
}