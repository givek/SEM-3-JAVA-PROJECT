package CHEMICAL;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class CHS3 extends JFrame {
	
	    int E=0,MT=0,T=0,C=0,P=0;
	    
	    private JCheckBox EE;
	    private JLabel EL;
	    private JCheckBox MTO2;
	    private JLabel MTL;
	    private JCheckBox TP;
	    private JLabel TL;
	    private JCheckBox CRE2;
	    private JLabel CL;
	    private JCheckBox PEIS;
	    private JLabel PL;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CHS3() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			EE = new JCheckBox("Environmental Engineering :");
			EE.setBounds(27, 45, 189, 23);
			frame.getContentPane();
			frame.add(EE);
			
			EL = new JLabel(" Rao, C.S.(350)");
			EL.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(EL);
			
			
			MTO2 = new JCheckBox("Mass Transfer Operation II :");
			MTO2.setBounds(27, 110, 182, 23);
			frame.getContentPane();
			frame.add(MTO2);
			
			MTL = new JLabel(" Treybal R.E. (Rs399)");
			MTL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(MTL);
			
			
			TP = new JCheckBox("Transport Phenomena :");
			TP.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(TP);
			
			TL = new JLabel(" Slattery, J.C (Rs350)");
			TL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(TL);
			
			
			CRE2 = new JCheckBox("Chemical Reaction Engineering II:");
			CRE2.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(CRE2);
			
			CL = new JLabel(" J.M. Smith  (Rs446)");
			CL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(CL);
			
			
			PEIS = new JCheckBox("Plant Engineering and Industrial Safety :");
			PEIS.setBounds(27, 317, 475, 23);
			frame.getContentPane();
			frame.add(PEIS);
			
			PL = new JLabel("K. S. N. Raju (Rs328)");
			PL.setBounds(37, 347, 465, 14);
			frame.getContentPane();
			frame.add(PL);

			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			EE.addItemListener(HandlerO);
			MTO2.addItemListener(HandlerO);
			TP.addItemListener(HandlerO);
			CRE2.addItemListener(HandlerO);
			PEIS.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent M) {			
					
					
				frame.dispose();
				CHSP3 frame = new CHSP3(E,MT,T,C,P);
				frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(EE.isSelected()) {
				
				E =1;
			}
			if(MTO2.isSelected()) {
				
				MT =1;
			}
			if(TP.isSelected()) {
				
				T =1;
			}
			if(CRE2.isSelected()) {
				
				C =1;
			}
			if(PEIS.isSelected()) {
				
				P =1;
			}
			
			
		}
		
		
	}	
}
