package dbms_plasma;


/* Home page*/

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class LoginFrame extends JFrame {
	JPanel jp;
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3;
	Color c1,c2,c5;
	JTextArea ta,ta2;
	



	
	LoginFrame()
	{
		super("LoginFrame");
		setLayout(null);
		jp = new JPanel();		this.add(jp);
		
		l1 = new JLabel();		jp.add(l1);
		l2 = new JLabel();		this.add(l2);	
		l3 = new JLabel();		this.add(l3);
				
		b1 = new JButton();		this.add(b1);
		b2 = new JButton();		this.add(b2);
		
		c1 = new Color(0,230,11);
		c2 = new Color(Color.HSBtoRGB(102,0,102));
		c5 = new Color(89,55,35);
		
		
		getContentPane().setBackground(Color.black);
		
		jp.setLayout(null);
		jp.setBounds(7, 7, 1009, 95);
		jp.setBackground(c5);
		jp.add(l1);
		l1.setText(" BLOOD BANK SYSTEM ");	l1.setBounds(352,19,510,50);
		Font myFont1 = new Font("Tohama", Font.BOLD+Font.ITALIC,20);
		l1.setFont(myFont1);
		l1.setForeground(Color.RED);
		jp.setBorder(new BevelBorder(BevelBorder.LOWERED));

	    b1.setBounds(400, 300, 310, 30);	b1.setText("ENTER DONOR DETAILS");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {	/*donar detail"s object creation*/
            	
            	Donordetails don;
				try {
					don = new Donordetails();
					don.setSize(1158,730);
	        		don.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	           		don.setVisible(true);
				} catch (Exception e1) {
					
					e1.printStackTrace();
				} 	
            	
            }          
         });
		
        
        
        b2.setBounds(400, 400, 310, 30);	b2.setText("ENTER PATIENT DETAILS");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 	/*p details object creation*/
            	Patientdetails pd= new Patientdetails();
        		pd.setSize(1158,730);
        		pd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        		
        		pd.setVisible(true);

                        	
            	
            }          
         });
		
        
        
       
        		
        
         
	}


}























