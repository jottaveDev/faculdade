package app;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome");
		String name = sc.nextLine();
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		sc.close();

	}

}
