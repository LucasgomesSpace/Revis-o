package revisãoJava;

import java.util.ArrayList;
import java.util.Scanner;


public class SomaNumeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();


		int num; 
		int sm = 0 ;

		do {
			System.out.println("Digite um numero para a lista");
			num =ler.nextInt();
			numeros.add(num);
			sm += num; 
		}while(num!= 0);
			
		System.out.println("Os numeros da lista são: ");
		for (int p : numeros) {
			System.out.println("["+p+"]");
		}
		System.out.println("A soma dos numeros desta lista é = "+ sm);
		ler.close();
	}
}