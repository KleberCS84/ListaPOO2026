package Colaboradores;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	private String obsExtra;
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
		super(nome,endereco, telefone);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
		
	}
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, String obsExtra) {
		super(nome,endereco, telefone);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
		this.setObsExtra(obsExtra);
		
	}
	
	public int getCodigoSetor() {
		return this.codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getImposto() {
		return this.imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public String getObsExtra() {
		return this.obsExtra;
	}
	public void setObsExtra(String obsExtra) {
		this.obsExtra = obsExtra;
	}
	
	public double calcularSalario() {
		return this.getSalarioBase() - (this.getImposto() / 100 * this.getSalarioBase());
	}
	
	@Override
	public String toString() {
		return super.toString()+
				"\nCodigo Setor: "+this.getCodigoSetor()+
				"\nSalario Base: "+this.getSalarioBase()+
				"\nImpostos: "+ this.getImposto()+"%"+
				"\nSalario Líquido: "+ calcularSalario()+
				"\nObservação: "+ this.obsExtra;
	}

}
