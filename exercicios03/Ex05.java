package exercicios03;

import java.util.Scanner;

/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n = 0,soma=0;
		
		do {
			System.out.println("Digite um número");
			n = ler.nextInt();
				soma+= n;	
		}
		while(n != 0);
			
		System.out.println("A somas dos numeros é:" + soma);
	}

}
