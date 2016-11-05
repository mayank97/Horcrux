package dblp;

import java.awt.*;
import javax.swing.*;

public class Main 
{
	public static void main(String[] agrs)
	{
		JFrame frame = new JFrame();
		frame.setTitle("DBLP Query Engine");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,800);
		
		JPanel panelWest = new JPanel();
		panelWest.setLayout(new FlowLayout());
	
		String[] query = {"Query", " Query1", "Query2", "Query3"};
		JComboBox combo = new JComboBox(query);
		
		combo.setAlignmentY(590);
		panelWest.add(combo);
		
		frame.add(panelWest, BorderLayout.WEST);
	
		JPanel panelNorth = new JPanel();
		JLabel label = new JLabel("<html><u>DBLP Query Engine</u></html>");
		label.setFont(new Font("Serif", Font.BOLD, 48));
		label.setForeground(new Color(0, 128, 128));
		
		panelNorth.add(label);
		
		frame.add(panelNorth, BorderLayout.NORTH);
		
		JPanel panelCenter = new JPanel();
		JTable table = new JTable(3,4);
		JScrollPane scrollBar = new JScrollPane(table);
		
		
		panelCenter.add(scrollBar);
		
		frame.add(panelCenter, BorderLayout.CENTER);
		
		frame.setVisible(true);
		JFrame frame;
	public static int counter=0;
	JLabel label;
	JButton start;
	JButton exit, op1, op2, op3, op4, situation;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	private char[][] checkboard;
	char p1, p2, superp;
	int currx, curry, p;
	String P1name, P2name;

	Tic_Tac_Toe() {
		initialiser();

	}

	void initialiser() {
		frame = new JFrame();
		frame.setBounds(500, 500, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		label = new JLabel("TIC TAC TOE!");
		label.setBounds(200, 10, 150, 40);
		frame.getContentPane().add(label);
		start = new JButton("START GAME");
		frame.getContentPane().add(start);
		start.setBounds(150, 100, 150, 50);
		exit = new JButton("EXT");
		frame.getContentPane().add(exit);
		exit.setBounds(150, 250, 150, 50);
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				options();

			}

		});
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
		
	}
}
