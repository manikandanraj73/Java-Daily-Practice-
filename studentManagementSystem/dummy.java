import java.sql.*;
import java.util.*;
public class dummy {
    

    public static void main(String[] args) {
        System.out.print("you want delete your records enter your id:");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        sc.close();
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root", "mani2004");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select id from dummy; ");
            while (rs.next()) {
             int id =(rs.getInt(1));
             if (ch==id) {
                String qry="delete from dummy where id =?";
                PreparedStatement p =con.prepareStatement(qry);
                p.setInt(1, ch);
                int u=p.executeUpdate();
                System.out.println(u+"  rows affected");

             }
             else{
                System.err.println("incorrect id records not found");
             }
            
            }
        }
        catch (Exception e){
          System.out.println(e);
        }
    }
}
