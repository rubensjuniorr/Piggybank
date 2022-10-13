package Faculdade;
import java.util.ArrayList;
import java.util.Arrays;


public class Cofrinho {
	ArrayList<Moeda> moedinhas = new ArrayList<Moeda>();
		
	public void criarMoeda() {
		moedinhas.add(new Dolar(0));// INDICE 0
		moedinhas.add(new Euro(0));	// INDICE 1
		moedinhas.add(new Real(0));	// INDICE 2
	}
	
	public void mostrar() {
		System.out.println("Voce possui:");
		moedinhas.get(0).mostrar();
		moedinhas.get(1).mostrar();
		moedinhas.get(2).mostrar();
	}
	
	public void addDolar(double input) {
		moedinhas.get(0).adicionar(input);
	}
	public void addEuro(double input) {
		moedinhas.get(1).adicionar(input);
	}
	public void addReal(double input) {
		moedinhas.get(2).adicionar(input);           // Aqui fiz as funções de cada um das moedas
	}
	public void removeDolar(double input) {
		moedinhas.get(0).remover(input);
	}
	public void removeEuro(double input) {
		moedinhas.get(1).remover(input);
	}
	public void removeReal(double input) {
		moedinhas.get(2).remover(input);
	}
	public void convercao() {
		double dolar = moedinhas.get(0).getDinheiro();
		double euro = moedinhas.get(1).getDinheiro();
		double real = moedinhas.get(2).getDinheiro();
		
		dolar = dolar*4.9;
		euro = euro*5.2;
		double soma = real + euro + dolar;
		System.out.println("Voce Possui no total em reais: R$" + soma);
		
	}
	
	
	
}

