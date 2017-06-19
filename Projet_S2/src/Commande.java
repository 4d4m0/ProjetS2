import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Commande {

	 static JFrame frame;
	 private JTextField textField;
	 private JTextField textField_1;
	 private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					Commande window = new Commande();
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
	public Commande() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	// Mise a jour d'une information  : utiliser le JLabel et modifier la string avec une méthode 
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnRetour.setBackground(new Color(51, 102, 0));
		btnRetour.setForeground(Color.WHITE);
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
		btnRetour.setBounds(445, 517, 89, 23);
		frame.getContentPane().add(btnRetour);
		
		JLabel lblRechercherUneCommande = new JLabel("Rechercher une commande :");
		lblRechercherUneCommande.setForeground(Color.WHITE);
		lblRechercherUneCommande.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRechercherUneCommande.setBounds(47, 126, 235, 14);
		frame.getContentPane().add(lblRechercherUneCommande);
		
		JLabel lblParNumroDe = new JLabel("Par num\u00E9ro de commande :");
		lblParNumroDe.setForeground(Color.BLACK);
		lblParNumroDe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblParNumroDe.setBounds(347, 126, 235, 14);
		frame.getContentPane().add(lblParNumroDe);
		
		textField = new JTextField();
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setBounds(347, 153, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblParFournisseur = new JLabel("Par fournisseur :");
		lblParFournisseur.setForeground(Color.BLACK);
		lblParFournisseur.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblParFournisseur.setBounds(609, 126, 146, 14);
		frame.getContentPane().add(lblParFournisseur);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setColumns(10);
		textField_1.setBounds(609, 153, 86, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblParDate = new JLabel("Par Date :");
		lblParDate.setForeground(Color.BLACK);
		lblParDate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblParDate.setBounds(774, 126, 109, 14);
		frame.getContentPane().add(lblParDate);
		
		Choice choice = new Choice();
		choice.setForeground(Color.LIGHT_GRAY);
		choice.setBounds(774, 151, 54, 20);
		frame.getContentPane().add(choice);
		
		JLabel lblInformationsDeLa = new JLabel("Informations de la commande :");
		lblInformationsDeLa.setForeground(Color.WHITE);
		lblInformationsDeLa.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInformationsDeLa.setBounds(47, 202, 264, 14);
		frame.getContentPane().add(lblInformationsDeLa);
		
		JLabel lblNewLabel = new JLabel("Num\u00E9ro de commande:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(47, 227, 198, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Date :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(47, 252, 64, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Num\u00E9ro de fournisseur :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(47, 277, 198, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nom du fournisseur :");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(47, 302, 198, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Adresse :");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(47, 327, 89, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Code Postal :");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(47, 352, 130, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblVille = new JLabel("Ville :");
		lblVille.setForeground(Color.WHITE);
		lblVille.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVille.setBounds(47, 377, 89, 14);
		frame.getContentPane().add(lblVille);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone :");
		lblTlphone.setForeground(Color.WHITE);
		lblTlphone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTlphone.setBounds(47, 402, 130, 14);
		frame.getContentPane().add(lblTlphone);
		
		JLabel lblTexte = new JLabel("TEXTE");
		lblTexte.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTexte.setBackground(Color.WHITE);
		lblTexte.setForeground(Color.BLACK);
		lblTexte.setBounds(276, 227, 217, 14);
		frame.getContentPane().add(lblTexte);
		
		JLabel lblTexte_1 = new JLabel("TEXTE");
		lblTexte_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTexte_1.setBackground(Color.WHITE);
		lblTexte_1.setForeground(Color.BLACK);
		lblTexte_1.setBounds(276, 252, 217, 14);
		frame.getContentPane().add(lblTexte_1);
		
		JLabel lblTexte_2 = new JLabel("TEXTE");
		lblTexte_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTexte_2.setBackground(Color.WHITE);
		lblTexte_2.setForeground(Color.BLACK);
		lblTexte_2.setBounds(276, 277, 217, 14);
		frame.getContentPane().add(lblTexte_2);
		
		JLabel lblTexte_3 = new JLabel("TEXTE");
		lblTexte_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTexte_3.setBackground(Color.WHITE);
		lblTexte_3.setForeground(Color.BLACK);
		lblTexte_3.setBounds(276, 302, 217, 14);
		frame.getContentPane().add(lblTexte_3);
		
		JLabel lblTexte_4 = new JLabel("TEXTE");
		lblTexte_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTexte_4.setBackground(Color.WHITE);
		lblTexte_4.setForeground(Color.BLACK);
		lblTexte_4.setBounds(276, 327, 217, 14);
		frame.getContentPane().add(lblTexte_4);
		
		JLabel lblTexte_5 = new JLabel("TEXTE");
		lblTexte_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTexte_5.setBackground(Color.WHITE);
		lblTexte_5.setForeground(Color.BLACK);
		lblTexte_5.setBounds(276, 352, 217, 14);
		frame.getContentPane().add(lblTexte_5);
		
		JLabel lblTexte_6 = new JLabel("TEXTE");
		lblTexte_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTexte_6.setBackground(Color.WHITE);
		lblTexte_6.setForeground(Color.BLACK);
		lblTexte_6.setBounds(276, 377, 217, 14);
		frame.getContentPane().add(lblTexte_6);
		
		JLabel lblTexte_7 = new JLabel("TEXTE");
		lblTexte_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTexte_7.setBackground(Color.WHITE);
		lblTexte_7.setForeground(Color.BLACK);
		lblTexte_7.setBounds(276, 402, 217, 14);
		frame.getContentPane().add(lblTexte_7);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setBounds(518, 202, 456, 280);
		frame.getContentPane().add(table);
		
		JLabel lblGestionnaireDeCave = new JLabel("Gestionnaire de cave");
		lblGestionnaireDeCave.setForeground(new Color(102, 0, 204));
		lblGestionnaireDeCave.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionnaireDeCave.setFont(new Font("Wide Latin", Font.BOLD, 20));
		lblGestionnaireDeCave.setBounds(0, 11, 982, 31);
		frame.getContentPane().add(lblGestionnaireDeCave);
		
		JLabel lblCommandes = new JLabel("Commandes");
		lblCommandes.setForeground(new Color(0, 0, 51));
		lblCommandes.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommandes.setFont(new Font("Wide Latin", Font.BOLD, 14));
		lblCommandes.setBounds(0, 45, 982, 23);
		frame.getContentPane().add(lblCommandes);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.BLACK);
		label.setIcon(new ImageIcon("verre_vin_qualit\u00E9.jpg"));
		label.setBounds(0, 0, 982, 553);
		frame.getContentPane().add(label);
		

	}
}
