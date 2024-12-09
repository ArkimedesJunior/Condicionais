package JavaCondicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		String nome;
		int codigo;
		float salario;
		float percentualReajuste = 0.0f;
		float novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Codigo 1 para Gerente");
		System.out.println("Codigo 2 para Vendedor");
		System.out.println("Codigo 3 para Supervisor");
		System.out.println("Codigo 4 para Motorista");
		System.out.println("Codigo 5 para Estoquista");
		System.out.println("Codigo 6 para Tecnico de Ti");
		
		codigo = leia.hashCode();
		
		System.out.println("Digite o seu nome:");
		nome = leia.next();
		
		
		System.out.println("Digite o seu cargo:");
		nome = leia.next();
		
		System.out.println("Digite o seu salario atual:");
		salario = leia.nextFloat();
		
		
		switch (codigo) {
		case 1:
			System.out.println("Ola Gerente " + nome );
			System.out.printf("O seu novo salario é: %.2f", salario * 1.1 );
			break;
			
		case 2: 
			System.out.println("Ola Vendedor " + nome );
			System.out.printf("O seu novo salario é: %.2f", salario * 1.07 );
			break;
			
		case 3:
			System.out.println("Ola Supervisor " + nome );
			System.out.printf("O seu novo salario é: %.2f", salario * 1.09 );
			break;
			
		case 4:
			System.out.println("Ola Motorista " + nome );
			System.out.printf("O seu novo salario é: %.2f", salario * 1.06 );
			break;

		case 5:
			System.out.println("Ola Estoquista"+  nome) ;
			System.out.printf("O seu novo salario é: %.2f", salario * 1.05);
			break;   


		case 6:
			System.out.println("Ola Tecnico de TI" + nome ) ;
			System.out.printf("O seu novo salario é: %.2f", salario * 1.08);
			break;   

		
         
    }
		
		  novoSalario = salario + (percentualReajuste * salario);

        
		System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Codigo: " + nome );
        System.out.printf("Novo salário reajustado: R$ %.2f\n", novoSalario);
		}
		

	}


