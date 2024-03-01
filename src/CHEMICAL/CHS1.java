package CHEMICAL;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class CHS1 extends JFrame {
	
	    int M4=0,E=0,S=0,C=0,ME=0,CH=0;
	    
	    private JCheckBox MATHS4;
	    private JLabel ML;
	    private JCheckBox EG2;
	    private JLabel EL;
	    private JCheckBox SFMO;
	    private JLabel SL;
	    private JCheckBox CET2;
	    private JLabel CL;
	    private JCheckBox MED;
	    private JLabel MEL;
        private JCheckBox CEE;
	    private JLabel CHL;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CHS1() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			MATHS4 = new JCheckBox("APPLIED MATHEMATICS IV:");
			MATHS4.setBounds(27, 45, 189, 23);
			frame.getContentPane();
			frame.add(MATHS4);
			
			ML = new JLabel("A text book of Applied Mathematics, Grewal B.S (Rs350)");
			ML.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(ML);
			
			
			EG2 = new JCheckBox("ENGINEERING CHEMISTRY II:");
			EG2.setBounds(27, 110, 182, 23);
			frame.getContentPane();
			frame.add(EG2);
			
			EL = new JLabel("B. R. Puri  (Rs399)");
			EL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(EL);
			
			
			SFMO = new JCheckBox("SOLID FLUID MECHANICAL OPERATIONS ");
			SFMO.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(SFMO);
			
			SL = new JLabel("  WC McCabe (Rs556)");
			SL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(SL);
			
			
			CET2 = new JCheckBox("CHEMICAL ENGINEERING THERMODYNAMICS II:");
			CET2.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(CET2);
			
			CL = new JLabel(" J.M. Smith  (Rs446)");
			CL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(CL);
			
			
			MED = new JCheckBox("MECHANICAL EQUIPMENT DESIGN :");
			MED.setBounds(27, 317, 475, 23);
			frame.getContentPane();
			frame.add(MED);
			
			MEL = new JLabel(" B.C. Bhattacharya (Rs293)");
			MEL.setBounds(37, 347, 465, 14);
			frame.getContentPane();
			frame.add(MEL);

            CEE = new JCheckBox("CHEMICAL ENGINEERING ECONOMICS : ");
			CEE.setBounds(27, 386, 464, 23);
			frame.getContentPane();
			frame.add(CEE);
			
			CHL = new JLabel("Pravin Kumar (Rs468):");
			CHL.setBounds(37, 416, 454, 14);
			frame.getContentPane();
			frame.add(CHL);
			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			MATHS4.addItemListener(HandlerO);
			EG2.addItemListener(HandlerO);
			SFMO.addItemListener(HandlerO);
			CET2.addItemListener(HandlerO);
			MED.addItemListener(HandlerO);
            CEE.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {			
				public void actionPerformed(ActionEvent e) {
					
					
					frame.dispose();
					CHSP1 frame = new CHSP1(M4,E,S,C,ME,CH);
					frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(MATHS4.isSelected()) {
				
				M4 =1;
			}
			if(EG2.isSelected()) {
				
				E =1;
			}
			if(SFMO.isSelected()) {
				
				S =1;
			}
			if(CET2.isSelected()) {
				
				C =1;
			}
			if(MED.isSelected()) {
				
				ME =1;
			}
            if(CEE.isSelected()) {
				
				CH =1;
			}
			
			
		}
		
		
	}	
}
