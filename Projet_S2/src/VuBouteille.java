import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VuBouteille {

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VuBouteille window = new VuBouteille();
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
	public VuBouteille() {
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
		
		JLabel lblGestionnaireDeCave = new JLabel("Gestionnaire de Cave");
		lblGestionnaireDeCave.setForeground(new Color(102, 0, 204));
		lblGestionnaireDeCave.setFont(new Font("Wide Latin", Font.BOLD, 20));
		lblGestionnaireDeCave.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionnaireDeCave.setBounds(0, 0, 978, 44);
		frame.getContentPane().add(lblGestionnaireDeCave);
		
		JLabel lblBouteille = new JLabel("Bouteille");
		lblBouteille.setHorizontalAlignment(SwingConstants.CENTER);
		lblBouteille.setFont(new Font("Wide Latin", Font.BOLD, 14));
		lblBouteille.setForeground(new Color(0, 0, 51));
		lblBouteille.setBounds(0, 41, 978, 29);
		frame.getContentPane().add(lblBouteille);
		
		JButton btnRetourStock = new JButton("Retour stock");
		btnRetourStock.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Stock.frame.setVisible(true);
			}
		});
		btnRetourStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRetourStock.setBackground(new Color(51, 102, 0));
		btnRetourStock.setForeground(Color.WHITE);
		btnRetourStock.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnRetourStock.setBounds(290, 499, 161, 29);
		frame.getContentPane().add(btnRetourStock);
		
		JButton btnNewButton = new JButton("Retour Accueil");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Accueil.frame.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(51, 102, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(540, 499, 161, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(65, 121, 130, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R\u00E9gion :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(65, 160, 130, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pays :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(65, 196, 130, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblMillsisme = new JLabel("Mill\u00E9sime :");
		lblMillsisme.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMillsisme.setForeground(Color.WHITE);
		lblMillsisme.setBounds(65, 232, 130, 20);
		frame.getContentPane().add(lblMillsisme);
		
		JLabel lblCuve = new JLabel("Cuv\u00E9e :");
		lblCuve.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCuve.setForeground(Color.WHITE);
		lblCuve.setBounds(65, 268, 130, 20);
		frame.getContentPane().add(lblCuve);
		
		JLabel lblRobe = new JLabel("Robe :");
		lblRobe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRobe.setForeground(Color.WHITE);
		lblRobe.setBounds(65, 304, 130, 20);
		frame.getContentPane().add(lblRobe);
		
		JLabel lblTemprature = new JLabel("Temp\u00E9rature :");
		lblTemprature.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTemprature.setForeground(Color.WHITE);
		lblTemprature.setBounds(65, 344, 130, 20);
		frame.getContentPane().add(lblTemprature);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9 :");
		lblQuantit.setForeground(Color.BLACK);
		lblQuantit.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuantit.setBounds(350, 268, 173, 20);
		frame.getContentPane().add(lblQuantit);
		
		JLabel lblFournisseur = new JLabel("Fournisseur :");
		lblFournisseur.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFournisseur.setForeground(Color.WHITE);
		lblFournisseur.setBounds(65, 380, 130, 20);
		frame.getContentPane().add(lblFournisseur);
		
		JLabel lblTaillesDisponible = new JLabel("Tailles disponible :");
		lblTaillesDisponible.setForeground(Color.BLACK);
		lblTaillesDisponible.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTaillesDisponible.setBounds(350, 157, 173, 20);
		frame.getContentPane().add(lblTaillesDisponible);
		
		JLabel lblDisponibilt = new JLabel("Disponibilt\u00E9 :");
		lblDisponibilt.setForeground(Color.BLACK);
		lblDisponibilt.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDisponibilt.setBounds(350, 304, 173, 20);
		frame.getContentPane().add(lblDisponibilt);
		
		JLabel lblNote = new JLabel("Note :");
		lblNote.setForeground(Color.BLACK);
		lblNote.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNote.setBounds(350, 232, 173, 20);
		frame.getContentPane().add(lblNote);
		
		JLabel lblEmplacement = new JLabel("Emplacement :");
		lblEmplacement.setForeground(Color.BLACK);
		lblEmplacement.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmplacement.setBounds(350, 344, 173, 20);
		frame.getContentPane().add(lblEmplacement);
		
		JLabel lblEfferve = new JLabel("Effervescent :");
		lblEfferve.setForeground(Color.BLACK);
		lblEfferve.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEfferve.setBounds(350, 121, 173, 20);
		frame.getContentPane().add(lblEfferve);
		
		JLabel lblDregre = new JLabel("Dregr\u00E9e :");
		lblDregre.setForeground(Color.BLACK);
		lblDregre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDregre.setBounds(350, 196, 173, 20);
		frame.getContentPane().add(lblDregre);
		
		JLabel lblNotes = new JLabel("Notes Particuli\u00E8res : ");
		lblNotes.setForeground(Color.BLACK);
		lblNotes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNotes.setBounds(350, 380, 173, 20);
		frame.getContentPane().add(lblNotes);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(210, 121, 125, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label = new JLabel("New label");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setForeground(Color.WHITE);
		label.setBounds(210, 160, 125, 20);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(210, 196, 125, 20);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(210, 232, 125, 20);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(210, 268, 125, 20);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(210, 304, 125, 20);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(210, 344, 125, 20);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(210, 380, 125, 20);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_7.setBounds(543, 121, 125, 20);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_8.setBounds(543, 160, 125, 20);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_9.setBounds(543, 196, 125, 20);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_10.setBounds(543, 232, 125, 20);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("New label");
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_11.setBounds(543, 268, 125, 20);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setForeground(Color.BLACK);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_12.setBounds(543, 304, 125, 20);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setForeground(Color.BLACK);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_13.setBounds(543, 344, 125, 20);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setForeground(Color.BLACK);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_14.setBounds(543, 380, 125, 20);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setForeground(Color.BLACK);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_15.setIcon(new ImageIcon("verre_vin_qualit\u00E9.jpg"));
		label_15.setBounds(0, 0, 978, 544);
		frame.getContentPane().add(label_15);
	}
}