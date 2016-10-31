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
		
	}
}
