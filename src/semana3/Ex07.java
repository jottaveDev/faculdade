package semana3;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual dia da semana deseja ir?");
		String diaSemana = sc.nextLine();
		System.out.println("Informe sua idade");
		int idade = sc.nextInt();
		System.out.println("Possui carteira de meio ingresso? S (sim) ou N (não)");
		String temCarteiraMeioIngresso = sc.next();

		boolean menorQue18 = idade < 18;
		boolean possuiCarteira = temCarteiraMeioIngresso.equals("S");

		int precoIngresso;

		if (diaSemana.equals("segunda") || diaSemana.equals("terça") || diaSemana.equals("quinta")) {
			precoIngresso = 20;
			if (menorQue18 || possuiCarteira) {
				precoIngresso = precoIngresso / 2;
			}
			System.out.println("Dia escolhido: " + diaSemana);
			System.out.println("O preço do seu ingresso é R$ " + precoIngresso);
		}
		if (diaSemana.equals("quarta")) {
			precoIngresso = 16;
			if (menorQue18 || possuiCarteira) {
				precoIngresso = precoIngresso / 2;
			}
			System.out.println("Dia escolhido: " + diaSemana);
			System.out.println("O preço do seu ingresso é R$ " + precoIngresso);
		}
		if (diaSemana.equals("sexta") || diaSemana.equals("sábado") || diaSemana.equals("domingo")) {
			precoIngresso = 26;
			if (menorQue18 || possuiCarteira) {
				precoIngresso = precoIngresso / 2;
			}
			System.out.println("Dia escolhido: " + diaSemana);
			System.out.println("O preço do seu ingresso é R$ " + precoIngresso);
		}

		sc.close();
	}

}
