import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class INICIO {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					INICIO window = new INICIO();
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
	public INICIO() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("INICIAR SESI\u00D3N");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				USUARIOLOGIN USUARIOLOLOGIN = new USUARIOLOGIN();
				USUARIOLOGIN.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(330, 242, 166, 59);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO A LA APLICACI\u00D3N");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 37));
		lblNewLabel.setBounds(123, 37, 682, 125);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Aplicaci\u00F3n realizada por Guillermo Moyano y C\u00E9sar Rodr\u00EDguez");
		lblNewLabel_1.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_1.setBounds(115, 431, 690, 52);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 889, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
