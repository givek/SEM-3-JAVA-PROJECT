package COMPUTER;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class CES1 extends JFrame {
	
	    int M4=0,A=0,C=0,O=0,CO=0;
	    
	    private JCheckBox MATHS4;
	    private JLabel ML;
	    private JCheckBox AOA;
	    private JLabel AL;
	    private JCheckBox CG;
	    private JLabel CL;
	    private JCheckBox OS;
	    private JLabel OL;
	    private JCheckBox COAA;
	    private JLabel COL;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CES1() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			MATHS4 = new JCheckBox("APPLIED MATHEMATICS IV :");
			MATHS4.setBounds(27, 45, 189, 23);
			frame.getContentPane();
			frame.add(MATHS4);
			
			ML = new JLabel("A text book of Applied Mathematics, Grewal B.S (Rs340)");
			ML.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(ML);
			
			
			AOA = new JCheckBox("ANALYSIS OF ALGORITHM :");
			AOA.setBounds(27, 110, 182, 23);
			frame.getContentPane();
			frame.add(AOA);
			
			AL = new JLabel("S.K Basu(Rs330)");
			AL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(AL);
			
			
			CG = new JCheckBox("COMPUTER GRAPHICS :");
			CG.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(CG);
			
			CL = new JLabel(" D Rogers(Rs430)");
			CL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(CL);
			
			
			OS = new JCheckBox("OPERATING SYSTEM :");
			OS.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(OS);
			
			OL = new JLabel(" William Stallings (Rs410)");
			OL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(OL);
			
			
			COAA = new JCheckBox("COMPUTER ORGANIZATION & ARCHITECTURE :");
			COAA.setBounds(27, 317, 475, 23);
			frame.getContentPane();
			frame.add(COAA);
			
			COL = new JLabel("Morris Mano (Rs270)");
			COL.setBounds(37, 347, 465, 14);
			frame.getContentPane();
			frame.add(COL);

			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			MATHS4.addItemListener(HandlerO);
			AOA.addItemListener(HandlerO);
			CG.addItemListener(HandlerO);
			OS.addItemListener(HandlerO);			
			COAA.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					frame.dispose();
					CESP1 frame = new CESP1(M4,A,C,O,CO);
					frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(MATHS4.isSelected()) {
				
				M4 =1;
			}
			if(AOA.isSelected()) {
				
				A =1;
			}
			if(CG.isSelected()) {
				
				C =1;
			}
			if(OS.isSelected()) {
				
				O =1;
			}
			if(COAA.isSelected()) {
				
				CO =1;
			}
			
			
		}
		
		
	}	
}
