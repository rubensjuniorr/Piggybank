package Faculdade;

public abstract class Moeda {
	
	public double valor;

	public double getValor() {
		return valor;
	}

	public Moeda(double valor) {
		super();
		this.valor = valor;                 //Como pedido na atividade fiz os abstract na moeda e os sets e gets
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	abstract void adicionar(double moeda);
	abstract void remover (double moeda);
	abstract void mostrar ();


	public void setEuro() {
		// TODO Auto-generated method stub
		
	}

	public double getEuro() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setDinheiro() {
		// TODO Auto-generated method stub
		
	}

	public double getDinheiro() {
		// TODO Auto-generated method stub
		return 0;
	}
}


	