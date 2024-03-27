package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
		System.out.println("Escreva 5 idades");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Idade " + i);
			ages.add(sc.nextInt());
		}
		
		int maior = 0;
		for (int i = 0; i < ages.size(); i++) {
			if (ages.get(i) >= 18) {
				maior++;
			}
		}
		System.out.println(maior + " pessoas são maiores");
		
		sc.close();
	}

}
