package exercicios04;

import java.util.Scanner;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
public class Ex4 {

	public static void main(String[] args) {
		int m[][] = new int[3][3];
		int l, c, somaT =0, somaD=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (l =0; l<3;l++){
			for(c = 0; c < 3; c++){
				System.out.printf("Posição: [ " +l+ " ][ " +c+ " ]: " );
				m[l][c]= entrada.nextInt();
				}
		}
	
		for (l =0; l<3;l++){
			for(c = 0; c < 3; c++){
				somaT += m[l][c];
				if (l == c){
				somaD += m[l][c];
				}
			}
		}		
		
		for (l = 0; l< 3; l++){
			for (c = 0; c < 3; c++){	
			System.out.printf("[ "+ m[l][c] + " ]");
			}
			System.out.println();
		}
		System.out.println("\nA soma total é: " +somaT);
		System.out.println("A soma da diagonal é: " +somaD);
		
	
	
	}
}