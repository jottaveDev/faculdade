package semana3;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double numberOne = sc.nextDouble();
		System.out.println("Digite outro numero");
		double numberTwo = sc.nextDouble();
		System.out.println("Digite outro numero");
		double numberThree = sc.nextDouble();
		
		if(numberOne == numberTwo || numberTwo == numberThree || numberOne == numberThree) {
			System.out.println("Os números devem ser diferente");
		} else if (numberOne > numberTwo) {
			System.out.println(numberOne + " é o maior numero!");
		} else if (numberTwo > numberThree) {
			System.out.println(numberTwo + " é o maior numero!");
		} else {
			System.out.println(numberThree + " é o maior numero!");
		}
		
		sc.close();
	}

}
