package CIVIL;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class CIES5 extends JFrame {
	
	    int M1=0,C1=0,P1=0,MC=0,B=0,E=0;
	    
	    private JCheckBox MATHS1;
	    private JLabel ML;
	    private JCheckBox PHY1;
	    private JLabel PL;
	    private JCheckBox CHEM1;
	    private JLabel CL;
	    private JCheckBox MECH;
	    private JLabel MCL;
	    
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CIES5() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			MATHS1 = new JCheckBox("DESIGN AND DRAWING OF REINFORCED CONCRETE STRUCTURES :");
			MATHS1.setBounds(27, 45, 600, 23);
			frame.getContentPane();
			frame.add(MATHS1);
			
			ML = new JLabel("A text book of Reinforcement Enginnering, P.N.Wartikar (Rs350)");
			ML.setBounds(37, 75, 450, 14);
			frame.getContentPane();
			frame.add(ML);
			
			
			PHY1 = new JCheckBox("CONSTRUCTION ENGINEERING :");
			PHY1.setBounds(27, 110, 350, 23);
			frame.getContentPane();
			frame.add(PHY1);
			
			PL = new JLabel("Quantitive Survey-H. K. Malik (Rs399)");
			PL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(PL);
			
			
			CHEM1 = new JCheckBox("CONSTRUCTION MANAGEMENT :");
			CHEM1.setBounds(27, 179, 450, 23);
			frame.getContentPane();
			frame.add(CHEM1);
			
			CL = new JLabel("Contruction Material-Jain & Jain (Rs430)");
			CL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(CL);
			
			
			MECH = new JCheckBox("BRIDGE DESIGN ENGINEERING :");
			MECH.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(MECH);
			
			MCL = new JLabel("Design Engineering by A K Tayal (Rs320)");
			MCL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(MCL);
			
			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			MATHS1.addItemListener(HandlerO);
			PHY1.addItemListener(HandlerO);
			CHEM1.addItemListener(HandlerO);
			MECH.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					frame.dispose();
					CIESP5 frame = new CIESP5(M1,P1,C1,MC);
					frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(MATHS1.isSelected()) {
				
				M1 =1;
			}
			if(PHY1.isSelected()) {
				
				P1 =1;
			}
			if(CHEM1.isSelected()) {
				
				C1 =1;
			}
			if(MECH.isSelected()) {
				
				MC =1;
			}
			
			
			
		}
		
		
	}	
}
