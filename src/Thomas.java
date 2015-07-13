import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Thomas extends JPanel implements ActionListener
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
    
    public Thomas(Map inf_map, questionBank inf_questions) 
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
           question = questions.q24.question;
           answerA = questions.q24.answer1;
           answerB = questions.q24.answer2;
           answerC = questions.q24.answer3;
           num = questions.q24.num;
        }
        if (myNumber == 1)
        {
           question = questions.q25.question;
           answerA = questions.q25.answer1;
           answerB = questions.q25.answer2;
           answerC = questions.q25.answer3;
           num = questions.q25.num;
        }
        if (myNumber == 2)
        {
           question = questions.q26.question;
           answerA = questions.q26.answer1;
           answerB = questions.q26.answer2;
           answerC = questions.q26.answer3;
           num = questions.q26.num;
        }
        if (myNumber == 3)
        {
           question = questions.q27.question;
           answerA = questions.q27.answer1;
           answerB = questions.q27.answer2;
           answerC = questions.q27.answer3;
           num = questions.q27.num;
        }
        if (myNumber == 4)
        {
           question = questions.q28.question;
           answerA = questions.q28.answer1;
           answerB = questions.q28.answer2;
           answerC = questions.q28.answer3;
           num = questions.q28.num;
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
                    map.thomasComplete = true;
                    map.buildingSetup();
                    map.buildingComplete();
                    map.thomasClose();
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
           question = questions.q29.question;
           answerA = questions.q29.answer1;
           answerB = questions.q29.answer2;
           answerC = questions.q29.answer3;
           num = questions.q29.num;
        }
        if (myNumber == 1)
        {
           question = questions.q30.question;
           answerA = questions.q30.answer1;
           answerB = questions.q30.answer2;
           answerC = questions.q30.answer3;
           num = questions.q30.num;
        }
        if (myNumber == 2)
        {
           question = questions.q31.question;
           answerA = questions.q31.answer1;
           answerB = questions.q31.answer2;
           answerC = questions.q31.answer3;
           num = questions.q31.num;
        }
        if (myNumber == 3)
        {
           question = questions.q32.question;
           answerA = questions.q32.answer1;
           answerB = questions.q32.answer2;
           answerC = questions.q32.answer3;
           num = questions.q32.num;
        }
        if (myNumber == 4)
        {
           question = questions.q33.question;
           answerA = questions.q33.answer1;
           answerB = questions.q33.answer2;
           answerC = questions.q33.answer3;
           num = questions.q33.num;
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
                    map.thomasComplete = true;
                    map.buildingSetup();
                    map.buildingComplete();
                    map.thomasClose();
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
           question = questions.q34.question;
           answerA = questions.q34.answer1;
           answerB = questions.q34.answer2;
           answerC = questions.q34.answer3;
           num = questions.q34.num;
        }
        if (myNumber == 1)
        {
           question = questions.q35.question;
           answerA = questions.q35.answer1;
           answerB = questions.q35.answer2;
           answerC = questions.q35.answer3;
           num = questions.q35.num;
        }
        if (myNumber == 2)
        {
           question = questions.q36.question;
           answerA = questions.q36.answer1;
           answerB = questions.q36.answer2;
           answerC = questions.q36.answer3;
           num = questions.q36.num;
        }
        if (myNumber == 3)
        {
           question = questions.q37.question;
           answerA = questions.q37.answer1;
           answerB = questions.q37.answer2;
           answerC = questions.q37.answer3;
           num = questions.q37.num;
        }
        if (myNumber == 4)
        {
           question = questions.q38.question;
           answerA = questions.q38.answer1;
           answerB = questions.q38.answer2;
           answerC = questions.q38.answer3;
           num = questions.q38.num;
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
                    map.thomasComplete = true;
                    map.buildingSetup();
                    map.buildingComplete();
                    map.thomasClose();
                    validate();
                    repaint();
            }
    }
    public void paintComponent(Graphics g) 
    {
    	super.paintComponent(g);
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/thomasBig.jpg");
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
                    map.multiplier = 1;
                    questionFormEasy();
                }
             }
            if (map.diff.difficultySet.equals("medium")) 
            {
                if (closeWindow < 3)
                {
                    map.multiplier = 2;
                    questionFormMedium();
                }
            }
            if (map.diff.difficultySet.equals("hard")) 
            {
                if (closeWindow < 3)
                {
                    map.multiplier = 3;
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