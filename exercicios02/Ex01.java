package exercicios02;

import java.util.Scanner;

/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/
public class Ex01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3){
			System.out.println(n1 + " é o maior");
		}
		
		else if(n2 > n3){
			System.out.println(n2 + " é o maior");	
		}
		else{
			System.out.println(n3 + " é o maior");
	    }
	}
}