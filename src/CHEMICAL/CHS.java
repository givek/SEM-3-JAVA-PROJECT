package CHEMICAL;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import FE.FESP; 


public class CHS extends JFrame {
	
	    int M3=0,E=0,F=0,C=0,P=0,CH=0;
	    
	    private JCheckBox MATHS3;
	    private JLabel ML;
	    private JCheckBox EG1;
	    private JLabel EL;
	    private JCheckBox FFO;
	    private JLabel FL;
	    private JCheckBox CET1;
	    private JLabel CL;
	    private JCheckBox PC;
	    private JLabel PL;
        private JCheckBox CHT;
	    private JLabel CHL;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CHS() {
			
			frame = new JFrame();
			frame.setBounds(100, 100, 555, 555);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			item = new JLabel("SELECT BOOKS YOU WANT TO PURCAHSE:");
			item.setBounds(27, 24, 247, 14);
			frame.getContentPane();
			frame.add(item);
			
			
			MATHS3 = new JCheckBox("APPLIED MATHEMATICS III:");
			MATHS3.setBounds(27, 45, 189, 23);
			frame.getContentPane();
			frame.add(MATHS3);
			
			ML = new JLabel("A text book of Applied Mathematics, Grewal B.S (Rs350)");
			ML.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(ML);
			
			
			EG1 = new JCheckBox("ENGINEERING CHEMISTRY I:");
			EG1.setBounds(27, 110, 182, 23);
			frame.getContentPane();
			frame.add(EG1);
			
			EL = new JLabel("B. R. Puri  (Rs399)");
			EL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(EL);
			
			
			FFO = new JCheckBox("FLUID FLOW OPERATIONS:");
			FFO.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(FFO);
			
			FL = new JLabel(" Suresh Ukarande (Rs430");
			FL.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(FL);
			
			
			CET1 = new JCheckBox("CHEMICAL ENGINEERING THERMODYNAMICS I:");
			CET1.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(CET1);
			
			CL = new JLabel(" J.M. Smith  (Rs446)");
			CL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(CL);
			
			
			PC = new JCheckBox("PROCESS CALCULATIONS:");
			PC.setBounds(27, 317, 475, 23);
			frame.getContentPane();
			frame.add(PC);
			
			PL = new JLabel("Durga Prasad Rao (Rs328)");
			PL.setBounds(37, 347, 465, 14);
			frame.getContentPane();
			frame.add(PL);

            CHT = new JCheckBox("CHEMICAL TECHNOLOGY: ");
			CHT.setBounds(27, 386, 464, 23);
			frame.getContentPane();
			frame.add(CHT);
			
			CHL = new JLabel("Bhaskara Rao (Rs394):");
			CHL.setBounds(37, 416, 454, 14);
			frame.getContentPane();
			frame.add(CHL);
			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			MATHS3.addItemListener(HandlerO);
			EG1.addItemListener(HandlerO);
			FFO.addItemListener(HandlerO);
			CET1.addItemListener(HandlerO);
			PC.addItemListener(HandlerO);			
            CHT.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					frame.dispose();
					CHSP frame = new CHSP(M3,E,F,C,P,CH);
					frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(MATHS3.isSelected()) {
				
				M3 =1;
			}
			if(EG1.isSelected()) {
				
				E =1;
			}
			if(FFO.isSelected()) {
				
				F =1;
			}
			if(CET1.isSelected()) {
				
				C =1;
			}
			if(PC.isSelected()) {
				
				P =1;
			}
            if(CHT.isSelected()) {
				
				CH =1;
			}
			
			
		}
		
		
	}	
}
