package listadeexercicio;

import java.util.Scanner;


public class ex16 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		int horainicial,horafinal,horasjogadas;
		
		System.out.println("Digite a hora que voce começou a jogar ");
		horainicial = entrada.nextInt();
		
		System.out.println("Digite a hora que voce parou de jogar  ");
		horafinal = entrada.nextInt();

		horasjogadas = horafinal - 25 + horainicial ;
		
		
		System.out.println(" o jogo durou " + horasjogadas + " horas");
}
}