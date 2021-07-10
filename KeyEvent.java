import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyListener;

public class KeyEvent extends Frame implements KeyListener
{
	Label l;  
    TextArea area;  
    KeyEvent(){  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        area=new TextArea();  
        area.setBounds(20,80,300, 300);  
        area.addKeyListener(this);  
          
        add(l);add(area);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
	public static void main(String[] args) 
	{
		KeyEvent ke=new KeyEvent();

	}
	@Override
	public void keyTyped(java.awt.event.KeyEvent e) 
	{
		
		l.setText("Key Typed");
	}
	@Override
	public void keyPressed(java.awt.event.KeyEvent e) 
	{
		l.setText("Key Pressed");
		
	}
	@Override
	public void keyReleased(java.awt.event.KeyEvent e) 
	{
		l.setText("Key Released"); 
		
	}

}