import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

/* 
 * 														/!\	MAIN CLASS /!\
 * 
 * 		Doit être ouvert en premier pour éviter les bugs ( création d'objet buggé --> accueil créer tout mais les autres pages ne crééent que celles rattachées directement sur elles
*
* Cette classe permet le lancment de toutes les autres ( pour le moment cette solution fonctionne et facilite la tâche)
*
*/
public class Accueil {

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("unused")
			public void run() {
				try {
					Accueil window = new Accueil();
					Accueil.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	@SuppressWarnings("unused")
	public Accueil() {
		initialize();
		Stock Stock = new Stock();
		Commande Commande = new Commande();
		Emplacement Emplacement = new Emplacement();
		Fournisseur Fournisseur = new Fournisseur();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Voir les Stocks");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(51, 102, 0));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			// set visible stock et set non visible Accueil
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Stock.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(125, 186, 228, 31);
		frame.getContentPane().add(btnNewButton);

		JButton btnVoirLes = new JButton("G\u00E9rer les emplacements");
		btnVoirLes.setForeground(new Color(255, 255, 255));
		btnVoirLes.setBackground(new Color(51, 102, 0));
		btnVoirLes.addMouseListener(new MouseAdapter() {
			@Override
			// Set visible emplcement et non visible accueil
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Emplacement.frame.setVisible(true);
			}
		});
		btnVoirLes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoirLes.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnVoirLes.setBounds(125, 322, 228, 31);
		frame.getContentPane().add(btnVoirLes);

		JButton btnVoirLesCommandes = new JButton("Voir les commandes");
		btnVoirLesCommandes.setForeground(new Color(255, 255, 255));
		btnVoirLesCommandes.setBackground(new Color(51, 102, 0));
		btnVoirLesCommandes.addMouseListener(new MouseAdapter() {
			@Override
			// set visible Commande et set non visible accueil
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				Commande.frame.setVisible(true);
			}
		});
		btnVoirLesCommandes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnVoirLesCommandes.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnVoirLesCommandes.setBounds(625, 186, 228, 31);
		frame.getContentPane().add(btnVoirLesCommandes);

		JButton btnVoirLesFournisseurs = new JButton("Voir les Fournisseurs");
		btnVoirLesFournisseurs.setForeground(new Color(255, 255, 255));
		btnVoirLesFournisseurs.setBackground(new Color(51, 102, 0));
		btnVoirLesFournisseurs.addMouseListener(new MouseAdapter() {
			@Override
			// Set visible Fournisseur et non visible accueil
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Fournisseur.frame.setVisible(true);
			}
		});
		btnVoirLesFournisseurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoirLesFournisseurs.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnVoirLesFournisseurs.setBounds(625, 322, 228, 31);
		frame.getContentPane().add(btnVoirLesFournisseurs);

			//Titre
		JLabel lblGestionnaireDeCave = new JLabel("Gestionnaire de Cave");
		lblGestionnaireDeCave.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionnaireDeCave.setForeground(new Color(102, 0, 204));
		lblGestionnaireDeCave.setBackground(Color.WHITE);
		lblGestionnaireDeCave.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 28));
		lblGestionnaireDeCave.setBounds(12, 57, 958, 60);
		frame.getContentPane().add(lblGestionnaireDeCave);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("IUT-01.png"));
		label_1.setBounds(0, 506, 157, 47);
		frame.getContentPane().add(label_1);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		label.setBackground(new Color(0, 0, 0));
		label.setIcon(new ImageIcon("verre_vin_qualité.jpg"));
		label.setBounds(0, 0, 982, 553);
		frame.getContentPane().add(label);
	}
}
