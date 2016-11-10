package dblp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main 
{
	private static final int Y_AXIS = 0;

	public static void main(String[] agrs)
	{
		JFrame frame = new JFrame();
		frame.setTitle("DBLP Query Engine");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,800);
		
		JPanel panelWest = new JPanel();
		panelWest.setLayout(new BorderLayout());
		
		JPanel comboPanel = new JPanel();
		String[] query = {"Query", " Query1", "Query2", "Query3"};
		JComboBox combo = new JComboBox(query);

		
		combo.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String s = (String) combo.getSelectedItem();
						System.out.println(s);
						if((s).equals("Query1"))
						{
							panelWest.revalidate();
							JPanel newPanelWest = new JPanel();
							
							newPanelWest.setLayout(new FlowLayout());
							
							
						}
						else if((s).equals("Query2"))
						{	panelWest.revalidate();
						
							JPanel newPanelWest = new JPanel();
							newPanelWest.setLayout(new FlowLayout());
							JLabel label = new JLabel("No. of Publications : ");
							newPanelWest.add(label);
							JTextField number = new JTextField(5);
							
							newPanelWest.add(number);
							
							JButton Search = new JButton("Search");
										Search.addActionListener(new ActionListener()
												{
													public void actionPerformed(ActionEvent e)
													{
														try
														{
																int j = Integer.parseInt(number.getText());

																JOptionPane.showMessageDialog(newPanelWest, "good keep going.");
													
														}
														catch(NumberFormatException z)
														{
															JOptionPane.showMessageDialog(newPanelWest, "Invalid Query. Enter a valid Query to proceed.");
															number.setText("");
														}
														
													}
												});
							JButton Reset = new JButton("Reset");
										Reset.addActionListener(new ActionListener()
												{
													public void actionPerformed(ActionEvent e)
													{
														number.setText("");
													}
												});
							
							newPanelWest.add(Search);
							newPanelWest.add(Reset);
							//frame.add(newPanelWest, BorderLayout.WEST);
							
							comboPanel.add(newPanelWest, BorderLayout.CENTER);
							panelWest.add(comboPanel);
						}
						else if((s).equals("Query3"))
						{
							
						}
					}
				}
			);

		
		comboPanel.add(combo, BorderLayout.NORTH);
		panelWest.add(comboPanel);
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
	
	public void Query1()
	{
		
	}
}
