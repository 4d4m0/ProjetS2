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
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
		btnRetour.setBounds(420, 527, 89, 23);
		frame.getContentPane().add(btnRetour);
		
		JLabel label = new JLabel("Gestionnaire de Cave");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(362, 11, 204, 31);
		frame.getContentPane().add(label);
		
		JLabel lblEmplacement = new JLabel("Emplacement");
		lblEmplacement.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmplacement.setBounds(403, 53, 123, 23);
		frame.getContentPane().add(lblEmplacement);
		
		JButton btnCrerUnEmplacement = new JButton("Cr\u00E9er un emplacement");
		btnCrerUnEmplacement.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCrerUnEmplacement.setBounds(74, 370, 204, 23);
		frame.getContentPane().add(btnCrerUnEmplacement);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(522, 128, 89, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnModifierUnEmplacement = new JButton("Modifier un emplacement");
		btnModifierUnEmplacement.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModifierUnEmplacement.setBounds(643, 370, 204, 23);
		frame.getContentPane().add(btnModifierUnEmplacement);
		
		table = new JTable();
		table.setBackground(Color.GRAY);
		table.setBounds(635, 131, 339, 231);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("cave-a-vin.jpg"));
		lblNewLabel.setBounds(30, 124, 331, 235);
		frame.getContentPane().add(lblNewLabel);
	}
}
