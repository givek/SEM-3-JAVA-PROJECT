package CHEMICAL;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class CHS4 extends JFrame {
	
	    int P=0,PO=0,PD=0,C=0;
	    
	    private JCheckBox PED;
	    private JLabel PL;
	    private JCheckBox PE;
	    private JLabel POL;
	    private JCheckBox PDAC;
	    private JLabel PDL;
	    private JCheckBox CE;
	    private JLabel CL;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CHS4() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			PED = new JCheckBox("Process Equipment Design :");
			PED.setBounds(27, 45, 189, 23);
			frame.getContentPane();
			frame.add(PED);
			
			PL = new JLabel(" E. Brownell(350)");
			PL.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(PL);
			
			
			PE = new JCheckBox("Process Engineering :");
			PE.setBounds(27, 110, 182, 23);
			frame.getContentPane();
			frame.add(PE);
			
			POL = new JLabel("  J.M. Dougla (Rs399)");
			POL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(POL);
			
			
			PDAC = new JCheckBox("Process Dynamics and Control :");
			PDAC.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(PDAC);
			
			PDL = new JLabel("  William L. Luyben (Rs350");
			PDL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(PDL);
			
			
			CE = new JCheckBox("Corrosion Engineering :");
			CE.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(CE);
			
			CL = new JLabel("  Mars G. Fontana  (Rs446)");
			CL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(CL);
			
			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			PED.addItemListener(HandlerO);
			PE.addItemListener(HandlerO);
			PDAC.addItemListener(HandlerO);
			CE.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent PR) {		
					
				frame.dispose();
				CHSP4 frame = new CHSP4(P,PO,PD,C);
				frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(PED.isSelected()) {
				
				P =1;
			}
			if(PE.isSelected()) {
				
				PO =1;
			}
			if(PDAC.isSelected()) {
				
				PD =1;
			}
			if(CE.isSelected()) {
				
				C =1;
			}
			
			
		}
		
		
	}	
}
