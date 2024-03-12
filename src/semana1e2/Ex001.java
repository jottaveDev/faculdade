package semana1e2;

import java.util.Scanner;

public class Ex001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero 1");
		int numero1 = sc.nextInt();
		System.out.println("Digite o numero 2");
		int numero2 = sc.nextInt();
		System.out.println("Digite o numero 3");
		int numero3 = sc.nextInt();
		
		int media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println("A média dos números é: " + media);
		sc.close();
	}
}
