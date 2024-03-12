package semana3;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a nota do aluno");
		double score = sc.nextDouble();

		if (score >= 7) {
			System.out.println("Você foi aprovado com a nota " + score + "!");
		} else {
			System.out.println("Você foi reprovado com a nota " + score + "!");
		}

		sc.close();
	}
}
