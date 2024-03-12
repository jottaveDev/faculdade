package semana3;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String isPasswordValid = "movidoACafe";

		System.out.println("Digite sua senha");
		String userPassword = sc.nextLine();
		
		if(userPassword.equals(isPasswordValid)) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}
		
		sc.close();
	}
}
