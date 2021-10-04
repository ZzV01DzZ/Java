package exercicios02;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
public class Ex04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float n= 0;
		
		System.out.println("Entre com um número qualquer: ");
		n = leia.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n+ " é par e sua raiz quadrada é: " + Math.sqrt(n));
		}
		
		else {
			System.out.println(n+ " é impar e " + n + " elevado ao quadrado é: " + Math.pow(n,2));
		}
	}

}
