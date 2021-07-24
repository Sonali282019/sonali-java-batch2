import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

 class Login extends JFrame implements ActionListener
{
	 
	public static void main(String[] args) 
	{
		JFrame f=new JFrame("LOGIN");  
		JFrame dash=new JFrame("DAshboard");
		JFrame cuslogin=new JFrame("Customer Login");
		JFrame addaccount_F=new JFrame("Add Account");
		JFrame viewaccount_F=new JFrame("View Account");
		
		Date d=new Date();
		
	    
		JLabel userLabel = new JLabel("USERNAME");
		
	    JLabel passwordLabel = new JLabel("PASSWORD"); 
	    JTextField userTextField = new JTextField();
	    JPasswordField passwordField = new JPasswordField();
	    JButton loginButton = new JButton("LOGIN");
	    JButton resetButton = new JButton("RESET");
	    JButton customerLogin = new JButton("CustomerLogin");
	    JButton addaccount_B = new JButton("Add Accounts");
	    JButton viewaccount_B = new JButton("View Accounts");
	    
	    JCheckBox showPassword = new JCheckBox("Show Password"); 
	    
	    
	    
	    dash.setSize(300,400);  
        dash.setLayout(null); 
        dash.getContentPane().setBackground(Color.lightGray);
        
        dash.add(addaccount_B );
        dash.add(viewaccount_B );
        
	    
	    
	    cuslogin.setSize(400,400);  
	    cuslogin.setLayout(null);
	    
	    addaccount_F.setSize(700,700);
	    viewaccount_F.setSize(700,700);
	    
	    
	    
		
	    
	    f.add(userLabel);f.add(passwordLabel);f.add(userTextField);
	    f.add(passwordField);
	    f.add(showPassword);
	    f.add(loginButton);
	    f.add(resetButton);
	    f.add(customerLogin);
	    
	    f.setSize(600,400);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	    
	    
        
        
        
        
	    
	    userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
        customerLogin.setBounds(380, 80, 200, 30);
        viewaccount_B.setBounds(50, 100, 150, 30);
        addaccount_B.setBounds(50, 170, 150, 30);
        
        
        
        
	    
	    
        loginButton.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
	            
		String userName = userTextField.getText();
	      String password = passwordField.getText();
	      if (userName.trim().equals("admin") && password.trim().equals("admin")) 
	      {
	    	  
	    	  dash.setVisible(true);
	          f.setVisible(false);
	          
	            
	         
	      } else {
	    	  JOptionPane.showMessageDialog(f,"Invalid Credentials");
	         
	      }
	            
	             
	            
	            
	            
	            
	        }  
	    }); 
        
        resetButton.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            
        		if (e.getSource() == resetButton) {
                    userTextField.setText("");
                    passwordField.setText("");
                }
        	            
        	            
        	        }  
        	    }); 
        customerLogin.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            
        		  
        	    cuslogin.setVisible(true);
        	    f.setVisible(false);
        		
        	       
        	            
        	        }  
        	    }); 
        
        addaccount_B.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            
        		  
        		addaccount_F.setVisible(true);
        	    
        		
        	       
        	            
        	        }  
        	    }); 
        
        viewaccount_B.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            
        		  
        		viewaccount_F.setVisible(true);
        	    
        		
        	       
        	            
        	        }  
        	    }); 
        
        showPassword.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            
        		if (e.getSource() == showPassword) {
                    if (showPassword.isSelected()) {
                        passwordField.setEchoChar((char) 0);
                    } else {
                        passwordField.setEchoChar('*');
                    }
         
         
                }
        	            
        	            
        	        }  
        	    }); 
        
        
	    
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	

	

	  