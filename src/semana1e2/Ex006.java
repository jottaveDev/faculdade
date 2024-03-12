package semana1e2;

import java.util.Scanner;

public class Ex006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu salario:");
		double salarioFuncionario = sc.nextDouble();
		double salarioMinimo = 1412.00;
		double quantidadeSalarioMinimo = salarioFuncionario / salarioMinimo;
		
		System.out.printf("Quantidade de salário minimo: %.1f\n", quantidadeSalarioMinimo);
		
		System.out.println("Informe a porcentagem de aumento");
		double porcentagemAumento = sc.nextDouble() / 100;
		double bonus = salarioFuncionario * porcentagemAumento;
		double novoSalarioFuncionario = salarioFuncionario + bonus;
		
		System.out.println("Parabéns! Você ganhou um aumento de " + (porcentagemAumento * 100) + "% do salário.");
		System.out.println("Bônus de aumento: " + bonus);
		System.out.println("Salário com bônus: " + novoSalarioFuncionario);
		
		sc.close();
	}
}
