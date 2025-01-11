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

public class stubuttons extends JFrame implements ActionListener {
   String name="sujit";
   JLabel l0,l1;
   JButton b1,b2,b3,b0,ads1,d2,d3,pass1;
   JDialog ads,j1,pass;
   JLabel ad1,ps1,ps2;
   JPasswordField p1,p2;
   JTextArea a1;
   stuSql su;
   stubuttons(stuSql su){
    this.su=su;
    setLayout(null);
    l0=new JLabel("Nalanda institute of technology");
    l1=new JLabel("welcome to you "+this.su.name);
     b1=new JButton("Check your result");
     b2=new JButton("Details");
     b3=new JButton("Update");
     b0=new JButton("< BACK");
     l0.setFont(new Font("bh",29,25));
    l1.setFont(new Font("bh",29,20));
     l0.setForeground(Color.RED);
     b1.setBackground(Color.black);
     b2.setBackground(Color.black);
     b3.setBackground(Color.black);
     b0.setBackground(Color.RED);


     b1.setForeground(Color.white);
     b2.setForeground(Color.white);
     b3.setForeground(Color.white);
     b0.setForeground(Color.white);

 add(l0);
 add(l1);
 add(b1);
 add(b2);
 add(b3);
 add(b0);
 l0.setBounds(200,50,500,50);
 l1.setBounds(280,150,400,30);
 b1.setBounds(50,250,160,50);
 b2.setBounds(470,250,160,50);
 b3.setBounds(260,350,160,50);
 b0.setBounds(5,2,80,20);
 setBounds(600,300,700,500);
 setVisible(true);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b0.addActionListener(this);
 
 j1=new JDialog(this,"update");
 j1.setLayout(new FlowLayout(10,30,40));
 d2=new JButton("address");
 d3=new JButton("password");
 j1.add(d2);
 j1.add(d3);
 j1.setBounds(750,400,400,150);
 j1.setVisible(false);

 d2.addActionListener(this);
 d3.addActionListener(this);
  pass1=new JButton("Update");


 pass=new JDialog(this,"Password");

 ps1=new JLabel("Old Password : ");
 ps2=new JLabel("New Password : ");
 p1=new JPasswordField(null);
 p2=new JPasswordField(null);

 


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

       pass1.addActionListener(this);




 ads=new JDialog(this,"Address");
 ads1=new JButton("Update");
  ad1=new JLabel("Address :");
   a1=new JTextArea();

        ads.setLayout(null);
      ads.add(ad1);
      ads.add(a1);
      ads.add(ads1);
      ad1.setBounds(100,30,100,30);
      a1.setBounds(250,30,200,100);
      ads1.setBounds(200,210,80,30);
      
      ads.setBounds(700,400,500,300);
      ads1.addActionListener(this);

 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
             new regnoEnter();
        }
        if(e.getSource()==b2){
            new stuDetails(su);
            setVisible(false);
            
        }
        if(e.getSource()==b3){
           j1.setVisible(true);
        }
       
        if(e.getSource()==b0){
            new sloginpage();
            setVisible(false);
        }
        if(e.getSource()==d2){
            ads.setVisible(true);
            j1.setVisible(false);
    }
    if(e.getSource()==d3){
        pass.setVisible(true);
        j1.setVisible(false);
}
if(e.getSource()==pass1){
    stuSql su=new stuSql();
    su.updatedetails(this.su.reg_no,new String(p2.getPassword()),"password");
    pass.setVisible(false);
}
        if(e.getSource()==ads1){
            stuSql su=new stuSql();
    su.updatedetails(this.su.reg_no,a1.getText(),"address");
            ads.setVisible(false);
    }
    
}
}
