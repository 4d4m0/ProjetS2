import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Voir les Stocks");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			// set visible stock et set non visible Accueil
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Stock.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(142, 186, 228, 31);
		frame.getContentPane().add(btnNewButton);

		JButton btnVoirLes = new JButton("G\u00E9rer les emplacements");
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
		btnVoirLes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVoirLes.setBounds(142, 322, 228, 31);
		frame.getContentPane().add(btnVoirLes);

		JButton btnVoirLesCommandes = new JButton("Voir les commandes");
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
		btnVoirLesCommandes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVoirLesCommandes.setBounds(625, 186, 228, 31);
		frame.getContentPane().add(btnVoirLesCommandes);

		JButton btnVoirLesFournisseurs = new JButton("Voir les Fournisseurs");
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
		btnVoirLesFournisseurs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVoirLesFournisseurs.setBounds(625, 322, 228, 31);
		frame.getContentPane().add(btnVoirLesFournisseurs);

			//Titre
		JLabel lblGestionnaireDeCave = new JLabel("Gestionnaire de Cave");
		lblGestionnaireDeCave.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGestionnaireDeCave.setBounds(406, 46, 204, 31);
		frame.getContentPane().add(lblGestionnaireDeCave);
	}
}
