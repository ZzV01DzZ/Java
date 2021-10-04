package exercicios01;
/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int a, m, d, i;
			
		Scanner leia = new Scanner(System.in);

		System.out.println("quantos anos: ");
		a = leia.nextInt();
		
		System.out.println("quantos meses: ");
		m = leia.nextInt();
		
		System.out.println("quantos dias: ");
		d = leia.nextInt();
		
		i = (a*365)+(m*30)+d;
		
		System.out.println("Idade em dias: " + i);
		
		leia.close();

	}

}
