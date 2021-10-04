package exercicios01;
/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int a, m, d, i;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Idade em dias: ");
		i = leia.nextInt();
		
		a =i/365;
		m =(i%365)/30;
		d =((i%365)%30);
		
		System.out.println(a + " Anos " + m + " Meses " + d + " Dias " );
		
		leia.close();
		
	}

}
