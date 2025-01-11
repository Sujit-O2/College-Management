import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userSql {

    Connection cc;
    String id;
    String name,gender,brach,exp,address,qualifi;
     void userLoginSql(long id,String pass ){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cc=DriverManager.getConnection("jdbc:mysql://localhost/userR","root","tAPASWINI");
         PreparedStatement pp=cc.prepareStatement("select * from details where id=? and pass=?");
         pp.setString(1,""+id);
         pp.setString(2,pass);
        ResultSet ss= pp.executeQuery();
        while(ss.next()){
            name=ss.getString("namee");
            this.id=ss.getString("id");
            qualifi=ss.getString("qualifi");
            brach=ss.getString("branch");
            exp=ss.getString("exp");
            gender=ss.getString("gender");
            address=ss.getString("address");
        }
        
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
    void userSignupSql(String name,long id,String qualifi,String branch,String exp,String gender,String address,String pass){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cc=DriverManager.getConnection("jdbc:mysql://localhost/userR","root","tAPASWINI");
         PreparedStatement pp=cc.prepareStatement("insert into details values(?,?,?,?,?,?,?,?);");
         pp.setString(1,name);
         pp.setString(2,""+id);
         pp.setString(3,qualifi);
         pp.setString(4,branch);
         pp.setString(5,exp);
         pp.setString(6,gender);
         pp.setString(7,address);
         pp.setString(8,pass);
         pp.executeUpdate();
        }
      catch(Exception e){
        System.out.println("good night");
      }
    }
    void userUpdateSql(String id,String value,String DType){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
      cc=DriverManager.getConnection("jdbc:mysql://localhost/userR","root","tAPASWINI");
      PreparedStatement pp;
      if(DType.equals("password")){
        pp=cc.prepareStatement("update details set pass=? where id=?");
        pp.setString(1,value);
        pp.setString(2,id);
        pp.executeUpdate();
      }
      else if(DType.equals("qualification")){
        pp=cc.prepareStatement("update details set qualifi=? where id=?");
        pp.setString(1,value);
        pp.setString(2,id);
        pp.executeUpdate();

      }
      else{
        pp=cc.prepareStatement("update details set address=? where id=?");
        pp.setString(1,value);
        pp.setString(2,id);
        pp.executeUpdate();

      }
    }
    catch(Exception e){
      System.out.println( e);
    }
}
}