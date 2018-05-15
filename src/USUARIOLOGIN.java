import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class USUARIOLOGIN {

	static JFrame frame;
	private JTextField usuario;
	private JPasswordField contrasenia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					USUARIOLOGIN window = new USUARIOLOGIN();
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
	public USUARIOLOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 26));
		frame.setBounds(100, 100, 884, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (usuario.getText().equals("")) {
					JOptionPane.showMessageDialog(frame,"ERROR !! en usuario ");
					
				} else if (String.valueOf(contrasenia.getPassword()).equals("1234")) {
					
					MENU MENU  = new  MENU();
					MENU.frame.setVisible(true);
					

				}else {
					JOptionPane.showMessageDialog(frame,"USUARIO O CONTRASEÑA NO VÁLIDO");
					
				}
				
				}	
			
		});
		
		btnNewButton.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 17));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(33, 267, 345, 120);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BORRAR");
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usuario.setText("");
				contrasenia.setText("");
			}
		});
	
		btnNewButton_1.setBounds(452, 267, 360, 120);
		frame.getContentPane().add(btnNewButton_1);
		
		usuario = new JTextField();
		usuario.setBounds(33, 132, 345, 70);
		frame.getContentPane().add(usuario);
		usuario.setColumns(10);
		
		contrasenia = new JPasswordField();
		contrasenia.setBounds(452, 132, 360, 70);
		frame.getContentPane().add(contrasenia);
		
		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(146, 28, 121, 93);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_1.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(545, 61, 156, 48);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
