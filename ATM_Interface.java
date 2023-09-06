import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ATM_Interface implements ActionListener
{
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();

    JButton b1=new JButton("Check balance...");
    JButton b2=new JButton("Withdraw Amount...");
    JButton b3=new JButton("Deposite Amount...");

    Label l1=new Label("Enter withdraw amount");
    Label l2=new Label("Enter Deposite amount");
    Label title=new Label("WELCOME TO ATM...!!");

    public ATM_Interface()
    {
        JFrame fr=new JFrame("Simple Calculation demo");

        fr.setSize(1000,900);
        fr.setLayout(null);
        fr.setVisible(true);

        fr.getContentPane().setBackground(Color.gray);

        //Set font...
        Font ft1=new Font("Arial",Font.BOLD,20);
        Font ft2=new Font("Monospaced",Font.BOLD,30);
        Font ft3=new Font("Dialog",Font.BOLD,60);

        //Display possition on console...
        title.setFont(ft3);
        title.setBounds(150,70,650,60);

        b1.setBounds(350,220,220,37);
        b2.setBounds(430,430,220,37);
        b3.setBounds(430,620,220,37);

        l1.setFont(ft2);
        l1.setBounds(70,320,400,30);
        l2.setFont(ft2);
        l2.setBounds(70,510,400,30);
        t1.setBounds(430,350,320,40);
        t2.setBounds(430,540,320,40);

        b1.setFont(ft1);
        b2.setFont(ft1);
        b3.setFont(ft1);

        t1.setFont(ft2);
        t2.setFont(ft2);
        t3.setFont(ft1);

        fr.add(title);

        fr.add(l1);
        fr.add(l2);

        fr.add(t1);
        fr.add(t2);
        fr.add(t3);

        fr.add(b1);
        fr.add(b2);
        fr.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        fr.addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowEvent e)
            {
                System.exit(1);
            }
        });
    }
    //code to execute after occure event
    double availableBalance=10000;

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
          JFrame jf1=new JFrame("Withdraw");
          jf1.setVisible(true);
          jf1.setLayout(null);
          jf1.setSize(500,300);

          Font fg=new Font("Arial",Font.BOLD,35);

          jf1.getContentPane().setBackground(Color.orange);

          Label lbl1=new Label("Your Current Balance=");
          Label lbl2=new Label("Rs."+availableBalance);
           
          lbl1.setFont(fg);
           lbl2.setFont(fg);
  
          jf1.add(lbl1);
          jf1.add(lbl2);

          lbl1.setBounds(30,100,430,30);
          lbl2.setBounds(150,145,200,50);


        }
        else if(e.getSource()==b2)
        {
            String s1=t1.getText();
            double amt=Double.parseDouble(s1);
            JFrame jf1=new JFrame("Withdraw");
            jf1.setVisible(true);
            jf1.setLayout(null);
            jf1.setSize(500,300);
  
            Font fg=new Font("Arial",Font.BOLD,35);

            if(amt>availableBalance)
            {
               jf1.getContentPane().setBackground(Color.RED);
  
                Label lbl2=new Label("Insufficeient Balance");

                lbl2.setFont(fg);
                lbl2.setBounds(30,100,430,30);
                jf1.add(lbl2);
            }
            else
            {
                jf1.getContentPane().setBackground(Color.cyan);
                availableBalance-=amt;

                Label WidrawAmt=new Label("Transcantion Successfui...!");
                Label curBal=new Label("Current Balance Rs"+availableBalance);
                WidrawAmt.setFont(fg);
                curBal.setFont(fg);
                WidrawAmt.setBounds(10,100,460,30);
                curBal.setBounds(10,150,470,30);
                jf1.add(WidrawAmt);
                jf1.add(curBal);
            }
        }
        else if(e.getSource()==b3)
        {
            JFrame jf1=new JFrame("Withdraw");
            jf1.setVisible(true);
            jf1.setLayout(null);
            jf1.setSize(500,300);
            Font fg=new Font("Arial",Font.BOLD,35);

            String s3=t2.getText();
            double amt3=Double.parseDouble(s3);
            jf1.getContentPane().setBackground(Color.GREEN);

            availableBalance+=amt3;

            Label lbl1=new Label("Transcantion Successful...");

            lbl1.setFont(fg);
            lbl1.setBounds(10,100,450,30);
            jf1.add(lbl1);
        }
    }
    public static void main(String []args)
    {
        ATM_Interface m=new ATM_Interface();
    }
}
