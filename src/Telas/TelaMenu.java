package Telas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaMenu extends JFrame implements ActionListener{
	private Container container;
	private JLabel titulo;
	private JButton bFornecedor;
	private JButton bEmpregado;
	
	public TelaMenu() {
		setTitle("MENU DE CADASTRO");
		setBounds(700,10,350,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		container = getContentPane();
		container.setLayout(null);
		
		titulo = new JLabel("Selecione o cadastro");
		titulo.setFont(new Font("Arial", Font.PLAIN, 20));
		titulo.setSize(300,30);
		titulo.setLocation(20,20);
		container.add(titulo);
		
		bFornecedor = new JButton("Cadastrar Fornecedor");
		bFornecedor.setFont(new Font("Arial", Font.PLAIN, 15));
		bFornecedor.setSize(250,40);
		bFornecedor.setLocation(50,80);
		bFornecedor.addActionListener(this);
		container.add(bFornecedor);
		
		bEmpregado = new JButton("Cadastrar Empregado");
		bEmpregado.setFont(new Font("Arial", Font.PLAIN, 15));
		bEmpregado.setSize(250,40);
		bEmpregado.setLocation(50,140);
		bEmpregado.addActionListener(this);
		container.add(bEmpregado);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bFornecedor) {
			new TelaDeCadastroFornecedor();
		} else if (e.getSource() == bEmpregado) {
			new TelaDeCadastroEmpregado();
		}
	}

}
