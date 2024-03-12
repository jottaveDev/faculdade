package semana3;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do produto");
		String nameProduct = sc.nextLine();
		System.out.println("Informe o preço do produto");
		double price = sc.nextDouble();

		double discount = 0;
		double priceWithDiscount;

		if (price >= 50 && price < 200) {
			discount = 0.05;
			priceWithDiscount = (price + (price * discount));
			System.out.println(nameProduct + ": R$ " + price);
			System.out.println("Preço com desconto: R$ " + priceWithDiscount);
		} else if (price >= 200 && price < 500) {
			discount = 0.06;
			priceWithDiscount = (price + (price * discount));
			System.out.println(nameProduct + ": R$ " + price);
			System.out.println("Preço com desconto: R$ " + priceWithDiscount);
		} else if (price >= 500 && price < 1000) {
			discount = 0.07;
			priceWithDiscount = (price + (price * discount));
			System.out.println(nameProduct + ": R$ " + price);
			System.out.println("Preço com desconto: R$ " + priceWithDiscount);
		} else if (price >= 1000) {
			discount = 0.08;
			priceWithDiscount = (price + (price * discount));
			System.out.println(nameProduct + ": R$ " + price);
			System.out.println("Preço com desconto: R$ " + priceWithDiscount);
		} else if (price <= 0) {
			System.out.println("Valor inválido!");
		} else {
			System.out.println(nameProduct + ": R$ " + price);
		}

		sc.close();
	}

}
