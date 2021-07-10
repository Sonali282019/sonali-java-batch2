import java.awt.*;
import java.awt.event.*;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
 
import javax.swing.JPanel;

public class PalindromeAwt implements ActionListener 
{
	
	TextField t1 ;
	
	  Label ques,answer ;
	  
	  Button b1;
	  
	  Frame f;
	  
	  
	  
	  PalindromeAwt ()
	  {
		  f = new Frame(" Check for Palindrome");

	       ques = new Label("Enter String:");
	       
	       ques.setBackground(Color.cyan);
	       
	       ques.setBounds(5, 50, 150, 30);
	        
	       f.add(ques);
	       
	       t1 = new TextField();
	        
	        t1.setBounds(180, 50, 150, 30);
	        
	        f.add(t1);
	        
	        answer = new Label("Result will be printed here :");
	        
	        answer.setBounds(90, 140, 200, 30);
	        
	        f.add(answer);
	        
	        b1 = new Button("CHECK FOR PALINDROME");
	        
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
		PalindromeAwt pa=new PalindromeAwt();

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String r=t1.getText();
		if (e.getSource().equals(b1))  
		      if (isPalindrome(r))
		       answer.setText("String u entered is palindrome");
		      else
		       answer.setText("String u entered is not palindrome");
		
	}
	 boolean isPalindrome(String s) {
		    int i, j;
		    for (i=0, j=s.length()-1; i < j; i++, j--)
		      if (s.charAt(i) != s.charAt(j))
		        return false;
		    return true;
		  }

}
