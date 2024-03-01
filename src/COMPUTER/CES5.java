package COMPUTER;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class CES5 extends JFrame {
	
	    int H=0,D=0,HP=0;
	    
	    private JCheckBox HMI;
	    private JLabel HL;
	    private JCheckBox DC;
	    private JLabel DL;
	    private JCheckBox HPC;
	    private JLabel HPL;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CES5() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			HMI = new JCheckBox("Human Machine Interaction :");
			HMI.setBounds(27, 45, 189, 23);
			frame.getContentPane();
			frame.add(HMI);
			
			HL = new JLabel("Brian Fling (Rs250):");
			HL.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(HL);
			
			
			DC = new JCheckBox("Distributed Computing :");
			DC.setBounds(27, 110, 182, 23);
			frame.getContentPane();
			frame.add(DC);
			
			DL = new JLabel(" M.L.Liu (Rs299):");
			DL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(DL);
			
			
			HPC = new JCheckBox("High Performance Computing :");
			HPC.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(HPC);
			
			HPL = new JLabel(" Georg Hager (Rs430)");
			HPL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(HPL);
			
			
		
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			HMI.addItemListener(HandlerO);
			DC.addItemListener(HandlerO);
			HPC.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {			
				public void actionPerformed(ActionEvent e) {
					
					
				frame.dispose();
				CESP5 frame = new CESP5(H,D,HP);
				frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(HMI.isSelected()) {
				
				H =1;
			}
			if(DC.isSelected()) {
				
				D =1;
			}
			if(HPC.isSelected()) {
				
				HP =1;
			}
			
			
		}
		
		
	}	
}
