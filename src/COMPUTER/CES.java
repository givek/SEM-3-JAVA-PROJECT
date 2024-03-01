package COMPUTER;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import FE.FESP1; 


public class CES extends JFrame {
	
	    int M3=0,DL=0,DM=0,E=0,DS=0;
	    
	    private JCheckBox MATHS3;
	    private JLabel ML;
	    private JCheckBox DLDA;
	    private JLabel DLL;
	    private JCheckBox DISCRETE;
	    private JLabel DML;
	    private JCheckBox ECCF;
	    private JLabel EL;
	    private JCheckBox DATA;
	    private JLabel DSL;;
	    private JFrame frame;
		private JLabel item;
		private JButton Button;
		
		public CES() {
			
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
			
			ML = new JLabel("A text book of Applied Mathematics, Grewal B.S (Rs380)");
			ML.setBounds(37, 75, 350, 14);
			frame.getContentPane();
			frame.add(ML);
			
			
			DLDA = new JCheckBox("Digital logic design & Analysis:");
			DLDA.setBounds(27, 110, 250, 23);
			frame.getContentPane();
			frame.add(DLDA);
			
			DLL = new JLabel("Tata McGrew Hill  (Rs320)");
			DLL.setBounds(37, 140, 288, 14);
			frame.getContentPane();
			frame.add(DLL);
			
			
			DISCRETE = new JCheckBox("Discrete Mathematics");
			DISCRETE.setBounds(27, 179, 388, 23);
			frame.getContentPane();
			frame.add(DISCRETE);
			
			DML = new JLabel(" Y.N Singh (Rs410)");
			DML.setBounds(37, 209, 346, 14);
			frame.getContentPane();
			frame.add(DML);
			
			
			ECCF = new JCheckBox("Electronic Circuits & Communication Fundamental:");
			ECCF.setBounds(27, 247, 388, 23);
			frame.getContentPane();
			frame.add(ECCF);
			
			EL = new JLabel(" David Bell (Rs400)");
			EL.setBounds(37, 277, 450, 14);
			frame.getContentPane();
			frame.add(EL);
			
			
			DATA = new JCheckBox("Data Structures:");
			DATA.setBounds(27, 317, 475, 23);
			frame.getContentPane();
			frame.add(DATA);
			
			DSL = new JLabel("Reema Thareja (Rs230)");
			DSL.setBounds(37, 347, 465, 14);
			frame.getContentPane();
			frame.add(DSL);

			
			Button = new JButton("GENERATE BILL");
			Button.setBounds(193, 469, 150, 23);
			frame.getContentPane();
			frame.add(Button);
			
			Handler HandlerO = new Handler();
			MATHS3.addItemListener(HandlerO);
			DLDA.addItemListener(HandlerO);
			DISCRETE.addItemListener(HandlerO);
			ECCF.addItemListener(HandlerO);
			DATA.addItemListener(HandlerO);
			
			
			Button.addActionListener(new ActionListener() {			
				public void actionPerformed(ActionEvent e) {
					
					
				frame.dispose();
				CESP frame = new CESP(M3,DL,DM,E,DS);
				frame.setVisible(true);
					
				}
			});
		}
		
	private class Handler implements ItemListener {
		
		public void itemStateChanged(ItemEvent event) {
			
			if(MATHS3.isSelected()) {
				
				M3 =1;
			}
			if(DLDA.isSelected()) {
				
				DL =1;
			}
			if(DISCRETE.isSelected()) {
				
				DM =1;
			}
			if(ECCF.isSelected()) {
				
				E =1;
			}
			if(DATA.isSelected()) {
				
				DS =1;
			}
			
			
		}
		
		
	}	
}
