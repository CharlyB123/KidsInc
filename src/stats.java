import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class stats extends JPanel implements ActionListener
{
    Map map;
    int scorePoints = 0;
    int tLeft = 0;
    int multi = 0;
    int fScore = 0;
    JButton calcScore = new JButton("Calculate Your Score");
    JTextArea questScore = new JTextArea();
    JTextArea timeLeft = new JTextArea();
    JTextArea multiplier = new JTextArea();
    JTextArea finalScore = new JTextArea();
    Font myFont = new Font("Arial", Font.BOLD, 18);
    
//====================================
    
    public stats(Map inf_map)
    {
        super();
        setBackground(Color.white);
        setBounds(0,0,640,441);
        setLayout(null);
        map = inf_map;
        add(calcScore);
        calcScore.setBounds(240,100,180,40);
        calcScore.setBackground(Color.white);
        calcScore.addActionListener(this);
        questScore.setBounds(280, 150, 80, 20);
        questScore.setText(" " + scorePoints);
        questScore.setFont(myFont);
        add(questScore);
        timeLeft.setBounds(280, 177, 80, 20);
        timeLeft.setText(" " + tLeft);
        timeLeft.setFont(myFont);
        add(timeLeft);
        multiplier.setBounds(280, 203, 80, 20);
        multiplier.setText(" " + multi);
        multiplier.setFont(myFont);
        add(multiplier);
        finalScore.setBounds(280, 278, 80, 20);
        finalScore.setText(" " + fScore);
        finalScore.setFont(myFont);
        add(finalScore);
    }
    
/****************************************
 *               METHODS                *
 ***************************************/
    
    //SCORESCREEN GRAPHIC
    public void paintComponent(Graphics g) 
    {
    	super.paintComponent(g);
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/scorescreen.jpg");
    	g.drawImage(myImage, 0, 0, this);
        g.setColor(Color.yellow);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source == calcScore)
        {
            scorePoints = map.scorePoints;
            tLeft = (map.timeLeft - map.i);
            multi = map.multiplier;
            fScore = (scorePoints + tLeft) * multi;
            questScore.setText(" " + scorePoints);
            timeLeft.setText(" " + tLeft);
            multiplier.setText(" " + multi);
            finalScore.setText(" " + fScore);
            validate();
            repaint();
        }
          
    }
}
