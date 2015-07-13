import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Title extends JPanel implements ActionListener
{
    //PANEL INITIALIZERS
    Info info = new Info(this);
    Instructions inst = new Instructions(this);
    Story story = new Story(this);
    // I added this comment as a test
    //MENU SETUP
    ImageIcon imageStart = new ImageIcon("images/start.jpg");
    ImageIcon imageHow = new ImageIcon("images/howtoplay.jpg");
    ImageIcon imageCredits = new ImageIcon("images/credits.jpg");
    JButton jb1 = new JButton(imageHow);
    JButton jb2 = new JButton(imageStart);
    JButton jb3 = new JButton(imageCredits);

//====================================
    
    public Title()
    {
        super();
        setBackground(Color.white);
        setBounds(0,0,640,441);
        setLayout(null);
        
        //ADD MENU BUTTONS
        add(jb1);
        jb1.setBounds(0,370,160,71);
        jb1.addActionListener(this);
        
        add(jb2);
        jb2.setBounds(160,370,320,71);
        jb2.addActionListener(this);
        
        add(jb3);
        jb3.setBounds(480,370,160,71);
        jb3.addActionListener(this);
    }
    
/****************************************
 *               METHODS                *
 ***************************************/
    
    //REMOVE Info & Instructions
    public void sideClose()
    {
        remove(info.jb1);
        remove(info);
        remove(inst.jb1);
        remove(inst);
        validate();
        repaint();
    }
    
    //REMOVE Title
    public void titleClose()
    {
        remove(this);
        remove(jb1);
        remove(jb2);
        remove(jb3);
        add(story);
        validate();
        repaint();
    }
    
//====================================
    
    //TITLE SCREEN GRAPHIC
    public void paintComponent(Graphics g) 
    {
    	super.paintComponent(g);
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/title.jpg");
    	g.drawImage(myImage, 0, 0, this);
        g.setColor(Color.yellow);
    }

    //MENU BUTTON ACTIONS
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source == jb1) //How To Play
        {
            remove(info);
            add(inst);
            inst.setBounds(160,40,321,329);
            validate();
            repaint();
        }
        else if (source == jb2) //Start
        {
            sideClose();
            titleClose();
        }
        else if(source == jb3) //Credits
        {
            remove(inst);
            add(info);
            info.setBounds(160,40,321,329);
            validate();
            repaint();
        }
    }
}
