package exercicios04;

import java.util.Scanner;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
public class Ex2 {

	public static void main(String[] args) {
		int [] lancamento = new int[10];
		int maior= 0, ocr= 0;
		float soma=0, cont=00;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número entre 1 e 6\n");
		
			for (int i = 0 ; i<10; i++){
				System.out.println ((i+1) + "º lançamento: ");
				lancamento[i] = entrada.nextInt();
					while(lancamento[i] < 1 || lancamento[i]>6) {
						System.out.println (" Número invalido!!!\n");
						System.out.println ((i+1)+ "º lançamento: ");
						lancamento[i] = entrada.nextInt();
					}
					soma +=lancamento[i]; 
					if(lancamento[i] > maior){
						maior = lancamento[i];
					}
				cont++;
			}
			for(int i=0; i<10; i++){
				if(lancamento[i] == maior){
		               ocr++;	
					}
			}
			System.out.println ("\nO valor da média é "+ (soma/cont));
			System.out.println ("\nO maior valor foi " + maior + " e ocorreu " + ocr +" vezes");
	}
}