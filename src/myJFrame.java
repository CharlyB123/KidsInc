import java.awt.*;
import javax.swing.*;

public class myJFrame extends JFrame
{
    myJPanel mjp = new myJPanel();
    
    public myJFrame ()
    {
	super ("Kids Inc");
      
    	add(mjp);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
	setSize (850, 600);
	setVisible(true);
    }
}