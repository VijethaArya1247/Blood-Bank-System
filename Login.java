package dbms_plasma;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame implements ActionListener {
	JFrame f;
	Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JButton registerButton = new JButton("REGISTER");
    JCheckBox showPassword = new JCheckBox("Show Password");

    Login() {
    	super("Login Form");
    	setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        
    
    }
    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(450, 250, 500, 30);
        passwordLabel.setBounds(450, 320, 500, 30);
        userTextField.setBounds(750, 250, 200, 30);
        passwordField.setBounds(750, 320, 200, 30);
        showPassword.setBounds(750, 380, 300, 30);
        loginButton.setBounds(450, 450, 150, 50);
        resetButton.setBounds(750, 450, 150, 50);
        registerButton.setBounds(600,550, 150, 50);
        userLabel.setFont(new Font("Verdana", Font.PLAIN, 24));
        passwordLabel.setFont(new Font("Verdana", Font.PLAIN, 24));
        showPassword.setFont(new Font("Verdana", Font.PLAIN, 24));
        userTextField.setFont(new Font("Verdana", Font.PLAIN, 24));
        passwordField.setFont(new Font("Verdana", Font.PLAIN, 24));
        JLabel background=new JLabel(new ImageIcon("D:/srm logo.png"));
		this.add(background);
 		background.setBounds(300,10, 850, 290);

    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        container.add(registerButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        registerButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == loginButton) {
    	   String userName = userTextField.getText();
			String password = passwordField.getText();
           try {
               Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/plasma",
                   "root", "root");

               PreparedStatement st = (PreparedStatement) connection
                   .prepareStatement("Select FIRSTNAME, PASSWRD from register where FIRSTNAME=? and PASSWRD=?");

               st.setString(1, userName);
               st.setString(2, password);
               ResultSet rs = st.executeQuery();
               if (rs.next()) {
            	  LoginFrame Frame= new LoginFrame();
            	  Frame.setVisible(true);
   				
                   
               } else {
                   JOptionPane.showMessageDialog(f, "Wrong Username & Password");
               }
           } catch (SQLException sqlException) {
               sqlException.printStackTrace();
           }
            
        }
        
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
       
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    
    
    
    registerButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        
			try {

			    
			    	new register();
			    	
			    	
			    
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			} 	
        	
        }          
     });
    }

	
}
    




