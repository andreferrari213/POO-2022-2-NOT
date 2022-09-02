package exemplo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * Exemplo de uma tela
 *
 */
public class TelaExemploSwing {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExemploSwing window = new TelaExemploSwing();
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
	public TelaExemploSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new MigLayout("", "[61px][130px,grow][5px][61px][130px]", "[26px][][29px]"));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1, "cell 0 0,alignx left,aligny center");
		
		textField = new JTextField();
		panel.add(textField, "cell 1 0,alignx left,aligny top");
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel, "cell 3 0,alignx left,aligny center");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "cell 4 0,alignx left,aligny top");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2, "cell 0 1,alignx trailing");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "cell 1 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel.add(lblNewLabel_3, "cell 3 1");
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton, "cell 1 2 3 1,alignx right,aligny top");
	}
}
