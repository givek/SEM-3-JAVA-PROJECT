package COMPUTER;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class CES3 extends JFrame {
	
	    int S=0,SP=0,D=0,C=0,M=0;
	    
	    private JCheckBox SE;
	    private JLabel SL;
	    private JCheckBox SPCC;
	    private JLabel SPL;
	    private JCheckBox DWM;
	    private JLabel DL;
	    private JCheckBox CSS ;
	    private JLabel CL;
	    private JCheckBox MACHINE;
	    private JLabel ML;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CES3() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			SE = new JCheckBox("Software Engineering :");
			SE.setBounds(27, 45, 250, 23);
			frame.getContentPane();
			frame.add(SE);
			
			SL = new JLabel(" Rajiv Mall (Rs350)");
			SL.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(SL);
			
			
			SPCC = new JCheckBox("System Programming & Compiler Contruction :");
			SPCC.setBounds(27, 110, 350, 23);
			frame.getContentPane();
			frame.add(SPCC);
			
			SPL = new JLabel(" Tata McGrew Hill (Rs399)");
			SPL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(SPL);
			
			
			DWM = new JCheckBox("Data Warehouse & Mining :");
			DWM.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(DWM);
			
			DL = new JLabel("  Reema THareja (Rs430)");
			DL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(DL);
			
			
			CSS = new JCheckBox("Cryptography & System Security:");
			CSS.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(CSS);
			
			CL = new JLabel(" William Stalings  (Rs320)");
			CL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(CL);
			
			
			MACHINE = new JCheckBox("Machine Learning :");
			MACHINE.setBounds(27, 317, 475, 23);
			frame.getContentPane();
			frame.add(MACHINE);
			
			ML = new JLabel(" Kevin Murphy (Rs290)");
			ML.setBounds(37, 347, 465, 14);
			frame.getContentPane();
			frame.add(ML);

			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			SE.addItemListener(HandlerO);
			SPCC.addItemListener(HandlerO);				
			DWM.addItemListener(HandlerO);
			CSS.addItemListener(HandlerO);
			MACHINE.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					frame.dispose();
					CESP3 frame = new CESP3(S,SP,D,C,M);
					frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(SE.isSelected()) {
				
				S =1;
			}
			if(SPCC.isSelected()) {
				
				SP =1;
			}
			if(DWM.isSelected()) {
				
				D =1;
			}
			if(CSS.isSelected()) {
				
				C =1;
			}
			if(MACHINE.isSelected()) {
				
				M =1;
			}
			
			
		}
		
		
	}	
}
