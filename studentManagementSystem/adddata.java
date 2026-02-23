import java.sql.*;

import java.util.*;


 public class adddata {
  static Scanner scanner=new Scanner(System.in);
    public static void adddetails(int i,String n,String c,String y,String m) throws SQLException{
        
        String name=n,course=c,year=y,mobile=m;
        int id=i;
       
      String url="jdbc:mysql://localhost:3306/details";
        String userName="root";
        String password="mani2004";
        String query=("insert into student values(?,?,?,?,?)");
        Connection con=DriverManager.getConnection(url,userName,password);
        PreparedStatement pr =con.prepareStatement(query);
        pr.setInt(1, id);
        pr.setString(2, name);
        
        pr.setString(3,year);
        pr.setString(4,course);
        pr.setString(5, mobile);
        int count =pr.executeUpdate();
        int isEmpty=0;
        if(count==isEmpty)System.out.println("Insertion Failed");
      else System.out.println("Inserted Successfully");
    }
    //view data
    /**

     */
    public static void viewdata() throws SQLException{
      
      String url="jdbc:mysql://localhost:3306/details";
      String userName="root";
      String password="mani2004";
      String qry=("Select * from student");
      Connection con=DriverManager.getConnection(url,userName,password);
      Statement st= con.createStatement();
      ResultSet rs=st.executeQuery(qry);
      while (rs.next()) {
        System.out.println("id= "+rs.getInt(1)+" \tName="+rs.getString(2)+" \t Course="+rs.getString(4)+" \tYear= "+rs.getString(3)+"\t mobile= "+rs.getString(5));
        
      }
        
    

    }
    //delete data
    public static void deleteData(int id) throws SQLException{
      
      String url="jdbc:mysql://localhost:3306/details";
      String userName="root";
      String password="mani2004";
      Connection con=DriverManager.getConnection(url,userName,password);
     try{
      PreparedStatement pr=con.prepareStatement("delete from student where rno =?");
      pr.setInt(1,id);
      int count =pr.executeUpdate();
      int isEmpty=0;
      if(isEmpty==count){
        System.out.println("some thing wrong enter correct id");
      }
      else{System.out.println(count+"  rows affected");}
       
     }
     catch(Exception e){
      e.printStackTrace();
     }
      
      }
      //ubdate data
      public static void updateDetails(int i,String n,String c,String y,String m) throws SQLException{
      
        String name=n,course=c,year=y, mobile=m;
        int id =i;
       
      String url="jdbc:mysql://localhost:3306/details";
        String userName="root";
        String password="mani2004";
        Connection con=DriverManager.getConnection(url,userName,password);
        PreparedStatement pr =con.prepareStatement("update student set name=?, course=?, year=?, mobile=? where rno=?");
        
        pr.setString(1, name);
        pr.setString(2,course);
        pr.setString(3,year);
        pr.setString(4, mobile);
        pr.setInt(5, id);
        int count =pr.executeUpdate();
        int isEmpty=0;
      if(count==isEmpty){System.out.println("Please Enter Correct Roll Number");}
       else System.out.println(count+" row updated");
    }
      }
    
    

