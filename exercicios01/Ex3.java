package exercicios01;
/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
import java.util.Scanner;*/

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int s, m, h;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Duração em segundos: ");
		s = leia.nextInt();
		
		h = (s/3600);
		m =(s-(h*3600))/60;
		s = (s-(h*3600)-(m*60));
		
		System.out.println(h + " horas,  " + m + " minutos e " + s + " segundos.  " );
		
		leia.close();

	}

}
