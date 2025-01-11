import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class useButt extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b0;
    JLabel l0,l1;
    String name="teacher";
    JDialog j1;
    JButton d1,d2,d3;

    JDialog mob,ads,pass;
    JLabel mo1,ad1,ps1,ps2;
    Choice m1;
    JPasswordField p1,p2;
    JTextArea a1;
    JButton mob1,ads1,pass1;
    userSql su;
    useButt(userSql su){
        this.su=su;
        name=this.su.name;
            setLayout(null);
    l0=new JLabel("Nalanda institute of technology");
   
    l1=new JLabel("welcome to you "+name);
     b1=new JButton("Student Result");
     b2=new JButton("Student Details");
     b3=new JButton("Your details");
     b4=new JButton("Update");
     b0=new JButton("< BACK");
     l0.setFont(new Font("bh",29,25));
    l1.setFont(new Font("bh",29,20));
     l0.setForeground(Color.RED);
     b1.setBackground(Color.black);
     b2.setBackground(Color.black);
     b3.setBackground(Color.black);
     b4.setBackground(Color.black);
     b0.setBackground(Color.RED);

     b1.setForeground(Color.white);
     b2.setForeground(Color.white);
     b3.setForeground(Color.white);
     b4.setForeground(Color.white);
     b0.setForeground(Color.white);

     add(l0);
 add(l1);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 add(b0);

 l0.setBounds(190,50,500,50);
 l1.setBounds(240,150,400,30);
 b1.setBounds(50,250,160,50);
 b2.setBounds(470,250,160,50);
 b3.setBounds(50,350,160,50);
 b4.setBounds(470,350,160,50);
 b0.setBounds(5,2,80,20);
 setBounds(600,300,700,500);
 setVisible(true);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);

 b0.addActionListener(this);

 j1=new JDialog(this,"update");
 j1.setLayout(new FlowLayout(10,30,40));
 d1=new JButton("qualification");
 d2=new JButton("address");
 d3=new JButton("password");
 j1.add(d1);
 j1.add(d2);
 j1.add(d3);
 j1.setBounds(750,400,400,150);
 j1.setVisible(false);

 d1.addActionListener(this);
 d2.addActionListener(this);
 d3.addActionListener(this);


 mob1=new JButton("Update");
 ads1=new JButton("Update");
 pass1=new JButton("Update");



 mob=new JDialog(this,"mob_No");
 ads=new JDialog(this,"Address");
 pass=new JDialog(this,"Password");

 mo1=new JLabel("New Qualificatin : ");
 m1=new Choice() ;
 m1.add("B-Tech with M-tech Asst. P");
 m1.add("B.sc with M.se Asst. P");
 m1.add("MCA with M-tech Asst. P");
 m1.add("M-Tech with P.H.D Asst. P");
 m1.add("M-Tech with P.H.D Professor");

 ad1=new JLabel("Address :");
 a1=new JTextArea();

 ps1=new JLabel("Old Password : ");
 ps2=new JLabel("New Password : ");
 p1=new JPasswordField(null);
 p2=new JPasswordField(null);

 mob.setLayout(null);
 mob.add(mo1);
 mob.add(m1);
 mob.add(mob1);
 mo1.setBounds(100,30,150,30);
 m1.setBounds(250,30,200,30);
 mob1.setBounds(200,100,80,30);
 
 mob.setBounds(700,400,500,200);


 ads.setLayout(null);
      ads.add(ad1);
      ads.add(a1);
      ads.add(ads1);
      ad1.setBounds(100,30,100,30);
      a1.setBounds(250,30,200,100);
      ads1.setBounds(200,210,80,30);
      
      ads.setBounds(700,400,500,300);


      pass.setLayout(null);
      pass.add(ps1);
      pass.add(ps2);
      pass.add(p1);
      pass.add(p2);
      pass.add(pass1);


      ps1.setBounds(100,30,100,30);
      ps2.setBounds(100,70,100,30);
      p1.setBounds(250,30,200,30);
      p2.setBounds(250,70,200,30);
      pass1.setBounds(200,120,80,30);
      
      pass.setBounds(700,400,500,200);

       mob1.addActionListener(this);
       ads1.addActionListener(this);
       pass1.addActionListener(this);


 this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new regnoEnter();
        }
        if(e.getSource()==b2){
            new regnoEnter1();
        }
        if(e.getSource()==b3){
            new userDetails(su);
            setVisible(false);
        }
        if(e.getSource()==b4){
            j1.setVisible(true);
        }
        if(e.getSource()==b0){
            new ulogin();
            setVisible(false);
        }
        if(e.getSource()==d1){
            mob.setVisible(true);
            j1.setVisible(false);
        }
        if(e.getSource()==d2){
            ads.setVisible(true);
            j1.setVisible(false);
        }
        if(e.getSource()==d3){
            pass.setVisible(true);
            j1.setVisible(false);
        }
        if(e.getSource()==mob1){
            userSql us=new userSql();
            us.userUpdateSql(this.su.id,m1.getSelectedItem(),"qualification");
        }

        if(e.getSource()==ads1){
            userSql su=new userSql();
            su.userUpdateSql(this.su.id,a1.getText(),"address");
            pass.setVisible(false); 
        }

        if(e.getSource()==pass1){
            userSql su=new userSql();
            su.userUpdateSql(this.su.id,new String(p2.getPassword()),"password");
            pass.setVisible(false);
        }

    }
    
    
}
