package exercicios03;

import java.util.Scanner;

/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
public class Ex3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int cont21 = 0, cont50 = 0, idade;
		
		System.out.println("Digite a idade:");
		idade = ler.nextInt();
		
		while (idade!=-99) {
			if(idade <=21) {
				cont21++;
			}
			if(idade >=50) {
				cont50++;
			}
			System.out.println("Digite a idade:");
			idade = ler.nextInt();
		}
		System.out.println(cont21 + " pessoas com menos de 21 anos; \n" +cont50+ " pessoas com mais de 50 anos.");
	}
}
