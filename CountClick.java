import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CountClick implements ActionListener 
{
	Button b1;
	
	Label lb1;
	
	Frame f;
	
	private int count = 0;
	
	CountClick()
	{
		f = new Frame("COUNT BUTTON CLICKS");

        lb1 = new Label("You clicked : 0 times");
        
        lb1.setBounds(5, 50, 150, 30);
        
        lb1.setBackground(Color.GREEN);
        
        f.add(lb1);
        
        b1 = new Button("Count click");
        
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
		CountClick cc=new CountClick();

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		count++;
		lb1.setText(String.valueOf("You clicked :" +count+" times"));
		
		
	}

}