import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class alogin extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2,b3;
    ImageIcon i1,i2;
    alogin(){
        setLayout(null);
        l1=new JLabel("EXMI NO:");
        l2=new JLabel("PASSWORD : ");
        
        t1=new JTextField();
        p1=new JPasswordField();
        b1=new JButton("LOGIN");
        b2=new JButton("CLEAR");
        b3=new JButton("BACK");
        i1=new ImageIcon(getClass().getResource("img\\logo (23).png"));
        Image ii=i1.getImage().getScaledInstance(100,100,20);
        i1=new ImageIcon(ii);
        l3=new JLabel(i1);
        l4=new JLabel("Welcome to you Admin");
        l4.setFont(new Font("italic",10,30));
        l3.setBounds(10,10,100,100);
        l1.setBounds(170,200,100,30);
        l2.setBounds(170,250,100,30);
        t1.setBounds(350,200,200,30);
        p1.setBounds(350,250,200,30);
        l4.setBounds(130,30,600,50);
        b1.setBounds(150,400,100,50);
        b2.setBounds(300,400,100,50);
        b3.setBounds(450,400,100,50);
        b1.setBackground(Color.darkGray);
        b2.setBackground(Color.darkGray);
        b3.setBackground(Color.darkGray);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(p1);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


       setBounds(600,200,700,600);
       setVisible(true);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1){
  adminSql su=new adminSql();
  su.adminLoginSql(Long.parseLong(t1.getText()),new String(p1.getPassword()));
   new adminButton(su);
 setVisible(false);
}
if(e.getSource()==b2){
t1.setText(null);
p1.setText(null);
}
if(e.getSource()==b3){
new college();
  setVisible(false);
}
}
   
    }