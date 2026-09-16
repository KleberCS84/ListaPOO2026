package Telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

import Colaboradores.*;


public class TelaDeCadastroFornecedor extends JFrame implements ActionListener{
	
	// Elementos do formulário
	private Container container;
	private JLabel titulo;
	private JLabel nome;
	private JTextField tNome;
	private JLabel endereco;
	private JTextField tEndereco;
	private JLabel telefone;
	private JTextField tTelefone;
	private JLabel valorCredito;
	private JTextField tValorCredito;
	private JLabel valorDivida;
	private JTextField tValorDivida;
	private JLabel obsExtras;
	private JTextArea tObsExtras;
	private JCheckBox termoDeDeclaracao;
	private JLabel termoDeConcetimento;
	private JRadioButton rbSimConcetimento;
	private JRadioButton rbNaoConcetimento;
	private ButtonGroup bgConcetimento;
	private JButton bSubmeter;
	private JButton bReset;
	
	private Fornecedor fornecedor;
	
	public TelaDeCadastroFornecedor() {
		final int recuoLabel = 15;
		final int recuoField = 130; 
		final int espacamento = 40;
		final int inicioForm = 30;
		
		setTitle("FICHA DE REGISTRO");
		setBounds (300, 90, 400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		container = getContentPane();
		container.setLayout(null);
		
		titulo = new JLabel ("Registro de Fornecedor");
		titulo.setFont(new Font("Arial", Font.PLAIN,25));
		titulo.setSize(300,30);
		titulo.setLocation(recuoLabel, inicioForm-10);
		container.add(titulo);
		
		nome = new JLabel ("Nome");
		nome.setFont(new Font("Arial", Font.PLAIN, 20));
		nome.setSize(100,20);
		nome.setLocation(recuoLabel,inicioForm+espacamento*1);
		container.add(nome);
		
		tNome = new JTextField();
		tNome.setFont(new Font("Arial", Font.PLAIN, 15));
		tNome.setSize(190,20);
		tNome.setLocation(recuoField, inicioForm+espacamento*1);
		container.add(tNome);
		
		endereco = new JLabel("Endereço");
		endereco.setFont(new Font("Arial", Font.PLAIN, 20));
		endereco.setSize(100,20);
		endereco.setLocation(recuoLabel,inicioForm+espacamento*2);
		container.add(endereco);
		
		tEndereco = new JTextField();
		tEndereco.setFont(new Font("Arial", Font.PLAIN, 15));
		tEndereco.setSize(190,20);
		tEndereco.setLocation(recuoField,inicioForm+espacamento*2);
		container.add(tEndereco);
		
		telefone = new JLabel("Telefone");
		telefone.setFont(new Font("Arial", Font.PLAIN, 20));
		telefone.setSize(100,20);
		telefone.setLocation(recuoLabel, inicioForm+espacamento*3);
		container.add(telefone);
		
		tTelefone = new JTextField();
		tTelefone.setFont(new Font("Arial", Font.PLAIN, 15));
		tTelefone.setSize(190,20);
		tTelefone.setLocation(recuoField,inicioForm+espacamento*3);
		container.add(tTelefone);
		
		valorCredito = new JLabel("Crédito");
		valorCredito.setFont(new Font("Arial", Font.PLAIN, 20));
		valorCredito.setSize(100,20);
		valorCredito.setLocation(recuoLabel,inicioForm+espacamento*4);
		container.add(valorCredito);
		
		tValorCredito = new JTextField();
		tValorCredito.setFont(new Font("Arial", Font.PLAIN, 15));
		tValorCredito.setSize(190,20);
		tValorCredito.setLocation(recuoField,inicioForm+espacamento*4);
		container.add(tValorCredito);
		
		valorDivida = new JLabel("Dívida");
		valorDivida.setFont(new Font("Arial", Font.PLAIN, 20));
		valorDivida.setSize(100,20);
		valorDivida.setLocation(recuoLabel,inicioForm+espacamento*5);
		container.add(valorDivida);
		
		tValorDivida = new JTextField();
		tValorDivida.setFont(new Font("Arial", Font.PLAIN, 15));
		tValorDivida.setSize(190,20);
		tValorDivida.setLocation(recuoField,inicioForm+espacamento*5);
		container.add(tValorDivida);
		
		obsExtras = new JLabel("Observações");
		obsExtras.setFont(new Font("Arial", Font.PLAIN, 15));
		obsExtras.setSize(200,20);
		obsExtras.setLocation(recuoLabel,inicioForm+espacamento*6);
		container.add(obsExtras);
		
		tObsExtras = new JTextArea();
		tObsExtras.setFont(new Font("Arial", Font.PLAIN, 15));
		tObsExtras.setSize(300,70);
		tObsExtras.setLocation(recuoLabel,inicioForm+espacamento*7-10);
		container.add(tObsExtras);
		
		termoDeDeclaracao = new JCheckBox("Declaro verdadeiras as informações");
		termoDeDeclaracao.setFont(new Font("Arial", Font.PLAIN, 15));
		termoDeDeclaracao.setSize(300,20);
		termoDeDeclaracao.setLocation(recuoLabel, inicioForm+espacamento*8+40);
		container.add(termoDeDeclaracao);
		
		termoDeConcetimento = new JLabel("Aceita os termos e condições?");
		termoDeConcetimento.setFont(new Font("Arial", Font.PLAIN, 15));
		termoDeConcetimento.setSize(300,20);
		termoDeConcetimento.setLocation(recuoLabel, inicioForm+espacamento*9+40);
		container.add(termoDeConcetimento);
		
		rbSimConcetimento = new JRadioButton("Sim");
		rbSimConcetimento.setFont(new Font("Arial", Font.PLAIN, 15));
		rbSimConcetimento.setSelected(false);
		rbSimConcetimento.setSize(100, 15);
		rbSimConcetimento.setLocation(recuoLabel, inicioForm+espacamento*10-15+40);
		container.add(rbSimConcetimento);
		
		rbNaoConcetimento = new JRadioButton("Não");
		rbNaoConcetimento.setFont(new Font("Arial", Font.PLAIN, 15));
		rbNaoConcetimento.setSelected(true);
		rbNaoConcetimento.setSize(100,15);
		rbNaoConcetimento.setLocation(recuoLabel + 100, inicioForm+espacamento*10-15+40);
		container.add(rbNaoConcetimento);
		
		bgConcetimento = new ButtonGroup();
		bgConcetimento.add(rbSimConcetimento);
		bgConcetimento.add(rbNaoConcetimento);
		
		
		bSubmeter = new JButton("SUBMETER");
		bSubmeter.setFont(new Font("Arial", Font.BOLD, 10));
		bSubmeter.setSize(100, 20);
		bSubmeter.setLocation(recuoLabel, inicioForm+espacamento*11+40);
		container.add(bSubmeter);
		
		bReset = new JButton("LIMPAR");
		bReset.setFont(new Font("Arial", Font.BOLD, 10));
		bReset.setSize(100,20);
		bReset.setLocation(220, inicioForm+espacamento*11+40);
		container.add(bReset);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
