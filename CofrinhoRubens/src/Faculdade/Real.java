package Faculdade;


public class Real extends Moeda {
	
	double real = 0;

	public Real(double real) {
		super(real);
		this.real = real;
	}
	@Override
	public void setDinheiro() {
		// TODO Auto-generated method stub
		
	}
	
	public void mostrar () {
		
		System.out.println("Real: R$" + this.real);
		
	}

	@Override
	public double getDinheiro() {
		// TODO Auto-generated method stub
		return real;
	}

	@Override
	public void adicionar(double real) {
		this.real += real;
		// TODO Auto-generated method stub
		
	}
	public void remover(double real) {
		if(real< this.real)
			this.real -= real;
		else
			this.real = 0;
	}


	

	

	

}
