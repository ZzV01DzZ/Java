package exercicios01;
/*  4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D = (R+S)/2, onde R = (A+B)² e S = (B+C)²
*/  
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int a, b, c, r, s;
		double d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("valor de a: ");
		a = leia.nextInt();
		
		System.out.println("valor de b: ");
		b = leia.nextInt();
		
		System.out.println("valor de c: ");
		c = leia.nextInt();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r + s) / 2;
		
		System.out.println("O valor de D é: " + d);
		
		leia.close();

	}

}
