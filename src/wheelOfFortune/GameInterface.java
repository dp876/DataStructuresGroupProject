// Damain Patterson

package wheelOfFortune;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;

public class GameInterface extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNameConst1;
	private JTextField txtRoundTotalConst1;
	private JTextField txtNameConst2;
	private JTextField txtRoundTotalConst2;
	private JTextField txtNameConst3;
	private JTextField txtRoundTotalConst3;
	private JTextField txtF11;
	private JTextField txtF12;
	private JTextField txtF13;
	private JTextField txtF14;
	private JTextField txtF15;
	private JTextField txtF16;
	private JTextField txtF17;
	private JTextField txtF18;
	private JTextField txtF19;
	private JTextField txtF20;
	private JTextField txtF21;
	private JTextField txtF22;
	private JTextField txtF10;
	private JTextField txtF9;
	private JTextField txtF8;
	private JTextField txtF7;
	private JTextField txtF6;
	private JTextField txtF5;
	private JTextField txtF4;
	private JTextField txtF3;
	private JTextField txtF2;
	private JTextField txtF1;
	private JTextField txtF23;
	private JTextField txtF34;
	private JTextField txtF33;
	private JTextField txtF32;
	private JTextField txtF31;
	private JTextField txtF30;
	private JTextField txtF29;
	private JTextField txtF28;
	private JTextField txtF27;
	private JTextField txtF26;
	private JTextField txtF25;
	private JTextField txtF24;
	private JTextField txtF44;
	private JTextField txtF43;
	private JTextField txtF42;
	private JTextField txtF41;
	private JTextField txtF40;
	private JTextField txtF39;
	private JTextField txtF38;
	private JTextField txtF37;
	private JTextField txtF36;
	private JTextField txtF35;
	private JButton btnCancel;
	private JPanel panelCont1;
	private JPanel panelCont2;
	private JPanel panelCont3;
	private JButton btnA;
	private JButton btnB;
	private JButton btnC;
	private JButton btnD;
	private JButton btnE;
	private JButton btnF;
	private JButton btnG;
	private JButton btnH;
	private JButton btnI;
	private JButton btnJ;
	private JButton btnK;
	private JButton btnL;
	private JButton btnM;
	private JButton btnN;
	private JButton btnO;
	private JButton btnP;
	private JButton btnQ;
	private JButton btnR;
	private JButton btnS;
	private JButton btnT;
	private JButton btnU;
	private JButton btnV;
	private JButton btnW;
	private JButton btnX;
	private JButton btnY;
	private JButton btnZ;

	private PlayerCircularList playerList;
	private PlayerNode currPlayer;
	private WheelCircularList wheelList = new WheelCircularList();
	private WheelNode currCard;
	private int currentPuzzleNumber = 0;
	private ArrayList<Integer> list = new ArrayList<Integer>();
	private int letterOccurrence = 0;
	private int puzzleLength = 0;
	private String filePath = "WOF.files//puzzles.txt";

	private LetterQueue queue = new LetterQueue();
	private Letter lr = new Letter();

	private String category = null;
	private String puzzle = null;

	private char txtBoxText[] = new char[44];
	private boolean txtBoxColorState[] = new boolean[44];
	private boolean showChar[] = new boolean[44];

	private boolean letterState[] = new boolean[26];
	private ArrayList<Character> charList = new ArrayList<Character>();
	private char letters[] = new char[26];

	private JButton btnBuyVowel;
	private JButton btnSolvePuzzle;
	private JButton btnSpin;
	private JLabel lblCategory;
	private JLabel lblRound;
	private JPanel panelButtons;
	private JTextField txtGrandTotalConst1;
	private JTextField txtGrandTotalConst2;
	private JLabel lblNewLabel_1_3_4;
	private JTextField txtGrandTotalConst3;
	private JLabel lblNewLabel_1_3_5;
	private JPanel panelMain;
	private JPanel panel_1;
	private JPanel panelHead;
	private JLabel lblNewLabel_2;
	private JLabel lblResult;
	private JLabel lblNewLabel_4;
	private JLabel lblLetter;
	private JLabel lblIncorrectLetter;
	private JPanel panelCPUResult;
	private JButton btnCPU;
	private JLabel lblPlayer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameInterface frame = new GameInterface();
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
	public GameInterface() {
		setFocusable(false);
		setTitle("GSN - Wheel Of Fortune");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 560);
		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelContestants = new JPanel();
		panelContestants.setFocusable(false);
		panelContestants.setBackground(new Color(204, 204, 204));
		panelContestants.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelContestants.setBounds(589, 21, 280, 404);
		contentPane.add(panelContestants);
		panelContestants.setLayout(null);

		panelCont1 = new JPanel();
		panelCont1.setFocusable(false);
		panelCont1.setBackground(SystemColor.scrollbar);
		panelCont1.setBounds(12, 11, 258, 120);
		panelContestants.add(panelCont1);
		panelCont1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Contestant 1", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCont1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Player Name:");
		lblNewLabel_1.setFocusable(false);
		lblNewLabel_1.setBounds(10, 26, 110, 15);
		panelCont1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtNameConst1 = new JTextField();
		txtNameConst1.setFocusable(false);
		txtNameConst1.setEditable(false);
		txtNameConst1.setBounds(120, 23, 125, 25);
		panelCont1.add(txtNameConst1);
		txtNameConst1.setColumns(10);

		txtGrandTotalConst1 = new JTextField();
		txtGrandTotalConst1.setFocusable(false);
		txtGrandTotalConst1.setEditable(false);
		txtGrandTotalConst1.setColumns(10);
		txtGrandTotalConst1.setBounds(120, 51, 125, 25);
		panelCont1.add(txtGrandTotalConst1);

		JLabel lblNewLabel_1_3_1 = new JLabel("Grand Total: $");
		lblNewLabel_1_3_1.setFocusable(false);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3_1.setBounds(10, 54, 110, 15);
		panelCont1.add(lblNewLabel_1_3_1);

		JLabel lblNewLabel_1_3 = new JLabel("Round Total: $");
		lblNewLabel_1_3.setFocusable(false);
		lblNewLabel_1_3.setBounds(10, 82, 110, 15);
		panelCont1.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtRoundTotalConst1 = new JTextField();
		txtRoundTotalConst1.setFocusable(false);
		txtRoundTotalConst1.setBounds(120, 79, 125, 25);
		panelCont1.add(txtRoundTotalConst1);
		txtRoundTotalConst1.setEditable(false);
		txtRoundTotalConst1.setColumns(10);

		panelCont2 = new JPanel();
		panelCont2.setFocusable(false);
		panelCont2.setBackground(SystemColor.scrollbar);
		panelCont2.setLayout(null);
		panelCont2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Contestant 2", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCont2.setBounds(12, 142, 258, 120);
		panelContestants.add(panelCont2);

		JLabel lblNewLabel_1_4 = new JLabel("Playe Name:");
		lblNewLabel_1_4.setFocusable(false);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(10, 26, 110, 15);
		panelCont2.add(lblNewLabel_1_4);

		txtNameConst2 = new JTextField();
		txtNameConst2.setFocusable(false);
		txtNameConst2.setEditable(false);
		txtNameConst2.setColumns(10);
		txtNameConst2.setBounds(120, 23, 125, 25);
		panelCont2.add(txtNameConst2);

		txtGrandTotalConst2 = new JTextField();
		txtGrandTotalConst2.setFocusable(false);
		txtGrandTotalConst2.setEditable(false);
		txtGrandTotalConst2.setColumns(10);
		txtGrandTotalConst2.setBounds(120, 51, 125, 25);
		panelCont2.add(txtGrandTotalConst2);

		lblNewLabel_1_3_4 = new JLabel("Grand Total: $");
		lblNewLabel_1_3_4.setFocusable(false);
		lblNewLabel_1_3_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3_4.setBounds(10, 54, 110, 15);
		panelCont2.add(lblNewLabel_1_3_4);

		JLabel lblNewLabel_1_3_2 = new JLabel("Round Total: $");
		lblNewLabel_1_3_2.setFocusable(false);
		lblNewLabel_1_3_2.setBounds(10, 83, 110, 15);
		panelCont2.add(lblNewLabel_1_3_2);
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtRoundTotalConst2 = new JTextField();
		txtRoundTotalConst2.setFocusable(false);
		txtRoundTotalConst2.setBounds(120, 79, 125, 25);
		panelCont2.add(txtRoundTotalConst2);
		txtRoundTotalConst2.setEditable(false);
		txtRoundTotalConst2.setColumns(10);

		panelCont3 = new JPanel();
		panelCont3.setFocusable(false);
		panelCont3.setBackground(SystemColor.scrollbar);
		panelCont3.setLayout(null);
		panelCont3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Contestant 3", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCont3.setBounds(12, 273, 258, 120);
		panelContestants.add(panelCont3);

		JLabel lblNewLabel_1_5 = new JLabel("Player Name:");
		lblNewLabel_1_5.setFocusable(false);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_5.setBounds(10, 26, 110, 15);
		panelCont3.add(lblNewLabel_1_5);

		txtNameConst3 = new JTextField();
		txtNameConst3.setFocusable(false);
		txtNameConst3.setEditable(false);
		txtNameConst3.setColumns(10);
		txtNameConst3.setBounds(120, 23, 125, 25);
		panelCont3.add(txtNameConst3);

		txtGrandTotalConst3 = new JTextField();
		txtGrandTotalConst3.setFocusable(false);
		txtGrandTotalConst3.setEditable(false);
		txtGrandTotalConst3.setColumns(10);
		txtGrandTotalConst3.setBounds(120, 51, 125, 25);
		panelCont3.add(txtGrandTotalConst3);

		lblNewLabel_1_3_5 = new JLabel("Grand Total: $");
		lblNewLabel_1_3_5.setFocusable(false);
		lblNewLabel_1_3_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3_5.setBounds(10, 54, 110, 15);
		panelCont3.add(lblNewLabel_1_3_5);

		txtRoundTotalConst3 = new JTextField();
		txtRoundTotalConst3.setFocusable(false);
		txtRoundTotalConst3.setBounds(120, 79, 125, 25);
		panelCont3.add(txtRoundTotalConst3);
		txtRoundTotalConst3.setEditable(false);
		txtRoundTotalConst3.setColumns(10);

		JLabel lblNewLabel_1_3_3 = new JLabel("Round Total: $");
		lblNewLabel_1_3_3.setFocusable(false);
		lblNewLabel_1_3_3.setBounds(10, 82, 110, 15);
		panelCont3.add(lblNewLabel_1_3_3);
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));

		panelButtons = new JPanel();
		panelButtons.setFocusable(false);
		panelButtons.setBackground(new Color(153, 204, 204));
		panelButtons.setBounds(20, 436, 850, 70);
		contentPane.add(panelButtons);
		panelButtons.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setFocusable(false);
		panel_1.setBackground(new Color(153, 204, 204));
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Vowels", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(200, 0, 260, 65);
		panelButtons.add(panel_1);
		panel_1.setLayout(null);

		// button buy vowel
		btnBuyVowel = new JButton("Buy");
		btnBuyVowel.setFocusable(false);
		btnBuyVowel.setFont(new Font("Verdana", Font.BOLD, 12));
		btnBuyVowel.setBounds(10, 17, 118, 35);
		panel_1.add(btnBuyVowel);
		btnBuyVowel.setBackground(new Color(255, 239, 213));
		btnBuyVowel.setEnabled(false);
		btnBuyVowel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buyVowelButtonAction();
			}
		});

		// button cancel
		btnCancel = new JButton("Cancel");
		btnCancel.setFocusable(false);
		btnCancel.setFont(new Font("Verdana", Font.BOLD, 12));
		btnCancel.setBounds(132, 17, 118, 35);
		panel_1.add(btnCancel);
		btnCancel.setBackground(new Color(255, 239, 213));
		btnCancel.setEnabled(false);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelButtonAction();
			}
		});

		// button solve puzzle
		btnSolvePuzzle = new JButton("Solve Puzzle");
		btnSolvePuzzle.setFocusable(false);
		btnSolvePuzzle.setFont(new Font("Verdana", Font.BOLD, 12));
		btnSolvePuzzle.setBackground(new Color(255, 239, 213));
		btnSolvePuzzle.setBounds(470, 17, 180, 35);
		panelButtons.add(btnSolvePuzzle);
		btnSolvePuzzle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				solvePuzzleButtonAction();
			}
		});
		btnSolvePuzzle.setEnabled(false);

		// button quit
		JButton btnQuit = new JButton("Quit");
		btnQuit.setFocusable(false);
		btnQuit.setFont(new Font("Verdana", Font.BOLD, 12));
		btnQuit.setBackground(new Color(255, 239, 213));
		btnQuit.setBounds(660, 17, 180, 35);
		panelButtons.add(btnQuit);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quitButtonAction();
			}
		});

		// button spin
		btnSpin = new JButton("Spin");
		btnSpin.setFocusable(false);
		btnSpin.setFont(new Font("Verdana", Font.BOLD, 12));
		btnSpin.setBackground(new Color(255, 239, 213));
		btnSpin.setBounds(10, 17, 180, 35);
		panelButtons.add(btnSpin);
		btnSpin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spinButtonAction(false);
			}
		});

		btnCPU = new JButton("CPU");
		btnCPU.setFocusable(false);
		btnCPU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cpuPlayer();
			}
		});
		btnCPU.setFont(new Font("Verdana", Font.BOLD, 12));
		btnCPU.setBackground(new Color(255, 239, 213));
		btnCPU.setBounds(10, 17, 180, 35);
		panelButtons.add(btnCPU);

		panelMain = new JPanel();
		panelMain.setFocusable(false);
		panelMain.setBackground(new Color(153, 204, 204));
		panelMain.setBounds(10, 69, 569, 356);
		contentPane.add(panelMain);
		panelMain.setLayout(null);

		JPanel panelLetters = new JPanel();
		panelLetters.setFocusable(false);
		panelLetters.setBackground(new Color(204, 204, 204));
		panelLetters.setBounds(12, 212, 545, 143);
		panelMain.add(panelLetters);
		panelLetters.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelLetters.setLayout(null);

		// button A
		btnA = new JButton("A");
		btnA.setFocusable(false);
		btnA.setBackground(new Color(245, 245, 220));
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('A', false);
			}
		});
		btnA.setBounds(10, 11, 45, 35);
		panelLetters.add(btnA);
		btnA.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button B
		btnB = new JButton("B");
		btnB.setFocusable(false);
		btnB.setBackground(new Color(245, 245, 220));
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('B', false);
			}
		});
		btnB.setBounds(60, 11, 45, 35);
		panelLetters.add(btnB);
		btnB.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button C
		btnC = new JButton("C");
		btnC.setFocusable(false);
		btnC.setBackground(new Color(245, 245, 220));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('C', false);
			}
		});
		btnC.setBounds(110, 11, 45, 35);
		panelLetters.add(btnC);
		btnC.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button D
		btnD = new JButton("D");
		btnD.setFocusable(false);
		btnD.setBackground(new Color(245, 245, 220));
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('D', false);
			}
		});
		btnD.setBounds(175, 11, 45, 35);
		panelLetters.add(btnD);
		btnD.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button E
		btnE = new JButton("E");
		btnE.setFocusable(false);
		btnE.setBackground(new Color(245, 245, 220));
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('E', false);
			}
		});
		btnE.setBounds(225, 11, 45, 35);
		panelLetters.add(btnE);
		btnE.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button F
		btnF = new JButton("F");
		btnF.setFocusable(false);
		btnF.setBackground(new Color(245, 245, 220));
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('F', false);
			}
		});
		btnF.setBounds(275, 11, 45, 35);
		panelLetters.add(btnF);
		btnF.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button G
		btnG = new JButton("G");
		btnG.setFocusable(false);
		btnG.setBackground(new Color(245, 245, 220));
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('G', false);
			}
		});
		btnG.setBounds(325, 11, 45, 35);
		panelLetters.add(btnG);
		btnG.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button H
		btnH = new JButton("H");
		btnH.setFocusable(false);
		btnH.setBackground(new Color(245, 245, 220));
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('H', false);
			}
		});
		btnH.setBounds(390, 11, 45, 35);
		panelLetters.add(btnH);
		btnH.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button I
		btnI = new JButton("I");
		btnI.setFocusable(false);
		btnI.setBackground(new Color(245, 245, 220));
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('I', false);
			}
		});
		btnI.setBounds(440, 11, 45, 35);
		panelLetters.add(btnI);
		btnI.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button J
		btnJ = new JButton("J");
		btnJ.setFocusable(false);
		btnJ.setBackground(new Color(245, 245, 220));
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('J', false);
			}
		});
		btnJ.setBounds(490, 11, 45, 35);
		panelLetters.add(btnJ);
		btnJ.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button K
		btnK = new JButton("K");
		btnK.setFocusable(false);
		btnK.setBackground(new Color(245, 245, 220));
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('K', false);
			}
		});
		btnK.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnK.setBounds(10, 54, 45, 35);
		panelLetters.add(btnK);

		// button L
		btnL = new JButton("L");
		btnL.setFocusable(false);
		btnL.setBackground(new Color(245, 245, 220));
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('L', false);
			}
		});
		btnL.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnL.setBounds(60, 54, 45, 35);
		panelLetters.add(btnL);

		// button M
		btnM = new JButton("M");
		btnM.setFocusable(false);
		btnM.setBackground(new Color(245, 245, 220));
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('M', false);
			}
		});
		btnM.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnM.setBounds(110, 54, 45, 35);
		panelLetters.add(btnM);

		// button N
		btnN = new JButton("N");
		btnN.setFocusable(false);
		btnN.setBackground(new Color(245, 245, 220));
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('N', false);
			}
		});
		btnN.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnN.setBounds(175, 54, 45, 35);
		panelLetters.add(btnN);

		// button O
		btnO = new JButton("O");
		btnO.setFocusable(false);
		btnO.setBackground(new Color(245, 245, 220));
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('O', false);
			}
		});
		btnO.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnO.setBounds(225, 54, 45, 35);
		panelLetters.add(btnO);

		// button P
		btnP = new JButton("P");
		btnP.setFocusable(false);
		btnP.setBackground(new Color(245, 245, 220));
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('P', false);
			}
		});
		btnP.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnP.setBounds(275, 54, 45, 35);
		panelLetters.add(btnP);

		// button Q
		btnQ = new JButton("Q");
		btnQ.setFocusable(false);
		btnQ.setBackground(new Color(245, 245, 220));
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('Q', false);
			}
		});
		btnQ.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnQ.setBounds(325, 54, 45, 35);
		panelLetters.add(btnQ);

		// button R
		btnR = new JButton("R");
		btnR.setFocusable(false);
		btnR.setBackground(new Color(245, 245, 220));
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('R', false);
			}
		});
		btnR.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnR.setBounds(390, 54, 45, 35);
		panelLetters.add(btnR);

		// button S
		btnS = new JButton("S");
		btnS.setFocusable(false);
		btnS.setBackground(new Color(245, 245, 220));
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('S', false);
			}
		});
		btnS.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnS.setBounds(440, 54, 45, 35);
		panelLetters.add(btnS);

		// button T
		btnT = new JButton("T");
		btnT.setFocusable(false);
		btnT.setBackground(new Color(245, 245, 220));
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('T', false);
			}
		});
		btnT.setBounds(490, 54, 45, 35);
		panelLetters.add(btnT);
		btnT.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button U
		btnU = new JButton("U");
		btnU.setFocusable(false);
		btnU.setBackground(new Color(245, 245, 220));
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('U', false);
			}
		});
		btnU.setBounds(110, 97, 45, 35);
		panelLetters.add(btnU);
		btnU.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button V
		btnV = new JButton("V");
		btnV.setFocusable(false);
		btnV.setBackground(new Color(245, 245, 220));
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('V', false);
			}
		});
		btnV.setBounds(175, 97, 45, 35);
		panelLetters.add(btnV);
		btnV.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button W
		btnW = new JButton("W");
		btnW.setFocusable(false);
		btnW.setBackground(new Color(245, 245, 220));
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('W', false);
			}
		});
		btnW.setBounds(225, 97, 45, 35);
		panelLetters.add(btnW);
		btnW.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button X
		btnX = new JButton("X");
		btnX.setFocusable(false);
		btnX.setBackground(new Color(245, 245, 220));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('X', false);
			}
		});
		btnX.setBounds(275, 97, 45, 35);
		panelLetters.add(btnX);
		btnX.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button Y
		btnY = new JButton("Y");
		btnY.setFocusable(false);
		btnY.setBackground(new Color(245, 245, 220));
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('Y', false);
			}
		});
		btnY.setBounds(325, 97, 45, 35);
		panelLetters.add(btnY);
		btnY.setFont(new Font("Segoe Print", Font.BOLD, 11));

		// button Z
		btnZ = new JButton("Z");
		btnZ.setFocusable(false);
		btnZ.setBackground(new Color(245, 245, 220));
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usedLetters('Z', false);
			}
		});
		btnZ.setBounds(390, 97, 45, 35);
		panelLetters.add(btnZ);
		btnZ.setFont(new Font("Segoe Print", Font.BOLD, 11));

		JPanel panelLetterBox = new JPanel();
		panelLetterBox.setFocusable(false);
		panelLetterBox.setBackground(new Color(204, 204, 204));
		panelLetterBox.setBounds(59, 0, 451, 153);
		panelMain.add(panelLetterBox);
		panelLetterBox.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelLetterBox.setLayout(null);

		txtF11 = new JTextField();
		txtF11.setFocusable(false);
		txtF11.setEditable(false);
		txtF11.setHorizontalAlignment(SwingConstants.CENTER);
		txtF11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF11.setColumns(10);
		txtF11.setBounds(10, 43, 35, 30);
		panelLetterBox.add(txtF11);

		txtF12 = new JTextField();
		txtF12.setFocusable(false);
		txtF12.setEditable(false);
		txtF12.setHorizontalAlignment(SwingConstants.CENTER);
		txtF12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF12.setColumns(10);
		txtF12.setBounds(46, 43, 35, 30);
		panelLetterBox.add(txtF12);

		txtF13 = new JTextField();
		txtF13.setFocusable(false);
		txtF13.setEditable(false);
		txtF13.setHorizontalAlignment(SwingConstants.CENTER);
		txtF13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF13.setColumns(10);
		txtF13.setBounds(82, 43, 35, 30);
		panelLetterBox.add(txtF13);

		txtF14 = new JTextField();
		txtF14.setFocusable(false);
		txtF14.setEditable(false);
		txtF14.setHorizontalAlignment(SwingConstants.CENTER);
		txtF14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF14.setColumns(10);
		txtF14.setBounds(118, 43, 35, 30);
		panelLetterBox.add(txtF14);

		txtF15 = new JTextField();
		txtF15.setFocusable(false);
		txtF15.setEditable(false);
		txtF15.setHorizontalAlignment(SwingConstants.CENTER);
		txtF15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF15.setColumns(10);
		txtF15.setBounds(154, 43, 35, 30);
		panelLetterBox.add(txtF15);

		txtF16 = new JTextField();
		txtF16.setFocusable(false);
		txtF16.setEditable(false);
		txtF16.setHorizontalAlignment(SwingConstants.CENTER);
		txtF16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF16.setColumns(10);
		txtF16.setBounds(190, 43, 35, 30);
		panelLetterBox.add(txtF16);

		txtF17 = new JTextField();
		txtF17.setFocusable(false);
		txtF17.setEditable(false);
		txtF17.setHorizontalAlignment(SwingConstants.CENTER);
		txtF17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF17.setColumns(10);
		txtF17.setBounds(226, 43, 35, 30);
		panelLetterBox.add(txtF17);

		txtF18 = new JTextField();
		txtF18.setFocusable(false);
		txtF18.setEditable(false);
		txtF18.setHorizontalAlignment(SwingConstants.CENTER);
		txtF18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF18.setColumns(10);
		txtF18.setBounds(262, 43, 35, 30);
		panelLetterBox.add(txtF18);

		txtF19 = new JTextField();
		txtF19.setFocusable(false);
		txtF19.setEditable(false);
		txtF19.setHorizontalAlignment(SwingConstants.CENTER);
		txtF19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF19.setColumns(10);
		txtF19.setBounds(298, 43, 35, 30);
		panelLetterBox.add(txtF19);

		txtF20 = new JTextField();
		txtF20.setFocusable(false);
		txtF20.setEditable(false);
		txtF20.setHorizontalAlignment(SwingConstants.CENTER);
		txtF20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF20.setColumns(10);
		txtF20.setBounds(334, 43, 35, 30);
		panelLetterBox.add(txtF20);

		txtF21 = new JTextField();
		txtF21.setFocusable(false);
		txtF21.setEditable(false);
		txtF21.setHorizontalAlignment(SwingConstants.CENTER);
		txtF21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF21.setColumns(10);
		txtF21.setBounds(370, 43, 35, 30);
		panelLetterBox.add(txtF21);

		txtF22 = new JTextField();
		txtF22.setFocusable(false);
		txtF22.setEditable(false);
		txtF22.setHorizontalAlignment(SwingConstants.CENTER);
		txtF22.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF22.setColumns(10);
		txtF22.setBounds(406, 43, 35, 30);
		panelLetterBox.add(txtF22);

		txtF10 = new JTextField();
		txtF10.setFocusable(false);
		txtF10.setEditable(false);
		txtF10.setHorizontalAlignment(SwingConstants.CENTER);
		txtF10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF10.setColumns(10);
		txtF10.setBounds(370, 11, 35, 30);
		panelLetterBox.add(txtF10);

		txtF9 = new JTextField();
		txtF9.setFocusable(false);
		txtF9.setEditable(false);
		txtF9.setHorizontalAlignment(SwingConstants.CENTER);
		txtF9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF9.setColumns(10);
		txtF9.setBounds(334, 11, 35, 30);
		panelLetterBox.add(txtF9);

		txtF8 = new JTextField();
		txtF8.setFocusable(false);
		txtF8.setEditable(false);
		txtF8.setHorizontalAlignment(SwingConstants.CENTER);
		txtF8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF8.setColumns(10);
		txtF8.setBounds(298, 11, 35, 30);
		panelLetterBox.add(txtF8);

		txtF7 = new JTextField();
		txtF7.setFocusable(false);
		txtF7.setEditable(false);
		txtF7.setHorizontalAlignment(SwingConstants.CENTER);
		txtF7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF7.setColumns(10);
		txtF7.setBounds(262, 11, 35, 30);
		panelLetterBox.add(txtF7);

		txtF6 = new JTextField();
		txtF6.setFocusable(false);
		txtF6.setEditable(false);
		txtF6.setHorizontalAlignment(SwingConstants.CENTER);
		txtF6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF6.setColumns(10);
		txtF6.setBounds(226, 11, 35, 30);
		panelLetterBox.add(txtF6);

		txtF5 = new JTextField();
		txtF5.setFocusable(false);
		txtF5.setEditable(false);
		txtF5.setHorizontalAlignment(SwingConstants.CENTER);
		txtF5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF5.setColumns(10);
		txtF5.setBounds(190, 11, 35, 30);
		panelLetterBox.add(txtF5);

		txtF4 = new JTextField();
		txtF4.setFocusable(false);
		txtF4.setEditable(false);
		txtF4.setHorizontalAlignment(SwingConstants.CENTER);
		txtF4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF4.setColumns(10);
		txtF4.setBounds(154, 11, 35, 30);
		panelLetterBox.add(txtF4);

		txtF3 = new JTextField();
		txtF3.setFocusable(false);
		txtF3.setEditable(false);
		txtF3.setHorizontalAlignment(SwingConstants.CENTER);
		txtF3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF3.setColumns(10);
		txtF3.setBounds(118, 11, 35, 30);
		panelLetterBox.add(txtF3);

		txtF2 = new JTextField();
		txtF2.setFocusable(false);
		txtF2.setEditable(false);
		txtF2.setHorizontalAlignment(SwingConstants.CENTER);
		txtF2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF2.setColumns(10);
		txtF2.setBounds(82, 11, 35, 30);
		panelLetterBox.add(txtF2);

		txtF1 = new JTextField();
		txtF1.setFocusable(false);
		txtF1.setEditable(false);
		txtF1.setHorizontalAlignment(SwingConstants.CENTER);
		txtF1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF1.setColumns(10);
		txtF1.setBounds(46, 11, 35, 30);
		panelLetterBox.add(txtF1);

		txtF23 = new JTextField();
		txtF23.setFocusable(false);
		txtF23.setEditable(false);
		txtF23.setHorizontalAlignment(SwingConstants.CENTER);
		txtF23.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF23.setColumns(10);
		txtF23.setBounds(10, 75, 35, 30);
		panelLetterBox.add(txtF23);

		txtF34 = new JTextField();
		txtF34.setFocusable(false);
		txtF34.setEditable(false);
		txtF34.setHorizontalAlignment(SwingConstants.CENTER);
		txtF34.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF34.setColumns(10);
		txtF34.setBounds(406, 75, 35, 30);
		panelLetterBox.add(txtF34);

		txtF33 = new JTextField();
		txtF33.setFocusable(false);
		txtF33.setEditable(false);
		txtF33.setHorizontalAlignment(SwingConstants.CENTER);
		txtF33.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF33.setColumns(10);
		txtF33.setBounds(370, 75, 35, 30);
		panelLetterBox.add(txtF33);

		txtF32 = new JTextField();
		txtF32.setFocusable(false);
		txtF32.setEditable(false);
		txtF32.setHorizontalAlignment(SwingConstants.CENTER);
		txtF32.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF32.setColumns(10);
		txtF32.setBounds(334, 75, 35, 30);
		panelLetterBox.add(txtF32);

		txtF31 = new JTextField();
		txtF31.setFocusable(false);
		txtF31.setEditable(false);
		txtF31.setHorizontalAlignment(SwingConstants.CENTER);
		txtF31.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF31.setColumns(10);
		txtF31.setBounds(298, 75, 35, 30);
		panelLetterBox.add(txtF31);

		txtF30 = new JTextField();
		txtF30.setFocusable(false);
		txtF30.setEditable(false);
		txtF30.setHorizontalAlignment(SwingConstants.CENTER);
		txtF30.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF30.setColumns(10);
		txtF30.setBounds(262, 75, 35, 30);
		panelLetterBox.add(txtF30);

		txtF29 = new JTextField();
		txtF29.setFocusable(false);
		txtF29.setEditable(false);
		txtF29.setHorizontalAlignment(SwingConstants.CENTER);
		txtF29.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF29.setColumns(10);
		txtF29.setBounds(226, 75, 35, 30);
		panelLetterBox.add(txtF29);

		txtF28 = new JTextField();
		txtF28.setFocusable(false);
		txtF28.setEditable(false);
		txtF28.setHorizontalAlignment(SwingConstants.CENTER);
		txtF28.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF28.setColumns(10);
		txtF28.setBounds(190, 75, 35, 30);
		panelLetterBox.add(txtF28);

		txtF27 = new JTextField();
		txtF27.setFocusable(false);
		txtF27.setEditable(false);
		txtF27.setHorizontalAlignment(SwingConstants.CENTER);
		txtF27.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF27.setColumns(10);
		txtF27.setBounds(154, 75, 35, 30);
		panelLetterBox.add(txtF27);

		txtF26 = new JTextField();
		txtF26.setFocusable(false);
		txtF26.setEditable(false);
		txtF26.setHorizontalAlignment(SwingConstants.CENTER);
		txtF26.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF26.setColumns(10);
		txtF26.setBounds(118, 75, 35, 30);
		panelLetterBox.add(txtF26);

		txtF25 = new JTextField();
		txtF25.setFocusable(false);
		txtF25.setEditable(false);
		txtF25.setHorizontalAlignment(SwingConstants.CENTER);
		txtF25.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF25.setColumns(10);
		txtF25.setBounds(82, 75, 35, 30);
		panelLetterBox.add(txtF25);

		txtF24 = new JTextField();
		txtF24.setFocusable(false);
		txtF24.setEditable(false);
		txtF24.setHorizontalAlignment(SwingConstants.CENTER);
		txtF24.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF24.setColumns(10);
		txtF24.setBounds(46, 75, 35, 30);
		panelLetterBox.add(txtF24);

		txtF44 = new JTextField();
		txtF44.setFocusable(false);
		txtF44.setEditable(false);
		txtF44.setHorizontalAlignment(SwingConstants.CENTER);
		txtF44.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF44.setColumns(10);
		txtF44.setBounds(370, 107, 35, 30);
		panelLetterBox.add(txtF44);

		txtF43 = new JTextField();
		txtF43.setFocusable(false);
		txtF43.setEditable(false);
		txtF43.setHorizontalAlignment(SwingConstants.CENTER);
		txtF43.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF43.setColumns(10);
		txtF43.setBounds(334, 107, 35, 30);
		panelLetterBox.add(txtF43);

		txtF42 = new JTextField();
		txtF42.setFocusable(false);
		txtF42.setEditable(false);
		txtF42.setHorizontalAlignment(SwingConstants.CENTER);
		txtF42.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF42.setColumns(10);
		txtF42.setBounds(298, 107, 35, 30);
		panelLetterBox.add(txtF42);

		txtF41 = new JTextField();
		txtF41.setFocusable(false);
		txtF41.setEditable(false);
		txtF41.setHorizontalAlignment(SwingConstants.CENTER);
		txtF41.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF41.setColumns(10);
		txtF41.setBounds(262, 107, 35, 30);
		panelLetterBox.add(txtF41);

		txtF40 = new JTextField();
		txtF40.setFocusable(false);
		txtF40.setEditable(false);
		txtF40.setHorizontalAlignment(SwingConstants.CENTER);
		txtF40.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF40.setColumns(10);
		txtF40.setBounds(226, 107, 35, 30);
		panelLetterBox.add(txtF40);

		txtF39 = new JTextField();
		txtF39.setFocusable(false);
		txtF39.setEditable(false);
		txtF39.setHorizontalAlignment(SwingConstants.CENTER);
		txtF39.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF39.setColumns(10);
		txtF39.setBounds(190, 107, 35, 30);
		panelLetterBox.add(txtF39);

		txtF38 = new JTextField();
		txtF38.setFocusable(false);
		txtF38.setEditable(false);
		txtF38.setHorizontalAlignment(SwingConstants.CENTER);
		txtF38.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF38.setColumns(10);
		txtF38.setBounds(154, 107, 35, 30);
		panelLetterBox.add(txtF38);

		txtF37 = new JTextField();
		txtF37.setFocusable(false);
		txtF37.setEditable(false);
		txtF37.setHorizontalAlignment(SwingConstants.CENTER);
		txtF37.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF37.setColumns(10);
		txtF37.setBounds(118, 107, 35, 30);
		panelLetterBox.add(txtF37);

		txtF36 = new JTextField();
		txtF36.setFocusable(false);
		txtF36.setEditable(false);
		txtF36.setHorizontalAlignment(SwingConstants.CENTER);
		txtF36.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF36.setColumns(10);
		txtF36.setBounds(82, 107, 35, 30);
		panelLetterBox.add(txtF36);

		txtF35 = new JTextField();
		txtF35.setFocusable(false);
		txtF35.setEditable(false);
		txtF35.setHorizontalAlignment(SwingConstants.CENTER);
		txtF35.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtF35.setColumns(10);
		txtF35.setBounds(46, 107, 35, 30);
		panelLetterBox.add(txtF35);

		panelCPUResult = new JPanel();
		panelCPUResult.setFocusable(false);
		panelCPUResult.setBackground(new Color(153, 204, 204));
		panelCPUResult.setBounds(59, 164, 451, 37);
		panelMain.add(panelCPUResult);
		panelCPUResult.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Reward: ");
		lblNewLabel_3.setFocusable(false);
		lblNewLabel_3.setBounds(195, 15, 143, 25);
		panelCPUResult.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 20));

		lblResult = new JLabel("null");
		lblResult.setFocusable(false);
		lblResult.setBounds(276, 15, 175, 25);
		panelCPUResult.add(lblResult);
		lblResult.setFont(new Font("Dialog", Font.PLAIN, 20));

		lblNewLabel_4 = new JLabel("Selected Letter:");
		lblNewLabel_4.setFocusable(false);
		lblNewLabel_4.setBounds(0, 0, 126, 14);
		panelCPUResult.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 15));

		lblLetter = new JLabel("null");
		lblLetter.setFocusable(false);
		lblLetter.setBounds(109, 0, 40, 14);
		panelCPUResult.add(lblLetter);
		lblLetter.setFont(new Font("Dialog", Font.PLAIN, 15));

		lblIncorrectLetter = new JLabel("Incorrect Letter!");
		lblIncorrectLetter.setFocusable(false);
		lblIncorrectLetter.setBounds(0, 23, 190, 14);
		panelCPUResult.add(lblIncorrectLetter);
		lblIncorrectLetter.setForeground(new Color(220, 20, 60));
		lblIncorrectLetter.setFont(new Font("Dialog", Font.BOLD, 15));

		JLabel lblNewLabel_4_1 = new JLabel("Player:");
		lblNewLabel_4_1.setFocusable(false);
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(195, 0, 70, 14);
		panelCPUResult.add(lblNewLabel_4_1);

		lblPlayer = new JLabel("null");
		lblPlayer.setFocusable(false);
		lblPlayer.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPlayer.setBounds(260, 0, 191, 14);
		panelCPUResult.add(lblPlayer);
		lblIncorrectLetter.setVisible(false);

		panelHead = new JPanel();
		panelHead.setFocusable(false);
		panelHead.setBackground(new Color(153, 204, 204));
		panelHead.setBounds(10, 21, 569, 37);
		contentPane.add(panelHead);
		panelHead.setLayout(null);

		JLabel lblNewLabel = new JLabel("Category: ");
		lblNewLabel.setFocusable(false);
		lblNewLabel.setBounds(58, 1, 130, 35);
		panelHead.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 26));

		lblCategory = new JLabel("null");
		lblCategory.setFocusable(false);
		lblCategory.setBounds(176, 3, 140, 30);
		panelHead.add(lblCategory);
		lblCategory.setFont(new Font("Poor Richard", Font.PLAIN, 26));

		JLabel lblNewLabel2 = new JLabel("Round: ");
		lblNewLabel2.setFocusable(false);
		lblNewLabel2.setBounds(409, 1, 100, 35);
		panelHead.add(lblNewLabel2);
		lblNewLabel2.setFont(new Font("Dialog", Font.PLAIN, 26));

		lblRound = new JLabel("null");
		lblRound.setFocusable(false);
		lblRound.setBounds(496, 3, 50, 30);
		panelHead.add(lblRound);
		lblRound.setFont(new Font("Poor Richard", Font.PLAIN, 26));

		lblNewLabel_2 = new JLabel("dp");
		lblNewLabel_2.setFocusable(false);
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(864, 506, 20, 14);
		contentPane.add(lblNewLabel_2);

		setLocationRelativeTo(null);
	}

	// reset components on GUI interface to required state
	public void reset() {
		for (int i = 0; i < 44; i++) {
			txtBoxText[i] = '_';
			showChar[i] = false;
		}

		showLetter();
		loadPuzzle();

		queue.emptyQueue();

		btnSpin.setEnabled(true);
		btnBuyVowel.setEnabled(false);
		btnCancel.setEnabled(false);
		btnSolvePuzzle.setEnabled(false);

		currPlayer = playerList.getHead();

		colorTxtBox();

		for (int i = 0; i < 26; i++) {
			letterState[i] = true;
		}

		selectContestant();

		lblResult.setText("null");
		lblLetter.setText("null");
		lblPlayer.setText("null");
		lblIncorrectLetter.setVisible(false);

		setVowelLetterState(false);
		setConstantLetterState(false);
	}

	// initialize components and attributes
	public void load() {
		currentPuzzleNumber = 0;

		for (int i = 0; i < 26; i++) {
			letterState[i] = true;
		}

		initializeLetters();

		setVowelLetterState(false);
		setConstantLetterState(false);

		loadPlayers();
		populateWheel();
		currPlayer = playerList.getHead();

		threeRandomRounds();
		loadPuzzle();

		selectContestant();
	}

	// store player data received from main interface
	public void storePlayers(PlayerCircularList data) {
		playerList = data;
	}

	// load player data to components on GUI
	public void loadPlayers() {
		PlayerNode head = new PlayerNode(playerList.getHead());

		PlayerNode current = head;

		do {
			if (current.getData().isCpu()) {
				panelCPUResult.setVisible(true);
			}
			if (current.getData().getpNumber() == 1) {
				txtNameConst1.setText(current.getData().getpName());
				txtRoundTotalConst1.setText("0");
				txtGrandTotalConst1.setText(Integer.toString(current.getData().getpGrandTotal()));
			} else if (current.getData().getpNumber() == 2) {
				txtNameConst2.setText(current.getData().getpName());
				txtRoundTotalConst2.setText("0");
				txtGrandTotalConst2.setText(Integer.toString(current.getData().getpGrandTotal()));
			} else if (current.getData().getpNumber() == 3) {
				txtNameConst3.setText(current.getData().getpName());
				txtRoundTotalConst3.setText("0");
				txtGrandTotalConst3.setText(Integer.toString(current.getData().getpGrandTotal()));
			}
			current = current.next;
		} while (current.getData() != head.getData());
	}

	// select & highlight selected contestant on GUI
	public void selectContestant() {
		if (currPlayer.getData().getpNumber() == 1) {
			panelCont1.setBackground(SystemColor.info);
			panelCont2.setBackground(SystemColor.scrollbar);
			panelCont3.setBackground(SystemColor.scrollbar);
		}
		if (currPlayer.getData().getpNumber() == 2) {
			panelCont1.setBackground(SystemColor.scrollbar);
			panelCont2.setBackground(SystemColor.info);
			panelCont3.setBackground(SystemColor.scrollbar);
		}
		if (currPlayer.getData().getpNumber() == 3) {
			panelCont1.setBackground(SystemColor.scrollbar);
			panelCont2.setBackground(SystemColor.scrollbar);
			panelCont3.setBackground(SystemColor.info);
		}

		if (currPlayer.getData().isCpu()) {
			btnSpin.setVisible(false);
			btnCPU.setVisible(true);
		} else {
			btnSpin.setVisible(true);
			btnSpin.setEnabled(true);
			btnCPU.setVisible(false);
		}

		currPlayer = currPlayer.getNext();
		hasPlays();
	}

	// add card values to the wheel circular linked list
	public void populateWheel() {
		Wheel w1 = new Wheel(1, "$2500", 2500);
		Wheel w2 = new Wheel(2, "Loose A Turn", 0);
		Wheel w3 = new Wheel(3, "$600", 600);
		Wheel w4 = new Wheel(4, "$700", 700);
		Wheel w5 = new Wheel(5, "$600", 600);
		Wheel w6 = new Wheel(6, "$1000", 1000);
		Wheel w7 = new Wheel(7, "$500", 500);
		Wheel w8 = new Wheel(8, "$700", 700);
		Wheel w9 = new Wheel(9, "Bankrupt", 0);
		Wheel w10 = new Wheel(10, "$600", 600);
		Wheel w11 = new Wheel(11, "$550", 550);
		Wheel w12 = new Wheel(12, "$1400", 1400);
		Wheel w13 = new Wheel(13, "$600", 600);
		Wheel w14 = new Wheel(14, "Bankrupt", 0);
		Wheel w15 = new Wheel(15, "$650", 650);
		Wheel w16 = new Wheel(16, "$850", 850);
		Wheel w17 = new Wheel(17, "$700", 700);
		Wheel w18 = new Wheel(18, "Loose A Turn", 0);
		Wheel w19 = new Wheel(19, "$800", 800);
		Wheel w20 = new Wheel(20, "$2000", 2000);
		Wheel w21 = new Wheel(21, "$650", 650);
		Wheel w22 = new Wheel(22, "$1300", 1300);
		Wheel w23 = new Wheel(23, "$900", 900);
		Wheel w24 = new Wheel(24, "$1600", 1600);
		Wheel w25 = new Wheel(25, "$2500", 2500);

		wheelList.addCard(w1);
		wheelList.addCard(w2);
		wheelList.addCard(w3);
		wheelList.addCard(w4);
		wheelList.addCard(w5);
		wheelList.addCard(w6);
		wheelList.addCard(w7);
		wheelList.addCard(w8);
		wheelList.addCard(w9);
		wheelList.addCard(w10);
		wheelList.addCard(w11);
		wheelList.addCard(w12);
		wheelList.addCard(w13);
		wheelList.addCard(w14);
		wheelList.addCard(w15);
		wheelList.addCard(w16);
		wheelList.addCard(w17);
		wheelList.addCard(w18);
		wheelList.addCard(w19);
		wheelList.addCard(w20);
		wheelList.addCard(w21);
		wheelList.addCard(w22);
		wheelList.addCard(w23);
		wheelList.addCard(w24);
		wheelList.addCard(w25);

		currCard = wheelList.getHead();
	}

	// loads a new puzzle & display category of puzzle & round
	public void loadPuzzle() {
		Scanner scan;

		try {
			scan = new Scanner(new File(filePath));

			for (int i = 0; i < list.get(currentPuzzleNumber); i++) {
				category = scan.next();
				puzzle = scan.next();
			}
			currentPuzzleNumber++;

			lblCategory.setText(category);
			lblRound.setText(Integer.toString(currentPuzzleNumber));

			letterPosition(puzzle.length(), puzzle);
			colorTxtBox();

			scan.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Load puzzle error: " + e);
		}
	}

	// reads puzzles from file & shuffle them randomly
	public void threeRandomRounds() {
		Path path = Paths.get(filePath);
		int lineCount = 0;

		try {
			lineCount = (int) Files.lines(path).count();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= lineCount; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
	}

	// enable or disable vowel buttons
	public void setVowelLetterState(boolean b) {
		// enable base on their state
		if (b == true) {
			btnA.setEnabled(letterState[0]);
			btnE.setEnabled(letterState[4]);
			btnI.setEnabled(letterState[8]);
			btnO.setEnabled(letterState[14]);
			btnU.setEnabled(letterState[20]);
		} else {
			btnA.setEnabled(false);
			btnE.setEnabled(false);
			btnI.setEnabled(false);
			btnO.setEnabled(false);
			btnU.setEnabled(false);
		}
	}

	// enable or disable constant letter buttons
	public void setConstantLetterState(boolean b) {
		// enable base on their state
		if (b == true) {
			btnB.setEnabled(letterState[1]);
			btnC.setEnabled(letterState[2]);
			btnD.setEnabled(letterState[3]);
			btnF.setEnabled(letterState[5]);
			btnG.setEnabled(letterState[6]);
			btnH.setEnabled(letterState[7]);
			btnJ.setEnabled(letterState[9]);
			btnK.setEnabled(letterState[10]);
			btnL.setEnabled(letterState[11]);
			btnM.setEnabled(letterState[12]);
			btnN.setEnabled(letterState[13]);
			btnP.setEnabled(letterState[15]);
			btnQ.setEnabled(letterState[16]);
			btnR.setEnabled(letterState[17]);
			btnS.setEnabled(letterState[18]);
			btnT.setEnabled(letterState[19]);
			btnV.setEnabled(letterState[21]);
			btnW.setEnabled(letterState[22]);
			btnX.setEnabled(letterState[23]);
			btnY.setEnabled(letterState[24]);
			btnZ.setEnabled(letterState[25]);
		} else {
			btnB.setEnabled(false);
			btnC.setEnabled(false);
			btnD.setEnabled(false);
			btnF.setEnabled(false);
			btnG.setEnabled(false);
			btnH.setEnabled(false);
			btnJ.setEnabled(false);
			btnK.setEnabled(false);
			btnL.setEnabled(false);
			btnM.setEnabled(false);
			btnN.setEnabled(false);
			btnP.setEnabled(false);
			btnQ.setEnabled(false);
			btnR.setEnabled(false);
			btnS.setEnabled(false);
			btnT.setEnabled(false);
			btnV.setEnabled(false);
			btnW.setEnabled(false);
			btnX.setEnabled(false);
			btnY.setEnabled(false);
			btnZ.setEnabled(false);
		}
	}

	// position letters of puzzle with display boxes on GUI
	public void letterPosition(int length, String string) {

		// use _ to represent white spaces
		for (int i = 0; i < 44; i++) {
			txtBoxText[i] = '_';
		}

		// get position of box to start showning puzzle
		int tempSpace = ((44 - length) / 2);
		int space;

		// check if puzzle contains even number of characters
		if (length % 2 != 0) {
			space = tempSpace + 1;
		} else {
			space = tempSpace;
		}
		puzzleLength = 0;

		// counts length of puzzle without white spaces
		for (int i = space, j = 0; j < length; i++, j++) {
			txtBoxText[i] = Character.toUpperCase(string.charAt(j));
			// System.out.print(i + " = " + txtBoxText[i] + " ");
			if (txtBoxText[i] != '_') {
				puzzleLength++;
			}
		}
	}

	// change color of text boxes if they are to be empty
	public void colorTxtBox() {

		// determine if textbox color should be changed if it contains '_' which means
		// it does not contain letters
		for (int i = 0; i < 44; i++) {
			if (txtBoxText[i] == '_')
				txtBoxColorState[i] = true;
			else
				txtBoxColorState[i] = false;
		}

		// determine if textboxes are suppose to display their character only if they
		// contain special characters
		for (int i = 0; i < 44; i++) {
			if (txtBoxText[i] == '\'' || txtBoxText[i] == ',' || txtBoxText[i] == '\"' || txtBoxText[i] == '.'
					|| txtBoxText[i] == '!' || txtBoxText[i] == '?' || txtBoxText[i] == '&' || txtBoxText[i] == '-') {
				showChar[i] = true;
			} else {
				showChar[i] = false;
			}
		}
		showLetter();

		// set textboxes that are to contain the puzzle to while & green if not
		if (txtBoxColorState[0] == true)
			txtF1.setBackground(new Color(0, 102, 0));
		else
			txtF1.setBackground(Color.WHITE);
		if (txtBoxColorState[1] == true)
			txtF2.setBackground(new Color(0, 102, 0));
		else
			txtF2.setBackground(Color.WHITE);
		if (txtBoxColorState[2] == true)
			txtF3.setBackground(new Color(0, 102, 0));
		else
			txtF3.setBackground(Color.WHITE);
		if (txtBoxColorState[3] == true)
			txtF4.setBackground(new Color(0, 102, 0));
		else
			txtF4.setBackground(Color.WHITE);
		if (txtBoxColorState[4] == true)
			txtF5.setBackground(new Color(0, 102, 0));
		else
			txtF5.setBackground(Color.WHITE);
		if (txtBoxColorState[5] == true)
			txtF6.setBackground(new Color(0, 102, 0));
		else
			txtF6.setBackground(Color.WHITE);
		if (txtBoxColorState[6] == true)
			txtF7.setBackground(new Color(0, 102, 0));
		else
			txtF7.setBackground(Color.WHITE);
		if (txtBoxColorState[7] == true)
			txtF8.setBackground(new Color(0, 102, 0));
		else
			txtF8.setBackground(Color.WHITE);
		if (txtBoxColorState[8] == true)
			txtF9.setBackground(new Color(0, 102, 0));
		else
			txtF9.setBackground(Color.WHITE);
		if (txtBoxColorState[9] == true)
			txtF10.setBackground(new Color(0, 102, 0));
		else
			txtF10.setBackground(Color.WHITE);
		if (txtBoxColorState[10] == true)
			txtF11.setBackground(new Color(0, 102, 0));
		else
			txtF11.setBackground(Color.WHITE);
		if (txtBoxColorState[11] == true)
			txtF12.setBackground(new Color(0, 102, 0));
		else
			txtF12.setBackground(Color.WHITE);
		if (txtBoxColorState[12] == true)
			txtF13.setBackground(new Color(0, 102, 0));
		else
			txtF13.setBackground(Color.WHITE);
		if (txtBoxColorState[13] == true)
			txtF14.setBackground(new Color(0, 102, 0));
		else
			txtF14.setBackground(Color.WHITE);
		if (txtBoxColorState[14] == true)
			txtF15.setBackground(new Color(0, 102, 0));
		else
			txtF15.setBackground(Color.WHITE);
		if (txtBoxColorState[15] == true)
			txtF16.setBackground(new Color(0, 102, 0));
		else
			txtF16.setBackground(Color.WHITE);
		if (txtBoxColorState[16] == true)
			txtF17.setBackground(new Color(0, 102, 0));
		else
			txtF17.setBackground(Color.WHITE);
		if (txtBoxColorState[17] == true)
			txtF18.setBackground(new Color(0, 102, 0));
		else
			txtF18.setBackground(Color.WHITE);
		if (txtBoxColorState[18] == true)
			txtF19.setBackground(new Color(0, 102, 0));
		else
			txtF19.setBackground(Color.WHITE);
		if (txtBoxColorState[19] == true)
			txtF20.setBackground(new Color(0, 102, 0));
		else
			txtF20.setBackground(Color.WHITE);
		if (txtBoxColorState[20] == true)
			txtF21.setBackground(new Color(0, 102, 0));
		else
			txtF21.setBackground(Color.WHITE);
		if (txtBoxColorState[21] == true)
			txtF22.setBackground(new Color(0, 102, 0));
		else
			txtF22.setBackground(Color.WHITE);
		if (txtBoxColorState[22] == true)
			txtF23.setBackground(new Color(0, 102, 0));
		else
			txtF23.setBackground(Color.WHITE);
		if (txtBoxColorState[23] == true)
			txtF24.setBackground(new Color(0, 102, 0));
		else
			txtF24.setBackground(Color.WHITE);
		if (txtBoxColorState[24] == true)
			txtF25.setBackground(new Color(0, 102, 0));
		else
			txtF25.setBackground(Color.WHITE);
		if (txtBoxColorState[25] == true)
			txtF26.setBackground(new Color(0, 102, 0));
		else
			txtF26.setBackground(Color.WHITE);
		if (txtBoxColorState[26] == true)
			txtF27.setBackground(new Color(0, 102, 0));
		else
			txtF27.setBackground(Color.WHITE);
		if (txtBoxColorState[27] == true)
			txtF28.setBackground(new Color(0, 102, 0));
		else
			txtF28.setBackground(Color.WHITE);
		if (txtBoxColorState[28] == true)
			txtF29.setBackground(new Color(0, 102, 0));
		else
			txtF29.setBackground(Color.WHITE);
		if (txtBoxColorState[29] == true)
			txtF30.setBackground(new Color(0, 102, 0));
		else
			txtF30.setBackground(Color.WHITE);
		if (txtBoxColorState[30] == true)
			txtF31.setBackground(new Color(0, 102, 0));
		else
			txtF31.setBackground(Color.WHITE);
		if (txtBoxColorState[31] == true)
			txtF32.setBackground(new Color(0, 102, 0));
		else
			txtF32.setBackground(Color.WHITE);
		if (txtBoxColorState[32] == true)
			txtF33.setBackground(new Color(0, 102, 0));
		else
			txtF33.setBackground(Color.WHITE);
		if (txtBoxColorState[33] == true)
			txtF34.setBackground(new Color(0, 102, 0));
		else
			txtF34.setBackground(Color.WHITE);
		if (txtBoxColorState[34] == true)
			txtF35.setBackground(new Color(0, 102, 0));
		else
			txtF35.setBackground(Color.WHITE);
		if (txtBoxColorState[35] == true)
			txtF36.setBackground(new Color(0, 102, 0));
		else
			txtF36.setBackground(Color.WHITE);
		if (txtBoxColorState[36] == true)
			txtF37.setBackground(new Color(0, 102, 0));
		else
			txtF37.setBackground(Color.WHITE);
		if (txtBoxColorState[37] == true)
			txtF38.setBackground(new Color(0, 102, 0));
		else
			txtF38.setBackground(Color.WHITE);
		if (txtBoxColorState[38] == true)
			txtF39.setBackground(new Color(0, 102, 0));
		else
			txtF39.setBackground(Color.WHITE);
		if (txtBoxColorState[39] == true)
			txtF40.setBackground(new Color(0, 102, 0));
		else
			txtF40.setBackground(Color.WHITE);
		if (txtBoxColorState[40] == true)
			txtF41.setBackground(new Color(0, 102, 0));
		else
			txtF41.setBackground(Color.WHITE);
		if (txtBoxColorState[41] == true)
			txtF42.setBackground(new Color(0, 102, 0));
		else
			txtF42.setBackground(Color.WHITE);
		if (txtBoxColorState[42] == true)
			txtF43.setBackground(new Color(0, 102, 0));
		else
			txtF43.setBackground(Color.WHITE);
		if (txtBoxColorState[43] == true)
			txtF44.setBackground(new Color(0, 102, 0));
		else
			txtF44.setBackground(Color.WHITE);
	}

	// store used letters to queue
	public void usedLetters(char letter, boolean cpu) {
		lr = new Letter(letter);
		queue.enQueue(lr);

		lblLetter.setText(Character.toString(letter));

		trackLetters();

		// calls the buy vowel function if letter was a vowel
		if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
			buyVowel();
		}

		if (!cpu) {
			setVowelLetterState(false);
			setConstantLetterState(false);

			btnSpin.setEnabled(true);
			btnBuyVowel.setEnabled(false);
			btnCancel.setEnabled(false);
			btnSolvePuzzle.setEnabled(false);
		}
		validateLetter(letter, cpu);
	}

	// check if letter was already used get set their state
	public void trackLetters() {
		lr = new Letter('A');
		if (queue.searchQueue(lr))
			letterState[0] = false;

		lr = new Letter('B');
		if (queue.searchQueue(lr))
			letterState[1] = false;

		lr = new Letter('C');
		if (queue.searchQueue(lr))
			letterState[2] = false;

		lr = new Letter('D');
		if (queue.searchQueue(lr))
			letterState[3] = false;

		lr = new Letter('E');
		if (queue.searchQueue(lr))
			letterState[4] = false;

		lr = new Letter('F');
		if (queue.searchQueue(lr))
			letterState[5] = false;

		lr = new Letter('G');
		if (queue.searchQueue(lr))
			letterState[6] = false;

		lr = new Letter('H');
		if (queue.searchQueue(lr))
			letterState[7] = false;

		lr = new Letter('I');
		if (queue.searchQueue(lr))
			letterState[8] = false;

		lr = new Letter('J');
		if (queue.searchQueue(lr))
			letterState[9] = false;

		lr = new Letter('K');
		if (queue.searchQueue(lr))
			letterState[10] = false;

		lr = new Letter('L');
		if (queue.searchQueue(lr))
			letterState[11] = false;

		lr = new Letter('M');
		if (queue.searchQueue(lr))
			letterState[12] = false;

		lr = new Letter('N');
		if (queue.searchQueue(lr))
			letterState[13] = false;

		lr = new Letter('O');
		if (queue.searchQueue(lr))
			letterState[14] = false;

		lr = new Letter('P');
		if (queue.searchQueue(lr))
			letterState[15] = false;

		lr = new Letter('Q');
		if (queue.searchQueue(lr))
			letterState[16] = false;

		lr = new Letter('R');
		if (queue.searchQueue(lr))
			letterState[17] = false;

		lr = new Letter('S');
		if (queue.searchQueue(lr))
			letterState[18] = false;

		lr = new Letter('T');
		if (queue.searchQueue(lr))
			letterState[19] = false;

		lr = new Letter('U');
		if (queue.searchQueue(lr))
			letterState[20] = false;

		lr = new Letter('V');
		if (queue.searchQueue(lr))
			letterState[21] = false;

		lr = new Letter('W');
		if (queue.searchQueue(lr))
			letterState[22] = false;

		lr = new Letter('X');
		if (queue.searchQueue(lr))
			letterState[23] = false;

		lr = new Letter('Y');
		if (queue.searchQueue(lr))
			letterState[24] = false;

		lr = new Letter('Z');
		if (queue.searchQueue(lr))
			letterState[25] = false;
	}

	// check if letter selected is correct & set them to be shown
	public void validateLetter(char letter, boolean cpu) {
		letterOccurrence = 0;
		for (int i = 0; i < 44; i++) {
			if (Character.toUpperCase(txtBoxText[i]) == Character.toUpperCase(letter)) {
				showChar[i] = true;
				letterOccurrence++;
			}
		}

		if (letterOccurrence > 0) {
			calculateRoundTotal(false);
			showLetter();

			if (cpu) {
				lblIncorrectLetter.setVisible(false);
			}
		} else {
			lblIncorrectLetter.setVisible(true);
			if (!cpu) {
				JOptionPane.showMessageDialog(null, "Incorrect Letter");
			}
			selectContestant();
		}
	}

	// show letters in textboxes if they have been set to show
	public void showLetter() {
		if (showChar[0] == true)
			txtF1.setText(Character.toString(txtBoxText[0]));
		else
			txtF1.setText(" ");
		if (showChar[1] == true)
			txtF2.setText(Character.toString(txtBoxText[1]));
		else
			txtF2.setText(" ");
		if (showChar[2] == true)
			txtF3.setText(Character.toString(txtBoxText[2]));
		else
			txtF3.setText(" ");
		if (showChar[3] == true)
			txtF4.setText(Character.toString(txtBoxText[3]));
		else
			txtF4.setText(" ");
		if (showChar[4] == true)
			txtF5.setText(Character.toString(txtBoxText[4]));
		else
			txtF5.setText(" ");
		if (showChar[5] == true)
			txtF6.setText(Character.toString(txtBoxText[5]));
		else
			txtF6.setText(" ");
		if (showChar[6] == true)
			txtF7.setText(Character.toString(txtBoxText[6]));
		else
			txtF7.setText(" ");
		if (showChar[7] == true)
			txtF8.setText(Character.toString(txtBoxText[7]));
		else
			txtF8.setText(" ");
		if (showChar[8] == true)
			txtF9.setText(Character.toString(txtBoxText[8]));
		else
			txtF9.setText(" ");
		if (showChar[9] == true)
			txtF10.setText(Character.toString(txtBoxText[9]));
		else
			txtF10.setText(" ");
		if (showChar[10] == true)
			txtF11.setText(Character.toString(txtBoxText[10]));
		else
			txtF11.setText(" ");
		if (showChar[11] == true)
			txtF12.setText(Character.toString(txtBoxText[11]));
		else
			txtF12.setText(" ");
		if (showChar[12] == true)
			txtF13.setText(Character.toString(txtBoxText[12]));
		else
			txtF13.setText(" ");
		if (showChar[13] == true)
			txtF14.setText(Character.toString(txtBoxText[13]));
		else
			txtF14.setText(" ");
		if (showChar[14] == true)
			txtF15.setText(Character.toString(txtBoxText[14]));
		else
			txtF15.setText(" ");
		if (showChar[15] == true)
			txtF16.setText(Character.toString(txtBoxText[15]));
		else
			txtF16.setText(" ");
		if (showChar[16] == true)
			txtF17.setText(Character.toString(txtBoxText[16]));
		else
			txtF17.setText(" ");
		if (showChar[17] == true)
			txtF18.setText(Character.toString(txtBoxText[17]));
		else
			txtF18.setText(" ");
		if (showChar[18] == true)
			txtF19.setText(Character.toString(txtBoxText[18]));
		else
			txtF19.setText(" ");
		if (showChar[19] == true)
			txtF20.setText(Character.toString(txtBoxText[19]));
		else
			txtF20.setText(" ");
		if (showChar[20] == true)
			txtF21.setText(Character.toString(txtBoxText[20]));
		else
			txtF21.setText(" ");
		if (showChar[21] == true)
			txtF22.setText(Character.toString(txtBoxText[21]));
		else
			txtF22.setText(" ");
		if (showChar[22] == true)
			txtF23.setText(Character.toString(txtBoxText[22]));
		else
			txtF23.setText(" ");
		if (showChar[23] == true)
			txtF24.setText(Character.toString(txtBoxText[23]));
		else
			txtF24.setText(" ");
		if (showChar[24] == true)
			txtF25.setText(Character.toString(txtBoxText[24]));
		else
			txtF25.setText(" ");
		if (showChar[25] == true)
			txtF26.setText(Character.toString(txtBoxText[25]));
		else
			txtF26.setText(" ");
		if (showChar[26] == true)
			txtF27.setText(Character.toString(txtBoxText[26]));
		else
			txtF27.setText(" ");
		if (showChar[27] == true)
			txtF28.setText(Character.toString(txtBoxText[27]));
		else
			txtF28.setText(" ");
		if (showChar[28] == true)
			txtF29.setText(Character.toString(txtBoxText[28]));
		else
			txtF29.setText(" ");
		if (showChar[29] == true)
			txtF30.setText(Character.toString(txtBoxText[29]));
		else
			txtF30.setText(" ");
		if (showChar[30] == true)
			txtF31.setText(Character.toString(txtBoxText[30]));
		else
			txtF31.setText(" ");
		if (showChar[31] == true)
			txtF32.setText(Character.toString(txtBoxText[31]));
		else
			txtF32.setText(" ");
		if (showChar[32] == true)
			txtF33.setText(Character.toString(txtBoxText[32]));
		else
			txtF33.setText(" ");
		if (showChar[33] == true)
			txtF34.setText(Character.toString(txtBoxText[33]));
		else
			txtF34.setText(" ");
		if (showChar[34] == true)
			txtF35.setText(Character.toString(txtBoxText[34]));
		else
			txtF35.setText(" ");
		if (showChar[35] == true)
			txtF36.setText(Character.toString(txtBoxText[35]));
		else
			txtF36.setText(" ");
		if (showChar[36] == true)
			txtF37.setText(Character.toString(txtBoxText[36]));
		else
			txtF37.setText(" ");
		if (showChar[37] == true)
			txtF38.setText(Character.toString(txtBoxText[37]));
		else
			txtF38.setText(" ");
		if (showChar[38] == true)
			txtF39.setText(Character.toString(txtBoxText[38]));
		else
			txtF39.setText(" ");
		if (showChar[39] == true)
			txtF40.setText(Character.toString(txtBoxText[39]));
		else
			txtF40.setText(" ");
		if (showChar[40] == true)
			txtF41.setText(Character.toString(txtBoxText[40]));
		else
			txtF41.setText(" ");
		if (showChar[41] == true)
			txtF42.setText(Character.toString(txtBoxText[41]));
		else
			txtF42.setText(" ");
		if (showChar[42] == true)
			txtF43.setText(Character.toString(txtBoxText[42]));
		else
			txtF43.setText(" ");
		if (showChar[43] == true)
			txtF44.setText(Character.toString(txtBoxText[43]));
		else
			txtF44.setText(" ");

		validateRoundCompletion(false, true);
	}

	// check if player looses their turn or is bankrupt
	public boolean looseTurn() {
		if (currCard.getData().getCard() == "Bankrupt") {
			if ((currPlayer.getData().getpNumber() - 1) == 1) {
				txtRoundTotalConst1.setText(Integer.toString(0));
			} else if ((currPlayer.getData().getpNumber() - 1) == 2) {
				txtRoundTotalConst2.setText(Integer.toString(0));
			} else if (currPlayer.getData().getpNumber() == 1) {
				txtRoundTotalConst3.setText(Integer.toString(0));
			}
			lblLetter.setText("null");
			return true;
		} else if (currCard.getData().getCard() == "Loose A Turn") {
			lblLetter.setText("null");
			return true;
		} else {
			return false;
		}
	}

	// randomly picks a card from wheel
	public void spinWheel(boolean cpu) {
		Random rand = new Random();

		int spin = rand.nextInt((100 - 50) + 1) + 50;

		int i = 0;
		do {
			currCard = currCard.getNext();
			i++;
		} while (i < spin);

		lblResult.setText(currCard.getData().getCard());

		if ((currPlayer.getData().getpNumber() - 1) == 1) {
			lblPlayer.setText(txtNameConst1.getText());
		} else if ((currPlayer.getData().getpNumber() - 1) == 2) {
			lblPlayer.setText(txtNameConst2.getText());
		} else if (currPlayer.getData().getpNumber() == 1) {
			lblPlayer.setText(txtNameConst3.getText());
		}

		if (!cpu) {
			lblIncorrectLetter.setVisible(false);
			lblLetter.setText("null");
			JOptionPane.showMessageDialog(null, currCard.getData().getCard(), "Reward:",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	// operation that occur for spin button
	public void spinButtonAction(boolean cpu) {
		spinWheel(cpu);
		boolean flag = looseTurn();
		if (flag == true) {
			lblIncorrectLetter.setVisible(false);
			selectContestant();
		} else {
			if (!cpu) {
				btnSpin.setEnabled(false);
				setConstantLetterState(true);
				checkMoney(false);
			} else {
				cpuPlay();
			}
		}
	}

	// operation that occur for buy vowel button
	public void buyVowelButtonAction() {
		btnBuyVowel.setEnabled(false);
		setVowelLetterState(true);
		setConstantLetterState(false);
		btnCancel.setEnabled(true);
		btnSolvePuzzle.setEnabled(false);
	}

	// operation that occur for cancel button
	public void cancelButtonAction() {
		btnCancel.setEnabled(false);
		setVowelLetterState(false);
		setConstantLetterState(true);
		btnBuyVowel.setEnabled(true);
		btnSolvePuzzle.setEnabled(true);
	}

	// operation that occur for solve puzzle button
	public void solvePuzzleButtonAction() {
		trySolvePuzzle();
	}

	public void quitButtonAction() {
		int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);

		if (result == 0) {
			backToMain();
		}
	}

	// return to main interface
	public void backToMain() {
		MainInterface window = new MainInterface();
		window.setVisible(true);
		this.dispose();
	}

	// checks if a round is complete or if its the end of the game
	public void validateRoundCompletion(boolean solved, boolean canPlay) {
		int countLetters = 0;

		// counts the amount of guessed letters
		for (int i = 0; i < 44; i++) {
			if (showChar[i] == true) {
				countLetters++;
			}

			// checks if the amount of guessed letters equals the puzzle length or if puzzle
			// has been solved
			if (countLetters == puzzleLength || solved == true || canPlay == false) {

				int player = highestRoundTotal(solved);

				if (canPlay == false) {
					JOptionPane.showMessageDialog(null, "No Constants Remain. \nNo Contestant Can Buy Vowels.",
							"Round Terminated", JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Contestant " + player,
							"Round " + currentPuzzleNumber + " Winner", JOptionPane.INFORMATION_MESSAGE);
				}

				if (currentPuzzleNumber < 3) {
					reset();
					break;
				} else {
					player = highestGrandTotal();

					JOptionPane.showMessageDialog(null, "Contestant " + player, "Winner of Game",
							JOptionPane.INFORMATION_MESSAGE);

					int option = JOptionPane.showConfirmDialog(null, "Play Again?", "Game Over",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (option == 0) {
						reset();
						load();
					} else {
						backToMain();
					}
				}
				break;
			}
		}
	}

	// sums up round total based on the amount of occurrence of selected letter
	public void calculateRoundTotal(boolean solved) {
		int rTotalP1 = Integer.parseInt(txtRoundTotalConst1.getText());
		int rTotalP2 = Integer.parseInt(txtRoundTotalConst2.getText());
		int rTotalP3 = Integer.parseInt(txtRoundTotalConst3.getText());
		int rNewTotalP1 = 0;
		int rNewTotalP2 = 0;
		int rNewTotalP3 = 0;

		if (solved) {
			if ((currPlayer.getData().getpNumber() - 1) == 1) {
				rNewTotalP1 = rTotalP1 + currCard.getData().getValue();
			} else if ((currPlayer.getData().getpNumber() - 1) == 2) {
				rNewTotalP2 = rTotalP2 + currCard.getData().getValue();
			} else if (currPlayer.getData().getpNumber() == 1) {
				rNewTotalP3 = rTotalP3 + currCard.getData().getValue();
			}
		} else {
			if ((currPlayer.getData().getpNumber() - 1) == 1) {
				rNewTotalP1 = rTotalP1 + (currCard.getData().getValue() * letterOccurrence);
			} else if ((currPlayer.getData().getpNumber() - 1) == 2) {
				rNewTotalP2 = rTotalP2 + (currCard.getData().getValue() * letterOccurrence);
			} else if (currPlayer.getData().getpNumber() == 1) {
				rNewTotalP3 = rTotalP3 + (currCard.getData().getValue() * letterOccurrence);
			}
		}

		if ((currPlayer.getData().getpNumber() - 1) == 1) {
			txtRoundTotalConst1.setText(Integer.toString(rNewTotalP1));
		} else if ((currPlayer.getData().getpNumber() - 1) == 2) {
			txtRoundTotalConst2.setText(Integer.toString(rNewTotalP2));
		} else if (currPlayer.getData().getpNumber() == 1) {
			txtRoundTotalConst3.setText(Integer.toString(rNewTotalP3));
		}
	}

	// checks which player has the highest grand total to determine winner of round
	public int highestRoundTotal(boolean solved) {
		int player = 0;

		try {
			int rTotalP1 = Integer.parseInt(txtRoundTotalConst1.getText());
			int rTotalP2 = Integer.parseInt(txtRoundTotalConst2.getText());
			int rTotalP3 = Integer.parseInt(txtRoundTotalConst3.getText());

			int gTotalP1 = Integer.parseInt(txtGrandTotalConst1.getText());
			int gTotalP2 = Integer.parseInt(txtGrandTotalConst2.getText());
			int gTotalP3 = Integer.parseInt(txtGrandTotalConst3.getText());

			int grandTotal = 0;

			if (solved == true) {
				if ((currPlayer.getData().getpNumber() - 1) == 1) {
					grandTotal = gTotalP1 + rTotalP1;
					txtGrandTotalConst1.setText(Integer.toString(grandTotal));
					player = 1;
				} else if ((currPlayer.getData().getpNumber() - 1) == 2) {
					grandTotal = gTotalP2 + rTotalP2;
					txtGrandTotalConst2.setText(Integer.toString(grandTotal));
					player = 2;
				} else if (currPlayer.getData().getpNumber() == 1) {
					grandTotal = gTotalP3 + rTotalP3;
					txtGrandTotalConst3.setText(Integer.toString(grandTotal));
					player = 3;
				}
			} else {
				if (rTotalP1 >= rTotalP2 && rTotalP1 >= rTotalP3) {
					grandTotal = gTotalP1 + rTotalP1;
					txtGrandTotalConst1.setText(Integer.toString(grandTotal));
					player = 1;
				} else if (rTotalP2 >= rTotalP1 && rTotalP3 >= rTotalP3) {
					grandTotal = gTotalP2 + rTotalP2;
					txtGrandTotalConst2.setText(Integer.toString(grandTotal));
					player = 2;
				} else {
					grandTotal = gTotalP3 + rTotalP3;
					txtGrandTotalConst3.setText(Integer.toString(grandTotal));
					player = 3;
				}
			}

			txtRoundTotalConst1.setText("0");
			txtRoundTotalConst2.setText("0");
			txtRoundTotalConst3.setText("0");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Error converting values from total field",
					JOptionPane.ERROR_MESSAGE);
		}
		return player;
	}

	// checks which player has the highest grand total to determine winner of game
	public int highestGrandTotal() {
		int player = 0;

		try {
			int gTotalP1 = Integer.parseInt(txtGrandTotalConst1.getText());
			int gTotalP2 = Integer.parseInt(txtGrandTotalConst2.getText());
			int gTotalP3 = Integer.parseInt(txtGrandTotalConst3.getText());

			if (gTotalP1 >= gTotalP2 && gTotalP1 >= gTotalP3) {
				player = 1;
			} else if (gTotalP2 >= gTotalP1 && gTotalP3 >= gTotalP3) {
				player = 2;
			} else {
				player = 3;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Error converting values from total field",
					JOptionPane.ERROR_MESSAGE);
		}
		return player;
	}

	// check if contestant has enough monet to buy vowel or has money to solve
	// puzzle
	public boolean checkMoney(boolean cpu) {
		int rTotalP1 = Integer.parseInt(txtRoundTotalConst1.getText());
		int rTotalP2 = Integer.parseInt(txtRoundTotalConst2.getText());
		int rTotalP3 = Integer.parseInt(txtRoundTotalConst3.getText());
		int vowelCost = 100;
		boolean hasMoney = false;
		boolean enoughMoney = false;

		if ((currPlayer.getData().getpNumber() - 1) == 1) {
			if (rTotalP1 > 0) {
				hasMoney = true;
			}
			if (rTotalP1 >= vowelCost) {
				enoughMoney = true;
			}
		} else if ((currPlayer.getData().getpNumber() - 1) == 2) {
			if (rTotalP2 > 0) {
				hasMoney = true;
			}
			if (rTotalP2 >= vowelCost) {
				enoughMoney = true;
			}
		} else if (currPlayer.getData().getpNumber() == 1) {
			if (rTotalP3 > 0) {
				hasMoney = true;
			}
			if (rTotalP3 >= vowelCost) {
				enoughMoney = true;
			}
		}

		if (cpu) {
			if (enoughMoney) {
				return true;
			} else {
				return false;
			}
		} else {
			if (hasMoney) {
				btnSolvePuzzle.setEnabled(true);
			}
			if (enoughMoney) {
				btnBuyVowel.setEnabled(true);
			}
		}
		return false;
	}

	// validate puzzle if contestant tries to solve puzzle
	public void trySolvePuzzle() {
		String str = JOptionPane.showInputDialog(null, "Enter Phrase:", "Solve Puzzle:", JOptionPane.PLAIN_MESSAGE);

		String str_ = str.replaceAll("\\s+", "_").trim();

		if (puzzle.equalsIgnoreCase(str_)) {
			JOptionPane.showMessageDialog(null, "You have solved the puzzle");
			calculateRoundTotal(true);
			validateRoundCompletion(true, true);
		} else {

			setVowelLetterState(false);
			setConstantLetterState(false);

			btnBuyVowel.setEnabled(false);
			btnCancel.setEnabled(false);
			btnSolvePuzzle.setEnabled(false);

			JOptionPane.showMessageDialog(null, "Incorrect", "Wrong answer", JOptionPane.ERROR_MESSAGE);
			selectContestant();
		}
	}

	// subtract price of vowel from round total
	public void buyVowel() {
		int rTotalP1 = Integer.parseInt(txtRoundTotalConst1.getText());
		int rTotalP2 = Integer.parseInt(txtRoundTotalConst2.getText());
		int rTotalP3 = Integer.parseInt(txtRoundTotalConst3.getText());
		int vowelCost = 100;
		int remainder = 0;

		if ((currPlayer.getData().getpNumber() - 1) == 1) {
			remainder = rTotalP1 - vowelCost;
			txtRoundTotalConst1.setText(Integer.toString(remainder));
		} else if ((currPlayer.getData().getpNumber() - 1) == 2) {
			remainder = rTotalP2 - vowelCost;
			txtRoundTotalConst2.setText(Integer.toString(remainder));
		} else if (currPlayer.getData().getpNumber() == 1) {
			remainder = rTotalP3 - vowelCost;
			txtRoundTotalConst3.setText(Integer.toString(remainder));
		}
	}

	public void cpuPlayer() {
//		try {
//			TimeUnit.SECONDS.sleep(1);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		spinButtonAction(true);
	}

	public void cpuPlay() {
		boolean enoughMoney = false;
		enoughMoney = checkMoney(true);

		try {
			charList.clear();

			for (int i = 0; i < 26; i++) {
				if (letterState[i] == true) {

					if (enoughMoney) {
						charList.add(letters[i]);
					}

					if (!enoughMoney) {
						if (letters[i] != 'A' && letters[i] != 'E' && letters[i] != 'I' && letters[i] != 'O'
								&& letters[i] != 'U') {
							charList.add(letters[i]);
						}
					}
				} else {
				}
			}

			Collections.shuffle(charList);

			usedLetters(charList.get(0), true);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void initializeLetters() {
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 'D';
		letters[4] = 'E';
		letters[5] = 'F';
		letters[6] = 'G';
		letters[7] = 'H';
		letters[8] = 'I';
		letters[9] = 'J';
		letters[10] = 'K';
		letters[11] = 'L';
		letters[12] = 'M';
		letters[13] = 'N';
		letters[14] = 'O';
		letters[15] = 'P';
		letters[16] = 'Q';
		letters[17] = 'R';
		letters[18] = 'S';
		letters[19] = 'T';
		letters[20] = 'U';
		letters[21] = 'V';
		letters[22] = 'W';
		letters[23] = 'X';
		letters[24] = 'Y';
		letters[25] = 'Z';
	}

	// checks if all constants are used & if contestants has can buy vowels
	public void hasPlays() {
		int count = 0;

		for (int i = 0; i < 26; i++) {
			if (i != 0 && i != 4 && i != 8 && i != 14 && i != 20) {
				if (letterState[i] == false) {
					count++;
				}
			}
		}

		if (count == 21) {
			int rTotalP1 = Integer.parseInt(txtRoundTotalConst1.getText());
			int rTotalP2 = Integer.parseInt(txtRoundTotalConst2.getText());
			int rTotalP3 = Integer.parseInt(txtRoundTotalConst3.getText());

			if (rTotalP1 == 0 && rTotalP2 == 0 && rTotalP3 == 0) {
				validateRoundCompletion(false, false);
			} else if ((currPlayer.getData().getpNumber() - 1) == 1) {
				if (rTotalP1 == 0) {
					selectContestant();
				}
			} else if ((currPlayer.getData().getpNumber() - 1) == 2) {
				if (rTotalP2 == 0) {
					selectContestant();

				}
			} else if (currPlayer.getData().getpNumber() == 1) {
				if (rTotalP3 == 0) {
					selectContestant();
				}
			}
		}
	}
}
