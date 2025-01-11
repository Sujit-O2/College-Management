import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class userSignPage extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,L10,L0,L00;
    JTextField t1,t2;
    JPasswordField p1,p2;
    Choice c11,c22,c33,c44;
    JTextArea aad;
    JButton b1,b2,b3,b4;
    ImageIcon i1;



    public userSignPage(){
        setTitle("signup page)@");
        setBounds(500,100,900,900);
        setLayout(null);
        L0=new JLabel("NALANDA INSTITUTE OF TECHNOLOGY.");
        l1=new JLabel("NAME :");
        l2=new JLabel("ID :");
        l3=new JLabel("QUALIFICATION :");
        l4=new JLabel("EXP :");
        l5=new JLabel("GENDER :");
        l6=new JLabel("ADDRESS (with contact no.):");
        l7=new JLabel("Want to login..");
        l8=new JLabel("Password :");
        l9=new JLabel("Re-enter Password :");
        L10=new JLabel("Branch  :");


        t1=new JTextField();
        t2=new JTextField();

        p1=new JPasswordField();
        p2=new JPasswordField();

        c11=new Choice();
        c22=new Choice();
        c33=new Choice();
        c44=new Choice();
        
                c11.add("B-Tech with M-tech Asst. P");
                c11.add("B.sc with M.se Asst. P");
                c11.add("MCA with M-tech Asst. P");
                c11.add("M-Tech with P.H.D Asst. P");
                c11.add("M-Tech with P.H.D Professor");
            
                  c22.add("5-10 year");
                  c22.add("10-20 year");
                  c22.add("20+ year");
                      c33.add("MALE");
                      c33.add("FEMALE");
                        c44.add("CSE");
                        c44.add("EE");
                        c44.add("ME");
                        c44.add("CE");
        aad=new JTextArea();
        b1=new JButton("BACK");
        b2=new JButton("SUBMIT");
        b3=new JButton("CLEAR");
        b4=new JButton("LOGIN");
        i1=new ImageIcon(getClass().getResource("img\\logo (23).png"));
        Image jj= i1.getImage().getScaledInstance(100,100,10);
        i1=new ImageIcon(jj);
        L00=new JLabel(i1);
           add(l1);
           add(l2);
           add(l3);
           add(l4);
           add(l5);
           add(l6);
           add(l7);
           add(L10);
           add(t1);
           add(t2);
           add(c11);
           add(c22);
           add(c33);
           add(c44);
           add(b1);
           add(b2);
           add(b3);
           add(b4);
           add(aad);
           add(L00);
           add(L0);
           add(l8);
           add(l9);
           add(p1);
           add(p2);
           
           L0.setFont(new Font("bold",20,20));
           L0.setBounds(200,50,500,50);
           L00.setBounds(700,5,150,150);
           l1.setBounds(250,100+20,200,50);
           l2.setBounds(250,150+20,200,50);
           l3.setBounds(250,200+20,200,50);
           L10.setBounds(250,250+20,100,100);
           l4.setBounds(250,300+20,200,50);
           l5.setBounds(250,350+20,200,50);
           l6.setBounds(250,400+20,200,50);
           l8.setBounds(250,600,200,50);
           l9.setBounds(250,650,200,50);
           l7.setBounds(300,810,200,20);
           
          
           t1.setBounds(500,150-30,200,30);
           t2.setBounds(500,200-30,200,30);
           c11.setBounds(500,250-30,200,30);
           c44.setBounds(500,300-30,200,30);
           c22.setBounds(500,350-30,200,30);
           c33.setBounds(500,400-30,200,30);
          aad.setBounds(500,450-30,250,150);
           p1.setBounds(500,600,200,30);
           p2.setBounds(500,650,200,30);
           b1.setBounds(260,750,120,30);
           b2.setBounds(410,750,120,30);
           b3.setBounds(560,750,120,30);
           b4.setBounds(500,810,130,20);
        
           p1.setBackground(Color.black);
           p2.setBackground(Color.black);

           p1.setForeground(Color.white);
           p2.setForeground(Color.white);

           b1.setBackground(Color.black);
           b2.setBackground(Color.black);
           b3.setBackground(Color.black);
           b4.setBackground(Color.black);
          
           b1.setForeground(Color.white);
           b2.setForeground(Color.white);
           b3.setForeground(Color.white);
           b4.setForeground(Color.white);
          
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);

setVisible(true);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

  
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new college();
            setVisible(false);
        }
        if(e.getSource()==b2){
            if(new String(p1.getPassword()).equals(new String(p2.getPassword()))){
            userSql su=new userSql();
            su.userSignupSql(t1.getText(),Long.parseLong(t2.getText()),c11.getSelectedItem(),c44.getSelectedItem(),c22.getSelectedItem(),c33.getSelectedItem(),aad.getText(),new String(p1.getPassword()));
            new college();
            setVisible(false);
            }
        }
        if(e.getSource()==b3){
            
            t1.setText(null);
            t2.setText(null);
            p1.setText(null);
            p2.setText(null);
            aad.setText(null);

        }
        if(e.getSource()==b4){
            new ulogin();
            setVisible(false);
        }
        
      
    }
     
}
