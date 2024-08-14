package revisãoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroParArray {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		Scanner ler = new Scanner (System.in);
		int sm = 0 ;
		int num ;
		do {
			System.out.println("Digite um numero para a lista");
			num =ler.nextInt();
			numeros.add(num);
			if ( num % 2 == 0 ) {
				sm += num;
			}
			else {}
		}while(num !=0);

		for (int i : numeros) {
			System.out.println(i);
		}
		System.out.println("A soma dos numeros pares = "+ sm);
		ler.close();
	}
}