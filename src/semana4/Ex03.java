package app;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do usuário");
		String user = sc.nextLine();
		
		System.out.println("Quantas vezes deseja exibir?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println(i + " " + user);
		}
		
		sc.close();
	}

}
