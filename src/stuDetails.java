import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class stuDetails extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l6,l9,l11;
    JLabel t1,t2,t9,t6;
    JLabel j1,r1;
    JButton b1;
    JDialog ads;
    stuSql su;
    stuDetails(stuSql su){
        this.su=su;
        setLayout(null);
        l1=new JLabel("NAME :");
        l2=new JLabel("REG NO :");
        l3=new JLabel("GENDER :");
        l4=new JLabel("COURSE & BRANCH:");
        
        l6=new JLabel("12th MARK(%) :");
        
        l9= new JLabel("ADDRESS :");

        r1=new JLabel(su.gender);
     
        b1=new JButton("back");
       

        t1= new JLabel(su.name);
        t2= new JLabel(""+su.reg_no);
        t6= new JLabel(su.mark12);
        t9= new JLabel(su.address);
        j1=new JLabel(su.brach);
       

      

      
       l11=new JLabel("Welcome to you student");
       l11.setFont(new Font("",30,30));
       l11.setBounds(160,20,400,40);
       l1.setBounds(100,100,200,25);
       t1.setBounds(400,100,200,25);
       l2.setBounds(100,160,200,25);
       t2.setBounds(400,160,200,25);
       l3.setBounds(100,220,200,25);
       r1.setBounds(400,220,100,25);
       l4.setBounds(100,280,200,25);
       j1.setBounds(400,280,200,25);
       l6.setBounds(100,340,200,25);
       t6.setBounds(400,340,200,25);
       l9.setBounds(100,400,200,25);
       t9.setBounds(400,460,200,25);
       b1.setBounds(250,650,100,30);
      
       add(l11);
       add(l1);
       add(l2);
       add(l3);
       add(l4);
       add(l6);
       add(l9);
       add(t1);
       add(t2);
       add(t6);
       add(t9);
       add(r1);
       add(b1);
       add(j1);
   
       b1.addActionListener(this);
       
        setBounds(500,200,800,800);
       setVisible(true);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
         new stubuttons(su);
         setVisible(false);
        }
        
    }
}
