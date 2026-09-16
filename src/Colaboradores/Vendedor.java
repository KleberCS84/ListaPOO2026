package Colaboradores;

public class Vendedor extends Empregado {
	private double valorVendas;
	private double comissao;
	
	public Vendedor (
			String nome,
			String endereco,
			String telefone,
			int codigoSetor,
			double salarioBase,
			double imposto,
			double valorVendas,
			double comissao){
		super(nome,endereco, telefone, codigoSetor, salarioBase, imposto);
		this.setValorVendas(valorVendas);
		this.setComissao(comissao);
		
	}

	public double getValorVendas() {
		return this.valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return this.comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public String toString() {
		return super.toString()+
		"\nValor de Vendas: "+this.getValorVendas()+
		"\nComissão: "+(this.getValorVendas()*this.getComissao()/100);
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + (this.getValorVendas()*this.getComissao()/100);
	}

}
