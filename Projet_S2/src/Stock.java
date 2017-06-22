import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Stock {

	static JFrame frame;
	private JTable table;
	int nbBtlBlanc = 50;
	int nbBtlRouge = 50;
	int nbBtlRose = 50;
	int nbBtlEffer = 100;
	int totalBtl = nbBtlBlanc + nbBtlRouge + nbBtlRose;
	String[] listeVin={"Vin1","Vin2","Vin3"};
	String[] listeTypeVin = { "Rouge", "Blanc", "Rose" };
	String[] listeFournisseur = { "Cuvelier Fauvarque", "F1", "F2" };
	String[] listeCuvee = { "2000", "2001", "2002", "2003" };
	String[] listeRegion = { "Bordeau", "Jura", "Aquitaine", "Bourgogne" };
	String[] listeVolume = { "75", "1", "1.5", "3", "4.5", "6", "9", "12", "15", "18" };
	private JTable table_2;

	public Bouteille Bttl_1;
	public Bouteille Bttl_2;
	public Bouteille Bttl_3;
	// public TableModel[][] Liste_Bttl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("unused")
			public void run() {
				try {
					Stock window = new Stock();
					Stock.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application
	 */
	public Stock() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false); 


		JLabel label = new JLabel("Gestionnaire de Cave");
		label.setForeground(new Color(102, 0, 204));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Wide Latin", Font.BOLD, 20));
		label.setBounds(0, 11, 982, 31);
		frame.getContentPane().add(label);

		JLabel lblNewLabel = new JLabel("Rechercher");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(284, 140, 104, 22);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblParTypeDe = new JLabel("Par type de vin");
		lblParTypeDe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblParTypeDe.setBounds(284, 199, 136, 22);
		frame.getContentPane().add(lblParTypeDe);

		JLabel lblParFournisseur = new JLabel("Par Fournisseur");
		lblParFournisseur.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblParFournisseur.setBounds(284, 232, 136, 22);
		frame.getContentPane().add(lblParFournisseur);

		JLabel lblParCuve = new JLabel("Par cuv\u00E9e");
		lblParCuve.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblParCuve.setBounds(284, 265, 136, 22);
		frame.getContentPane().add(lblParCuve);

		JLabel lblParRgion = new JLabel("Par R\u00E9gion");
		lblParRgion.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblParRgion.setBounds(284, 298, 136, 22);
		frame.getContentPane().add(lblParRgion);

		JLabel lblPar = new JLabel("Par Volume\r\n");
		lblPar.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPar.setBounds(284, 331, 136, 22);
		frame.getContentPane().add(lblPar);

		JLabel lblListeDesBouteilles = new JLabel("Liste des Bouteilles");
		lblListeDesBouteilles.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblListeDesBouteilles.setBounds(682, 140, 163, 22);
		frame.getContentPane().add(lblListeDesBouteilles);

		JLabel lblVinBlanc = new JLabel("Vin Blanc :");
		lblVinBlanc.setForeground(Color.WHITE);
		lblVinBlanc.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVinBlanc.setBounds(10, 205, 97, 14);
		frame.getContentPane().add(lblVinBlanc);

		JLabel lblVinRouge = new JLabel("Vin Rouge :");
		lblVinRouge.setForeground(Color.WHITE);
		lblVinRouge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVinRouge.setBounds(10, 238, 97, 22);
		frame.getContentPane().add(lblVinRouge);

		JLabel lblVinRos = new JLabel("Vin Ros\u00E9 :");
		lblVinRos.setForeground(Color.WHITE);
		lblVinRos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVinRos.setBounds(10, 271, 97, 14);
		frame.getContentPane().add(lblVinRos);

		JLabel lblVinE = new JLabel("Vin Effervescent :");
		lblVinE.setForeground(Color.WHITE);
		lblVinE.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVinE.setBounds(10, 304, 154, 14);
		frame.getContentPane().add(lblVinE);

		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotal.setBounds(10, 337, 86, 14);
		frame.getContentPane().add(lblTotal);

		JButton btnRetour = new JButton("Retour");
		btnRetour.setBackground(new Color(51, 102, 0));
		btnRetour.setForeground(new Color(255, 255, 255));
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				Accueil.frame.setVisible(true);
			}
		});
		btnRetour.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnRetour.setBounds(413, 503, 89, 23);
		frame.getContentPane().add(btnRetour);

		JButton btnVoirLaBouteille = new JButton("Voir la bouteille");
		btnVoirLaBouteille.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				VuBouteille vue=new VuBouteille();
				frame.setVisible(false);
				VuBouteille.frame.setVisible(true);
			}
		});
		btnVoirLaBouteille.setBackground(new Color(51, 102, 0));
		btnVoirLaBouteille.setForeground(new Color(255, 255, 255));
		btnVoirLaBouteille.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnVoirLaBouteille.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoirLaBouteille.setBounds(492, 393, 153, 23);
		frame.getContentPane().add(btnVoirLaBouteille);

		JButton btnAjouterUneBouteille = new JButton("Ajouter une bouteille");
		btnAjouterUneBouteille.setBackground(new Color(51, 102, 0));
		btnAjouterUneBouteille.setForeground(new Color(255, 255, 255));
		btnAjouterUneBouteille.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Add_Bttl modif = new Add_Bttl();
				Add_Bttl.frame.setVisible(true);
			}
		});
		btnAjouterUneBouteille.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAjouterUneBouteille.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnAjouterUneBouteille.setBounds(363, 452, 189, 23);
		frame.getContentPane().add(btnAjouterUneBouteille);

		JButton btnModifierUneBouteille = new JButton("Modifier une bouteille");
		btnModifierUneBouteille.setBackground(new Color(51, 102, 0));
		btnModifierUneBouteille.setForeground(new Color(255, 255, 255));
		btnModifierUneBouteille.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnModifierUneBouteille.setBounds(657, 393, 223, 23);
		frame.getContentPane().add(btnModifierUneBouteille);

		table = new JTable();
		table.setBounds(657, 175, 285, 181);
		frame.getContentPane().add(table);

		JLabel lblStocks = new JLabel("Stocks");
		lblStocks.setForeground(new Color(0, 0, 51));
		lblStocks.setHorizontalAlignment(SwingConstants.CENTER);
		lblStocks.setFont(new Font("Wide Latin", Font.BOLD, 15));
		lblStocks.setBounds(0, 54, 982, 41);
		frame.getContentPane().add(lblStocks);
		
	/*	Connection con =null;
		try {
			con =Connect.connect();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		JLabel lblTotal_1 = new JLabel(Integer.toString(nbBtlBlanc));
		lblTotal_1.setForeground(Color.WHITE);
		lblTotal_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotal_1.setBounds(176, 207, 46, 14);
		frame.getContentPane().add(lblTotal_1);

		JLabel label_1 = new JLabel(Integer.toString(nbBtlRouge));
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(176, 240, 46, 14);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel(Integer.toString(nbBtlRose));
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(176, 273, 46, 14);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel(Integer.toString(nbBtlEffer));
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(176, 306, 46, 14);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel(Integer.toString(totalBtl));
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setBounds(176, 339, 46, 14);
		frame.getContentPane().add(label_4);

		JComboBox comboBox = new JComboBox(listeTypeVin);
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		comboBox.setBounds(449, 200, 175, 20);
		frame.getContentPane().add(comboBox);

		JComboBox comboBox_1 = new JComboBox(listeFournisseur);
		comboBox_1.setBackground(Color.LIGHT_GRAY);
		comboBox_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		comboBox_1.setBounds(449, 235, 175, 20);
		frame.getContentPane().add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox(listeCuvee);
		comboBox_2.setBackground(Color.LIGHT_GRAY);
		comboBox_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		comboBox_2.setBounds(449, 268, 175, 20);
		frame.getContentPane().add(comboBox_2);

		JComboBox comboBox_3 = new JComboBox(listeRegion);
		comboBox_3.setBackground(Color.LIGHT_GRAY);
		comboBox_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		comboBox_3.setBounds(449, 301, 175, 20);
		frame.getContentPane().add(comboBox_3);

		JComboBox comboBox_4 = new JComboBox(listeVolume);
		comboBox_4.setBackground(Color.LIGHT_GRAY);
		comboBox_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		comboBox_4.setBounds(449, 334, 175, 20);
		frame.getContentPane().add(comboBox_4);

		/*
		 * Liste_Bttl = new TableModel[][] { {Bttl_1 = new
		 * Bouteille("Chateau Lecroc", "Bordeau", "France", null, 2000, "rouge",
		 * 13, "Cuvelier Fauvarque", 10, 75, "non", 3, 4, "oui", 3, "RAS")},
		 * {Bttl_2 = new Bouteille("Chateau Leduc", "Bourgogne", "France", null,
		 * 2001, "rouge", 13, "Cuvelier Fauvarque", 10, 75, "non", 3, 4, "oui",
		 * 3, "Bon avec de la viande Rouge")}, {Bttl_3 = new
		 * Bouteille("Chateau Leduc", "Bourgogne", "France", "medaille argent",
		 * 2001, "rouge", 13, "Cuvelier Fauvarque", 10, 75, "non", 3, 4, "oui",
		 * 3, null)}, };
		 * 
		 * String[] entete = { "nom", "region", "pays", "millesime", "cuvee",
		 * "robe", "temperature", "fournisseur", "degre", "volume",
		 * "effervescent", "note", "quantite", "disponible", "emplacement",
		 * "commentaire" };
		 */
		table_2 = new JTable();
		table_2.setBounds(640, 350, 274, -156);
		frame.getContentPane().add(table_2);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("verre_vin_qualit\u00E9.jpg"));
		label_5.setBounds(0, 0, 982, 553);
		frame.getContentPane().add(label_5);

	}
}
