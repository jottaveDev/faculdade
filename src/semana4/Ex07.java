package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Escreva 5 numeros");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Numero " + i);
			numbers.add(sc.nextInt());
		}
		
		int entre0e50 = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) >= 0 && numbers.get(i) <= 50) {
				entre0e50++;
			}
		}
		System.out.println(entre0e50 + " numeros estao entre 0 e 50");
		
		sc.close();

	}

}
