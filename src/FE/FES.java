package FE;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class FES extends JFrame {
	
	    int M1=0,C1=0,P1=0,MC=0,B=0,E=0;
	    
	    private JCheckBox MATHS1;
	    private JLabel ML;
	    private JCheckBox PHY1;
	    private JLabel PL;
	    private JCheckBox CHEM1;
	    private JLabel CL;
	    private JCheckBox MECH;
	    private JLabel MCL;
	    private JCheckBox BEE;
	    private JLabel BL;
	    private JCheckBox EVS;
	    private JLabel EL;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public FES() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			MATHS1 = new JCheckBox("APPLIED MATHEMATICS I:");
			MATHS1.setBounds(27, 45, 189, 23);
			frame.getContentPane();
			frame.add(MATHS1);
			
			ML = new JLabel("A text book of Applied Mathematics, P.N.Wartikar (Rs350)");
			ML.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(ML);
			
			
			PHY1 = new JCheckBox("APPLIED PHYSICS I:");
			PHY1.setBounds(27, 110, 182, 23);
			frame.getContentPane();
			frame.add(PHY1);
			
			PL = new JLabel("Engineering Physics-H. K. Malik (Rs399)");
			PL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(PL);
			
			
			CHEM1 = new JCheckBox("APPLIED CHEMISTRY I");
			CHEM1.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(CHEM1);
			
			CL = new JLabel("Engineering Chemistry-Jain & Jain (Rs430)");
			CL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(CL);
			
			
			MECH = new JCheckBox("ENGINEERING MECHANICS:");
			MECH.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(MECH);
			
			MCL = new JLabel("Engineering Mechanics by A K Tayal (Rs320)");
			MCL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(MCL);
			
			
			BEE = new JCheckBox("BASIC ELECTRICAL ENGINEERING:");
			BEE.setBounds(27, 317, 475, 23);
			frame.getContentPane();
			frame.add(BEE);
			
			BL = new JLabel("B.L.Theraja - Electrical Engineering (Rs290)");
			BL.setBounds(37, 347, 465, 14);
			frame.getContentPane();
			frame.add(BL);
			
			EVS = new JCheckBox("ENVIRONMENTAL STUDIES:");
			EVS.setBounds(27, 386, 464, 23);
			frame.getContentPane();
			frame.add(EVS);
			
			EL = new JLabel("Environmental Studies by Benny Joseph (Rs210)");
			EL.setBounds(37, 416, 454, 14);
			frame.getContentPane();
			frame.add(EL);
			
			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			MATHS1.addItemListener(HandlerO);
			PHY1.addItemListener(HandlerO);
			CHEM1.addItemListener(HandlerO);
			MECH.addItemListener(HandlerO);
			BEE.addItemListener(HandlerO);
			EVS.addItemListener(HandlerO);
			
			Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					frame.dispose();
					FESP frame = new FESP(M1,P1,C1,MC,B,E);
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
			if(BEE.isSelected()) {
				
				B =1;
			}
			if(EVS.isSelected()) {
				
				E =1;
			}
			
			
		}
		
		
	}	
}
