import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Difficulty extends JPanel implements ActionListener
{
    //PANEL INITIALIZERS
    Map map = new Map(this);
    Story story;
    
    //DIFFICULTY SELECT BUTTON INITIALIZERS
    ImageIcon imageFreshSoph = new ImageIcon("images/freshsoph.jpg");
    ImageIcon imageJunior = new ImageIcon("images/senior.jpg");
    ImageIcon imageSenior = new ImageIcon("images/junior.jpg");
    JButton jb1 = new JButton(imageFreshSoph);
    JButton jb2 = new JButton(imageJunior);
    JButton jb3 = new JButton(imageSenior);
    
    String difficultySet; //User's chosen difficulty
    
//====================================
    
    public Difficulty(Story inf_story)
    {
        super();
        story = inf_story;
        
        setBackground(Color.white);
        setLayout(null);
        setBounds(0,0,640,441);
        
        //BUTTON ACTIVATIONS
        add(jb1);
        jb1.setBounds(0,111,640,110);
        jb1.addActionListener(this);
        
        add(jb2);
        jb2.setBounds(0,221,640,110);
        jb2.addActionListener(this);
        
        add(jb3);
        jb3.setBounds(0,331,640,110);
        jb3.addActionListener(this);
    }
    
//====================================
    
    //DIFFICULTY SELECT GRAPHIC
    public void paintComponent(Graphics g) 
    {
    	super.paintComponent(g);
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/difficulty.jpg");
    	g.drawImage(myImage, 0, 0, this);
        g.setColor(Color.yellow);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source == jb1) //Easy
        {
            difficultySet = "easy";
            remove(this);
            remove(jb1);
            remove(jb2);
            remove(jb3);
            add(map);
            validate();
            repaint();
        }
        else if (source == jb2) //Medium
        {
            difficultySet = "medium";
            remove(this);
            remove(jb1);
            remove(jb2);
            remove(jb3);
            add(map);
            validate();
            repaint();
        }
        else if(source == jb3) //Hard
        {
            difficultySet = "hard";
            remove(this);
            remove(jb1);
            remove(jb2);
            remove(jb3);
            add(map);
            validate();
            repaint();
        }
    }
}