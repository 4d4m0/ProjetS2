import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Fournisseur {

	static JFrame frame;
	private JTable table;
	private String[] ListeFournisseur ={"Cuvelier Fauvarque","Cuvelier 2","Cuvelier 3"};
	protected ArrayList<CreerFournisseur> ListeFournisseurs = new ArrayList<CreerFournisseur>();
	CreerFournisseur fournisseur1 =new CreerFournisseur("cuvelier Fauvarque", "20 rue du vin", "59000", "Maubeuge", "01.02.03.04.05");
	CreerFournisseur fournisseur2 =new CreerFournisseur("cuvelier du monde", "32 rue du vin", "59000", "Maubeuge", "06.07.08.09.10");
	Listefournisseur.add()

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
		ListeFournisseurs.add(fournisseur1);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRetour = new JButton("Retour ");
		btnRetour.setBackground(new Color(51, 102, 0));
		btnRetour.setForeground(Color.WHITE);
		btnRetour.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
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
		
		JComboBox comboBox = new JComboBox(ListeFournisseur);
		comboBox.setForeground(Color.LIGHT_GRAY);
		comboBox.setBounds(51, 156, 71, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel label = new JLabel("Gestionnaire de Cave");
		label.setForeground(new Color(102, 0, 204));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Wide Latin", Font.BOLD, 20));
		label.setBounds(0, 11, 982, 31);
		frame.getContentPane().add(label);
		
		table = new JTable();
		table.setBounds(181, 156, 270, 253);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(508, 193, 113, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Adresse :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(508, 220, 113, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblCodePostal = new JLabel("Code postal :");
		lblCodePostal.setForeground(Color.BLACK);
		lblCodePostal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCodePostal.setBounds(508, 247, 113, 14);
		frame.getContentPane().add(lblCodePostal);
		
		JLabel lblVille = new JLabel("Ville :");
		lblVille.setForeground(Color.BLACK);
		lblVille.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVille.setBounds(508, 272, 113, 14);
		frame.getContentPane().add(lblVille);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone :");
		lblTlphone.setForeground(Color.BLACK);
		lblTlphone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTlphone.setBounds(508, 299, 113, 14);
		frame.getContentPane().add(lblTlphone);
		
		JLabel lblTexte = new JLabel();
		lblTexte.setText("");
		lblTexte.setForeground(Color.WHITE);
		lblTexte.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTexte.setBounds(677, 193, 179, 14);
		frame.getContentPane().add(lblTexte);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(677, 220, 179, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(677, 247, 179, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(677, 272, 179, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setBounds(677, 299, 179, 14);
		frame.getContentPane().add(label_4);
		
		JButton btnModifierLeFournisseur = new JButton("Modifier le fournisseur");
		btnModifierLeFournisseur.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnModifierLeFournisseur.setBackground(new Color(51, 102, 0));
		btnModifierLeFournisseur.setForeground(Color.WHITE);
		btnModifierLeFournisseur.setBounds(508, 356, 227, 23);
		frame.getContentPane().add(btnModifierLeFournisseur);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("verre_vin_qualit\u00E9.jpg"));
		label_5.setBounds(0, 0, 982, 553);
		frame.getContentPane().add(label_5);
		
		JButton btnVoirLeFournisseur = new JButton("voir le fournisseur");
		btnVoirLeFournisseur.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label_1.setText((String) comboBox.getSelectedItem());

			}
		});
		btnVoirLeFournisseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnVoirLeFournisseur.setBounds(51, 247, 89, 23);
		frame.getContentPane().add(btnVoirLeFournisseur);
	}
}
