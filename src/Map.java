import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Map extends JPanel implements ActionListener, MouseListener
{
    //PANEL INITIALIZERS
    stats stats = new stats(this);
    questionBank questions = new questionBank();
    Hub hub = new Hub(this, questions);
    Library library = new Library(this, questions);
    Hammond hammond = new Hammond(this, questions);
    Thomas thomas = new Thomas(this, questions);
    ist ist = new ist(this, questions);
    Difficulty diff; //Use to call difficulty
    
    //BUILDING SELECT BUTTON INITIALIZERS
    ImageIcon imageLibrary = new ImageIcon("images/library.jpg");
    ImageIcon imageHammond = new ImageIcon("images/hammond.jpg");
    ImageIcon imageHub = new ImageIcon("images/hub.jpg");
    ImageIcon imageThomas = new ImageIcon("images/thomas.jpg");
    ImageIcon imageIST = new ImageIcon("images/ist.jpg");
    ImageIcon imageLibrary2 = new ImageIcon("images/library2.jpg");
    ImageIcon imageHammond2 = new ImageIcon("images/hammond2.jpg");
    ImageIcon imageHub2 = new ImageIcon("images/hub2.jpg");
    ImageIcon imageThomas2 = new ImageIcon("images/thomas2.jpg");
    ImageIcon imageIST2 = new ImageIcon("images/ist2.jpg");
    JButton jb1 = new JButton(imageLibrary);
    JButton jb2 = new JButton(imageHammond);
    JButton jb3 = new JButton(imageHub);
    JButton jb4 = new JButton(imageThomas);
    JButton jb5 = new JButton(imageIST);
    
    //TIMER
    Timer time;
    int delay = 0;
    int i = 0;
    JProgressBar pb;
    
    //MISC
    boolean libraryComplete = false;
    boolean hammondComplete = false;
    boolean thomasComplete = false;
    boolean hubComplete = false;
    boolean istComplete = false;
    int scorePoints = 0;
    int timeLeft = (100 - i);
    int multiplier = 0;
    
    
//====================================
    
    public Map(Difficulty inf_diff)
    {
        super();
        diff = inf_diff;
        setBackground(Color.white);
        setLayout(null);
        setBounds(0,0,640,441);
        
        //BUTTON ACTIVATOR
        buildingSetup();
        
        //PROGRESS BAR
        pb = new JProgressBar(JProgressBar.VERTICAL,0,100);
        pb.setStringPainted(true);
        pb.setString("TIME");
        add(pb);
        pb.setBounds(0,0,50,442);
        
        //TIMER
        delay = 2000; //milliseconds
  	time = new Timer(delay, this);
    }
    
/****************************************
 *               METHODS                *
 ***************************************/
    
    public void libraryClose()
    {
        remove(library.jb2);
        remove(library.jb3);
        remove(library.jb4);
        remove(library.questionText);
        remove(library);
        validate();
        repaint();
    }
    
    public void hubClose()
    {
        remove(hub.jb2);
        remove(hub.jb3);
        remove(hub.jb4);
        remove(hub.questionText);
        remove(hub);
        validate();
        repaint();
    }
    
    public void hammondClose()
    {
        remove(hammond.jb2);
        remove(hammond.jb3);
        remove(hammond.jb4);
        remove(hammond.questionText);
        remove(hammond);
        validate();
        repaint();
    }
    
    public void thomasClose()
    {
        remove(thomas.jb2);
        remove(thomas.jb3);
        remove(thomas.jb4);
        remove(thomas.questionText);
        remove(thomas);
        validate();
        repaint();
    }
    
    public void istClose()
    {
        remove(ist.jb2);
        remove(ist.jb3);
        remove(ist.jb4);
        remove(ist.questionText);
        remove(ist);
        validate();
        repaint();
    }

    void buildingSetup()
    {
        add(jb1);
        jb1.setBounds(223,0,134,93);
        jb1.addActionListener(this);
        jb1.addMouseListener(this);
        
        add(jb2);
        jb2.setBounds(171,235,94,125);
        jb2.addActionListener(this);
        jb2.addMouseListener(this);
        
        add(jb3);
        jb3.setBounds(393,336,133,100);
        jb3.addActionListener(this);
        jb3.addMouseListener(this);
        
        add(jb4);
        jb4.setBounds(404,112,150,85);
        jb4.addActionListener(this);
        jb4.addMouseListener(this);
        
        validate();
        repaint();
    }
    
    void buildingComplete()
    {
        if (libraryComplete == true)
        {
            remove(jb1);
        }
        if (hammondComplete == true)
        {
            remove(jb2);
        }
        if (thomasComplete == true)
        {
            remove(jb4);
        }
        if (hubComplete == true)
        {
            remove(jb3);
        }
        if (libraryComplete & hammondComplete & thomasComplete & hubComplete == true)
        {
            add(jb5);
            jb5.setBounds(50,150,120,149);
            jb5.addActionListener(this);
            jb5.addMouseListener(this);
        }
        if (istComplete == true)
        {
            remove(jb5);
            remove(this);
            remove(ist.jb5);
            remove(ist);
            time.stop();
            remove(pb);
            add(stats);
            stats.multi = multiplier;
            validate();
            repaint();
        }
    }
    
//=====================================
    
    //MAP GRAPHIC
    public void paintComponent(Graphics g) 
    {
    	super.paintComponent(g);
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/map.jpg");
    	g.drawImage(myImage, 0, 0, this);
        g.setColor(Color.yellow);
    }

    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        
        if (source == jb1)
        {
            time.start();
            remove(jb1);
            remove(jb2);
            remove(jb3);
            remove(jb4);
            add(library);
            library.setBounds(140,10,340,420);
            validate();
            repaint();
        }
        if (source == jb2)
        {
            time.start();
            remove(jb1);
            remove(jb2);
            remove(jb3);
            remove(jb4);
            add(hammond);
            hammond.setBounds(140,10,340,420);
            validate();
            repaint();
        }
        if (source == jb3)
        {
            time.start();
            remove(jb1);
            remove(jb2);
            remove(jb3);
            remove(jb4);
            add(hub);
            hub.setBounds(140,10,340,420);
            
            validate();
            repaint();
        }
        if (source == jb4)
        {
            time.start();
            remove(jb1);
            remove(jb2);
            remove(jb3);
            remove(jb4);
            add(thomas);
            thomas.setBounds(140,10,340,420);
            validate();
            repaint();
        }
        if (source == jb5)
        {
            remove(jb1);
            remove(jb2);
            remove(jb3);
            remove(jb4);
            remove(jb5);
            add(ist);
            ist.setBounds(140,10,340,420);
            validate();
            repaint();
        }
        if (source == time)
        {
            i = i+1;
            pb.setValue(i);
        }
    }
    
    public void mouseEntered(MouseEvent m)
    {
        Object source = m.getSource();
        if (source == jb1)
        {
            jb1.setIcon(imageLibrary2);
        }
        else if (source == jb2)
        {
            jb2.setIcon(imageHammond2);
        }
        else if (source == jb3)
        {
            jb3.setIcon(imageHub2);
        }
        else if (source == jb4)
        {
            jb4.setIcon(imageThomas2);
        }
        else if (source == jb5)
        {
            jb5.setIcon(imageIST2);
        }
    }
    
    public void mouseExited(MouseEvent m)
    {
        Object source = m.getSource();
        if (source == jb1)
        {
            jb1.setIcon(imageLibrary);
        }
        else if (source == jb2)
        {
            jb2.setIcon(imageHammond);
        }
        else if (source == jb3)
        {
            jb3.setIcon(imageHub);
        }
        else if (source == jb4)
        {
            jb4.setIcon(imageThomas);
        }
        else if (source == jb5)
        {
            jb5.setIcon(imageIST);
        }
    }
    
    //NOT NEEDED, BUT REQUIRED
    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}

}