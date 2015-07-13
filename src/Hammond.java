import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Hammond extends JPanel implements ActionListener
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
    
    public Hammond(Map inf_map, questionBank inf_questions) 
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
           question = questions.q1.question;
           answerA = questions.q1.answer1;
           answerB = questions.q1.answer2;
           answerC = questions.q1.answer3;
           num = questions.q1.num;
        }
        if (myNumber == 1)
        {
           question = questions.q2.question;
           answerA = questions.q2.answer1;
           answerB = questions.q2.answer2;
           answerC = questions.q2.answer3;
           num = questions.q2.num;
        }
        if (myNumber == 2)
        {
           question = questions.q3.question;
           answerA = questions.q3.answer1;
           answerB = questions.q3.answer2;
           answerC = questions.q3.answer3;
           num = questions.q3.num;
        }
        if (myNumber == 3)
        {
           question = questions.q4.question;
           answerA = questions.q4.answer1;
           answerB = questions.q4.answer2;
           answerC = questions.q4.answer3;
           num = questions.q4.num;
        }
        if (myNumber == 4)
        {
           question = questions.q5.question;
           answerA = questions.q5.answer1;
           answerB = questions.q5.answer2;
           answerC = questions.q5.answer3;
           num = questions.q5.num;
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
                    map.hammondComplete = true;
                    map.buildingSetup();
                    map.buildingComplete();
                    map.hammondClose();
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
           question = questions.q14.question;
           answerA = questions.q14.answer1;
           answerB = questions.q14.answer2;
           answerC = questions.q14.answer3;
           num = questions.q14.num;
        }
        if (myNumber == 1)
        {
           question = questions.q15.question;
           answerA = questions.q15.answer1;
           answerB = questions.q15.answer2;
           answerC = questions.q15.answer3;
           num = questions.q15.num;
        }
        if (myNumber == 2)
        {
           question = questions.q16.question;
           answerA = questions.q16.answer1;
           answerB = questions.q16.answer2;
           answerC = questions.q16.answer3;
           num = questions.q16.num;
        }
        if (myNumber == 3)
        {
           question = questions.q17.question;
           answerA = questions.q17.answer1;
           answerB = questions.q17.answer2;
           answerC = questions.q17.answer3;
           num = questions.q17.num;
        }
        if (myNumber == 4)
        {
           question = questions.q18.question;
           answerA = questions.q18.answer1;
           answerB = questions.q18.answer2;
           answerC = questions.q18.answer3;
           num = questions.q18.num;
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
                    map.hammondComplete = true;
                    map.buildingSetup();
                    map.buildingComplete();
                    map.hammondClose();
                    validate();
                    repaint();
            }
    }
    
    void questionFormHard()
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
           question = questions.q19.question;
           answerA = questions.q19.answer1;
           answerB = questions.q19.answer2;
           answerC = questions.q19.answer3;
           num = questions.q19.num;
        }
        if (myNumber == 1)
        {
           question = questions.q20.question;
           answerA = questions.q20.answer1;
           answerB = questions.q20.answer2;
           answerC = questions.q20.answer3;
           num = questions.q20.num;
        }
        if (myNumber == 2)
        {
           question = questions.q21.question;
           answerA = questions.q21.answer1;
           answerB = questions.q21.answer2;
           answerC = questions.q21.answer3;
           num = questions.q21.num;
        }
        if (myNumber == 3)
        {
           question = questions.q22.question;
           answerA = questions.q22.answer1;
           answerB = questions.q22.answer2;
           answerC = questions.q22.answer3;
           num = questions.q22.num;
        }
        if (myNumber == 4)
        {
           question = questions.q23.question;
           answerA = questions.q23.answer1;
           answerB = questions.q23.answer2;
           answerC = questions.q23.answer3;
           num = questions.q23.num;
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
                    map.hammondComplete = true;
                    map.buildingSetup();
                    map.buildingComplete();
                    map.hammondClose();
                    validate();
                    repaint();
            }
    }
    
    public void paintComponent(Graphics g) 
    {
    	super.paintComponent(g);
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/hammondBig.jpg");
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