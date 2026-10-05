package Telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Colaboradores.Empregado;
import Colaboradores.Fornecedor;
import Colaboradores.Administrador;
import Colaboradores.Operario;
import Colaboradores.Vendedor;

public class TelaDeCadastroEmpregado extends JFrame implements ActionListener {
	
	private Container container;
	private JLabel titulo;
	private JLabel cargo;
	private JComboBox<String> cbCargo;
	private String [] cargos = {"","Administrador", "Operário", "Vendedor"};
	
	//Atributos herdados da classe Pessoa
	private JLabel nome;
	private JTextField tNome;
	private JLabel endereco;
	private JTextField tEndereco;
	private JLabel telefone;
	private JTextField tTelefone;
	
	//Atributos da classe Empregado
	private JLabel codigoSetor;
	private JTextField tCodigoSetor;
	private JLabel imposto;
	private JTextField tImposto;
	private JLabel salarioBase;
	private JTextField tSalarioBase;
	
	//Atributo da classe Administrador
	private JLabel ajudaDeCusto;
	private JTextField tAjudaDeCusto;
	
	//Atributo da classe Operário
	private JLabel comissaoOperario;
	private JTextField tComissaoOperario;
	private JLabel valorProducao;
	private JTextField tValorProducao;
	
	//Atributo da classe vendedor
	private JLabel comissaoVendedor;
	private JTextField tComissaoVendedor;
	private JLabel valorVendas;
	private JTextField tValorVendas;
	
	//campos comuns
	private JLabel obsExtra;
	private JTextArea tObsExtra;
	private JCheckBox termoDeDeclaracao;
	private JLabel termoDeConcetimento;
	private JRadioButton rbSimConcetimento;
	private JRadioButton rbNaoConcetimento;
	private ButtonGroup bgConcetimento;
	private JButton bSubmeter;
	private JButton bReset;
	private JLabel mensagem;
	
	private JTextArea mostrador;
	
	private Empregado empregado;
		
