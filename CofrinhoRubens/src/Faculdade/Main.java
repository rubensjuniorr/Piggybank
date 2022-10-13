package Faculdade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Cofrinho rubinho = new Cofrinho();
		rubinho.criarMoeda();
		
		int controle= 0;
		Scanner tecladin = new Scanner(System.in);
		int resposta;
		int resposta2;
		double valor;
		while(controle==0) {
			System.out.println("Precione 1 para adicionar moedas no cofrinho");
			System.out.println("Precione 2 para remover moedas no cofrinho");
			System.out.println("Precione 3 para lista todas as  moedas no cofrinho");
			System.out.println("Precione 4 para converter em real as moedas no cofrinho");
			System.out.println("Precione qualquer numero para encerrar o programa");
			resposta = tecladin.nextInt();
			
			switch(resposta) {                 //Trabalhei com switch para facilitar o programa
			case 1:
				System.out.println("Digite 1 para adicionar Dolar");				
				System.out.println("Digite 2 para adicionar Euro");				
				System.out.println("Digite 3 para adicionar Real");	
				System.out.println("Digite qualquer numero para voltar");
				resposta2 = tecladin.nextInt();
				switch(resposta2) {
				case 1:
					System.out.println("Quanto deseja adicionar?");
					valor = tecladin.nextDouble();
					rubinho.addDolar(valor);
					System.out.println("Valor adicionado com sucesso\n");
					break;
				case 2:
					System.out.println("Quanto deseja adicionar?");
					valor = tecladin.nextDouble();
					rubinho.addEuro(valor);
					System.out.println("Valor adicionado com sucesso\n");
					break;
				case 3:
					System.out.println("Quanto deseja adicionar?");
					valor = tecladin.nextDouble();
					rubinho.addReal(valor);
					System.out.println("Valor adicionado com sucesso\n");
					break;
				default:
					break;
					
				 }
				break;
			case 2:
				rubinho.mostrar();
				System.out.println("Digite 1 para remover Dolar");
				System.out.println("Digite 2 para remover Euro");
				System.out.println("Digite 3 para remover Real");
				System.out.println("Digite qualquer numero para voltar");
				resposta2 = tecladin.nextInt();
				switch(resposta2) {
				case 1:
					System.out.println("Quanto deseja remover?");
					valor = tecladin.nextDouble();
					rubinho.removeDolar(valor);
					System.out.println("Valor removido com sucesso\n");
					break;
				case 2:
					System.out.println("Quanto deseja remover?");
					valor = tecladin.nextDouble();
					rubinho.removeEuro(valor);
					System.out.println("Valor removido com sucesso\n");
					break;
				case 3:
					System.out.println("Quanto deseja remover?");
					valor = tecladin.nextDouble();
					rubinho.removeReal(valor);
					System.out.println("Valor removido com sucesso");
					break;
				default:
					break;
					
					
				 }
				break;
			case 3:
				rubinho.mostrar();
				System.out.println("\nDigite qualquer numero para voltar");
				resposta2 = tecladin.nextInt();
				break;
			
			case 4:
				rubinho.convercao();
				System.out.println("\n\nDigite qualquer numero para voltar");
				resposta2 = tecladin.nextInt();
				break;
			default:
				controle = 1;
			}
			
				
			
		}
		
		
	System.out.println("O programa foi finalizado :D");	
	}
	

}
