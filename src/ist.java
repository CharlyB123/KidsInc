import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ist extends JPanel implements ActionListener
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
    
    public ist(Map inf_map, questionBank inf_questions) 
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
        int myNumber = (int) (r * 7);
        String question = new String();
        String answerA = new String();
        String answerB = new String();
        String answerC = new String();
        
        if (myNumber == 0)
        {
           question = questions.q53.question;
           answerA = questions.q53.answer1;
           answerB = questions.q53.answer2;
           answerC = questions.q53.answer3;
           num = questions.q53.num;
        }
        if (myNumber == 1)
        {
           question = questions.q54.question;
           answerA = questions.q54.answer1;
           answerB = questions.q54.answer2;
           answerC = questions.q54.answer3;
           num = questions.q54.num;
        }
        if (myNumber == 2)
        {
           question = questions.q55.question;
           answerA = questions.q55.answer1;
           answerB = questions.q55.answer2;
           answerC = questions.q55.answer3;
           num = questions.q55.num;
        }
        if (myNumber == 3)
        {
           question = questions.q56.question;
           answerA = questions.q56.answer1;
           answerB = questions.q56.answer2;
           answerC = questions.q56.answer3;
           num = questions.q56.num;
        }
        if (myNumber == 4)
        {
           question = questions.q57.question;
           answerA = questions.q57.answer1;
           answerB = questions.q57.answer2;
           answerC = questions.q57.answer3;
           num = questions.q57.num;
        }
        if (myNumber == 5)
        {
           question = questions.q58.question;
           answerA = questions.q58.answer1;
           answerB = questions.q58.answer2;
           answerC = questions.q58.answer3;
           num = questions.q58.num;
        }
        if (myNumber == 6)
        {
           question = questions.q59.question;
           answerA = questions.q59.answer1;
           answerB = questions.q59.answer2;
           answerC = questions.q59.answer3;
           num = questions.q59.num;
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
            map.istComplete = true;
            map.buildingSetup();
            map.buildingComplete();
            map.istClose();
            validate();
            repaint();
        }
    }
    
    void questionFormMedium()
    {
        //RANDOM QUESTION CALCULATION
        double r = Math.random();
        int myNumber = (int) (r * 10);
        String question = new String();
        String answerA = new String();
        String answerB = new String();
        String answerC = new String();
        
        if (myNumber == 0)
        {
           question = questions.q53.question;
           answerA = questions.q53.answer1;
           answerB = questions.q53.answer2;
           answerC = questions.q53.answer3;
           num = questions.q53.num;
        }
        if (myNumber == 1)
        {
           question = questions.q54.question;
           answerA = questions.q54.answer1;
           answerB = questions.q54.answer2;
           answerC = questions.q54.answer3;
           num = questions.q54.num;
        }
        if (myNumber == 2)
        {
           question = questions.q55.question;
           answerA = questions.q55.answer1;
           answerB = questions.q55.answer2;
           answerC = questions.q55.answer3;
           num = questions.q55.num;
        }
        if (myNumber == 3)
        {
           question = questions.q56.question;
           answerA = questions.q56.answer1;
           answerB = questions.q56.answer2;
           answerC = questions.q56.answer3;
           num = questions.q56.num;
        }
        if (myNumber == 4)
        {
           question = questions.q57.question;
           answerA = questions.q57.answer1;
           answerB = questions.q57.answer2;
           answerC = questions.q57.answer3;
           num = questions.q57.num;
        }
        if (myNumber == 5)
        {
           question = questions.q58.question;
           answerA = questions.q58.answer1;
           answerB = questions.q58.answer2;
           answerC = questions.q58.answer3;
           num = questions.q58.num;
        }
        if (myNumber == 6)
        {
           question = questions.q59.question;
           answerA = questions.q59.answer1;
           answerB = questions.q59.answer2;
           answerC = questions.q59.answer3;
           num = questions.q59.num;
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
            map.istComplete = true;
            map.buildingSetup();
            map.buildingComplete();
            map.istClose();
            validate();
            repaint();
        }
    }
    
    void questionFormHard()
    {
        //RANDOM QUESTION CALCULATION
        double r = Math.random();
        int myNumber = (int) (r * 10);
        String question = new String();
        String answerA = new String();
        String answerB = new String();
        String answerC = new String();
        
        if (myNumber == 0)
        {
           question = questions.q53.question;
           answerA = questions.q53.answer1;
           answerB = questions.q53.answer2;
           answerC = questions.q53.answer3;
           num = questions.q53.num;
        }
        if (myNumber == 1)
        {
           question = questions.q54.question;
           answerA = questions.q54.answer1;
           answerB = questions.q54.answer2;
           answerC = questions.q54.answer3;
           num = questions.q54.num;
        }
        if (myNumber == 2)
        {
           question = questions.q55.question;
           answerA = questions.q55.answer1;
           answerB = questions.q55.answer2;
           answerC = questions.q55.answer3;
           num = questions.q55.num;
        }
        if (myNumber == 3)
        {
           question = questions.q56.question;
           answerA = questions.q56.answer1;
           answerB = questions.q56.answer2;
           answerC = questions.q56.answer3;
           num = questions.q56.num;
        }
        if (myNumber == 4)
        {
           question = questions.q57.question;
           answerA = questions.q57.answer1;
           answerB = questions.q57.answer2;
           answerC = questions.q57.answer3;
           num = questions.q57.num;
        }
        if (myNumber == 5)
        {
           question = questions.q58.question;
           answerA = questions.q58.answer1;
           answerB = questions.q58.answer2;
           answerC = questions.q58.answer3;
           num = questions.q58.num;
        }
        if (myNumber == 6)
        {
           question = questions.q59.question;
           answerA = questions.q59.answer1;
           answerB = questions.q59.answer2;
           answerC = questions.q59.answer3;
           num = questions.q59.num;
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
            map.istComplete = true;
            map.buildingSetup();
            map.buildingComplete();
            map.istClose();
            validate();
            repaint();
        }
    }
    
    public void paintComponent(Graphics g) 
    {
    	super.paintComponent(g);
    	Image myImage = Toolkit.getDefaultToolkit().getImage("images/istBig.jpg");
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