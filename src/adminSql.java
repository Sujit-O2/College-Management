import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class adminSql {

    Connection cc;
    String id;
    String name,gender,brach,exp,address,post;
     void adminLoginSql(long id,String pass ){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cc=DriverManager.getConnection("jdbc:mysql://localhost/adminn","root","tAPASWINI");
         PreparedStatement pp=cc.prepareStatement("select * from details where id=? and pass=?");
         pp.setString(1,""+id);
         pp.setString(2,pass);
        ResultSet ss= pp.executeQuery();
        while(ss.next()){
            name=ss.getString("namee");
            this.id=ss.getString("id");
            post=ss.getString("post");
            exp=ss.getString("exp");
            gender=ss.getString("gender");
            address=ss.getString("address");
        }
        
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
    void adminSignupSql(String name,long id,String post,String exp,String gender,String address,String pass){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cc=DriverManager.getConnection("jdbc:mysql://localhost/adminn","root","tAPASWINI");
         PreparedStatement pp=cc.prepareStatement("insert into details values(?,?,?,?,?,?,?);");
         pp.setString(1,name);
         pp.setString(2,""+id);
         pp.setString(3,post);
         pp.setString(4,exp);
         pp.setString(5,gender);
         pp.setString(6,address);
         pp.setString(7,pass);
         pp.executeUpdate();
        }
      catch(Exception e){
        System.out.println(e);
      }

    }
    void adminUpdateSql(String id,String value,String DType){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
      cc=DriverManager.getConnection("jdbc:mysql://localhost/adminn","root","tAPASWINI");
      PreparedStatement pp;
      if(DType.equals("password")){
        pp=cc.prepareStatement("update details set pass=? where id=?");
        pp.setString(1,value);
        pp.setString(2,id);
        pp.executeUpdate();
      }
      else if(DType.equals("exp")){
        pp=cc.prepareStatement("update details set exp=? where id=?");
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