package dbms_plasma;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;



// window size 600,710

public class Patientdetails extends JFrame 
{
	
	JPanel jp1,jp2;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	JButton b,b1;
	Color c1,c2,c3,c4,c5,c6;
	Font myFont1,f1,f2,myFont2,f3,f4;
	static int flag,f;
	static String dn,dc;
	Patientdetails() 
	{
		super("Patient Details");
		setLayout(null);
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		tf5 = new JTextField();
		tf6 = new JTextField();
		tf7 = new JTextField();
		tf8 = new JTextField();
		flag=0;
		f=0;
		
		
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		l6 = new JLabel();
		l7 = new JLabel();
		l8 = new JLabel();
		l9 = new JLabel();
		l10 = new JLabel();
		l11 = new JLabel();
		l12 = new JLabel();
		l13 = new JLabel();
		
		
		
		b = new JButton("Submit");
		b1 = new JButton("Check");

		c1 = new Color(102);
		c2 = new Color(240,240,240);
		c3 = new Color(10,255,235);
		c4 = new Color(29,82,59);
		c5 = new Color(89,55,25);
		c6 = new Color(119,5,25);
		getContentPane().setBackground(Color.black);
		add(jp1);
		jp1.setLayout(null);
		jp1.setBounds(5, 5, 1130, 115);
		jp1.setBackground(c6);
		jp1.add(l1);
		l1.setText("BLOOD BANK SYSTEM ")	;	l1.setBounds(352,19,510,50);
		myFont1 = new Font("Tohama", Font.BOLD+Font.ITALIC,20);
		l1.setFont(myFont1);
		l1.setForeground(Color.RED);
		jp1.setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		
		
		add(jp2);
		jp2.setLayout(null);
		jp2.setBounds(255,125,640,400);
		jp2.setBorder(new BevelBorder(BevelBorder.LOWERED));
		jp2.setBackground(c5);
		
		
		
		jp2.add(l2);
		l2.setText("Patient Registration Form");	l2.setBounds(220,18,175,50);
		Font myFont2 = new Font("Tohama", Font.BOLD+Font.ITALIC,14);
		l2.setFont(myFont2);	l2.setForeground(c2);
		
		f2 = new Font("Tohama", Font.BOLD,15);
		f4 = new Font("Tohama", Font.BOLD+Font.ITALIC,15);
		
		jp2.add(l3);	l3.setText("Basic details");	l3.setBounds(45,78,175,15);
		l3.setFont(f4);	l3.setForeground(c3);
		
		jp2.add(l4);	l4.setText("Patient name :");	l4.setBounds(20,108,175,15);
		l4.setFont(f2);	l4.setForeground(c2);
		
		
		jp2.add(l5);	l5.setText("Gender :");	l5.setBounds(20,158,175,15);
		
		l5.setFont(f2);		l5.setForeground(c2);														
		
		
		
		jp2.add(l6);	l6.setText("Contact Number :");	l6.setBounds(20,208,175,15);
		
		l6.setFont(f2);	l6.setForeground(c2);
		

		jp2.add(l7);	l7.setText("Date Of Birth :");l7.setBounds(20,258,175,15);

		l7.setFont(f2);	l7.setForeground(c2);
		
		jp2.add(l8);	l8.setText("Address :");	l8.setBounds(20,308,175,15);
		
		l8.setFont(f2);	l8.setForeground(c2);
		
		
		jp2.add(tf1);	tf1.setBounds(20,133,175,19);
		jp2.add(tf2);	tf2.setBounds(20,183,175,19);
		jp2.add(tf3);	tf3.setBounds(20,233,175,19);
		jp2.add(tf4);	tf4.setBounds(20,283,175,19);
		jp2.add(tf5);	tf5.setBounds(20,333,175,19);
		
		
		jp2.add(l9);	l9.setText("Health details");	l9.setBounds(255,78,175,15);
		
		l9.setFont(f4);	l9.setForeground(c3);
		
		

        jp2.add(l10);	l10.setText("Blood type :");	l10.setBounds(220,108,175,15);
		
		l10.setFont(f2);	l10.setForeground(c2);
		
		
		jp2.add(tf6);	tf6.setBounds(220,133,175,19);
		
		
		
	
		

		jp2.add(l11);	l11.setText("Other Details");	l11.setBounds(455,78,175,15);
		
		l11.setFont(f4);	l11.setForeground(c3);
		
		jp2.add(l12);	l12.setText("Hospital name and address:");	l12.setBounds(420,108,285,15);
		
		l12.setFont(f2); l12.setForeground(c2);
		
		
		jp2.add(l13);	l13.setText("Blood bank name :");l13.setBounds(420,158,175,15);
		
		l13.setFont(f2);	l13.setForeground(c2);

		jp2.add(tf7);	tf7.setBounds(420,133,175,19);
		jp2.add(tf8);	tf8.setBounds(420,183,175,19);

		b.setBounds(499,330,100,29);
			jp2.add(b);
		
		
		b1.setBounds(299,330,100,29);
		jp2.add(b1);
		b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
               String t=tf6.getText();
             try{
            		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/plasma","root","root");
              
            	     Statement stmt = con.createStatement();
            	     ResultSet rs = stmt.executeQuery("SELECT * FROM donar");
            	     while (rs.next()) {
            	 				if (rs.getString("BLOODTYPE").equals(t))  
            	 			{			
            	 				flag=1;  
            	 				dn=rs.getString("DONARNAME");
            	 				dc=rs.getString("CONTACTNUMBER");
            	 				
            	 				
            	 				break;
            	 			}	
   				     }
   				
				if(flag>0){
   					JOptionPane.showMessageDialog(jp2,"Blood Group Matched!!");
   					
   				}
   				else {
					JOptionPane.showMessageDialog(jp2,"Blood Group Not Matched!!");
   			
   				}
   			
   			}
		catch (Exception e1) {
				
				e1.printStackTrace();
			}
   				
   		}
 
            });	
		
		b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if(flag==1) {
            	String t=tf6.getText();
            	if(tf1.getText().isEmpty() ||tf2.getText().isEmpty() ||tf3.getText().isEmpty() ||tf4.getText().isEmpty() || tf5.getText().isEmpty() || tf6.getText().isEmpty()|| tf7.getText().isEmpty()|| tf8.getText().isEmpty()) {
						JOptionPane.showMessageDialog(jp2,"Enter All The Details!","Note",JOptionPane.WARNING_MESSAGE);
						return;
					}
            	try {
                    Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/plasma","root", "root");
                    PreparedStatement Pstatement=connection.prepareStatement("insert into patient values(?,?,?,?,?,?,?,?,?,?)");
                    Pstatement.setString(1,tf1.getText());
                    Pstatement.setString(2,tf2.getText());
                    Pstatement.setString(3,tf3.getText());
                    Pstatement.setString(4,tf4.getText());
                    Pstatement.setString(5,tf5.getText());
                    Pstatement.setString(6,tf6.getText());
                    Pstatement.setString(7,tf7.getText());
                    Pstatement.setString(8,tf8.getText());
                    Pstatement.setString(9,dn);
                    Pstatement.setString(10,dc);
                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(jp2,"Submitted Successfully!","Note",JOptionPane.WARNING_MESSAGE);
                    patientsValues(t);
                    dispose();
        		}
        		catch(SQLException e1)
        		{
        			System.out.println(e1);
          		}
            }  
            
           
            else
            {
            	JOptionPane.showMessageDialog(jp2,"Cannot submit!","Note",JOptionPane.WARNING_MESSAGE);
				return;
            }
            }

			private void patientsValues(String t) {
				try {
				 Connection connection1 =DriverManager.getConnection("jdbc:mysql://localhost:3306/plasma","root", "root");
		         String s="DELETE FROM donar WHERE BLOODTYPE='"+t+"'";
			        PreparedStatement Pstatement1 = connection1.prepareStatement(s);
		 	    Pstatement1.execute();
				}
				catch(SQLException e)
				{
					System.out.println(e);
				}
				
			}

			
         });
		
		}

	}

