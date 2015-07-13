import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Story extends JPanel implements ActionListener
{
    //PANEL INITIALIZERS
    Difficulty mjpd = new Difficulty(this);
    Title title;
    
    //BUTTONS
    JButton jb1 = new JButton("Begin Your Adventure...");
    
//====================================
    
    public Story(Title inf_title)
    {
        super();
        title = inf_title;
        
        setBackground(Color.white);
        setBounds(0,0,640,441);
        setLayout(null);
        
        //ADD CLOSE BUTTON
        add(jb1);
        jb1.setBounds(190,380,250,50);
        jb1.addActionListener(this);
    }
    
//====================================
    
    //STORY SCREEN GRAPHIC
    public void paintComponent(Graphics g) 
    {
    	super.paintComponent(g);
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/story.jpg");
    	g.drawImage(myImage, 0, 0, this);
        g.setColor(Color.yellow);
    }
    
    //CLOSE BUTTON ACTIONS
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source == jb1)
        {
            remove(jb1);
            remove(this);
            add(mjpd);
            validate();
            repaint();
        }
    }
}