import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;
 
public class CreateFrameExample {
 
  public static void main(String[] args) {
 
// Create frame with specific title
 
Frame frame = new Frame("Example Frame");
 
// Create a component to add to the frame; in this case a text area with sample text
 
Component textArea = new TextArea("Sample text...");
 
// Create a component to add to the frame; in this case a button
 
Component button = new Button("Click Me!!");
 
// Add the components to the frame; by default, the frame has a border layout
 
frame.add(textArea, BorderLayout.NORTH);
 
frame.add(button, BorderLayout.SOUTH);
 
// Show the frame
 
int width = 300;
 
int height = 300;
 
frame.setSize(width, height);
 
frame.setVisible(true);
 
  }
}
