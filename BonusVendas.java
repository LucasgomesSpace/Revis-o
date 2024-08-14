package revisãoJava;

import java.util.Scanner;

public class BonusVendas {

	public static void main(String[] args) {

		Scanner ler =new Scanner (System.in); 
		int bon  ; 
		int vend = 0 ;

		for (int i = 1; i <= 4; i++) {
			System.out.println("Quantas vendas foram realizadas na "+i+"º semana ?");
			bon =ler.nextInt();
			vend += bon;
		}
		System.out.println("Foram realizadas " + vend + " vendas e você obteve um ");

		switch (vend) {

		case 1 : System.out.println("Sem Bonus");
		break;
		case 2 : System.out.println("Sem Bonus");
		break;
		case 3 : System.out.println("Sem Bonus");
		break;
		case 4 : System.out.println("Sem Bonus");
		break;
		case 5 : System.out.println("Sem Bonus");
		break;
		case 6 : System.out.println("Sem Bonus");
		break;
		case 7 : System.out.println("Sem Bonus");
		break;
		case 8 : System.out.println("Sem Bonus");
		break;
		case 9 : System.out.println("Sem Bonus");
		break;
		case 10 : System.out.println("Sem Bonus");
		break;
		case 11 : System.out.println("Bonus de 100 reais");
		break;
		case 12 : System.out.println("Bonus de 100 reais");
		break;
		case 13 : System.out.println("Bonus de 100 reais");
		break;
		case 14 : System.out.println("Bonus de 100 reais");
		break;
		case 15 : System.out.println("Bonus de 100 reais");
		break;
		case 16 : System.out.println("Bonus de 300 reais");
		break;
		case 17 : System.out.println("Bonus de 300 reais");
		break;
		case 18 : System.out.println("Bonus de 300 reais");
		break;
		case 19 : System.out.println("Bonus de 300 reais");
		break;
		case 20 : System.out.println("Bonus de 300 reais");
		break;
		default : System.out.println("Bonus de 500 reais"); 

		}
		ler.close();
	}
}