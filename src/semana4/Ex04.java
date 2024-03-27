package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> ages = new ArrayList<Integer>();

		System.out.println("Escreva 5 idades");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Idade " + i);
			ages.add(sc.nextInt());
		}

		int sum = 0;
		for (Integer i = 0; i < ages.size(); i++) {
			System.out.println(ages.get(i));
			sum += ages.get(i);
		}

		System.out.println("A média é: " + sum / 5);

		sc.close();
	}

}
