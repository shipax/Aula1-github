package aplication;

import java.util.Scanner;

import entities.Alugueis;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Alugueis[] aluguel = new Alugueis[10];
		System.out.println("Quantos quartos serão alugados? ");
		int qtdadeAluguel = input.nextInt();
		
		for (int i = 0; i < qtdadeAluguel; i++) {
			System.out.printf("Aluguel %d", i + 1);
			System.out.println("\nNome: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.println("Email: ");
			String email = input.nextLine();
			System.out.println("Quarto: ");
			int quarto = input.nextInt();
			aluguel[quarto] = new Alugueis(name, email);
		}
		System.out.println("--Quartos Ocupados--");
		System.out.println();
		for (int i = 0; i < aluguel.length; i++) {
			if (aluguel[i] != null)
				System.out.println(i + ": " + aluguel[i]);
		}
		
		input.close();
	}

}
