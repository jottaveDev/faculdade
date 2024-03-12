package semana1e2;

import java.util.Scanner;

public class Ex003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado");
		int lado = sc.nextInt();
		int area = lado * lado;
		
		System.out.println("A area desse quadrado é: " + area);
		
		sc.close();
	}
}
