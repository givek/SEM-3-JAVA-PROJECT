package COMPUTER;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class CE extends JFrame {
	
	private JFrame frame;
	private JLabel item;
	private JButton Button1;
	private JButton Button2;
    private JButton Button3;
    private JButton Button4;
    private JButton Button5;
    private JButton Button6;
	
	public CE() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 300);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		item = new JLabel("SELECT YOUR SEMESTER :");
		item.setBounds(29, 31, 258, 14);
		frame.getContentPane();
		frame.add(item);
		
		
		Button1 = new JButton("SEM 3");
		Button1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CES CESO = new CES();
				
			}
		});
		Button1.setBounds(68, 85, 89, 23);
		frame.getContentPane();
		frame.add(Button1);
		
		Button2 = new JButton("SEM 4");
		Button2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CES1 CES1O = new CES1();
				
			}
		});
		Button2.setBounds(225, 85, 89, 23);
		frame.getContentPane();	
		frame.add(Button2);


        Button3 = new JButton("SEM 5");
		Button3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CES2 CES2O = new CES2();
				
			}
		});
		Button3.setBounds(68, 145, 89, 23);
		frame.getContentPane();	
		frame.add(Button3);

        Button4 = new JButton("SEM 6");
		Button4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CES3 CES3O = new CES3();
				
			}
		});
		Button4.setBounds(225, 145, 89, 23);
		frame.getContentPane();	
		frame.add(Button4);

        Button5 = new JButton("SEM 7");
		Button5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CES4 CES4O = new CES4();
				
			}
		});
		Button5.setBounds(68, 204, 89, 23);
		frame.getContentPane();	
		frame.add(Button5);

        Button6 = new JButton("SEM 8");
		Button6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CES5 CES5O = new CES5();
				
			}
		});
		Button6.setBounds(225, 204, 89, 23);
		frame.getContentPane();	
		frame.add(Button6);


		
		
	
		
	}
}