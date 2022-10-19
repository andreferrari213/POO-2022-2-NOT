package exercicio05prova;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EventoApresentacao extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtValor;
	private JTextField txtData;
	private JTextField txtQtdPagantes;
	private JTextField txtOpiniaoGeral;
	private JTextField txtNomeBanda;
	private JTextField txtEstiloMusical;
	private JCheckBox checkShowMusical;
	private JButton bt_salvar;
	private JLabel lblEstiloMusical;
	private JLabel lblNomeBanda;

	private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventoApresentacao frame = new EventoApresentacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EventoApresentacao() {
		setResizable(false);
		setTitle("Gest\u00E3o de Eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("T\u00EDtulo:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);

		txtTitulo = new JTextField();
		txtTitulo.setBounds(73, 8, 214, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Valor:");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel_1);

		txtValor = new JTextField();
		txtValor.setBounds(73, 33, 214, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Data:");
		lblNewLabel_2.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel_2);

		txtData = new JTextField();
		txtData.setBounds(73, 58, 214, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Avalia\u00E7\u00E3o");
		lblNewLabel_3.setBounds(10, 86, 65, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Qtd pagantes:");
		lblNewLabel_4.setBounds(10, 111, 86, 14);
		contentPane.add(lblNewLabel_4);

		txtQtdPagantes = new JTextField();
		txtQtdPagantes.setBounds(106, 108, 181, 20);
		contentPane.add(txtQtdPagantes);
		txtQtdPagantes.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Opini\u00E3o geral:");
		lblNewLabel_5.setBounds(10, 136, 86, 14);
		contentPane.add(lblNewLabel_5);

		txtOpiniaoGeral = new JTextField();
		txtOpiniaoGeral.setBounds(106, 133, 318, 20);
		contentPane.add(txtOpiniaoGeral);
		txtOpiniaoGeral.setColumns(10);

		checkShowMusical = new JCheckBox("Show musical");
		checkShowMusical.setBounds(6, 157, 126, 23);
		contentPane.add(checkShowMusical);

		lblNomeBanda = new JLabel("Nome banda:");
		lblNomeBanda.setEnabled(false);
		lblNomeBanda.setBounds(10, 190, 86, 14);
		contentPane.add(lblNomeBanda);

		txtNomeBanda = new JTextField();
		txtNomeBanda.setEnabled(false);
		txtNomeBanda.setBounds(106, 184, 181, 20);
		contentPane.add(txtNomeBanda);
		txtNomeBanda.setColumns(10);

		lblEstiloMusical = new JLabel("Estilo musical:");
		lblEstiloMusical.setEnabled(false);
		lblEstiloMusical.setBounds(10, 215, 86, 14);
		contentPane.add(lblEstiloMusical);

		txtEstiloMusical = new JTextField();
		txtEstiloMusical.setEnabled(false);
		txtEstiloMusical.setBounds(106, 209, 181, 20);
		contentPane.add(txtEstiloMusical);
		txtEstiloMusical.setColumns(10);

		bt_salvar = new JButton("Salvar");
		bt_salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastra();
			}
		});
		bt_salvar.setBounds(10, 266, 89, 23);
		contentPane.add(bt_salvar);

		JButton btnRelatorio = new JButton("Relatório");
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder("Eventos:\n");

				//TODO FOR EM TODOS OS ELEMENTOS USANDO sb.append

				JOptionPane.showMessageDialog(null, sb.toString());
			}
		});
		btnRelatorio.setBounds(335, 266, 89, 23);
		contentPane.add(btnRelatorio);
		
		JButton bt_buscar = new JButton("Buscar");
		bt_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String titulo = JOptionPane.showInputDialog("Informe o título do evento");

				
				if (titulo == null || titulo.length() == 0)
					return;

				//RECUPERAR O EVENTO PELO TÍTULO E ADICIONAR TODAS AS INFORMAÇÕES NA TELA.
				
			}
		});
		bt_buscar.setBounds(221, 263, 117, 29);
		contentPane.add(bt_buscar);
		
		JButton bt_novo = new JButton("Novo");
		bt_novo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText("");
				txtData.setText("");
				txtEstiloMusical.setText("");
				txtNomeBanda.setText("");
				txtOpiniaoGeral.setText("");
				txtQtdPagantes.setText("");
				txtTitulo.setText("");
				txtValor.setText("");
				checkShowMusical.setSelected(false);
				
			}
		});
		bt_novo.setBounds(102, 263, 117, 29);
		contentPane.add(bt_novo);

		checkShowMusical.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				checkShowMusicalChanged();
			}
		});
	}

	private void checkShowMusicalChanged() {
		txtNomeBanda.setText(null);
		txtEstiloMusical.setText(null);

		if (checkShowMusical.isSelected()) {
			lblNomeBanda.setEnabled(true);
			txtNomeBanda.setEnabled(true);
			lblEstiloMusical.setEnabled(true);
			txtEstiloMusical.setEnabled(true);
		} else {
			lblNomeBanda.setEnabled(false);
			txtNomeBanda.setEnabled(false);
			lblEstiloMusical.setEnabled(false);
			txtEstiloMusical.setEnabled(false);
		}
	}

	private void cadastra() {
		String titulo = txtTitulo.getText();
		float valor = 0f;
		try {
			valor = Float.parseFloat(txtValor.getText().replace(',', '.'));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Valor inválido");
			txtValor.requestFocus();
			return;
		}

		LocalDate data = null;
		try {
			data = LocalDate.parse(txtData.getText(), dateTimeFormatter);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Data inválida (deve ser no formato dd/MM/yyyy)");
			txtData.requestFocus();
			return;
		}

		try {

			//TODO CRIAR UM EVENTO E ADICIONAR NA ESTRUTURA DE ARMAZENAMENTO
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
			return;
		}

		String qtdPagantesString = txtQtdPagantes.getText();
		String opiniaoGeral = txtOpiniaoGeral.getText();
		if ((qtdPagantesString != null && !qtdPagantesString.equals(""))
				|| (opiniaoGeral != null && !opiniaoGeral.equals(""))) {
			int qtdPagantes = 0;
			try {
				qtdPagantes = Integer.parseInt(txtQtdPagantes.getText());
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Quantidade de pagantes inv�lida");
				txtQtdPagantes.requestFocus();
				return;
			}

			try {

				//CRIAR UMA AVALIAÇÃO E ADICIONAR NO EVENTO
			
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
				return;
			}
		}

		
		//TODO PARA ACIONAR, VERIFICAR SE O EVENTO EXISTE (PELO TÍTULO)
		//SE EXISTIR, ATUALIZAR E EXIBIR MENSAGEM "ATUALIZADO COM SUCESSO"
		//SE NÃO EXISTIR CADASTRAR E EVENTO E EXIBIR A MENSAGEM "CADASTRADO COM SUCESSO"
		//CASO DE ERRO, EXIBIR MENSAGEM 
		
	}
}
