package semana3;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o planeta: M (Marte) ou L (Lua)");
		String planet = sc.nextLine();
		System.out.println("Informe o seu peso");
		double weight = sc.nextDouble();
		
		double weightMarte = (weight / 9.81) * 1.62;
		double weightLua = (weight / 9.81) * 3.71;
		
		if(planet.equals("M")) {
			System.out.printf("Seu peso em Marte é : %.3f\n", weightMarte);
		} else if(planet.equals("L")) {
			System.out.printf("Seu peso na Lua é : %.3f\n",weightLua);
		} else {
			System.out.println("Informe um planeta válido");
		}
		
		sc.close();
	}
}
