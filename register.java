package dbms_plasma;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;


public class register extends JFrame implements ActionListener
{
	JFrame f;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b;
	Font myFont1,f1,f2,myFont2,f3,f4;
	
	
	register() 
	{
		super("New Registration");
		setLayout(null);
		final JFrame f=new JFrame("Details");
		
		
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		tf5 = new JTextField();
		tf6 = new JTextField();
		tf7 = new JTextField();

		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		l6 = new JLabel();
		l7 = new JLabel();
		l8 = new JLabel();

		b = new JButton("Submit");

		l1.setText("Registration form ")	;	l1.setBounds(450,55,450,80);
		myFont1 = new Font("Tohama", Font.BOLD+Font.ITALIC,35);
		l1.setFont(myFont1);
		l1.setForeground(Color.black);
		f.add(l1);

		f.setLayout(null);
		f.setSize(1500,800);
		f.setBackground(Color.LIGHT_GRAY);
		f.setVisible(true);

		f2 = new Font("Tohama", Font.BOLD,15);
		f4 = new Font("Tohama", Font.BOLD+Font.ITALIC,15);

		f.add(l2);	l2.setText("First Name : ");	l2.setBounds(450,150,300,25);
		l2.setFont(f2);	l2.setForeground(Color.black);
		l2.setFont(new Font("Verdana", Font.PLAIN, 24));

		f.add(l3);	l3.setText("Last Name : ");	l3.setBounds(450,300,300,25);
		
		l3.setFont(f2);		l3.setForeground(Color.black);
		l3.setFont(new Font("Verdana", Font.PLAIN, 24));

		f.add(l4);	l4.setText("Contact Number:");	l4.setBounds(450,450,300,25);
		
		l4.setFont(f2);	l4.setForeground(Color.black);
		l4.setFont(new Font("Verdana", Font.PLAIN, 24));
		

		f.add(l5);	l5.setText("Email Id :");l5.setBounds(450,600,300,25);

		l5.setFont(f2);	l5.setForeground(Color.black);
		l5.setFont(new Font("Verdana", Font.PLAIN, 24));
		
		f.add(l6);	l6.setText("Address :");	l6.setBounds(750,150,300,25);
		
		l6.setFont(f2);	l6.setForeground(Color.black);
		l6.setFont(new Font("Verdana", Font.PLAIN, 24));
		
		
        f.add(l7);	l7.setText("Password :");	l7.setBounds(750,300,300,25);
		
		l7.setFont(f2);	l7.setForeground(Color.black);
		l7.setFont(new Font("Verdana", Font.PLAIN, 24));
		
        f.add(l8);	l8.setText("Confirm Password :");	l8.setBounds(750,450,300,25);
		
		l8.setFont(f2);	l8.setForeground(Color.black);
		l8.setFont(new Font("Verdana", Font.PLAIN, 24));

		f.add(tf1);	tf1.setBounds(450,225,175,25);
		f.add(tf2);	tf2.setBounds(450,375,175,25);
		f.add(tf3);	tf3.setBounds(450,525,175,25);
		f.add(tf4);	tf4.setBounds(450,675,175,25);
		f.add(tf5);	tf5.setBounds(750,225,175,25);
		f.add(tf6);	tf6.setBounds(750,375,175,25);
		f.add(tf7);	tf7.setBounds(750,525,175,25);
		tf1.setFont(new Font("Verdana", Font.PLAIN, 18));
		tf2.setFont(new Font("Verdana", Font.PLAIN, 18));
		tf3.setFont(new Font("Verdana", Font.PLAIN,18));
		tf4.setFont(new Font("Verdana", Font.PLAIN, 18));
		tf5.setFont(new Font("Verdana", Font.PLAIN, 18));
		tf6.setFont(new Font("Verdana", Font.PLAIN, 18));
		tf7.setFont(new Font("Verdana", Font.PLAIN, 18));

		b.setText("Submit");	b.setBounds(1100,600,200,50);
		b.addActionListener(this);	f.add(b);
		b.setFont(new Font("Verdana", Font.PLAIN, 24));
		
		
	b.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) { 
        	try {
            
            java.sql.Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/plasma","root","root");
            
            PreparedStatement Pstatement=connection.prepareStatement("insert into register values(?,?,?,?,?,?,?)");
            
            Pstatement.setString(1,tf1.getText());
            Pstatement.setString(2,tf2.getText());
            Pstatement.setString(3,tf3.getText());
            Pstatement.setString(4,tf4.getText());
            Pstatement.setString(5,tf5.getText());
            Pstatement.setString(6,tf6.getText());
            Pstatement.setString(7,tf7.getText());
            //Checking for the Password match
            if(tf6.getText().equalsIgnoreCase(tf7.getText()))
            {
                //Executing query
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(f,"Data Registered Successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(f,"password did not match");
            }

        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        }});

    }


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}


