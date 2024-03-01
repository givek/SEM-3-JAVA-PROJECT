package COMPUTER;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class CES4 extends JFrame {
	
	    int D=0,M=0,A=0,R=0;
	    
	    private JCheckBox DSIP;
	    private JLabel DL;
	    private JCheckBox MCC;
	    private JLabel ML;
	    private JCheckBox AISC;
	    private JLabel AL;
	    private JCheckBox ROBOTICS;
	    private JLabel RL;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CES4() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			DSIP = new JCheckBox("Digital Signal & Image Processing:");
			DSIP.setBounds(27, 45, 350, 23);
			frame.getContentPane();
			frame.add(DSIP);
			
			DL = new JLabel(" S.Sridhar (Rs350)");
			DL.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(DL);
			
			
			MCC = new JCheckBox("Mobile Communication & Computing :");
			MCC.setBounds(27, 110, 350, 23);
			frame.getContentPane();
			frame.add(MCC);
			
			ML = new JLabel(" John Schiller (Rs299)");
			ML.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(ML);
			
			
			AISC = new JCheckBox("Artificial Intelligence & Soft Computing :");
			AISC.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(AISC);
			
			AL = new JLabel(" N.P. Padhy (Rs430)");
			AL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(AL);
			
			
			ROBOTICS = new JCheckBox("Robotics :");
			ROBOTICS.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(ROBOTICS);
			
			RL = new JLabel("  Saeed B Nika  (Rs320");
			RL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(RL);
			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			DSIP.addItemListener(HandlerO);			
			MCC.addItemListener(HandlerO);
			AISC.addItemListener(HandlerO);
			ROBOTICS.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					frame.dispose();
					CESP4 frame = new CESP4(D,M,A,R);
					frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(DSIP.isSelected()) {
				
				D =1;
			}
			if(MCC.isSelected()) {
				
				M =1;
			}
			if(AISC.isSelected()) {
				
				A =1;
			}
			if(ROBOTICS.isSelected()) {
				
				R =1;
			}
			
			
		}
		
		
	}	
}
