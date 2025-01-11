import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class stuSql {

    Connection cc;
    String reg_no;
    String name,gender,brach,mark12,address;
    float mark1,mark2,mark3,mark4,mark5,mark6,mark7,mark8;
     void stuLoginSql(long reg_no,String pass ){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cc=DriverManager.getConnection("jdbc:mysql://localhost/student","root","tAPASWINI");
         PreparedStatement pp=cc.prepareStatement("select * from details where reg_no=? and pass=?");
         pp.setString(1,""+reg_no);
         pp.setString(2,pass);
        ResultSet ss= pp.executeQuery();
        while(ss.next()){
            name=ss.getString("namee");
            this.reg_no=ss.getString("reg_no");
            gender=ss.getString("gender");
            brach=ss.getString("c_amd_b");
            mark12=""+ss.getFloat("mark12");
            address=ss.getString("address");
        }
      }
      catch(Exception e){
        System.out.println(e);
      }
        
      }
      void studetSql(long reg_no){
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          cc=DriverManager.getConnection("jdbc:mysql://localhost/student","root","tAPASWINI");
           PreparedStatement pp=cc.prepareStatement("select * from details where reg_no=?");
           pp.setString(1,""+reg_no);
          
          ResultSet ss= pp.executeQuery();
          while(ss.next()){
              name=ss.getString("namee");
              this.reg_no=ss.getString("reg_no");
              gender=ss.getString("gender");
              brach=ss.getString("c_amd_b");
              mark12=""+ss.getFloat("mark12");
              address=ss.getString("address");
          }
          
        }
      catch(Exception e){
        System.out.println(e);
      }
    }
    void stuSignupSql(String name,long reg_no,String gender,String branch,float mark12,String pass,String address){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cc=DriverManager.getConnection("jdbc:mysql://localhost/student","root","tAPASWINI");
         PreparedStatement pp=cc.prepareStatement("insert into details values(?,?,?,?,?,?,?);");
         pp.setString(1,name);
         pp.setString(2,""+reg_no);
         pp.setString(3,gender);
         pp.setString(4,branch);
         pp.setFloat(5,mark12);
         pp.setString(6,pass);
         pp.setString(7,address);
         pp.executeUpdate();
         pp=cc.prepareStatement("insert into result values(?,?,?,?,?,?,?,?,?);");
         pp.setString(1,""+reg_no);
         pp.setFloat(2,0);
         pp.setFloat(3,0);
         pp.setFloat(4,0);
         pp.setFloat(5,0);
         pp.setFloat(6,0);
         pp.setFloat(7,0);
         pp.setFloat(8,0);
         pp.setFloat(9,0);
         pp.executeUpdate();

        }
      catch(Exception e){
        System.out.println("good night");
      }
    }
    void viewMark(String reg_no){
      this.reg_no=reg_no;
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        cc=DriverManager.getConnection("jdbc:mysql://localhost/student","root","tAPASWINI");
       PreparedStatement pp= cc.prepareStatement("Select * from result where REG=?");
       pp.setString(1,reg_no);
       ResultSet rr=pp.executeQuery();
       while(rr.next()){
        mark1=rr.getFloat("mark1");
        mark2=rr.getFloat("mark2");
        mark3=rr.getFloat("mark3");
        mark4=rr.getFloat("mark4");
        mark5=rr.getFloat("mark5");
        mark6=rr.getFloat("mark6");
        mark7=rr.getFloat("mark7");
        mark8=rr.getFloat("mark8");
       }
      }
      catch(Exception E){
        System.out.println(E);
      }
    }
    void markUpdate(String mark,float score, String reg_no2){
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        cc=DriverManager.getConnection("jdbc:mysql://localhost/student","root","tAPASWINI");
        PreparedStatement pp;
        if(mark.equals("mark1")){
       pp= cc.prepareStatement("update result SET mark1=? where REG=?");
        }
        else if(mark.equals("mark2")){
          pp= cc.prepareStatement("update result SET mark2=? where REG=?");
           }
           else if(mark.equals("mark3")){
           pp= cc.prepareStatement("update result SET mark3=? where REG=?");
             }
            else if(mark.equals("mark4")){
              pp= cc.prepareStatement("update result SET mark4=? where REG=?");
               }
              else if(mark.equals("mark5")){
                pp= cc.prepareStatement("update result SET mark5=? where REG=?");
                 }
                else if(mark.equals("mark6")){
                  pp= cc.prepareStatement("update result SET mark6=? where REG=?");
                   }
                  else if(mark.equals("mark7")){
                     pp= cc.prepareStatement("update result SET mark7=? where REG=?");
                     }
                    else{
                      pp= cc.prepareStatement("update result SET mark8=? where REG=?");
                       }
       
       pp.setFloat(1,score);
       pp.setString(2,reg_no2);
       pp.executeUpdate();
        
      }
      catch (Exception e) {
        System.out.println(e);
      }
    }
    void updatedetails(String regno,String value,String dtype){
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cc=DriverManager.getConnection("jdbc:mysql://localhost/student","root","tAPASWINI");
        PreparedStatement pp;
        if(dtype.equals(new String("password"))){
          pp=cc.prepareStatement("update details SET PASS=? where reg_no=?;");
          pp.setString(1,value);
          pp.setString(2,regno);
          pp.executeUpdate();

        }
        else{
          pp=cc.prepareStatement("update details SET address=? where reg_no=?;");
          pp.setString(1,value);
          pp.setString(2,regno);
          pp.executeUpdate();
        }

      }
      catch(Exception e){
        System.out.println(e);
      }
    }

}