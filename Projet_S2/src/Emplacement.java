import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Emplacement {

	static JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					Emplacement window = new Emplacement();
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
	public Emplacement() {
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
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setForeground(Color.WHITE);
		btnRetour.setBackground(new Color(51, 102, 0));
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
		
		JLabel label = new JLabel("Gestionnaire de Cave");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(102, 0, 204));
		label.setFont(new Font("Wide Latin", Font.BOLD, 20));
		label.setBounds(0, 13, 982, 31);
		frame.getContentPane().add(label);
		
		JLabel lblEmplacement = new JLabel("Emplacement");
		lblEmplacement.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmplacement.setForeground(new Color(0, 0, 51));
		lblEmplacement.setFont(new Font("Wide Latin", Font.BOLD, 14));
		lblEmplacement.setBounds(0, 57, 982, 23);
		frame.getContentPane().add(lblEmplacement);
		
		JButton btnCrerUnEmplacement = new JButton("Cr\u00E9er un emplacement");
		btnCrerUnEmplacement.setBackground(new Color(51, 102, 0));
		btnCrerUnEmplacement.setForeground(Color.WHITE);
		btnCrerUnEmplacement.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnCrerUnEmplacement.setBounds(12, 370, 331, 23);
		frame.getContentPane().add(btnCrerUnEmplacement);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.LIGHT_GRAY);
		comboBox.setBounds(522, 128, 89, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnModifierUnEmplacement = new JButton("Modifier un emplacement");
		btnModifierUnEmplacement.setForeground(Color.WHITE);
		btnModifierUnEmplacement.setBackground(new Color(51, 102, 0));
		btnModifierUnEmplacement.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnModifierUnEmplacement.setBounds(635, 370, 335, 23);
		frame.getContentPane().add(btnModifierUnEmplacement);
		
		table = new JTable();
		table.setBackground(Color.GRAY);
		table.setBounds(635, 131, 335, 231);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("cave-a-vin.jpg"));
		lblNewLabel.setBounds(12, 128, 331, 229);
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setIcon(new ImageIcon("cave-a-vin.jpg"));
		lblNewLabel1.setBounds(12, 128, 331, 235);
		frame.getContentPane().add(lblNewLabel1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("verre_vin_qualit\u00E9.jpg"));
		label_1.setBounds(0, 0, 982, 553);
		frame.getContentPane().add(label_1);
	}
}
