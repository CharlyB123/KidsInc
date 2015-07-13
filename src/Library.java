import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Library extends JPanel implements ActionListener
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
    
    public Library(Map inf_map, questionBank inf_questions) 
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
                    map.libraryComplete = true;
                    map.buildingSetup();
                    map.buildingComplete();
                    map.libraryClose();
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
           question = questions.q6.question;
           answerA = questions.q6.answer1;
           answerB = questions.q6.answer2;
           answerC = questions.q6.answer3;
           num = questions.q6.num;
        }
        if (myNumber == 1)
        {
           question = questions.q7.question;
           answerA = questions.q7.answer1;
           answerB = questions.q7.answer2;
           answerC = questions.q7.answer3;
           num = questions.q7.num;
        }
        if (myNumber == 2)
        {
           question = questions.q8.question;
           answerA = questions.q8.answer1;
           answerB = questions.q8.answer2;
           answerC = questions.q8.answer3;
           num = questions.q8.num;
        }
        if (myNumber == 3)
        {
           question = questions.q8.question;
           answerA = questions.q8.answer1;
           answerB = questions.q8.answer2;
           answerC = questions.q8.answer3;
           num = questions.q8.num;
        }
        if (myNumber == 4)
        {
           question = questions.q9.question;
           answerA = questions.q9.answer1;
           answerB = questions.q9.answer2;
           answerC = questions.q9.answer3;
           num = questions.q9.num;
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
                    map.libraryComplete = true;
                    map.buildingSetup();
                    map.buildingComplete();
                    map.libraryClose();
                    validate();
                    repaint();
            }
    
    }
    
    void questionFormHard()
    {                //RANDOM QUESTION CALCULATION
        double r = Math.random();
        int myNumber = (int) (r * 5);
        String question = new String();
        String answerA = new String();
        String answerB = new String();
        String answerC = new String();
        
        if (myNumber == 0)
        {
           question = questions.q10.question;
           answerA = questions.q10.answer1;
           answerB = questions.q10.answer2;
           answerC = questions.q10.answer3;
           num = questions.q10.num;
        }
        if (myNumber == 1)
        {
           question = questions.q11.question;
           answerA = questions.q11.answer1;
           answerB = questions.q11.answer2;
           answerC = questions.q11.answer3;
           num = questions.q11.num;
        }
        if (myNumber == 2)
        {
           question = questions.q12.question;
           answerA = questions.q12.answer1;
           answerB = questions.q12.answer2;
           answerC = questions.q12.answer3;
           num = questions.q12.num;
        }
        if (myNumber == 3)
        {
           question = questions.q12.question;
           answerA = questions.q12.answer1;
           answerB = questions.q12.answer2;
           answerC = questions.q12.answer3;
           num = questions.q12.num;
        }
        if (myNumber == 4)
        {
           question = questions.q13.question;
           answerA = questions.q13.answer1;
           answerB = questions.q13.answer2;
           answerC = questions.q13.answer3;
           num = questions.q13.num;
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
                    map.libraryComplete = true;
                    map.buildingSetup();
                    map.buildingComplete();
                    map.libraryClose();
                    validate();
                    repaint();
            }
    }
    
    
    public void paintComponent(Graphics g) 
    {
    	super.paintComponent(g);
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/libraryBig.jpg");
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

