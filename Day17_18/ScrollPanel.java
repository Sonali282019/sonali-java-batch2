
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

// create a class ScrollPanel
// extending JFrame
public class ScrollPanel extends JFrame {

	// Declaration of objects of the
	// JScrollPane class
	JScrollPane scrollpane;

	// Constructor of ScrollPanel class
	public ScrollPanel()
	{
		
		// used to call super class
		// variables and methods
		super("JScrollPane Demonstration");

		// Function to set size of JFrame.
		setSize(300, 200);

		// Function to set Default
		// close operation of JFrame.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();

		// Function to set
		// visible of JFrame.
		setVisible(true);
	}
	
	// class init
	public void init()
	{
		
		// Declaration of objects
		// of JRadioButton class.
		JRadioButton form[][] = new JRadioButton[12][5];

		// to contain a string count
		String counts[] = {"", "1 star", "2 star",
					"3 star", "4 star", "5 star"};

		// to contain a string value
		String categories[] = {"Geeks", "Language", "Java",
							"Sudo Placement", "Python",
							"CS Subject", "Operating System",
							"Data Structure", "Algorithm",
							"PHP language", "JAVASCRIPT",
							"C Sharp" };

		// Declaration of objects
		// of the JPanel class.
		JPanel p = new JPanel();

		// Function to set size of JFrame.
		p.setSize(600, 400);

		// Function to set Layout of JFrame.
		p.setLayout(new GridLayout(13, 6, 10, 0));

		// for loop
		for (int row = 0; row < 13; row++) {
			
			// Declaration of objects
			// of ButtonGroup class
			ButtonGroup bg = new ButtonGroup();

			for (int col = 0; col < 6; col++)
			{
				
				// If condition
				if (row == 0) {

					// add new Jlabel
					p.add(new JLabel(counts[col]));
				}
				else {
					// If condition
					if (col == 0)
					{

						// add new Jlabel
						p.add(new JLabel(categories[row - 1]));
					}
					
					else
					{
						form[row - 1][col - 1] = new JRadioButton();

						// add form in ButtonGroup
						bg.add(form[row - 1][col - 1]);

						// add form in JFrame
						p.add(form[row - 1][col - 1]);
					}
				}
			}
		}

		// Declaration of objects
		// of scrollpane class.
		scrollpane = new JScrollPane(p);

		// to get content pane
		getContentPane().add(scrollpane, BorderLayout.CENTER);
	}

	// Main Method
	public static void main(String args[])
	{
		new ScrollPanel();
	}
}
