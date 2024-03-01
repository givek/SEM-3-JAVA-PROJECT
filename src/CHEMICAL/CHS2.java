package CHEMICAL;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class CHS2 extends JFrame {
	
	    int C=0,MT=0,H=0,CH=0,B=0,A=0;
	    
	    private JCheckBox CPN;
	    private JLabel CL;
	    private JCheckBox MTO1;
	    private JLabel MTL;
	    private JCheckBox HTO;
	    private JLabel HL;
	    private JCheckBox CRE1;
	    private JLabel CHL;
	    private JCheckBox BCE;
	    private JLabel BL;
        private JCheckBox AMS;
	    private JLabel AL;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CHS2() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			CPN = new JCheckBox("Computer Programming & Numerical Methods :");
			CPN.setBounds(27, 45, 350, 23);
			frame.getContentPane();
			frame.add(CPN);
			
			CL = new JLabel("  John Mathews(Rs350)");
			CL.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(CL);
			
			
			MTO1 = new JCheckBox("Mass Transfer Operation I :");
			MTO1.setBounds(27, 110, 182, 23);
			frame.getContentPane();
			frame.add(MTO1);
			
			MTL = new JLabel(" Treybal R.E. (Rs399)");
			MTL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(MTL);
			
			
			HTO = new JCheckBox("Heat Transfer Operations : ");
			HTO.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(HTO);
			
			HL = new JLabel("  B. K. Datta (Rs350");
			HL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(HL);
			
			
			CRE1 = new JCheckBox("Chemical Reaction Engineering I:");
			CRE1.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(CRE1);
			
			CHL = new JLabel(" J.M. Smith  (Rs446)");
			CHL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(CHL);
			
			
			BCE = new JCheckBox("Business Communication and Ethics : ");
			BCE.setBounds(27, 317, 475, 23);
			frame.getContentPane();
			frame.add(BCE);
			
			BL = new JLabel("Fred Luthans (Rs328)");
			BL.setBounds(37, 347, 465, 14);
			frame.getContentPane();
			frame.add(BL);

            AMS = new JCheckBox("Advanced Material Science : ");
			AMS.setBounds(27, 386, 464, 23);
			frame.getContentPane();
			frame.add(AMS);
			
			AL = new JLabel(" B.K. Agrawal (Rs394):");
			AL.setBounds(37, 416, 454, 14);
			frame.getContentPane();
			frame.add(AL);
			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			CPN.addItemListener(HandlerO);
			MTO1.addItemListener(HandlerO);
			HTO.addItemListener(HandlerO);
			CRE1.addItemListener(HandlerO);
			BCE.addItemListener(HandlerO);
            AMS.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent M) {		
					
					
				frame.dispose();
				CHSP2 frame = new CHSP2(C,MT,H,CH,B,A);
				frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(CPN.isSelected()) {
				
				C =1;
			}
			if(MTO1.isSelected()) {
				
				MT =1;
			}
			if(HTO.isSelected()) {
				
				H =1;
			}
			if(CRE1.isSelected()) {
				
				CH =1;
			}
			if(BCE.isSelected()) {
				
				B =1;
			}
            if(AMS.isSelected()) {
				
				A =1;
			}
			
			
		}
		
		
	}	
}
