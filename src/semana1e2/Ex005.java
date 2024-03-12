package semana1e2;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu peso? (em kg)");
		int peso = sc.nextInt();
		System.out.println("Qual a sua altura? (em cm)");
		int altura = sc.nextInt();
		
		int imc = (peso * 10000) / (altura * altura);
		
		System.out.println("O seu imc é: " + imc);
		
		sc.close();
	}

}
