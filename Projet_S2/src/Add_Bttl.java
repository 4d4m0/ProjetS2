import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class Add_Bttl extends Stock {

	static JFrame frame;

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

		JButton btnRetourAuxStocks = new JButton("Retour aux Stocks");
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
		btnRetourAuxStocks.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRetourAuxStocks.setBounds(412, 527, 151, 23);
		frame.getContentPane().add(btnRetourAuxStocks);

		JLabel label = new JLabel("Gestionnaire de Cave");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(387, 11, 204, 31);
		frame.getContentPane().add(label);

		JLabel lblModifier = new JLabel("Modifier");
		lblModifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModifier.setBounds(454, 53, 58, 14);
		frame.getContentPane().add(lblModifier);

		JLabel lblNom = new JLabel("Nom :");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNom.setBounds(25, 128, 123, 14);
		frame.getContentPane().add(lblNom);

		JLabel lblRgion = new JLabel("R\u00E9gion :");
		lblRgion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRgion.setBounds(25, 153, 123, 23);
		frame.getContentPane().add(lblRgion);

		JLabel lblPays = new JLabel("Pays :");
		lblPays.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPays.setBounds(25, 187, 123, 23);
		frame.getContentPane().add(lblPays);

		JLabel lblMillsime = new JLabel("Mill\u00E9sime :");
		lblMillsime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMillsime.setBounds(25, 221, 123, 23);
		frame.getContentPane().add(lblMillsime);

		JLabel lblCuve = new JLabel("Cuv\u00E9e :");
		lblCuve.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCuve.setBounds(25, 255, 123, 14);
		frame.getContentPane().add(lblCuve);

		JLabel lblTemprature = new JLabel("Temp\u00E9rature :");
		lblTemprature.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTemprature.setBounds(25, 280, 123, 23);
		frame.getContentPane().add(lblTemprature);

		JLabel lblFournisseur = new JLabel("Fournisseur :");
		lblFournisseur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFournisseur.setBounds(25, 314, 123, 23);
		frame.getContentPane().add(lblFournisseur);

		JLabel lblDegrDalcool = new JLabel("Degr\u00E9 d'alcool :");
		lblDegrDalcool.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDegrDalcool.setBounds(25, 348, 123, 23);
		frame.getContentPane().add(lblDegrDalcool);

		JLabel lblVolumeBouteille = new JLabel("Volume bouteille :");
		lblVolumeBouteille.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVolumeBouteille.setBounds(25, 382, 123, 23);
		frame.getContentPane().add(lblVolumeBouteille);

		JLabel lbl_0 = new JLabel("SOME TEXTE");
		lbl_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_0.setBounds(158, 130, 95, 14);
		frame.getContentPane().add(lbl_0);

		JLabel label_1 = new JLabel("SOME TEXTE");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(158, 159, 95, 14);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("SOME TEXTE");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(158, 193, 95, 14);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("SOME TEXTE");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(158, 225, 95, 14);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("SOME TEXTE");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(158, 255, 95, 14);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("SOME TEXTE");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(158, 284, 95, 14);
		frame.getContentPane().add(label_5);

		JLabel label_6 = new JLabel("SOME TEXTE");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(158, 318, 95, 14);
		frame.getContentPane().add(label_6);

		JLabel label_7 = new JLabel("SOME TEXTE");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(158, 352, 95, 14);
		frame.getContentPane().add(label_7);

		JLabel label_8 = new JLabel("SOME TEXTE");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(158, 382, 95, 14);
		frame.getContentPane().add(label_8);
		
		JLabel lblEffervescent = new JLabel("Effervescent :");
		lblEffervescent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEffervescent.setBounds(263, 130, 136, 14);
		frame.getContentPane().add(lblEffervescent);
		
		JLabel lblNote = new JLabel("Note :");
		lblNote.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNote.setBounds(263, 159, 136, 14);
		frame.getContentPane().add(lblNote);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9 :");
		lblQuantit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantit.setBounds(263, 193, 136, 17);
		frame.getContentPane().add(lblQuantit);
		
		JLabel lblDisponible = new JLabel("Disponible :");
		lblDisponible.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDisponible.setBounds(263, 227, 136, 17);
		frame.getContentPane().add(lblDisponible);
		
		JLabel lblEmplacement = new JLabel("Emplacement :");
		lblEmplacement.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmplacement.setBounds(263, 257, 136, 23);
		frame.getContentPane().add(lblEmplacement);
		
		JLabel lblNotesParticulires = new JLabel("Notes Particuli\u00E8res :");
		lblNotesParticulires.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNotesParticulires.setBounds(263, 286, 136, 14);
		frame.getContentPane().add(lblNotesParticulires);
		
		JLabel label_9 = new JLabel("SOME TEXTE");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(412, 128, 95, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("SOME TEXTE");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_10.setBounds(412, 162, 95, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("SOME TEXTE");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_11.setBounds(412, 191, 95, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("SOME TEXTE");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_12.setBounds(412, 225, 95, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("SOME TEXTE");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_13.setBounds(412, 259, 95, 14);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("SOME TEXTE");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_14.setBounds(412, 284, 95, 14);
		frame.getContentPane().add(label_14);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(628, 127, 72, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(710, 127, 72, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(792, 127, 72, 20);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(874, 127, 72, 20);
		frame.getContentPane().add(comboBox_3);
	}
}
