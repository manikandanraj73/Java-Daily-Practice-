import java.util.Scanner;
public class tables{
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    
    
    int w,c,re;
    boolean isEmpty=true;
        while (isEmpty) {
        System.out.println("if u want to print the table\npress 1 to yes\npress 2 to no");
        w=scanner.nextInt();
    
    if(w==1){
       
        System.out.print("enter wanted table number:");
        c=scanner.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(i+"X"+c+"="+(i*c));
        }
    
    
    }
    else if(w==2){
        System.out.println("exited");
        isEmpty=false;
    }
    else {
        System.out.println("you pressed a wrong number");
        System.out.println("do u want re-enter that process \npress =5");
        re=scanner.nextInt();
      
        if(re==5){
            isEmpty=true;
        }
        else
          isEmpty=false;
    }}
    scanner.close();
    }
    
}