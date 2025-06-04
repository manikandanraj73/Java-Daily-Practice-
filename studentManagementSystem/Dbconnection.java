import java.util.Scanner;
import java.sql.*;
public class Dbconnection {
    public static void main(String[] args)throws SQLException{
    
            Scanner inp =new Scanner(System.in);
            System.out.print("\npress 1 = add details\npress 2 = view details\npress 3 = delete data\nEnter your option:");
                int ch=inp.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println(adddata.adddetails()+"   rows affected");
                        
                        break;
                    case 2:
                    adddata.viewdata();
                        break;
                    case 3:
                         adddata.deleteData();
                            break;
                    }
                inp.close();
        
        }
    }
    
    


