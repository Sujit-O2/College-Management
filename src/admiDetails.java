import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class admiDetails extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,L0,L00;
    JLabel t1,t2;
    JLabel c11,c22,c33;
    JLabel aad;
    JButton b1;
    ImageIcon i1;

adminSql suu;

    public admiDetails(adminSql su){
        this.suu=su;
        setTitle("signup page)@");
        setBounds(500,100,900,900);
        setLayout(null);
        L0=new JLabel("NALANDA INSTITUTE OF TECHNOLOGY.");
        l1=new JLabel("NAME :");
        l2=new JLabel("ID :");
        l3=new JLabel("YOUR POST :");
        l4=new JLabel("EXP :");
        l5=new JLabel("GENDER :");
        l6=new JLabel("ADDRESS (with contact no.):");

        t1=new JLabel(suu.name);
        t2=new JLabel(suu.id);
        c11=new JLabel(suu.post);
        c22=new JLabel(suu.exp);
        c33=new JLabel(suu.gender);
        aad=new JLabel(suu.address);
        b1=new JButton("BACK");
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
       
           add(t1);
           add(t2);
           add(c11);
           add(c22);
           add(c33);
           add(b1);
           add(aad);
           add(L00);
           add(L0);
          
           
           L0.setFont(new Font("bold",20,20));
           L0.setBounds(200,50,500,50);
           L00.setBounds(700,5,150,150);
           l1.setBounds(250,100+20,200,50);
           l2.setBounds(250,150+30,200,50);
           l3.setBounds(250,200+40,200,50);
           l4.setBounds(250,250+50,200,50);
           l5.setBounds(250,300+60,200,50);
           l6.setBounds(250,350+70,200,50);
           
           
           t1.setBounds(500,150-30,200,50);
           t2.setBounds(500,200-20,200,50);
           c11.setBounds(500,250-10,200,50);
           c22.setBounds(500,300+10,200,50);
           c33.setBounds(500,350+20,200,50);
          aad.setBounds(500,400+30,250,150);
         
           b1.setBounds(260,700,120,30);
        

           b1.setBackground(Color.black);
          
          
           b1.setForeground(Color.white);
           
    b1.addActionListener(this);
   
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
           new adminButton(suu);
            setVisible(false);
        }
    }
}