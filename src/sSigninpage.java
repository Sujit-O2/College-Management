import java.awt.Choice;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class sSigninpage extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l6,l7,l8,l9,l11;
    JTextField t1,t2,t9,t6;
    JPasswordField p1,p2;
    Choice j1;
    JButton b1,b2;

    JRadioButton r1,r2;
    sSigninpage(){
        setLayout(null);
        l1=new JLabel("NAME :");
        l2=new JLabel("REG NO :");
        l3=new JLabel("GENDER :");
        l4=new JLabel("COURSE & BRANCH:");
        
        l6=new JLabel("12th MARK(%) :");
        l7=new JLabel("PASSWORD ;");
        l8=new JLabel("RE ENTER PASSWORD :");
        l9= new JLabel("ADDRESS :");

        r1=new JRadioButton("male");
        r2=new JRadioButton("female");
        b1=new JButton("back");
        b2=new JButton("submit");

        t1= new JTextField(null);
        t2= new JTextField(null);
        t6= new JTextField(null);
        t9= new JTextField(null);
       p1=new JPasswordField(null);
       p2=new JPasswordField(null);
       j1=new Choice();
       j1.add("B.TECH - CSE");
       j1.add("B.TECH - CST");
       j1.add("B.TECH - CE");
       j1.add("B.TECH - ME");
       j1.add("B.TECH - EE");
       j1.add("M.TECH-CSE");
       j1.add("M.TECH-CST");
       j1.add("M.TECH-THERMAL");
       j1.add("MBA");
       j1.add("MCA");
       j1.add("MAC");

       

      

      
       l11=new JLabel("Welcome to you student");
       l11.setFont(new Font("",30,30));
       l11.setBounds(160,20,400,40);
       l1.setBounds(100,100,200,25);
       t1.setBounds(400,100,200,25);
       l2.setBounds(100,160,200,25);
       t2.setBounds(400,160,200,25);
       l3.setBounds(100,220,200,25);
       r1.setBounds(400,220,100,25);
       r2.setBounds(550,220,100,25);
       l4.setBounds(100,280,200,25);
       j1.setBounds(400,280,200,25);
       l6.setBounds(100,340,200,25);
       t6.setBounds(400,340,200,25);
       l7.setBounds(100,400,200,25);
       p1.setBounds(400,400,200,25);
       l8.setBounds(100,460,200,25);
       p2.setBounds(400,460,200,25);
       l9.setBounds(100,520,200,25);
       t9.setBounds(400,520,200,25);
       b1.setBounds(250,650,100,30);
       b2.setBounds(450,650,100,30);
       add(l11);
       add(l1);
       add(l2);
       add(l3);
       add(l4);
       add(l6);
       add(l7);
       add(l8);
       add(l9);
       add(t1);
       add(t2);
       add(t6);
       add(t9);
       add(p1);
       add(p2);
       add(j1);
       add(r1);
       add(r2);
       add(b1);
       add(b2);
       b1.addActionListener(this);
       b2.addActionListener(this);
        setBounds(500,200,800,800);
       setVisible(true);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            new college();
            setVisible(false);
        }
        if(e.getSource()==b2){
            if(new String(p1.getPassword()).equals(new String(p2.getPassword()))){
            String gender="female";
            stuSql su=new stuSql();
            if(r1.isSelected()){
                gender="male";

            }
            su.stuSignupSql(t1.getText(),Long.parseLong(t2.getText()),gender,j1.getSelectedItem(),Float.parseFloat(t6.getText()),new String(p1.getPassword()),t9.getText());
        setVisible(false);
        new college();
    }
        }
    }
}
