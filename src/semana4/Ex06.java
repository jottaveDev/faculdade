package app;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int n = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(n * i);
		}
		
		sc.close();

	}

}
