package exercicios03;
/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        
		int n, par = 0, impar = 0;
		
		for(int i = 1; i <= 10; i++){
			System.out.println("Digite o " + i + "º número: ");
			n = ler.nextInt();
			
			if(n % 2 == 0){
                par++;
			}
			else {
				impar++;
			}
		}

		System.out.println("Existem " + par + " números pares e " + impar + " números impares." );
	}

}
