import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Instructions extends JPanel implements ActionListener
{
    JButton jb1 = new JButton("Close");
    Title title;
    
//====================================
    
    public Instructions(Title inf_title)
    {
        super();
        title = inf_title;
        setBackground(Color.white);
        setLayout(null);
        setBounds(250,175,321,329);
        
        add(jb1);
        jb1.setBounds(110,280,100,40);
        jb1.addActionListener(this);
    }
    
//====================================
    
    //INFO SCREEN GRAPHIC
    public void paintComponent(Graphics g) 
    {
    	super.paintComponent(g);
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/instructions.jpg");
    	g.drawImage(myImage, 0, 0, this);
        g.setColor(Color.yellow);
    }
    
    //CLOSE BUTTON ACTION
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source == jb1)
        {
            title.sideClose();
        }
    }
}
