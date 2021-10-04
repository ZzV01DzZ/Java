package exercicios01;

import java.util.Scanner;

/*6.Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
que efetua tal cálculo é:*/
public class Ex6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Valor de x no ponto 1:");
		x1 = leia.nextInt();
		
		System.out.println("Valor de y no ponto 1:");
		y1 = leia.nextInt();
		
		System.out.println("Valor de x no ponto 2:");
		x2 = leia.nextInt();
		
		System.out.println("Valor de y no ponto 1:");
		y2 = leia.nextInt();
		
		d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.println("A distância entre o ponto 1 e 2 é: " + d);
		
		leia.close();


	}

}
