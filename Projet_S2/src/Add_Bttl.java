import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Add_Bttl {

	static JFrame frame;
	private JTextField t_nom;
	private JTextField t_region;
	private JTextField t_pays;
	private JTextField t_millesime;
	private JTextField t_cuvee;
	private JTextField t_tempe;
	private JTextField t_fournisseur;
	private JTextField t_degre;
	private JTextField t_volume;
	private JTextField t_efferve;
	private JTextField t_note;
	private JTextField t_qtt;
	private JTextField t_dispo;
	private JTextField t_emplacement;
	private JTextField t_comment;
	private JTextField t_robe;
	public ArrayList<Bouteille> stock = new ArrayList<Bouteille>();
	public Bouteille b = new Bouteille("vin1", "bordeau", "france", "", null, null, null, null, null, null, null, null,
			null, null, null, null);
	public Connection con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Bttl window = new Add_Bttl();
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
	public Add_Bttl() {
		initialize();
//		try {
//			
//			insertBttl(con, b);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public Bouteille ajouter_Bttl(JTextField nom, JTextField region, JTextField pays, JTextField millesime,
			JTextField cuvee, JTextField robe, JTextField temp, JTextField fournisseur, JTextField degre,
			JTextField volume, JTextField effer, JTextField note, JTextField qtt, JTextField dispo,
			JTextField emplacement, JTextField comment) {
		Bouteille n_Bttl = new Bouteille(nom.getText(), region.getText(), pays.getText(), millesime.getText(),
				cuvee.getText(), robe.getText(), temp.getText(), fournisseur.getText(), degre.getText(),
				volume.getText(), effer.getText(), note.getText(), qtt.getText(), dispo.getText(),
				emplacement.getText(), comment.getText());
		// stock.add(n_Bttl);
		return n_Bttl;
		// System.out.println(n_Bttl);
		// System.out.println(stock);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		JButton btnRetourAuxStocks = new JButton("Retour aux Stocks");
		btnRetourAuxStocks.setForeground(Color.WHITE);
		btnRetourAuxStocks.setBackground(new Color(51, 102, 0));
		btnRetourAuxStocks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				Stock.frame.setVisible(true);
			}
		});
		btnRetourAuxStocks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRetourAuxStocks.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnRetourAuxStocks.setBounds(406, 505, 176, 23);
		frame.getContentPane().add(btnRetourAuxStocks);

		JLabel label = new JLabel("Gestionnaire de Cave");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(102, 0, 204));
		label.setFont(new Font("Wide Latin", Font.BOLD, 20));
		label.setBounds(0, 0, 978, 43);
		frame.getContentPane().add(label);

		JLabel lblModifier = new JLabel("Modifier");
		lblModifier.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifier.setForeground(new Color(0, 0, 51));
		lblModifier.setFont(new Font("Wide Latin", Font.BOLD, 14));
		lblModifier.setBounds(0, 40, 978, 23);
		frame.getContentPane().add(lblModifier);

		JLabel lblNom = new JLabel("Nom :");
		lblNom.setForeground(Color.WHITE);
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNom.setBounds(25, 128, 123, 14);
		frame.getContentPane().add(lblNom);

		JLabel lblRgion = new JLabel("R\u00E9gion :");
		lblRgion.setForeground(Color.WHITE);
		lblRgion.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRgion.setBounds(25, 153, 123, 23);
		frame.getContentPane().add(lblRgion);

		JLabel lblPays = new JLabel("Pays :");
		lblPays.setForeground(Color.WHITE);
		lblPays.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPays.setBounds(25, 187, 123, 23);
		frame.getContentPane().add(lblPays);

		JLabel lblMillsime = new JLabel("Mill\u00E9sime :");
		lblMillsime.setForeground(Color.WHITE);
		lblMillsime.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMillsime.setBounds(25, 221, 123, 23);
		frame.getContentPane().add(lblMillsime);

		JLabel lblCuve = new JLabel("Cuv\u00E9e :");
		lblCuve.setForeground(Color.WHITE);
		lblCuve.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCuve.setBounds(25, 255, 123, 14);
		frame.getContentPane().add(lblCuve);

		JLabel lblTemprature = new JLabel("Temp\u00E9rature :");
		lblTemprature.setForeground(Color.WHITE);
		lblTemprature.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTemprature.setBounds(25, 316, 123, 23);
		frame.getContentPane().add(lblTemprature);

		JLabel lblFournisseur = new JLabel("Fournisseur :");
		lblFournisseur.setForeground(Color.WHITE);
		lblFournisseur.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFournisseur.setBounds(25, 350, 123, 23);
		frame.getContentPane().add(lblFournisseur);

		JLabel lblDegrDalcool = new JLabel("Degr\u00E9 d'alcool :");
		lblDegrDalcool.setForeground(Color.WHITE);
		lblDegrDalcool.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDegrDalcool.setBounds(25, 384, 136, 23);
		frame.getContentPane().add(lblDegrDalcool);

		JLabel lblVolumeBouteille = new JLabel("Volume bouteille :");
		lblVolumeBouteille.setForeground(Color.WHITE);
		lblVolumeBouteille.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVolumeBouteille.setBounds(291, 124, 149, 23);
		frame.getContentPane().add(lblVolumeBouteille);

		JLabel lblEffervescent = new JLabel("Effervescent :");
		lblEffervescent.setForeground(Color.WHITE);
		lblEffervescent.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEffervescent.setBounds(291, 157, 136, 14);
		frame.getContentPane().add(lblEffervescent);

		JLabel lblNote = new JLabel("Note :");
		lblNote.setForeground(Color.WHITE);
		lblNote.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNote.setBounds(291, 186, 136, 14);
		frame.getContentPane().add(lblNote);

		JLabel lblQuantit = new JLabel("Quantit\u00E9 :");
		lblQuantit.setForeground(Color.WHITE);
		lblQuantit.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuantit.setBounds(291, 219, 136, 17);
		frame.getContentPane().add(lblQuantit);

		JLabel lblDisponible = new JLabel("Disponible :");
		lblDisponible.setForeground(Color.WHITE);
		lblDisponible.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDisponible.setBounds(291, 253, 136, 17);
		frame.getContentPane().add(lblDisponible);

		JLabel lblEmplacement = new JLabel("Emplacement :");
		lblEmplacement.setForeground(Color.WHITE);
		lblEmplacement.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmplacement.setBounds(291, 280, 136, 23);
		frame.getContentPane().add(lblEmplacement);

		JLabel lblNotesParticulires = new JLabel("Notes Particuli\u00E8res :");
		lblNotesParticulires.setForeground(Color.WHITE);
		lblNotesParticulires.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNotesParticulires.setBounds(291, 318, 166, 14);
		frame.getContentPane().add(lblNotesParticulires);

		JLabel lblRobe = new JLabel("Robe :");
		lblRobe.setForeground(Color.WHITE);
		lblRobe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRobe.setBounds(25, 282, 136, 18);
		frame.getContentPane().add(lblRobe);

		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.LIGHT_GRAY);
		comboBox.setBounds(628, 127, 72, 20);
		frame.getContentPane().add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.LIGHT_GRAY);
		comboBox_1.setBounds(710, 127, 72, 20);
		frame.getContentPane().add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setForeground(Color.LIGHT_GRAY);
		comboBox_2.setBounds(792, 127, 72, 20);
		frame.getContentPane().add(comboBox_2);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setForeground(Color.LIGHT_GRAY);
		comboBox_3.setBounds(874, 127, 72, 20);
		frame.getContentPane().add(comboBox_3);

		t_nom = new JTextField();
		t_nom.setBounds(178, 125, 95, 20);
		frame.getContentPane().add(t_nom);
		t_nom.setColumns(10);

		JButton btnValider = new JButton("Valider");
		btnValider.setBackground(new Color(51, 102, 0));
		btnValider.setForeground(Color.WHITE);
		btnValider.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnValider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			JOptionPane jop1 = new JOptionPane();
			jop1.showMessageDialog(null, "La bouteille est ajoutée", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
			}


		});
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnValider.setBounds(178, 430, 95, 23);
		frame.getContentPane().add(btnValider);

		JButton btnSupprimerLaBouteille = new JButton("Supprimer la bouteille");
		btnSupprimerLaBouteille.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSupprimerLaBouteille.setBackground(new Color(51, 102, 0));
		btnSupprimerLaBouteille.setForeground(Color.WHITE);
		btnSupprimerLaBouteille.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnSupprimerLaBouteille.setBounds(692, 382, 201, 25);
		frame.getContentPane().add(btnSupprimerLaBouteille);

		t_region = new JTextField();
		t_region.setColumns(10);
		t_region.setBounds(178, 154, 95, 20);
		frame.getContentPane().add(t_region);

		t_pays = new JTextField();
		t_pays.setColumns(10);
		t_pays.setBounds(178, 188, 95, 20);
		frame.getContentPane().add(t_pays);

		t_millesime = new JTextField();
		t_millesime.setColumns(10);
		t_millesime.setBounds(178, 222, 95, 20);
		frame.getContentPane().add(t_millesime);

		t_cuvee = new JTextField();
		t_cuvee.setColumns(10);
		t_cuvee.setBounds(178, 252, 95, 20);
		frame.getContentPane().add(t_cuvee);

		t_tempe = new JTextField();
		t_tempe.setColumns(10);
		t_tempe.setBounds(178, 281, 95, 20);
		frame.getContentPane().add(t_tempe);

		t_fournisseur = new JTextField();
		t_fournisseur.setColumns(10);
		t_fournisseur.setBounds(178, 315, 95, 20);
		frame.getContentPane().add(t_fournisseur);

		t_degre = new JTextField();
		t_degre.setColumns(10);
		t_degre.setBounds(178, 349, 95, 20);
		frame.getContentPane().add(t_degre);

		t_volume = new JTextField();
		t_volume.setColumns(10);
		t_volume.setBounds(178, 383, 95, 20);
		frame.getContentPane().add(t_volume);

		t_efferve = new JTextField();
		t_efferve.setColumns(10);
		t_efferve.setBounds(460, 125, 95, 20);
		frame.getContentPane().add(t_efferve);

		t_note = new JTextField();
		t_note.setColumns(10);
		t_note.setBounds(460, 154, 95, 20);
		frame.getContentPane().add(t_note);

		t_qtt = new JTextField();
		t_qtt.setColumns(10);
		t_qtt.setBounds(460, 188, 95, 20);
		frame.getContentPane().add(t_qtt);

		t_dispo = new JTextField();
		t_dispo.setColumns(10);
		t_dispo.setBounds(460, 222, 95, 20);
		frame.getContentPane().add(t_dispo);

		t_emplacement = new JTextField();
		t_emplacement.setColumns(10);
		t_emplacement.setBounds(460, 252, 95, 20);
		frame.getContentPane().add(t_emplacement);

		t_comment = new JTextField();
		t_comment.setColumns(10);
		t_comment.setBounds(460, 281, 95, 20);
		frame.getContentPane().add(t_comment);

		JLabel lblFont = new JLabel("font");
		lblFont.setBackground(new Color(51, 102, 0));
		lblFont.setForeground(Color.WHITE);
		lblFont.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblFont.setIcon(new ImageIcon("verre_vin_qualit\u00E9.jpg"));
		lblFont.setBounds(0, 0, 982, 553);
		frame.getContentPane().add(lblFont);

		t_robe = new JTextField();
		t_robe.setBounds(460, 316, 95, 20);
		frame.getContentPane().add(t_robe);
		t_robe.setColumns(10);
	}

	public void insertBttl(Connection con, Bouteille B) throws SQLException {
		try (Statement stmt = con.createStatement()) {
			stmt.executeUpdate("INSERT INTO bouteille VALUES (" + B.nom + ",'" + B.region + "'," + B.pays
					+ "'," + B.millesime + "'," + B.cuvee + "'," + B.robe + "'," + B.temperature + "',"
					+ B.fournisseur + "'," + B.degre + "'," + B.volume + "'," + B.effervescent + "',"
					+ B.note + "'," + B.quantite + "'," + B.emplacement + "'," + B.commentaire + "',"+B.disponible+")");
		}
	}

//	public void insertBttl(Connection con, Bouteille B) throws SQLException {
//		try (Statement stmt = con.createStatement()) {
//			stmt.executeUpdate("INSERT INTO bouteille VALUES (" + nom + ",'" + region + "'," + pays
//					+ "'," + millesime + "'," + cuvee + "'," + robe + "'," + temperature + "',"
//					+ fournisseur + "'," + degre + "'," + volume + "'," + effervescent + "',"
//					+ note + "'," + quantite + "'," + emplacement + "'," + commentaire + ")");
//		}
//	}

}
