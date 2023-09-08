
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ATMInterface implements ActionListener
{
  TextField w_amt=new TextField();
  TextField d_amt=new TextField();
 TextField txt1=new TextField();
 JButton bt1=new JButton("Check Balance");
 JButton bt2=new JButton("Withdraw Amount");
 JButton bt3=new JButton("Deposite Amount");
  Label wl=new Label("Enter Withdraw Amount:");
  Label dl=new Label("Enter Deposite Amount:");
  Label title=new Label("WELCOME TO ATM");
 public ATMInterface() 
 {
   
 JFrame fr=new JFrame("Simple Calculation Demo");
 
 fr.setSize(2000,1000);
 fr.setLayout(null);
 fr.setVisible(true);

 fr.getContentPane().setBackground(Color.pink);

 //create font 
 Font fnt=new Font("Arial",Font.BOLD,23);
  Font fnt2=new Font("Arial",Font.BOLD,20);
 Font fl=new Font("Monospaced",Font.BOLD,50);

 Font ft=new Font("Dialog",Font.BOLD,80);
 //set display possition for controls
title.setFont(ft);
 title.setBounds(400,70,1000,60);


 bt1.setBounds(600,700,250,70);
 bt2.setBounds(800,400,250,40);
 bt3.setBounds(800,590,250,40);

  wl.setBounds(250,330,650,40);
  dl.setBounds(250,520,650,40);
  w_amt.setBounds(900,330,580,40);
 d_amt.setBounds(900,520,580,40);

w_amt.setFont(fnt2);
d_amt.setFont(fnt2);
 bt1.setFont(fnt);
 bt2.setFont(fnt);
 bt3.setFont(fnt);
 wl.setFont(fl);
 dl.setFont(fl);

txt1.setFont(fnt);


 fr.add(title);
 fr.add(wl);
 fr.add(dl);
 fr.add(w_amt);
 fr.add(d_amt);
 fr.add(txt1);
 fr.add(bt1);
 fr.add(bt2);
 fr.add(bt3);

 bt1.addActionListener(this);
 bt2.addActionListener(this);
 bt3.addActionListener(this);

 fr.addWindowListener(new WindowAdapter()
 {
 public void windowClosing(WindowEvent e)
 {
 System.exit(1);
 }
 });
 }
 // code to execute after event occure
 double availableBalance=10000;
 public void actionPerformed(ActionEvent e)
 {

 if(e.getSource()==bt1)
 {

   JFrame jf3=new JFrame("Withdraw");
   jf3.setVisible(true);
   jf3.setLayout(null);
   jf3.setSize(600,600);
   Font fg=new Font("Arial",Font.BOLD,40);

  jf3.getContentPane().setBackground(Color.lightGray);

   Label wam=new Label("Your Current Balance :- ");
   Label po=new Label("Rs."+availableBalance);
   po.setFont(fg);

      wam.setFont(fg);
      wam.setBounds(50,200,430,30);
     jf3.add(wam);
     jf3.add(po);
     po.setBounds(150,245,300,50);


 }
 else if(e.getSource()==bt2)
 {
   String s1=w_amt.getText();
   double amt=Double.parseDouble(s1);
   JFrame jf3=new JFrame("Withdraw");
   jf3.setVisible(true);
   jf3.setLayout(null);
   jf3.setSize(650,600);
   Font fg=new Font("Arial",Font.BOLD,40);

   if(amt>availableBalance)
   {
    jf3.getContentPane().setBackground(Color.red);


     Label Withdrawa=new Label("Insufficeient Balance..!");
      Withdrawa.setFont(fg);
      Withdrawa.setBounds(70,250,430,30);
      jf3.add(Withdrawa);
   }

   else
   {
    jf3.getContentPane().setBackground(Color.GREEN);
     availableBalance-=amt;
   

     Label Widrawamt=new Label("Transcantion Successful..!");
     Label curBal=new Label("Current Balance Rs"+availableBalance);
      Widrawamt.setFont(fg);
      curBal.setFont(fg);
      Widrawamt.setBounds(70,200,490,30);
      curBal.setBounds(50,250,490,30);
      jf3.add(Widrawamt);
      jf3.add(curBal);
   }

 
 }
 else if(e.getSource()==bt3)
  {
    JFrame jf3=new JFrame("Withdraw");
   jf3.setVisible(true);
   jf3.setLayout(null);
   jf3.setSize(650,600);
   Font fg=new Font("Arial",Font.BOLD,40);

    String s3=d_amt.getText();
   double amt3=Double.parseDouble(s3);
  jf3.getContentPane().setBackground(Color.yellow);

   availableBalance+=amt3;

   Label wam=new Label("Transcantion Successful..!");
   
      wam.setFont(fg);
      wam.setBounds(60,200,500,30);
     jf3.add(wam);
   
    }

  }
 public static void main(String[] arg)
 {
 ATMInterface m=new ATMInterface();
 }
}