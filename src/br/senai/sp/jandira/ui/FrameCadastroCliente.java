package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class FrameCadastroCliente extends JFrame {

	private JPanel ContantPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtDataNascimento;
	private final ButtonGroup buttonGroupGenero = new ButtonGroup();

	public FrameCadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 318);
		ContantPane = new JPanel();
		ContantPane.setBackground(new Color(153, 51, 0));
		ContantPane.setForeground(Color.WHITE);
		ContantPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ContantPane);
		ContantPane.setLayout(null);
		
		JButton btnSalvar = new JButton("Salvar Contato");
		btnSalvar.setBounds(281, 217, 120, 30);
		ContantPane.add(btnSalvar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		ContantPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 32, 233, 20);
		ContantPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(10, 88, 233, 20);
		ContantPane.add(txtEmail);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 67, 46, 14);
		ContantPane.add(lblEmail);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBounds(10, 154, 99, 20);
		ContantPane.add(txtDataNascimento);
		
		JLabel lblDataNascimento = new JLabel("Data de Nasc.:");
		lblDataNascimento.setBounds(10, 133, 99, 14);
		ContantPane.add(lblDataNascimento);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(133, 133, 46, 14);
		ContantPane.add(lblSexo);
		
		JRadioButton radioFeminino = new JRadioButton("F");
		buttonGroupGenero.add(radioFeminino);
		radioFeminino.setBounds(129, 153, 50, 23);
		ContantPane.add(radioFeminino);
		
		JRadioButton radioMasculino = new JRadioButton("M");
		buttonGroupGenero.add(radioMasculino);
		radioMasculino.setBounds(190, 153, 53, 23);
		ContantPane.add(radioMasculino);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 193, 46, 14);
		ContantPane.add(lblCidade);
		
		JComboBox comboCidade = new JComboBox();
		comboCidade.setModel(new DefaultComboBoxModel(new String[] {"Itapevi", "Jandira", "Osasco", "Barueri", "Carapicuiba", "Santana de Parnaiba", "Pirapora", "Cotia"}));
		comboCidade.setBounds(10, 221, 233, 22);
		ContantPane.add(comboCidade);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(281, 33, 120, 174);
		ContantPane.add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Lasanha", "Pastel", "Coxinha", "Pizza", "Feijoada", "Farofa", "Miojo", "Goiabada", "Mandioca", "Batata Doce", "Limonada"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
	}
}
