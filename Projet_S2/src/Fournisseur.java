import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;

public class Fournisseur {

	static JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					Fournisseur window = new Fournisseur();
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
	public Fournisseur() {
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
		
		JButton btnRetour = new JButton("Retour ");
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				Accueil.frame.setVisible(true);
			}
		});
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRetour.setBounds(440, 487, 89, 23);
		frame.getContentPane().add(btnRetour);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(51, 156, 71, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel label = new JLabel("Gestionnaire de Cave");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(375, 11, 204, 31);
		frame.getContentPane().add(label);
		
		table = new JTable();
		table.setBounds(181, 156, 270, 253);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setBounds(508, 159, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Adresse :");
		lblNewLabel_1.setBounds(508, 184, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblCodePostal = new JLabel("Code postal :");
		lblCodePostal.setBounds(508, 209, 71, 14);
		frame.getContentPane().add(lblCodePostal);
		
		JLabel lblVille = new JLabel("Ville :");
		lblVille.setBounds(508, 234, 46, 14);
		frame.getContentPane().add(lblVille);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone :");
		lblTlphone.setBounds(508, 259, 71, 14);
		frame.getContentPane().add(lblTlphone);
		
		JLabel lblTexte = new JLabel("TEXTE ...");
		lblTexte.setBounds(605, 159, 46, 14);
		frame.getContentPane().add(lblTexte);
		
		JLabel label_1 = new JLabel("TEXTE ...");
		label_1.setBounds(605, 184, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("TEXTE ...");
		label_2.setBounds(605, 209, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("TEXTE ...");
		label_3.setBounds(605, 234, 46, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("TEXTE ...");
		label_4.setBounds(605, 259, 46, 14);
		frame.getContentPane().add(label_4);
		
		JButton btnModifierLeFournisseur = new JButton("Modifier le fournisseur");
		btnModifierLeFournisseur.setBounds(508, 332, 143, 23);
		frame.getContentPane().add(btnModifierLeFournisseur);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("grappe-de-raisin.PNG"));
		lblNewLabel_2.setBounds(784, 200, 113, 113);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
