import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
 
import javax.swing.JPanel;

public class UsernamePass implements ActionListener 
{
	
	TextField t1,t2 ;
	
	  Label ques,answer,pass ;
	  
	  Button b1;
	  
	  Frame f;
	  
	  
	  
	  UsernamePass ()
	  {
		  f = new Frame("Email Validation");

	       ques = new Label("Enter Username:");
	       pass=new Label("Enter Password:");
	       
	       ques.setBackground(Color.cyan);
	       pass.setBackground(Color.cyan);
	       
	       ques.setBounds(5, 50, 150, 30);
	       pass.setBounds(5, 100, 150, 30);
	        
	       f.add(ques);
	       f.add(pass);
	       
	       t1 = new TextField();
	       t2 = new TextField();
	        
	        t1.setBounds(180, 50, 150, 30);
	        t2.setBounds(180, 100, 150, 30);
	        
	        f.add(t1);
	        f.add(t2);
	        
	        answer = new Label("Result will be printed here :");
	        
	        answer.setBounds(90, 140, 200, 30);
	        
	        f.add(answer);
	        
	        b1 = new Button("Validate");
	        
	        b1.setBounds(90, 200, 180, 30);
	        
	        f.add(b1);

	        b1.addActionListener(this);
	        
	        f.addWindowListener(new WindowAdapter() 
	        {
	            @Override
	            public void windowClosing(WindowEvent we) 
	            {
	                System.exit(0);
	            }
	        });

	        f.setLayout(null);
	        f.setSize(500, 400);
	        f.setVisible(true);
		  
//		    t.addActionListener(this);
//		    setVisible(true); 
		  
	  }

	public static void main(String[] args) 
	{
		UsernamePass pa=new UsernamePass();

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String r=t1.getText();
		String p=t2.getText();
		 
		      if (validateEmailAddress(r) && validatePassword(p) )
		       answer.setText("valid");
		      else
		       answer.setText("not valid");
		
	}
	 boolean validateEmailAddress(String userName) 
	 {
		 Pattern emailNamePtrn = Pattern.compile(
				    "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		 Matcher mtch = emailNamePtrn.matcher(userName);
	        if(mtch.matches()){
	            return true;
	        }
	        return false;
		  }
	 boolean validatePassword(String pass) 
	 {
		 String regex = "^(?=.*[0-9])"
                 + "(?=.*[a-z])(?=.*[A-Z])"
                 + "(?=.*[@#$%^&+=])"
                 + "(?=\\S+$).{8,20}$";
		 
		 Pattern p = Pattern.compile(regex);
		 if (pass== null ) {
	            return false;
	        }
		 Matcher m = p.matcher(pass);
		 return m.matches();
		  }

}
