import java.awt.*;
import java.awt.event.*;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
 
import javax.swing.JPanel;



public class CircleArea implements ActionListener
{
	Button b1;
	
    TextField t1;
    
    Label lb1, lb3;
    
    Frame f;
    
    CircleArea() {
        f = new Frame(" Find Area of a circle");

        lb1 = new Label("Enter radius of a circle :");
        
        lb1.setBounds(5, 50, 150, 30);
        
        f.add(lb1);

        t1 = new TextField();
        
        t1.setBounds(180, 50, 150, 30);
        
        f.add(t1);

        lb3 = new Label("AREA OF CIRCLE :");
        lb3.setBounds(90, 140, 150, 30);
        f.add(lb3);

        b1 = new Button("Calculate Area");
        
        b1.setBounds(90, 200, 100, 30);
        
        f.add(b1);

        b1.addActionListener(this);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });

        f.setLayout(null);
        f.setSize(300, 300);
        f.setVisible(true);

    }

	

	public static void main(String[] args) 
	{
		CircleArea ca = new CircleArea();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		float r = Float.parseFloat(t1.getText());
		
        float area = 0;

        if (e.getSource().equals(b1))
        {
            area = (float) 3.14 * r * r;

            lb3.setText(String.valueOf("Result :    " + area));
        }
		
		
	}

}