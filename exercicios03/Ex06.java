package exercicios03;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Ex06 {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int n = 0,soma = 0, cont = 0;
			
			do {
				System.out.println("Digite um número :");
				n = ler.nextInt();
				if(n %3 == 0 && n !=0)
					cont++;
					soma+=n;
		 		
			}
			while(n != 0);
				
			System.out.println("A média dos números múltiplos de 3 é:" + soma/cont);
	
		}
	
	}
