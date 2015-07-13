import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Hub extends JPanel implements ActionListener
{
    Map map;
    questionBank questions;
    Difficulty diff; 
    JButton jb1 = new JButton("Begin");
    JButton jb2,jb3,jb4;
    JButton jb5 = new JButton("Next Question");
    JTextArea questionText;
    int closeWindow = 0;
    int num = 0;
    
    public Hub(Map inf_map, questionBank inf_questions) 
    {
        super();
        map = inf_map;
        questions = inf_questions;
        diff = map.diff;
        
        setBackground(Color.blue);
        setLayout(null);
        setBounds(0, 0, 640, 441);
        
        add(jb1);
        jb1.setBounds(110,190,120,40);
        jb1.setBackground(Color.white);
        jb1.addActionListener(this);
        
        jb5.setBounds(110,250,120,40);
        jb5.setBackground(Color.white);
        jb5.addActionListener(this);
    }
    
/****************************************
 *               METHODS                *
 ***************************************/
    
    void questionFormEasy()
    {
        //RANDOM QUESTION CALCULATION
        double r = Math.random();
        int myNumber = (int) (r * 5);
        String question = new String();
        String answerA = new String();
        String answerB = new String();
        String answerC = new String();
        
        if (myNumber == 0)
        {
           question = questions.q39.question;
           answerA = questions.q39.answer1;
           answerB = questions.q39.answer2;
           answerC = questions.q39.answer3;
           num = questions.q39.num;
        }
        if (myNumber == 1)
        {
           question = questions.q40.question;
           answerA = questions.q40.answer1;
           answerB = questions.q40.answer2;
           answerC = questions.q40.answer3;
           num = questions.q40.num;
        }
        if (myNumber == 2)
        {
           question = questions.q41.question;
           answerA = questions.q41.answer1;
           answerB = questions.q41.answer2;
           answerC = questions.q41.answer3;
           num = questions.q41.num;
        }
        if (myNumber == 3)
        {
           question = questions.q42.question;
           answerA = questions.q42.answer1;
           answerB = questions.q42.answer2;
           answerC = questions.q42.answer3;
           num = questions.q42.num;
        }
        if (myNumber == 4)
        {
           question = questions.q43.question;
           answerA = questions.q43.answer1;
           answerB = questions.q43.answer2;
           answerC = questions.q43.answer3;
           num = questions.q43.num;
        }
        
        
        //TEXT
        questionText = new JTextArea("Question:\n" + question + "\n\nPossible Answers:" + "\nA: " + answerA + "\nB: " + answerB + "\nC: " + answerC);
        add(questionText);
        questionText.setBounds(20,20,300,175);
        questionText.setLineWrap(true);
                
        //BUTTONS
        jb2 = new JButton("A");
        add(jb2);
        jb2.setBounds(60,250,50,50);
        jb2.addActionListener(this);
                
        jb3 = new JButton("B");
        add(jb3);
        jb3.setBounds(150,250,50,50);
        jb3.addActionListener(this);
                
        jb4 = new JButton("C");
        add(jb4);
        jb4.setBounds(240,250,50,50);
        jb4.addActionListener(this);
        validate();
        repaint();
    
        closeWindow++; //adds 1 tick to panel close counter
        if (closeWindow > 3)
            {
                    map.hubComplete = true;
                    map.buildingSetup();
                    map.buildingComplete();
                    map.hubClose();
                    validate();
                    repaint();
            }
    }
    
    void questionFormMedium()
    {
       //RANDOM QUESTION CALCULATION
        double r = Math.random();
        int myNumber = (int) (r * 5);
        String question = new String();
        String answerA = new String();
        String answerB = new String();
        String answerC = new String();
        
        if (myNumber == 0)
        {
           question = questions.q44.question;
           answerA = questions.q44.answer1;
           answerB = questions.q44.answer2;
           answerC = questions.q44.answer3;
           num = questions.q44.num;
        }
        if (myNumber == 1)
        {
           question = questions.q45.question;
           answerA = questions.q45.answer1;
           answerB = questions.q45.answer2;
           answerC = questions.q45.answer3;
           num = questions.q45.num;
        }
        if (myNumber == 2)
        {
           question = questions.q46.question;
           answerA = questions.q46.answer1;
           answerB = questions.q46.answer2;
           answerC = questions.q46.answer3;
           num = questions.q46.num;
        }
        if (myNumber == 3)
        {
           question = questions.q47.question;
           answerA = questions.q47.answer1;
           answerB = questions.q47.answer2;
           answerC = questions.q47.answer3;
           num = questions.q47.num;
        }
        if (myNumber == 4)
        {
           question = questions.q48.question;
           answerA = questions.q48.answer1;
           answerB = questions.q48.answer2;
           answerC = questions.q48.answer3;
           num = questions.q48.num;
        }  
                //TEXT
        questionText = new JTextArea("Question:\n" + question + "\n\nPossible Answers:" + "\nA: " + answerA + "\nB: " + answerB + "\nC: " + answerC);
        add(questionText);
        questionText.setBounds(20,20,300,175);
        questionText.setLineWrap(true);
                
        //BUTTONS
        jb2 = new JButton("A");
        add(jb2);
        jb2.setBounds(60,250,50,50);
        jb2.addActionListener(this);
                
        jb3 = new JButton("B");
        add(jb3);
        jb3.setBounds(150,250,50,50);
        jb3.addActionListener(this);
                
        jb4 = new JButton("C");
        add(jb4);
        jb4.setBounds(240,250,50,50);
        jb4.addActionListener(this);
        validate();
        repaint();
        
        closeWindow++; //adds 1 tick to panel close counter
        if (closeWindow > 3)
            {
                    map.hubComplete = true;
                    map.buildingSetup();
                    map.buildingComplete();
                    map.hubClose();
                    validate();
                    repaint();
            }
    }
    
    void questionFormHard()
    {               //RANDOM QUESTION CALCULATION
        double r = Math.random();
        int myNumber = (int) (r * 5);
        String question = new String();
        String answerA = new String();
        String answerB = new String();
        String answerC = new String();
        
        if (myNumber == 0)
        {
           question = questions.q49.question;
           answerA = questions.q49.answer1;
           answerB = questions.q49.answer2;
           answerC = questions.q49.answer3;
           num = questions.q49.num;
        }
        if (myNumber == 1)
        {
           question = questions.q50.question;
           answerA = questions.q50.answer1;
           answerB = questions.q50.answer2;
           answerC = questions.q50.answer3;
           num = questions.q50.num;
        }
        if (myNumber == 2)
        {
           question = questions.q51.question;
           answerA = questions.q51.answer1;
           answerB = questions.q51.answer2;
           answerC = questions.q51.answer3;
           num = questions.q51.num;
        }
        if (myNumber == 3)
        {
           question = questions.q52.question;
           answerA = questions.q52.answer1;
           answerB = questions.q52.answer2;
           answerC = questions.q52.answer3;
           num = questions.q52.num;
        }
        if (myNumber == 4)
        {
           question = questions.q53.question;
           answerA = questions.q53.answer1;
           answerB = questions.q53.answer2;
           answerC = questions.q53.answer3;
           num = questions.q53.num;
        }  
                        //TEXT
        questionText = new JTextArea("Question:\n" + question + "\n\nPossible Answers:" + "\nA: " + answerA + "\nB: " + answerB + "\nC: " + answerC);
        add(questionText);
        questionText.setBounds(20,20,300,175);
        questionText.setLineWrap(true);
                
        //BUTTONS
        jb2 = new JButton("A");
        add(jb2);
        jb2.setBounds(60,250,50,50);
        jb2.addActionListener(this);
                
        jb3 = new JButton("B");
        add(jb3);
        jb3.setBounds(150,250,50,50);
        jb3.addActionListener(this);
                
        jb4 = new JButton("C");
        add(jb4);
        jb4.setBounds(240,250,50,50);
        jb4.addActionListener(this);
        validate();
        repaint();
        
        closeWindow++; //adds 1 tick to panel close counter
        if (closeWindow > 3)
            {
                    map.hubComplete = true;
                    map.buildingSetup();
                    map.buildingComplete();
                    map.hubClose();
                    validate();
                    repaint();
            }
    }
    
    public void paintComponent(Graphics g) 
    {
    	super.paintComponent(g);
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/hubBig.jpg");
    	g.drawImage(myImage, 0, 0,340,420, this);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        Object source = e.getSource();
        //BEGIN QUESTIONS
        if (source == jb1)
        {
            remove(jb1);
            if (map.diff.difficultySet.equals("easy")) 
            {
                if (closeWindow < 3)
                {
                    questionFormEasy();
                }
                
             }
            if (map.diff.difficultySet.equals("medium")) 
            {
                if (closeWindow < 3)
                {
                    questionFormMedium();
                }

            }
            if (map.diff.difficultySet.equals("hard")) 
            {
                if (closeWindow < 3)
                {
                    questionFormHard();
                }
            }
        }
        if (source == jb2) //A
        {
            if(num == 1)
            {
                questionText.setText("Answer A was correct.");
                remove(jb2);
                remove(jb3);
                remove(jb4);
                add(jb5);
                map.scorePoints = map.scorePoints + 30;
                validate();
                repaint();
                
            }
            else
            {
                questionText.setText("Answer A was incorrect.");
                remove(jb2);
                remove(jb3);
                remove(jb4);
                add(jb5);
                validate();
                repaint();
            }
        }
        if (source == jb3) //B
        {
            if(num == 2)
            {
                questionText.setText("Answer B was correct.");
                remove(jb2);
                remove(jb3);
                remove(jb4);
                add(jb5);
                map.scorePoints = map.scorePoints + 30;
                validate();
                repaint();
            }
            else
            {
                questionText.setText("Answer B was incorrect.");
                remove(jb2);
                remove(jb3);
                remove(jb4);
                add(jb5);
                validate();
                repaint();
            }
        }
        if (source == jb4) //C
        {
            if(num == 3)
            {
                questionText.setText("Answer C was correct.");
                remove(jb2);
                remove(jb3);
                remove(jb4);
                add(jb5);
                map.scorePoints = map.scorePoints + 30;
                validate();
                repaint();
            }
            else
            {
                questionText.setText("Answer C was incorrect.");
                remove(jb2);
                remove(jb3);
                remove(jb4);
                add(jb5);
                validate();
                repaint();
            }
        }
        if (source == jb5)
        {
            if (map.diff.difficultySet.equals("easy")) 
            {
                remove(jb5);
                remove(questionText);
                questionFormEasy();
                validate();
                repaint();
            }
            if (map.diff.difficultySet.equals("medium")) 
            {
                remove(jb5);
                remove(questionText);
                questionFormMedium();
                validate();
                repaint();
            }
            if (map.diff.difficultySet.equals("hard")) 
            {
                remove(jb5);
                remove(questionText);
                questionFormHard();
                validate();
                repaint();
            }
        }
    }
}