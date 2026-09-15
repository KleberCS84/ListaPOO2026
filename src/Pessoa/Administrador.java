package Pessoa;

public class Administrador extends Empregado {
	private double ajudaDeCusto;
	
	public Administrador(
			String nome, 
			String endereco, 
			String telefone, 
			int codigoSetor, 
			double salarioBase, 
			double imposto, 
			double ajudaDeCusto
			) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.setAjudaDeCusto(ajudaDeCusto);
		
	}
	
	public double getAjudaDeCusto() {
		return this.ajudaDeCusto;
	}
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	

	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + this.getAjudaDeCusto();
	}
	
	@Override
	public String toString() {
		return super.toString()+
		"\nAjuda de Custo: "+ this.getAjudaDeCusto();
	}

}
