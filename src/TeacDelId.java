import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacDelId extends JFrame implements ActionListener{
    ImageIcon i1;
    JLabel l1,l2,l3;
    JTextField t1;
    JButton b1;
    
 TeacDelId(){
    setTitle(" <<REG>>");
    setLayout(null);
    i1=new ImageIcon(getClass().getResource("img\\logo (23).png"));
    l1=new JLabel("NALANDA INSTITUTE OF TECHNOLOGY");
    l2=new JLabel("ENTER ID NO. >>>");
    Image ii=i1.getImage().getScaledInstance(80,80,20);
    i1.setImage(ii);
    l3=new JLabel(i1);
    t1=new JTextField(null);
    b1=new JButton("Enter >>");
    
    add(l1);
    add(l2);
    add(l3);
    add(t1);
    add(b1);
   

    setBounds(550,300,800,400);
    
    l1.setBounds(200,50,600,30);
    l1.setFont(new Font("",10,20));
    l2.setBounds(200,150,200,30);
    l3.setBounds(650,10,100,100);
    t1.setBounds(400,150,200,30);
    b1.setBounds(300,300,150,30);
    

    b1.setBackground(Color.DARK_GRAY);
  
    b1.setForeground(Color.CYAN);
   
    this.getContentPane().setBackground(Color.white);
    
    
b1.addActionListener(this);

setDefaultCloseOperation(EXIT_ON_CLOSE);

    setVisible(true);




 }
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1){
        
      }
      }

    
}