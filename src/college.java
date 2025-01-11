import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class college extends JFrame implements ActionListener{
    JMenuBar j1;
    JMenu m1,m2,m3;
    JMenuItem mm1,mm2,mm3,mm4,mm5,mm6;
    ImageIcon im;
    JLabel l1,l2;
    public college(){
        
        setLayout(null);
   j1=new JMenuBar();
   m1=new JMenu("User");
   m2=new JMenu("Student");
   m3=new JMenu("Admin");  
mm1=new JMenuItem("log in");
mm2=new JMenuItem("sign up");
mm3=new JMenuItem("log in");
mm4=new JMenuItem("sign up");   
mm5=new JMenuItem("log in");
mm6=new JMenuItem("sign up");
im = new ImageIcon(getClass().getResource("img\\IMG_20240104_121023.jpg"));
Image i1=im.getImage().getScaledInstance(800,700,5);
im =  new ImageIcon(i1); 
l1=new JLabel(im);
l2=new JLabel("NALANDA INSTITUTE OF TECHNOLOGY");
l1.setBounds(0,30,800,510);
l2.setBounds(300,0,900,30);
m1.add(mm1);
m1.add(mm2);
m2.add(mm3);
m2.add(mm4);
m3.add(mm5);
m3.add(mm6);
   j1.add(m1);
   j1.add(m2);
   j1.add(m3);
   this.setJMenuBar(j1);
   add(l1);
   add(l2);
   setVisible(true);

   mm1.addActionListener(this);
   mm2.addActionListener(this);
   mm3.addActionListener(this);
   mm4.addActionListener(this);
   mm5.addActionListener(this);
   mm6.addActionListener(this);
   
setBounds(520,150,800,600);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==mm1){
           new ulogin();
           setVisible(false);
        }
        if(e.getSource()==mm2){
            new userSignPage();
           setVisible(false);
        }
        if(e.getSource()==mm3){
            new sloginpage();
            setVisible(false);
        }
        if(e.getSource()==mm4){
            new sSigninpage();
            setVisible(false);
        }
        if(e.getSource()==mm5){
            new alogin();
            setVisible(false);
        }
        if(e.getSource()==mm6){
            new adminSign();
            setVisible(false);
            
        }
    }
   public static void main(String[] args) {
    new college();
   }
}
