package FE;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class FES1 extends JFrame {
	
	    int M2=0,C2=0,P2=0,E=0,S=0,C=0;
	    
	    private JCheckBox MATHS2;
	    private JLabel ML;
	    private JCheckBox PHY2;
	    private JLabel PL;
	    private JCheckBox CHEM2;
	    private JLabel C2L;
	    private JCheckBox ED;
	    private JLabel EDL;
	    private JCheckBox SPA;
	    private JLabel SL;
	    private JCheckBox CS;
	    private JLabel CL;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public FES1() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			MATHS2 = new JCheckBox("APPLIED MATHEMATICS II:");
			MATHS2.setBounds(27, 45, 189, 23);
			frame.getContentPane();
			frame.add(MATHS2);
			
			ML = new JLabel("A text book of Applied Mathematics, P.N.Wartikar (Rs350)");
			ML.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(ML);
			
			
			PHY2 = new JCheckBox("APPLIED PHYSICS II:");
			PHY2.setBounds(27, 110, 182, 23);
			frame.getContentPane();
			frame.add(PHY2);
			
			PL = new JLabel("Engineering Physics-D. K. Bhattacharya, (Rs370)");
			PL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(PL);
			
			
			CHEM2 = new JCheckBox("APPLIED CHEMISTRY II");
			CHEM2.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(CHEM2);
			
			C2L = new JLabel("Engineering Chemistry-Jain & Jain (Rs430)");
			C2L.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(C2L);
			
			
			ED = new JCheckBox("ENGINEERING DRAWING:");
			ED.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(ED);
			
			EDL = new JLabel("P.J. Shah, Engineering Graphics (Rs410)");
			EDL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(EDL);
			
			
			SPA = new JCheckBox("STRUCTURED PROGRAMMING APPROACH:");
			SPA.setBounds(27, 317, 475, 23);
			frame.getContentPane();
			frame.add(SPA);
			
			SL = new JLabel("Basics of Computer Science, by BehrouzForouzan (Rs310)");
			SL.setBounds(37, 347, 465, 14);
			frame.getContentPane();
			frame.add(SL);
			
			CS = new JCheckBox("COMMUNICATION SKILLS:");
			CS.setBounds(27, 386, 464, 23);
			frame.getContentPane();
			frame.add(CS);
			
			CL = new JLabel("Mastering Communication by Nicky Stanton (Rs250)");
			CL.setBounds(37, 416, 454, 14);
			frame.getContentPane();
			frame.add(CL);
			
			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			MATHS2.addItemListener(HandlerO);
			PHY2.addItemListener(HandlerO);
			CHEM2.addItemListener(HandlerO);       
			ED.addItemListener(HandlerO);
			SPA.addItemListener(HandlerO);
			CS.addItemListener(HandlerO);
			
			Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					frame.dispose();
					FESP1 frame = new FESP1(M2,P2,C2,E,S,C);
					frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(MATHS2.isSelected()) {
				
				M2 =1;
			}
			if(PHY2.isSelected()) {
				
				P2 =1;
			}
			if(CHEM2.isSelected()) {
				
				C2 =1;
			}
			if(ED.isSelected()) {
				
				E =1;
			}
			if(SPA.isSelected()) {
				
				S =1;
			}
			if(CS.isSelected()) {
				
				C =1;
			}
			
			
		}
		
		
	}	
}
