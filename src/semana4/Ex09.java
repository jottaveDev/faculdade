package app;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um numero");
			double number = sc.nextDouble();
			
			if (number < 0) {
				System.out.println("Programa encerrado");
				break;
			} else {
				sum += number;
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