	public TelaDeCadastroEmpregado() {
		final int recuoLabel = 15;
		final int recuoField = 170; 
		final int espacamento = 40;
		final int inicioForm = 30;
		
		setTitle("FICHA DE REGISTRO");
		setBounds (700, 10, 720, 800);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		
		container = getContentPane();
		container.setLayout(null);
		
		titulo = new JLabel ("Registro de Empregado");
		titulo.setFont(new Font("Arial", Font.PLAIN,25));
		titulo.setSize(300,30);
		titulo.setLocation(recuoLabel, inicioForm-10);
		container.add(titulo);
		
		cargo = new JLabel ("Cargo");
		cargo.setFont(new Font("Arial", Font.PLAIN, 17));
		cargo.setSize(180,25);
		cargo.setLocation(recuoLabel, inicioForm+espacamento*1);
		container.add(cargo);
		
		cbCargo = new JComboBox<String>(cargos);
		cbCargo.setFont(new Font("Arial", Font.PLAIN, 15));
		cbCargo.setSize(190,20);
		cbCargo.setLocation(recuoField, inicioForm+espacamento*1);
		container.add(cbCargo);
		cbCargo.addActionListener(this);
		
		
		nome = new JLabel ("Nome");
		nome.setFont(new Font("Arial", Font.PLAIN, 17));
		nome.setSize(100,20);
		nome.setLocation(recuoLabel,inicioForm+espacamento*2);
		container.add(nome);
		
		tNome = new JTextField();
		tNome.setFont(new Font("Arial", Font.PLAIN, 15));
		tNome.setSize(190,20);
		tNome.setLocation(recuoField, inicioForm+espacamento*2);
		container.add(tNome);
		
		endereco = new JLabel("Endereço");
		endereco.setFont(new Font("Arial", Font.PLAIN, 17));
		endereco.setSize(100,20);
		endereco.setLocation(recuoLabel,inicioForm+espacamento*3);
		container.add(endereco);
		
		tEndereco = new JTextField();
		tEndereco.setFont(new Font("Arial", Font.PLAIN, 15));
		tEndereco.setSize(190,20);
		tEndereco.setLocation(recuoField,inicioForm+espacamento*3);
		container.add(tEndereco);
		
		telefone = new JLabel("Telefone");
		telefone.setFont(new Font("Arial", Font.PLAIN, 17));
		telefone.setSize(100,20);
		telefone.setLocation(recuoLabel, inicioForm+espacamento*4);
		container.add(telefone);
		
		tTelefone = new JTextField();
		tTelefone.setFont(new Font("Arial", Font.PLAIN, 15));
		tTelefone.setSize(190,20);
		tTelefone.setLocation(recuoField,inicioForm+espacamento*4);
		container.add(tTelefone);
		
		codigoSetor = new JLabel("Código do setor");
		codigoSetor.setFont(new Font("Arial", Font.PLAIN, 17));
		codigoSetor.setSize(200,25);
		codigoSetor.setLocation(recuoLabel,inicioForm+espacamento*5);
		container.add(codigoSetor);
		
		tCodigoSetor = new JTextField();
		tCodigoSetor.setFont(new Font("Arial", Font.PLAIN, 15));
		tCodigoSetor.setSize(190,20);
		tCodigoSetor.setLocation(recuoField,inicioForm+espacamento*5);
		container.add(tCodigoSetor);
		
		imposto = new JLabel("Imposto(%)");
		imposto.setFont(new Font("Arial", Font.PLAIN, 17));
		imposto.setSize(200,20);
		imposto.setLocation(recuoLabel,inicioForm+espacamento*6);
		container.add(imposto);
		
		tImposto = new JTextField();
		tImposto.setFont(new Font("Arial", Font.PLAIN, 15));
		tImposto.setSize(190,20);
		tImposto.setLocation(recuoField,inicioForm+espacamento*6);
		container.add(tImposto);
		
		salarioBase = new JLabel("Salario Base(R$)");
		salarioBase.setFont(new Font("Arial", Font.PLAIN, 17));
		salarioBase.setSize(200,20);
		salarioBase.setLocation(recuoLabel,inicioForm+espacamento*7);
		container.add(salarioBase);
		
		tSalarioBase = new JTextField();
		tSalarioBase.setFont(new Font("Arial", Font.PLAIN, 15));
		tSalarioBase.setSize(190,20);
		tSalarioBase.setLocation(recuoField,inicioForm+espacamento*7);
		container.add(tSalarioBase);
		
		//Administrador
		ajudaDeCusto = new JLabel("Ajuda de Custo(R$)");
		ajudaDeCusto.setFont(new Font("Arial", Font.PLAIN, 17));
		ajudaDeCusto.setSize(200,20);
		ajudaDeCusto.setLocation(recuoLabel, inicioForm+espacamento*8);
		ajudaDeCusto.setVisible(false);
		container.add(ajudaDeCusto);
		
		tAjudaDeCusto = new JTextField();
		tAjudaDeCusto.setFont(new Font("Arial", Font.PLAIN, 15));
		tAjudaDeCusto.setSize(190,20);
		tAjudaDeCusto.setLocation(recuoField, inicioForm+espacamento*8);
		tAjudaDeCusto.setVisible(false);
		container.add(tAjudaDeCusto);
		
		//Operário
		comissaoOperario = new JLabel("Comissão (%)");
		comissaoOperario.setFont(new Font("Arial", Font.PLAIN, 17));
		comissaoOperario.setSize(200,20);
		comissaoOperario.setLocation(recuoLabel, inicioForm+espacamento*8);
		comissaoOperario.setVisible(false);
		container.add(comissaoOperario);

		tComissaoOperario = new JTextField();
		tComissaoOperario.setFont(new Font("Arial", Font.PLAIN, 15));
		tComissaoOperario.setSize(190,20);
		tComissaoOperario.setLocation(recuoField, inicioForm+espacamento*8);
		tComissaoOperario.setVisible(false);
		container.add(tComissaoOperario);

		valorProducao = new JLabel("Produção (R$)");
		valorProducao.setFont(new Font("Arial", Font.PLAIN, 17));
		valorProducao.setSize(220,20);
		valorProducao.setLocation(recuoLabel, inicioForm+espacamento*9);
		valorProducao.setVisible(false);
		container.add(valorProducao);

		tValorProducao = new JTextField();
		tValorProducao.setFont(new Font("Arial", Font.PLAIN, 15));
		tValorProducao.setSize(190,20);
		tValorProducao.setLocation(recuoField, inicioForm+espacamento*9);
		tValorProducao.setVisible(false);
		container.add(tValorProducao);

		//Vendedor
		comissaoVendedor = new JLabel("Comissão (%)");
		comissaoVendedor.setFont(new Font("Arial", Font.PLAIN, 17));
		comissaoVendedor.setSize(200,20);
		comissaoVendedor.setLocation(recuoLabel, inicioForm+espacamento*8);
		comissaoVendedor.setVisible(false);
		container.add(comissaoVendedor);

		tComissaoVendedor = new JTextField();
		tComissaoVendedor.setFont(new Font("Arial", Font.PLAIN, 15));
		tComissaoVendedor.setSize(190,20);
		tComissaoVendedor.setLocation(recuoField, inicioForm+espacamento*8);
		tComissaoVendedor.setVisible(false);
		container.add(tComissaoVendedor);

		valorVendas = new JLabel("Vendas (R$)");
		valorVendas.setFont(new Font("Arial", Font.PLAIN, 17));
		valorVendas.setSize(200,20);
		valorVendas.setLocation(recuoLabel, inicioForm+espacamento*9);
		valorVendas.setVisible(false);
		container.add(valorVendas);

		tValorVendas = new JTextField();
		tValorVendas.setFont(new Font("Arial", Font.PLAIN, 15));
		tValorVendas.setSize(190,20);
		tValorVendas.setLocation(recuoField, inicioForm+espacamento*9);
		tValorVendas.setVisible(false);
		container.add(tValorVendas);
		
		obsExtra = new JLabel("Observações");
		obsExtra.setFont(new Font("Arial", Font.PLAIN, 15));
		obsExtra.setSize(200,20);
		obsExtra.setLocation(recuoLabel,inicioForm+espacamento*10);
		container.add(obsExtra);
		
		tObsExtra = new JTextArea();
		tObsExtra.setFont(new Font("Arial", Font.PLAIN, 15));
		tObsExtra.setSize(recuoField+170,70);
		tObsExtra.setLocation(recuoLabel,inicioForm+espacamento*11-10);
		container.add(tObsExtra);
		
		termoDeDeclaracao = new JCheckBox("Declaro verdadeiras as informações");
		termoDeDeclaracao.setFont(new Font("Arial", Font.PLAIN, 15));
		termoDeDeclaracao.setSize(300,20);
		termoDeDeclaracao.setLocation(recuoLabel, inicioForm+espacamento*12+40);
		container.add(termoDeDeclaracao);
		
		termoDeConcetimento = new JLabel("Aceita os termos e condições?");
		termoDeConcetimento.setFont(new Font("Arial", Font.PLAIN, 15));
		termoDeConcetimento.setSize(300,20);
		termoDeConcetimento.setLocation(recuoLabel, inicioForm+espacamento*13+40);
		container.add(termoDeConcetimento);
		
		rbSimConcetimento = new JRadioButton("Sim");
		rbSimConcetimento.setFont(new Font("Arial", Font.PLAIN, 15));
		rbSimConcetimento.setSelected(false);
		rbSimConcetimento.setSize(100, 15);
		rbSimConcetimento.setLocation(recuoLabel, inicioForm+espacamento*14-15+40);
		container.add(rbSimConcetimento);
		
		rbNaoConcetimento = new JRadioButton("Não");
		rbNaoConcetimento.setFont(new Font("Arial", Font.PLAIN, 15));
		rbNaoConcetimento.setSelected(true);
		rbNaoConcetimento.setSize(100,15);
		rbNaoConcetimento.setLocation(recuoLabel + 100, inicioForm+espacamento*14-15+40);
		container.add(rbNaoConcetimento);
		
		bgConcetimento = new ButtonGroup();
		bgConcetimento.add(rbSimConcetimento);
		bgConcetimento.add(rbNaoConcetimento);
		
		
		bSubmeter = new JButton("SUBMETER");
		bSubmeter.setFont(new Font("Arial", Font.BOLD, 10));
		bSubmeter.setSize(100, 20);
		bSubmeter.setLocation(recuoLabel, inicioForm+espacamento*15+40);
		bSubmeter.addActionListener(this);
		container.add(bSubmeter);
		
		bReset = new JButton("LIMPAR");
		bReset.setFont(new Font("Arial", Font.BOLD, 10));
		bReset.setSize(100,20);
		bReset.setLocation(220, inicioForm+espacamento*15+40);
		bReset.addActionListener(this);
		container.add(bReset);
		
		mensagem = new JLabel();
		mensagem.setFont(new Font("Arial", Font.ITALIC, 15));
		mensagem.setSize(330, 20);
		mensagem.setLocation(recuoLabel, espacamento*13+120);
		container.add(mensagem);
		
		
		mostrador = new JTextArea();
		mostrador.setFont(new Font("Arial",Font.PLAIN, 15));
		mostrador.setSize(300, inicioForm+espacamento*13+40);
		mostrador.setLocation(recuoField+200, inicioForm);
		container.add(mostrador);
		
		setVisible(true);
		
	}
	
