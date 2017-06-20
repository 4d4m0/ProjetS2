
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Modif_Fournisseur {

	static JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modif_Fournisseur window = new Modif_Fournisseur();
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
	public Modif_Fournisseur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false); 

		
		JLabel lblNewLabel = new JLabel("Gestionnaire de Cave");
		lblNewLabel.setForeground(new Color(102, 0, 204));
		lblNewLabel.setFont(new Font("Wide Latin", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 982, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Retour");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				Fournisseur.frame.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(new Color(51, 102, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(420, 515, 135, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblModifierUnFournisseur = new JLabel("Modifier un Fournisseur");
		lblModifierUnFournisseur.setForeground(new Color(0, 0, 51));
		lblModifierUnFournisseur.setFont(new Font("Wide Latin", Font.BOLD, 14));
		lblModifierUnFournisseur.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifierUnFournisseur.setBounds(0, 37, 982, 25);
		frame.getContentPane().add(lblModifierUnFournisseur);
		
		JLabel lblIdFournisseur = new JLabel("ID Fournisseur :");
		lblIdFournisseur.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdFournisseur.setForeground(new Color(255, 255, 255));
		lblIdFournisseur.setBounds(300, 165, 145, 16);
		frame.getContentPane().add(lblIdFournisseur);
		
		JButton btnModifierajouter = new JButton("Modifier/Ajouter");
		btnModifierajouter.setBackground(new Color(51, 102, 0));
		btnModifierajouter.setForeground(Color.WHITE);
		btnModifierajouter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnModifierajouter.setBounds(287, 463, 187, 25);
		frame.getContentPane().add(btnModifierajouter);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBackground(new Color(51, 102, 0));
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSupprimer.setForeground(Color.WHITE);
		btnSupprimer.setBounds(510, 463, 187, 25);
		frame.getContentPane().add(btnSupprimer);
		
		textField = new JTextField();
		textField.setBounds(510, 195, 175, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(510, 231, 175, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(510, 266, 175, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(510, 295, 175, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(510, 163, 175, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(510, 324, 175, 22);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nom :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(300, 197, 145, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Adresse :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(300, 236, 145, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Code Postal :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(300, 268, 145, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ville :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(300, 297, 145, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("T\u00E9l\u00E9phone :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(300, 326, 145, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setIcon(new ImageIcon("verre_vin_qualit\u00E9.jpg"));
		lblNewLabel_6.setBounds(0, 0, 982, 553);
		frame.getContentPane().add(lblNewLabel_6);
	}
}