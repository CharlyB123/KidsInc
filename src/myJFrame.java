import java.awt.*;
import javax.swing.*;

public class myJFrame extends JFrame
{
    public myJFrame ()
    {
	super ("IST 240 - Team 14: Final Project");

        myJPanel mjp = new myJPanel();
    	
	getContentPane().add(mjp,"Center");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize (655, 480);
	setVisible(true);
    }
}