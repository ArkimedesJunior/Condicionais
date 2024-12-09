package JavaCondicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numero;
		
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		 numero = leia.nextInt();
		
		
		
		if (numero % 2 == 0) {
			System.out.println("O numero é par");
		} else {
			System.out.println("O  numero é ímpar");
		}
		
		if (numero > 0) {
			System.out.println("O numero é positivo");
		} else {
			System.out.println("O numero é negativo");
		
			
		}
	}
}
