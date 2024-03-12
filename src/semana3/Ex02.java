package semana3;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a nota do aluno");
		double score = sc.nextDouble();

		if (score >= 7) {
			System.out.println("Aluno aprovado com a nota " + score + "!");
		} else if (score >= 6) {
			System.out.println("Aluno aprovado na final com a nota " + score + "!");
		} else {
			System.out.println("Aluno reprovado com a nota " + score + "!");
		}

		sc.close();
	}
}