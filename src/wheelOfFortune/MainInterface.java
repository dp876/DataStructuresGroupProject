// Damain Patterson

package wheelOfFortune;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainInterface extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private String filePath = "WOF.files//puzzles.txt";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface frame = new MainInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainInterface() {
		setFocusable(false);
		setTitle("GSN - Start");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 460);
		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// button 1 player
		JButton btn1Player = new JButton("1 Player");
		btn1Player.setFocusable(false);
		btn1Player.setBackground(new Color(255, 239, 213));
		btn1Player.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPlayerNames(1);
			}
		});
		btn1Player.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn1Player.setBounds(69, 290, 206, 30);
		contentPane.add(btn1Player);

		JLabel lblNewLabel = new JLabel("dp");
		lblNewLabel.setFocusable(false);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		lblNewLabel.setBounds(314, 406, 20, 14);
		contentPane.add(lblNewLabel);

		JPanel logoPanel = new JPanel();
		logoPanel.setFocusable(false);
		logoPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		logoPanel.setBounds(69, 45, 206, 206);
		contentPane.add(logoPanel);
		logoPanel.setLayout(null);

		JLabel lblLogo = new JLabel("logo");
		lblLogo.setFocusable(false);
		lblLogo.setBounds(3, 3, 200, 200);
		logoPanel.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(MainInterface.class.getResource("/images/GSN 200x200.png")));

		// button 2 player
		JButton btn2Player = new JButton("2 Player");
		btn2Player.setFocusable(false);
		btn2Player.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPlayerNames(2);
			}
		});
		btn2Player.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn2Player.setBackground(new Color(255, 239, 213));
		btn2Player.setBounds(69, 321, 206, 30);
		contentPane.add(btn2Player);

		// button 3 player
		JButton btn3Player = new JButton("3 Player");
		btn3Player.setFocusable(false);
		btn3Player.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPlayerNames(3);
			}
		});
		btn3Player.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn3Player.setBackground(new Color(255, 239, 213));
		btn3Player.setBounds(69, 352, 206, 30);
		contentPane.add(btn3Player);
		setLocationRelativeTo(null);
		createFolder();
	}
	
	// create folder & puzzle file if it does not exist
		public void createFolder() {
			File file = new File(filePath);

			if (!file.exists()) {
				new File("WOF.files").mkdirs(); // creates a folder called WOF.files
				try {
					file.createNewFile();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		}

	// prompt players to enter names
	public void getPlayerNames(int players) {
		String player1 = null, player2 = null, player3 = null;
		boolean validName = false;

		// validName is set to false if user did not enter a name
		try {
			if (players >= 1) {
				player1 = JOptionPane.showInputDialog(null, "Enter Name:", "Contestant 1", JOptionPane.PLAIN_MESSAGE);
				if (player1 == null || player1.isEmpty())
					validName = false;
				else
					validName = true;
			}

			if (players >= 2 && validName) {
				if (!player1.isEmpty()) {
					player2 = JOptionPane.showInputDialog(null, "Enter Name:", "Contestant 2",
							JOptionPane.PLAIN_MESSAGE);
					if (player2 == null || player2.isEmpty())
						validName = false;
					else
						validName = true;
				}
			}

			if (players == 3 && validName) {
				if (!player1.isEmpty() && !player2.isEmpty()) {
					player3 = JOptionPane.showInputDialog(null, "Enter Name:", "Contestant 3",
							JOptionPane.PLAIN_MESSAGE);
					if (player3 == null || player3.isEmpty())
						validName = false;
					else
						validName = true;
				}
			}

		} catch (

		Exception e) {
			// JOptionPane.showMessageDialog(null, e);
		}

		// player name is added to linked list if all names were valid
		if (validName == true) {
			Player p1 = new Player();
			Player p2 = new Player();
			Player p3 = new Player();
			PlayerCircularList pcl = new PlayerCircularList();
			
			if(players == 1) {
				p1.setpName(player1);
				p2.setpName("cpu 1");
				p3.setpName("cpu 2");
				
				p1.setCpu(false);
				p2.setCpu(true);
				p3.setCpu(true);
			}
			else if(players == 2) {
				p1.setpName(player1);
				p2.setpName(player2);
				p3.setpName("cpu 1");
				
				p1.setCpu(false);
				p2.setCpu(false);
				p3.setCpu(true);
			}
			else if(players == 3) {
				p1.setpName(player1);
				p2.setpName(player2);
				p3.setpName(player3);
				
				p1.setCpu(false);
				p2.setCpu(false);
				p3.setCpu(false);
			}

			p1.setpNumber(1);
			p2.setpNumber(2);
			p3.setpNumber(3);
			
			p1.setpGrandTotal(0);
			p2.setpGrandTotal(0);
			p3.setpGrandTotal(0);
			
			pcl.addPlayer(p1);
			pcl.addPlayer(p2);	
			pcl.addPlayer(p3);



			// loads game interface
			GameInterface window = new GameInterface();
			window.setVisible(true);
			window.storePlayers(pcl);
			window.load();
			this.dispose();
		}

	}
}
