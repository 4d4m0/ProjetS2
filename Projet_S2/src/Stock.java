import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class Stock {

	static JFrame frame;
	private JTable table;

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
	 * Create the application.
	 */
	public Stock() {
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

		JLabel label = new JLabel("Gestionnaire de Cave");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(371, 11, 204, 31);
		frame.getContentPane().add(label);

		JLabel lblNewLabel = new JLabel("Rechercher");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(316, 145, 104, 22);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblParTypeDe = new JLabel("Par type de vin");
		lblParTypeDe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParTypeDe.setBounds(316, 199, 104, 22);
		frame.getContentPane().add(lblParTypeDe);

		JLabel lblParFournisseur = new JLabel("Par Fournisseur");
		lblParFournisseur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParFournisseur.setBounds(316, 232, 104, 22);
		frame.getContentPane().add(lblParFournisseur);

		JLabel lblParCuve = new JLabel("Par cuv\u00E9e");
		lblParCuve.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParCuve.setBounds(316, 265, 104, 22);
		frame.getContentPane().add(lblParCuve);

		JLabel lblParRgion = new JLabel("Par R\u00E9gion");
		lblParRgion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParRgion.setBounds(316, 298, 104, 22);
		frame.getContentPane().add(lblParRgion);

		JLabel lblPar = new JLabel("Par Volume\r\n");
		lblPar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPar.setBounds(316, 331, 104, 22);
		frame.getContentPane().add(lblPar);

		JLabel lblListeDesBouteilles = new JLabel("Liste des Bouteilles");
		lblListeDesBouteilles.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblListeDesBouteilles.setBounds(682, 140, 163, 22);
		frame.getContentPane().add(lblListeDesBouteilles);

		JList list = new JList();
		list.setBounds(682, 173, 259, 203);
		frame.getContentPane().add(list);

		JLabel lblVinBlanc = new JLabel("Vin Blanc :");
		lblVinBlanc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVinBlanc.setBounds(10, 205, 97, 14);
		frame.getContentPane().add(lblVinBlanc);

		JLabel lblVinRouge = new JLabel("Vin Rouge :");
		lblVinRouge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVinRouge.setBounds(10, 238, 97, 22);
		frame.getContentPane().add(lblVinRouge);

		JLabel lblVinRos = new JLabel("Vin Ros\u00E9 :");
		lblVinRos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVinRos.setBounds(10, 271, 97, 14);
		frame.getContentPane().add(lblVinRos);

		JLabel lblVinE = new JLabel("Vin Effervescent :");
		lblVinE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVinE.setBounds(10, 304, 122, 14);
		frame.getContentPane().add(lblVinE);

		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotal.setBounds(10, 337, 86, 14);
		frame.getContentPane().add(lblTotal);

		JButton btnRetour = new JButton("Retour");
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				Accueil.frame.setVisible(true);
			}
		});
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnRetour.setBounds(413, 503, 89, 23);
		frame.getContentPane().add(btnRetour);

		JButton btnVoirLaBouteille = new JButton("Voir la bouteille");
		btnVoirLaBouteille.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoirLaBouteille.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoirLaBouteille.setBounds(549, 393, 130, 23);
		frame.getContentPane().add(btnVoirLaBouteille);

		JButton btnAjouterUneBouteille = new JButton("Ajouter une bouteille");
		btnAjouterUneBouteille.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAjouterUneBouteille.setBounds(371, 453, 177, 23);
		frame.getContentPane().add(btnAjouterUneBouteille);

		JButton btnModifierUneBouteille = new JButton("Modifier une bouteille");
		btnModifierUneBouteille.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModifierUneBouteille.setBounds(682, 393, 198, 23);
		frame.getContentPane().add(btnModifierUneBouteille);

		table = new JTable();
		table.setBounds(316, 393, 223, 29);
		frame.getContentPane().add(table);

		JLabel lblStocks = new JLabel("Stocks");
		lblStocks.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStocks.setBounds(425, 54, 77, 31);
		frame.getContentPane().add(lblStocks);

		JLabel lblTotal_1 = new JLabel("Total ...");
		lblTotal_1.setBounds(154, 205, 46, 14);
		frame.getContentPane().add(lblTotal_1);

		JLabel label_1 = new JLabel("Total ...");
		label_1.setBounds(154, 238, 46, 14);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Total ...");
		label_2.setBounds(154, 271, 46, 14);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Total ...");
		label_3.setBounds(154, 304, 46, 14);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("Total ...");
		label_4.setBounds(154, 337, 46, 14);
		frame.getContentPane().add(label_4);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(462, 202, 133, 20);
		frame.getContentPane().add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(462, 235, 133, 20);
		frame.getContentPane().add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(462, 268, 133, 20);
		frame.getContentPane().add(comboBox_2);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(462, 301, 133, 20);
		frame.getContentPane().add(comboBox_3);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(462, 334, 133, 20);
		frame.getContentPane().add(comboBox_4);
	}
}
