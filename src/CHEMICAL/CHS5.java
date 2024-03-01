package CHEMICAL;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class CHS5 extends JFrame {
	
	    int M=0,P=0,E=0;
	    
	    private JCheckBox MSO;
	    private JLabel ML;
	    private JCheckBox PEEM;
	    private JLabel PL;
	    private JCheckBox ESD;
	    private JLabel EL;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CHS5() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			MSO = new JCheckBox("Modeling, Simulation & Optimization :");
			MSO.setBounds(27, 45, 350, 23);
			frame.getContentPane();
			frame.add(MSO);
			
			ML = new JLabel("David M.  Himmelbleau (350)");
			ML.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(ML);
			
			
			PEEM = new JCheckBox("Project Engineering & Entrepreneurship Management  :");
			PEEM.setBounds(27, 110, 400, 23);
			frame.getContentPane();
			frame.add(PEEM);
			
			PL = new JLabel("Choudhary, S. (Rs399)");
			PL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(PL);
			
			
			ESD = new JCheckBox("Energy System Design: ");
			ESD.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(ESD);
			
			EL = new JLabel(" Douglas J. M. (Rs350");
			EL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(EL);
			
			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			MSO.addItemListener(HandlerO);
			PEEM.addItemListener(HandlerO);
			ESD.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent PR) {		
					
					
			    frame.dispose();
				CHSP5 frame = new CHSP5(M,P,E);
				frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(MSO.isSelected()) {
				
				M =1;
			}
			if(PEEM.isSelected()) {
				
				P =1;
			}
			if(ESD.isSelected()) {
				
				E =1;
			}
			
			
		}
		
		
	}	
}
