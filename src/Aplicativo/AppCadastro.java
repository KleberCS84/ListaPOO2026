package Aplicativo;
import Colaboradores.Administrador;
import Telas.TelaDeCadastroFornecedor;
import Colaboradores.Empregado;
import Colaboradores.Fornecedor;
import Colaboradores.Operario;
import Colaboradores.Pessoa;
import Colaboradores.Vendedor;

public class AppCadastro {

	public static void main(String[] args) {
		
		final double taxaImposto = 27;
		final double comissaoOperario = 10;
		final double comissaoVendedor = 10;
			
		/*Pessoa[] listaDePessoas = {
			new Fornecedor("Fulano","Rua Street","555-555-555",2000, 1300),
			new Empregado("Gael", "Rua da Aura", "676-767-676", 67,1900, taxaImposto),
			new Administrador("Beltrano", "Rua Vila do chaves", "454-545-454",8,1800,taxaImposto,350),
			new Operario("Astrogildo", "rua centro", "232-233-233", 6, 1000, taxaImposto, 5000, comissaoOperario),
			new Vendedor("Ciclano","Rua nomeio", "666-556-656",1, 1200,taxaImposto, 4000, comissaoVendedor)
		};
		
		System.out.println("----LISTA DE PESSOAS----");
		for (Pessoa p : listaDePessoas) {
			System.out.println(p);
		}*/
		
		TelaDeCadastroFornecedor teste = new TelaDeCadastroFornecedor();
		
	}

}
