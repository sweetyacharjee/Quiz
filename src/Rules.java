
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules  extends JFrame implements ActionListener{


    String name;
    JButton Start ,back;
    Rules(String name){
        

        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        
        JLabel heading=new JLabel ("Welcome "+name+" to Simple Minds ");
        heading .setBounds(70,20,700,30);
        heading.setFont(new Font ("Monogolian Baiti",Font.BOLD , 25));
        heading.setForeground(new Color(30,144,254));
        add(  heading);

        JLabel rules=new JLabel ();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font ("Tahoma",Font.PLAIN , 16));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. The quiz consists of multiple-choice, true/false, or short-answer questions." + "<br><br>" +
                "3. Each quiz has a set number of questions and a time limit for completion." + "<br><br>" +
                "4. Participants must complete the quiz independently without assistance from others." + "<br><br>" +
                "5. Use of external resources (books, internet, etc.) is prohibited unless explicitly allowed." + "<br><br>" +
                "6. Participants are allowed only one attempt per quiz unless otherwise specified." + "<br><br>" +
                "7. Multiple attempts using different accounts are not permitted." + "<br><br>" +
                "8. In case of technical issues, participants should immediately contact support." + "<br><br>" +
            "<html>"
        );
        add( rules);
        
    

        back =new JButton ("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        Start =new JButton ("Start");
        Start.setBounds(400,500,100,30);
        Start.setBackground(new Color(30,144,254));
        Start.setForeground(Color.white);
        Start.addActionListener(this);
        add(Start);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== Start){
            setVisible(false);
           new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){
         new Rules ("User");

    }
}
