package Pessoa;

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;
	
	public Operario(
			String nome, 
			String endereco, 
			String telefone, 
			int codigoSetor, 
			double salarioBase, 
			double imposto, 
			double valorProducao, 
			double comissao) {
		super(nome, endereco, telefone, codigoSetor,salarioBase, imposto);
		this.setValorProducao(valorProducao);
		this.setComissao(comissao);
	}
	
	public double getValorProducao() {
		return this.valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	public double getComissao() {
		return this.comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + (this.getValorProducao()*this.getComissao()/100);
	}

	@Override
	public String toString() {
		return super.toString()+
		"\nComissão: "+(this.getValorProducao()*this.getComissao()/100);
	}
}
