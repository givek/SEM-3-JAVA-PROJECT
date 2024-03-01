package CHEMICAL;

import javax.swing.JFrame;
import java.awt.*;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

   
public class CHSP2 extends JFrame {    
    
	private JPanel contentPane;
	private JTable table;
	private JButton BPrint;
    
    CHSP2(int i,int j,int k,int l,int m,int n){    
    
	setBounds(100, 100, 555, 450);
	contentPane = new JPanel();
	contentPane.setBackground(Color.WHITE);
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
    
    String data[][]= new String[16][16];
    
    int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0;
    
    data[0][0] = ""; 
	data[0][1] = "";
	
	data[1][0] = "ITEM"; 
	data[1][1] = "AMOUNT";
	
	data[2][0] = ""; 
	data[2][1] = "";
	
	
    int x=3;
	
	if(i==1) {
		
		data[x][0] = "Computer Programming & Numerical Methods "; 
		data[x][1] = "Rs350";
		p1=350;
		x++;
		}
	
	if(j==1) {
		
		data[x][0] = "Mass Transfer Operation I "; 
		data[x][1] = "Rs399";
		p2=399;
		x++;
	}
	
	if(k==1) {
		
		data[x][0] = "Heat Transfer Operations : "; 
		data[x][1] = "Rs350";
		p3=430;
		x++;
	}
	
	if(l==1) {
		
		data[x][0] = "Chemical Reaction Engineering I"; 
		data[x][1] = "Rs446";
		p4=446;
		x++;
	}
	
	if(m==1) {
		
		data[x][0] = "Business Communication and Ethics "; 
		data[x][1] = "Rs328";
		p5=328;
		x++;
	}
	
	if(n==1) {
		
		data[x][0] = "Advanced Material Science "; 
		data[x][1] = "Rs394";
		p6=394;
		x++;
	}
    
	int t = p1+p2+p3+p4+p5+p6;
	
	data[x+1][0] = ""; 
	data[x+1][1] = "";
	
	data[x+2][0] = "TOTAL"; 
	data[x+2][1] = "Rs"+t;
	
		
	String column[]={"ID","NAME"};
	
	table = new JTable(data,column);
	table.setBounds(36, 31, 468, 300);
	table.setShowGrid(false);
	table.setBackground(Color.WHITE);
	
    TableColumnModel columnModel = table.getColumnModel();
    TableColumn col = columnModel.getColumn(1); 
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
    col.setCellRenderer(renderer);
      
    contentPane.add(table);
	
	BPrint = new JButton("PRINT");
	BPrint.setBounds(224, 366, 89, 23);
	contentPane.add(BPrint);
	BPrint.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			MessageFormat header = new MessageFormat("BOOK STORE BILL");
	        MessageFormat footer = new MessageFormat("");
			
			try{
				
				table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
			    }
			catch(Exception z){}		
		}
	});          
  }
}	