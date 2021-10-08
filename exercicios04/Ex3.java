package exercicios04;

import java.util.Scanner;

/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/
public class Ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int n1 [][] = new int[4][6];
		int n2 [][] = new int[4][6];
		int m1 [][] = new int[4][6];
		int l,c;
		
		for (l = 0; l < 4; l++){
			for (c = 0; c < 6; c++) {
				System.out.printf("Posição [ " +l+ " ][ " +c+ " ] da matriz N1: ");
				n1[l][c] = entrada.nextInt();
			}
		}
		
		for (l = 0; l < 4; l++){
			for (c = 0; c < 6; c++) {
				System.out.printf("Posição [ " +l+ " ][ " +c+ " ] da matriz N2: ");
				n2[l][c] = entrada.nextInt();
			}
		}
		
		for (l= 0; l < 4; l++){
			for (c = 0; c < 6; c++){
				m1[l][c] = (n1[l][c] + n2[l][c]);		
			}			
		}
		System.out.println();
		System.out.println("A soma dos elementos de mesma posição das matrizes N1 e N2:\n");
		for (l = 0; l< 4; l++){
			for (c = 0; c < 6; c++){
				System.out.printf("[ "+ m1[l][c] + " ]");
			}
			System.out.println();
		}
		
		for (l= 0; l < 4; l++){
			for (c = 0; c < 6; c++){
				m1[l][c] = (n1[l][c] - n2[l][c]);		
			}			
		}
		System.out.println();
		System.out.println("A Diferença dos elementos de mesma posição das matrizes N1 e N2:\n");
		for (l = 0; l< 4; l++){
			for (c = 0; c < 6; c++){
				System.out.printf("[ "+ m1[l][c] + " ]");
			}
			System.out.println();
		}
	}
}