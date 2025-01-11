import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;;

public class StuMark extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JDialog j1,j2,j3,j4,j5,j6,j7,j8;

    JLabel d1,d2,d3,d4,d5,d6,d7,d8;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JButton a1,a2,a3,a4,a5,a6,a7,a8;
    stuSql su;
    String reg_no;
StuMark(stuSql su, String reg_no){
   this.reg_no=reg_no;
   this.su=su;
    setLayout(new GridLayout(9,3));
  l1=new JLabel("     Sem 1 ::>");
  l2=new JLabel("     Sem 2 ::>");
  l3=new JLabel("     Sem 3 ::>");
  l4=new JLabel("     Sem 4 ::>");
  l5=new JLabel("     Sem 5 ::>");
  l6=new JLabel("     Sem 6 ::>");
  l7=new JLabel("     Sem 7 ::>");
  l8=new JLabel("     Sem 8 ::>");
  l9=new JLabel("     CGPA ::>");

  m1=new JLabel(""+su.mark1);
  m2=new JLabel(""+su.mark2);
  m3=new JLabel(""+su.mark3);
  m4=new JLabel(""+su.mark4);
  m5=new JLabel(""+su.mark5);
  m6=new JLabel(""+su.mark6);
  m7=new JLabel(""+su.mark7);
  m8=new JLabel(""+su.mark8);
  m9=new JLabel(""+(su.mark1+su.mark2+su.mark3+su.mark4+su.mark5+su.mark6+su.mark7+su.mark8)/8);
  
 b1=new JButton("Update");
 b2=new JButton("Update");
 b3=new JButton("Update");
 b4=new JButton("Update");
 b5=new JButton("Update");
 b6=new JButton("Update");
 b7=new JButton("Update");
 b8=new JButton("Update");
 b9=new JButton("Refresh");

 j1=new JDialog(this,"sem 1");
 j2=new JDialog(this,"sem 2");
 j3=new JDialog(this,"sem 3");
 j4=new JDialog(this,"sem 4");
 j5=new JDialog(this,"sem 5");
 j6=new JDialog(this,"sem 6");
 j7=new JDialog(this,"sem 7");
 j8=new JDialog(this,"sem 8");

   d1=new JLabel("Enter mark > ");
   d2=new JLabel("Enter mark > ");
   d3=new JLabel("Enter mark > ");
   d4=new JLabel("Enter mark > ");
   d5=new JLabel("Enter mark > ");
   d6=new JLabel("Enter mark > ");
   d7=new JLabel("Enter mark > ");
   d8=new JLabel("Enter mark > ");

    t1=new JTextField(null);
    t2=new JTextField(null);
    t3=new JTextField(null);
    t4=new JTextField(null);
    t5=new JTextField(null);
    t6=new JTextField(null);
    t7=new JTextField(null);
    t8=new JTextField(null);
    
      a1=new JButton("Upload");
      a2=new JButton("Upload");
      a3=new JButton("Upload");
      a4=new JButton("Upload");
      a5=new JButton("Upload");
      a6=new JButton("Upload");
      a7=new JButton("Upload");
      a8=new JButton("Upload");
      
     j1.setLayout(null);
      j1.add(d1);
      j1.add(t1);
      j1.add(a1);
      d1.setBounds(100,30,100,30);
      t1.setBounds(250,30,100,30);
      a1.setBounds(200,100,80,30);
      
      j1.setBounds(800,400,500,200);

      j1.setVisible(false);

      j1.setLayout(null);
      j1.add(d1);
      j1.add(t1);
      j1.add(a1);
      d1.setBounds(100,30,100,30);
      t1.setBounds(250,30,100,30);
      a1.setBounds(200,100,80,30);
      
      j1.setBounds(800,400,500,200);

      j1.setVisible(false);

      j2.setLayout(null);
      j2.add(d2);
      j2.add(t2);
      j2.add(a2);
      d2.setBounds(100,30,100,30);
      t2.setBounds(250,30,100,30);
      a2.setBounds(200,100,80,30);
      
      j2.setBounds(800,400,500,200);

      j2.setVisible(false);

      j3.setLayout(null);
      j3.add(d3);
      j3.add(t3);
      j3.add(a3);
      d3.setBounds(100,30,100,30);
      t3.setBounds(250,30,100,30);
      a3.setBounds(200,100,80,30);
      
      j3.setBounds(800,400,500,200);

      j3.setVisible(false);

      j4.setLayout(null);
      j4.add(d4);
      j4.add(t4);
      j4.add(a4);
      d4.setBounds(100,30,100,30);
      t4.setBounds(250,30,100,30);
      a4.setBounds(200,100,80,30);
      
      j4.setBounds(800,400,500,200);

      j4.setVisible(false);

      j5.setLayout(null);
      j5.add(d5);
      j5.add(t5);
      j5.add(a5);
      d5.setBounds(100,30,100,30);
      t5.setBounds(250,30,100,30);
      a5.setBounds(200,100,80,30);
      
      j5.setBounds(800,400,500,200);

      j5.setVisible(false);

      j6.setLayout(null);
      j6.add(d6);
      j6.add(t6);
      j6.add(a6);
      d6.setBounds(100,30,100,30);
      t6.setBounds(250,30,100,30);
      a6.setBounds(200,100,80,30);
      
      j6.setBounds(800,400,500,200);

      j6.setVisible(false);

      j7.setLayout(null);
      j7.add(d7);
      j7.add(t7);
      j7.add(a7);
      d7.setBounds(100,30,100,30);
      t7.setBounds(250,30,100,30);
      a7.setBounds(200,100,80,30);
      
      j7.setBounds(800,400,500,200);

      j7.setVisible(false);

      j8.setLayout(null);
      j8.add(d8);
      j8.add(t8);
      j8.add(a8);
      d8.setBounds(100,30,100,30);
      t8.setBounds(250,30,100,30);
      a8.setBounds(200,100,80,30);
      
      j8.setBounds(800,400,500,200);

      j8.setVisible(false);

   
   add(l1);
   add(m1);
   add(b1);

   add(l2);
   add(m2);
   add(b2);
   
   add(l3);
   add(m3);
   add(b3);
   
   add(l4);
   add(m4);
   add(b4);
   
   add(l5);
   add(m5);
   add(b5);
   
   add(l6);
   add(m6);
   add(b6);

   add(l7);
   add(m7);
   add(b7);
   
   add(l8);
   add(m8);
   add(b8);
   
   add(l9);
   add(m9);
   add(b9);
   
  
   
   setBounds(750,200,600,600);
   setVisible(true);


  
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
   b5.addActionListener(this);
   b6.addActionListener(this);
   b7.addActionListener(this);
   b8.addActionListener(this);
   b9.addActionListener(this);


   a1.addActionListener(this);
   a2.addActionListener(this);
   a3.addActionListener(this);
   a4.addActionListener(this);
   a5.addActionListener(this);
   a6.addActionListener(this);
   a7.addActionListener(this);
   a8.addActionListener(this);


}
    @Override
    public void actionPerformed(ActionEvent e) {
      
     if(e.getSource()==a1){
       
         su.markUpdate("mark1",Float.parseFloat(t1.getText()),reg_no);
         m1.setText(""+this.su.mark1);
        j1.setVisible(false);
        setVisible(false);
     }
     if(e.getSource()==a2){
      su.markUpdate("mark2",Float.parseFloat(t2.getText()),reg_no);
      m1.setText(""+this.su.mark2);
              j2.setVisible(false);
              setVisible(false);
     }
     if(e.getSource()==a3){
      su.markUpdate("mark3",Float.parseFloat(t3.getText()),reg_no);
      m1.setText(""+this.su.mark3);
        j3.setVisible(false);
        setVisible(false);
     }
     if(e.getSource()==a4){
      su.markUpdate("mark4",Float.parseFloat(t4.getText()),reg_no);
      m1.setText(""+this.su.mark4);
        j4.setVisible(false);
        setVisible(false);
     }
     if(e.getSource()==a5){
      su.markUpdate("mark5",Float.parseFloat(t5.getText()),reg_no);
      m1.setText(""+this.su.mark5);
        j5.setVisible(false);
        setVisible(false);
     }
     if(e.getSource()==a6){
      su.markUpdate("mark6",Float.parseFloat(t6.getText()),reg_no);
      m1.setText(""+this.su.mark6);
        j6.setVisible(false);
        setVisible(false);
     }
     if(e.getSource()==a7){
      su.markUpdate("mark7",Float.parseFloat(t7.getText()),reg_no);
      m1.setText(""+this.su.mark7);
        j7.setVisible(false);
        setVisible(false);
     }
     if(e.getSource()==a8){
      su.markUpdate("mark8",Float.parseFloat(t8.getText()),reg_no);
      m1.setText(""+this.su.mark8);
        j8.setVisible(false);
        setVisible(false);
     }
     
     if(e.getSource()==b1){
        j1.setVisible(true);
     }
     if(e.getSource()==b2){
        j2.setVisible(true);
         }
     if(e.getSource()==b3){
        j3.setVisible(true);
     }
     if(e.getSource()==b4){
        j4.setVisible(true);
     }
     if(e.getSource()==b5){
        j5.setVisible(true);
     }
     if(e.getSource()==b6){
        j6.setVisible(true);
     }
     if(e.getSource()==b7){
        j7.setVisible(true);
     }
     if(e.getSource()==b8){
        j8.setVisible(true);
     }
     if(e.getSource()==b9){
        setVisible(false);
        setVisible(true);
     }
     
    }
    
}
