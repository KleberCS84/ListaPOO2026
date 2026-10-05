package Colaboradores;

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;	
	private String obsExtra;
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.setValorCredito(valorCredito);
		this.setValorDivida(valorDivida);
		
	}
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida, String obsExtra) {
		super(nome, endereco, telefone);
		this.setValorCredito(valorCredito);
		this.setValorDivida(valorDivida);
		this.setObsExtra(obsExtra);		
	}

	
	public double getValorCredito() {
		return this.valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	public double getValorDivida() {
		return this.valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public String getObsExtra() {
		return this.obsExtra;
	}
	public void setObsExtra(String obsExtra) {
		this.obsExtra = obsExtra;
	}
	
	public double obterSaldo() {
		return this.getValorCredito() - this.getValorDivida();
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nCredito: "+ this.getValorCredito() + 
				"\nDívida: "+ this.getValorDivida()+
				"\nSaldo: "+ obterSaldo()+
				"\nObservação: "+ this.obsExtra;
	}

}
