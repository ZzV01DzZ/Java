package exercicios01;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		double a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Valor de a:");
		a = leia.nextInt();
		System.out.println("Valor de b:");
		b = leia.nextInt();
		System.out.println("Valor de c:");
		c = leia.nextInt();
		System.out.println("Valor de d:");
		d = leia.nextInt();
		System.out.println("Valor de e:");
		e = leia.nextInt();
		System.out.println("Valor de f:");
		f = leia.nextInt();
		
		x = ((c*e) - (b*f))/((a*e) - (b*d));
		y = ((a*f) - (c*d))/((a*e) - (b*d));
		
		System.out.println("Valor de x é: " + x + " e o valor de y é: " + y +".");
		
		leia.close();
	}

}
