package COMPUTER;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class CES2 extends JFrame {
	
	    int M=0,D=0,C=0,T=0,A=0;
	    
	    private JCheckBox MP;
	    private JLabel ML;
	    private JCheckBox DMS;
	    private JLabel DL;
	    private JCheckBox CN;
	    private JLabel CL;
	    private JCheckBox TOCS;
	    private JLabel TL;
	    private JCheckBox AA;
	    private JLabel AL;;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CES2() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			MP = new JCheckBox("Microprocessor:");
			MP.setBounds(27, 45, 189, 23);
			frame.getContentPane();
			frame.add(MP);
			
			ML = new JLabel(" Barry B Brey(Rs320)");
			ML.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(ML);
			
			
			DMS = new JCheckBox("Database Management System:");
			DMS.setBounds(27, 110, 250, 23);
			frame.getContentPane();
			frame.add(DMS);
			
			DL = new JLabel(" G.K Gupta (Rs310)");
			DL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(DL);
			
			
			CN = new JCheckBox("Computer Network:");
			CN.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(CN);
			
			CL = new JLabel("  S Keshav(Rs430)");
			CL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(CL);
			
			
			TOCS = new JCheckBox("Theory of Computer Science:");
			TOCS.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(TOCS);
			
			TL = new JLabel(" Vivek Kulkarni  (Rs350)");
			TL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(TL);
			
			
			AA = new JCheckBox("Advance Algorithm:");
			AA.setBounds(27, 317, 475, 23);
			frame.getContentPane();
			frame.add(AA);
			
			AL = new JLabel(" S.K. Basu (Rs270)");
			AL.setBounds(37, 347, 465, 14);
			frame.getContentPane();
			frame.add(AL);

			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			MP.addItemListener(HandlerO);
			DMS.addItemListener(HandlerO);
			CN.addItemListener(HandlerO);				
			TOCS.addItemListener(HandlerO);
			AA.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					frame.dispose();
					CESP2 frame = new CESP2(M,D,C,T,A);
					frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(MP.isSelected()) {
				
				M =1;
			}
			if(DMS.isSelected()) {
				
				D =1;
			}
			if(CN.isSelected()) {
				
				C =1;
			}
			if(TOCS.isSelected()) {
				
				T =1;
			}
			if(AA.isSelected()) {
				
				A =1;
			}
			
			
		}
		
		
	}	
}
