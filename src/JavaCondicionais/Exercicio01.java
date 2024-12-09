package JavaCondicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		float A;
		float B;
		float C;
		
		
		Scanner leia = new Scanner(System.in);
		
	   System.out.println("Digite o numero A:");
	   A = leia.nextFloat();
	   
	   System.out.println("Digite o numero B;");
	   B = leia.nextFloat();
	   
	   System.out.println("Digite o numero C;");
	   C = leia.nextFloat();
	   
	   
	   if ( ( A + B) < C )   { 
	   
	   System.out.println("A soma de A + B e maior do C!");
	   
	   }else {
            System.out.println("A soma não e maior que C");
	}
	}
}
