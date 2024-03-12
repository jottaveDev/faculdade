package semana1e2;

import java.util.Scanner;

public class Ex002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero 1");
		int numero1 = sc.nextInt();
		System.out.println("Digite o numero 2");
		int numero2 = sc.nextInt();
		System.out.println("Digite o numero 3");
		int numero3 = sc.nextInt();
		
		int mediaPonderada = ((numero1 * 3) + (numero2 * 5) + (numero3 * 8)) / 16;
		
		System.out.println("A média ponderada dos números é: " + mediaPonderada);
		sc.close();
	}
}