	private void atualizarCamposPorCargo() {
		String cargoSelecionado = (String) cbCargo.getSelectedItem();
	    ajudaDeCusto.setVisible(false);
	    tAjudaDeCusto.setVisible(false);
	    comissaoOperario.setVisible(false);
	    tComissaoOperario.setVisible(false);
	    valorProducao.setVisible(false);
	    tValorProducao.setVisible(false);
	    comissaoVendedor.setVisible(false);
	    tComissaoVendedor.setVisible(false);
	    valorVendas.setVisible(false);
	    tValorVendas.setVisible(false);
	    
	    
	    switch(cargoSelecionado) {
	    case "Administrador":
	    	ajudaDeCusto.setVisible(true);
	    	tAjudaDeCusto.setVisible(true);
	    	mensagem.setVisible(false);
	    	break;
	    case "Operário":
	    	comissaoOperario.setVisible(true);
	    	tComissaoOperario.setVisible(true);
	    	valorProducao.setVisible(true);
	    	tValorProducao.setVisible(true);
	    	mensagem.setVisible(false);
	    	break;
	    case "Vendedor":
	    	comissaoVendedor.setVisible(true);
	    	tComissaoVendedor.setVisible(true);
	    	valorVendas.setVisible(true);
	    	tValorVendas.setVisible(true);
	    	mensagem.setVisible(false);
	    	break;
	    	default:
	    		break;
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cbCargo) {
			atualizarCamposPorCargo();
		} else if (e.getSource() == bSubmeter) {
			if(termoDeDeclaracao.isSelected()) {
				if(rbSimConcetimento.isSelected()) {
					//empregado = new Empregado(tNome.getText(), tEndereco.getText(), tTelefone.getText(), Integer.parseInt(tCodigoSetor.getText()), Double.parseDouble(tSalarioBase.getText()),Double.parseDouble(tImposto.getText()), tObsExtra.getText());
					String cargoSelecionado = (String) cbCargo.getSelectedItem();
					
					switch (cargoSelecionado) {
			        case "Administrador":
			            empregado = new Administrador(tNome.getText(), tEndereco.getText(), tTelefone.getText(),
			                    Integer.parseInt(tCodigoSetor.getText()), Double.parseDouble(tSalarioBase.getText()),
			                    Double.parseDouble(tImposto.getText()), Double.parseDouble(tAjudaDeCusto.getText()),
			                    tObsExtra.getText());
			            break;
			        case "Operário":
			            empregado = new Operario(tNome.getText(), tEndereco.getText(), tTelefone.getText(),
			                    Integer.parseInt(tCodigoSetor.getText()), Double.parseDouble(tSalarioBase.getText()),
			                    Double.parseDouble(tImposto.getText()), Double.parseDouble(tValorProducao.getText()),
			                    Double.parseDouble(tComissaoOperario.getText()), tObsExtra.getText());
			            break;
			        case "Vendedor":
			            empregado = new Vendedor(tNome.getText(), tEndereco.getText(), tTelefone.getText(),
			                    Integer.parseInt(tCodigoSetor.getText()), Double.parseDouble(tSalarioBase.getText()),
			                    Double.parseDouble(tImposto.getText()), Double.parseDouble(tValorVendas.getText()),
			                    Double.parseDouble(tComissaoVendedor.getText()), tObsExtra.getText());
			            break;
			        default:
			        	mensagem.setText("Selecione um cargo.");
			            mensagem.setForeground(Color.RED);
			            return;
					}
					
					mostrador.setText(empregado.toString());
					mensagem.setText("Empregado cadastrado com sucesso.");
					mensagem.setForeground(Color.DARK_GRAY);
				} else {
					mensagem.setText("Aceite os termos e condições.");
					mensagem.setForeground(Color.RED);
				}
			} else {
				mensagem.setText("Marque que as informações são verdadeiras.");
				mensagem.setForeground(Color.RED);
			}
			
		}else if (e.getSource() == bReset) {
			String def = "";
			tNome.setText(def);
			tEndereco.setText(def);
			tTelefone.setText(def);
			tCodigoSetor.setText(def);
			tImposto.setText(def);
			tObsExtra.setText(def);
			termoDeDeclaracao.setSelected(false);
			rbNaoConcetimento.setSelected(true);
			mensagem.setText(def);
			
		}
		
	}
}
