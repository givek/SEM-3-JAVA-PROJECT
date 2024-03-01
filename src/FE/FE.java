package FE;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class FE extends JFrame {
	
	private JFrame frame;
	private JLabel item;
	private JButton Button1;
	private JButton Button2;
	
	public FE() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 300);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		item = new JLabel("SELECT YOUR SEMESTER :");
		item.setBounds(35, 99, 181, 23);
		frame.getContentPane();
		frame.add(item);
		
		
		Button1 = new JButton("SEM 1");
		Button1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FES FESO = new FES();
				
			}
		});
		Button1.setBounds(55, 147, 110, 23);
		frame.getContentPane();
		frame.add(Button1);
		
		Button2 = new JButton("SEM 2");
		Button2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FES1 FES1O = new FES1();
				
			}
		});
		Button2.setBounds(218, 147, 110, 23);
		frame.getContentPane();	
		frame.add(Button2);
		
		
	
		
	}
}
		