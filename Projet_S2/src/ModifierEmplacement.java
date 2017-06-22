import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ModifierEmplacement {

	static JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifierEmplacement window = new ModifierEmplacement();
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
	public ModifierEmplacement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false); 

		
		JLabel lblCrerUnEmplacement = new JLabel("Modifier un emplacement");
		lblCrerUnEmplacement.setForeground(new Color(0, 0, 51));
		lblCrerUnEmplacement.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrerUnEmplacement.setFont(new Font("Wide Latin", Font.BOLD, 14));
		lblCrerUnEmplacement.setBounds(0, 52, 978, 20);
		frame.getContentPane().add(lblCrerUnEmplacement);
		
		JLabel lblGestionnaireDeCave = new JLabel("Gestionnaire de cave");
		lblGestionnaireDeCave.setForeground(new Color(102, 0, 204));
		lblGestionnaireDeCave.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionnaireDeCave.setFont(new Font("Wide Latin", Font.BOLD, 20));
		lblGestionnaireDeCave.setBounds(0, 16, 978, 20);
		frame.getContentPane().add(lblGestionnaireDeCave);
		
		JLabel lblNombreDeBouteille = new JLabel("Nombre de bouteille :");
		lblNombreDeBouteille.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombreDeBouteille.setForeground(new Color(255, 255, 255));
		lblNombreDeBouteille.setBounds(226, 164, 183, 20);
		frame.getContentPane().add(lblNombreDeBouteille);
		
		JLabel lblSuperficie = new JLabel("Superficie :");
		lblSuperficie.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSuperficie.setForeground(new Color(255, 255, 255));
		lblSuperficie.setBounds(226, 200, 183, 20);
		frame.getContentPane().add(lblSuperficie);
		
		JLabel lblTemprature = new JLabel("Temp\u00E9rature :");
		lblTemprature.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTemprature.setForeground(new Color(255, 255, 255));
		lblTemprature.setBounds(226, 236, 183, 20);
		frame.getContentPane().add(lblTemprature);
		
		JLabel lblHumidit = new JLabel("Humidit\u00E9 :");
		lblHumidit.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHumidit.setForeground(new Color(255, 255, 255));
		lblHumidit.setBounds(226, 272, 183, 20);
		frame.getContentPane().add(lblHumidit);
		
		textField = new JTextField();
		textField.setBounds(424, 158, 146, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(424, 194, 146, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(424, 230, 146, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(424, 266, 146, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblM = new JLabel("m\u00B2");
		lblM.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblM.setForeground(new Color(0, 0, 0));
		lblM.setBounds(585, 194, 69, 20);
		frame.getContentPane().add(lblM);
		
		JLabel lblc = new JLabel("\u00B0C");
		lblc.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblc.setForeground(new Color(0, 0, 0));
		lblc.setBounds(585, 230, 69, 20);
		frame.getContentPane().add(lblc);
		
		JLabel label = new JLabel("%");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(585, 266, 69, 20);
		frame.getContentPane().add(label);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane jop_ajout = new JOptionPane();
				jop_ajout.showMessageDialog(null, "Emplacement modifié", "Confirmation",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnValider.setBackground(new Color(51, 102, 0));
		btnValider.setForeground(new Color(255, 255, 255));
		btnValider.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnValider.setBounds(354, 428, 115, 29);
		frame.getContentPane().add(btnValider);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.setVisible(false);
			Emplacement.frame.setVisible(true);
			}
		});
		btnRetour.setBackground(new Color(51, 102, 0));
		btnRetour.setForeground(new Color(255, 255, 255));
		btnRetour.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnRetour.addActionListener(new ActionListener() {
			/*faire les actions des boutons*/
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRetour.setBounds(424, 499, 115, 29);
		frame.getContentPane().add(btnRetour);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane jop_suppr = new JOptionPane();
				jop_suppr.showMessageDialog(null, "Emplacement supprimé", "Confirmation",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSupprimer.setBackground(new Color(51, 102, 0));
		btnSupprimer.setForeground(new Color(255, 255, 255));
		btnSupprimer.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnSupprimer.setBounds(501, 428, 115, 29);
		frame.getContentPane().add(btnSupprimer);
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(new Color(51, 102, 0));
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setIcon(new ImageIcon("verre_vin_qualit\u00E9.jpg"));
		label_1.setBounds(10, 0, 978, 544);
		frame.getContentPane().add(label_1);
	}
}
