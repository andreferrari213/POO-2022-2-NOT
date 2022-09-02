package exercicio02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * Classe de apresentação: Tela.
 *
 */
public class Exercicio02View {

	private JFrame frame;
	private JTextField tfFrase;
	private JTextArea taResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio02View window = new Exercicio02View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercicio02View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][grow]", "[][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Frase");
		frame.getContentPane().add(lblNewLabel, "cell 0 0,alignx trailing");
		
		tfFrase = new JTextField();
		frame.getContentPane().add(tfFrase, "cell 1 0,growx");
		tfFrase.setColumns(10);

		taResultado = new JTextArea();
		frame.getContentPane().add(taResultado, "cell 1 2,grow");
		
		JButton btnNewButton = new JButton("Processar");
		
		//Esse botão é responsável por executar uma ação de recuperar as palavras
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Cria um objeto de Exercicio02 passando a frase digitada pelo usuário
				Exercicio02 objeto = new Exercicio02(tfFrase.getText());
				
				String[] palavras = objeto.getPalavras();
				
				//Realiza o processamento do array de palavras para exibir no componente JTextArea
				String resultadoFinal = "";
				for (int i = 0; i < palavras.length; i++) {
					resultadoFinal += palavras[i] +"\t"+ palavras[i].length()+"\n";
				}
				
				//Apresenta o resultado no componente
				taResultado.setText(resultadoFinal);
			}
		});
		
		frame.getContentPane().add(btnNewButton, "cell 1 1,alignx center");
		
	}

}
