package Faculdade;

public class Dolar extends Moeda{
	
	double dolar = 0;

	public Dolar(double dolar) {
		super(dolar);
		this.dolar = dolar;
	}
	
	public void remover(double dolar) {
		if(dolar< this.dolar)
			this.dolar -= dolar;
		else
			this.dolar = 0;
		
	
			
	}
	
	public void mostrar() {
		
		System.out.println("Dolar: $" + this.dolar);
		
	}


	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return super.getValor();
	}

	@Override
	public void setValor(double valor) {
		// TODO Auto-generated method stub
		super.setValor(valor);
	}                                              //Adicionei os valores em cada umas das moedas de add/remover etc
	@Override
	public void adicionar(double dolar) {
		this.dolar += dolar;
	}


	@Override
	public void setDinheiro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getDinheiro() {
		// TODO Auto-generated method stub
		return dolar;
	}

	
	
	
}
