package revisãoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class VerifacPositivo {

	public static void main(String[] args) {
	
		
		ArrayList<Integer> nume = new ArrayList<Integer>();

		Scanner ler = new Scanner (System.in);
		int sm = 0 ;
		int foi ;
		do {
			System.out.println("Digite um numero para a lista");
			foi =ler.nextInt();
			if ( foi > 0 ) {
				nume.add(foi);
			}
			else {}
		}while(foi !=0);
		
		
		for (int i : nume) {
			System.out.println(i);
		}
		System.out.println("A soma dos numeros pares = "+ sm);
		ler.close();

	}

}
