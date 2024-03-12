package semana1e2;

import java.util.Scanner;

public class Ex004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do raio do circulo?");
		int raio = sc.nextInt();
		int area = 3 * (raio * raio);
		
		System.out.println("A area desse circulo é: " + area);
		
		sc.close();
	}
}
