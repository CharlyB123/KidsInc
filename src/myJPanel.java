import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanel extends JPanel
{
    Title title = new Title();

//====================================
    
    public myJPanel()
    {
        super();
        
        setBackground(Color.gray);
        setLayout(null);
        
        add(title);

    }
    
}