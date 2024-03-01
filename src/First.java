import FE.*;
import COMPUTER.*;
import CHEMICAL.*;
import CIVIL.*;
import java.awt.event.*;
import javax.swing.*;


public class First{
	
	public static void main(String args[]) {
		
		new run();
	}
}


class run extends JFrame{
	
	private JFrame frame;
	private JLabel item;
	private JButton FE;
	private JButton CE;
	private JButton CIVIL;
	private JButton CHEM;
	
    public run() {
		
    	frame = new JFrame();
		frame.setBounds(100, 100, 400, 300);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		FE = new JButton("F.E");
		FE.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				FE FEO = new FE();
			}
		});
		FE.setBounds(55, 147, 110, 23);
		frame.getContentPane();
		frame.add(FE);
		
		CE = new JButton("COMPUTER");
		CE.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				CE CEO = new CE();
			}
		});
		CE.setBounds(218, 147, 110, 23);
		frame.getContentPane();	
		frame.add(CE);
		
		CIVIL = new JButton("CIVIL");
		CIVIL.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				CIE CHO = new CIE();
			}
		});
		CIVIL.setBounds(55, 198, 110, 23);
		frame.getContentPane();	
		frame.add(CIVIL);
		
		CHEM = new JButton("CHEMICAL");
		CHEM.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				CH CHO = new CH();
			}
		});
		CHEM.setBounds(218, 198, 110, 23);
		frame.getContentPane();	
		frame.add(CHEM);
		
		item = new JLabel("SELECT YOUR BRANCH :");
		item.setBounds(35, 99, 181, 23);
		frame.getContentPane();
		frame.add(item);
		
		}
}