import java.sql.*;

import java.util.*;


 public class adddata {
  static Scanner scanner=new Scanner(System.in);
    public static int adddetails() throws SQLException{
        
       
        System.out.print("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Enter your course:");
      
        String course=scanner.nextLine();
       
        System.out.print("Enter your Year like('I','II','III'):");
        String year=scanner.next();
       

      String url="jdbc:mysql://localhost:3306/details";
        String userName="root";
        String password="mani2004";
        String query=("insert into students values(?,?,?,?)");
        Connection con=DriverManager.getConnection(url,userName,password);
        PreparedStatement pr =con.prepareStatement(query);
        pr.setInt(1, 0);
        pr.setString(2, name);
        pr.setString(3,course);
        pr.setString(4,year);
        int count =pr.executeUpdate();
        return count;

    }
    //view data
    /**

     */
    public static void viewdata() throws SQLException{
      
      String url="jdbc:mysql://localhost:3306/details";
      String userName="root";
      String password="mani2004";
      String qry=("Select * from students");
      Connection con=DriverManager.getConnection(url,userName,password);
      Statement st= con.createStatement();
      ResultSet rs=st.executeQuery(qry);
      while (rs.next()) {
        System.out.println("id= "+rs.getInt(1)+" \tName="+rs.getString(2)+" \t Course="+rs.getString(3)+" \tYear"+rs.getString(4));
        
      }
        
    

    }
    //delete data
    public static void deleteData() throws SQLException{
      
      String url="jdbc:mysql://localhost:3306/details";
      String userName="root";
      String password="mani2004";
      System.out.println("Enter id to delete records");
      int id=scanner.nextInt();
      
      scanner.close();
      Connection con=DriverManager.getConnection(url,userName,password);
     try{
      PreparedStatement pr=con.prepareStatement("delete from students where id =?");
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
      
      }
    
    

