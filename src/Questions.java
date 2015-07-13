import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Questions 
{
    String question;
    String answer1;
    String answer2;
    String answer3;
    int num;
    
//=====================================

    public Questions(String inf_question, String inf_answer1, String inf_answer2, String inf_answer3, int inf_num)
    {
        question = inf_question;
        answer1 = inf_answer1;
        answer2 = inf_answer2;
        answer3 = inf_answer3;
        num = inf_num;
    }
    
    //=====================================
    
    String correct()
    {
       return "Correct!\nAdd 2 points!!!";
    }
    
    String wrong()
    {
       return "Incorrect, better luck next quesiton";
    }
}