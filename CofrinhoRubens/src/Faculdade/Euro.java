package Faculdade;

public class Euro extends Moeda {
	
	double euro = 0;

	public Euro(double euro) {
		super(euro);
		this.euro = euro;
	}
	public void remove(double euro) {
		this.euro -= euro;
	}

	public void mostrar () {
		
		System.out.println("Euro: €" + this.euro);
		
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
	}

	@Override
	public void adicionar(double euro) {
		this.euro += euro;
	}
		
	
	@Override
	public void setEuro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getEuro() {
		// TODO Auto-generated method stub
		return euro;
	}
	@Override
	public void setDinheiro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getDinheiro() {
		// TODO Auto-generated method stub
		return euro;
		
	}
	public void remover(double euro) {
		if(euro< this.euro)
			this.euro -= euro;
		else
			this.euro = 0;
	}
	
    
	

	
}
