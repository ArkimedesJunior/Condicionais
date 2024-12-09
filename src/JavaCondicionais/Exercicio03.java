package JavaCondicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		String Doador;
		int Idade;
		boolean PrimeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu Nome:");
		Doador = leia.next();
		
		System.out.println("Digite sua Idade:");
		Idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue?");
		PrimeiraDoacao = leia.nextBoolean();
		
	   
		if(Idade < 18 || Idade > 69) {
			System.out.println(Doador + ", não está apto a doar sangue! ");
			
			 
		} else if(Idade >= 60 && Idade <= 69) {
			if (PrimeiraDoacao) {
				System.out.println(Doador + ", não está apto para doar sangue!");
		
				
			} else {
				System.out.println(Doador + ", voce esta apto para doar sangue!");
			}
		
		}else {
			System.out.println(Doador +", voce esta apto para doar sangue");
		}
			
		

	}

}
