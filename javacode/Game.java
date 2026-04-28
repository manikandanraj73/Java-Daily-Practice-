import java.util.Random;
import java.util.Scanner;

public class Game {
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    Random random=new Random(0);
    String[] values={"tails","heads"};
    boolean Notwin=true;
    // while(Notwin){
    //     System.out.println("press the number between 1 to 6");
    //     System.out.print("Enter the number: ");
    //     int inp=sc.nextInt();
    //     if(inp>=1 && inp<=6){
    //     if(random.nextInt(7)==inp){
    //         System.out.println("YOU WON THE GAME.....");
    //         Notwin=false;
    //     }else{
    //         System.out.println(" Try again ");
    //         System.out.println();
    //     }}
    //     else{System.out.println("Enter the number b/w 1 to 6");}

    // }
   
    for(int i=1;i<=5;i++){
        System.out.println(random.nextInt(7));
    }
}   
}
