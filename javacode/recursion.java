import java.util.*;
public class recursion {
    static int fact(int x){
        if (x==0){
         return 1;
    }
    else
        return x*fact(x-1);
    }
    public static void main(String[] args) {
        System.out.println("finding a factorial value to given values");
        System.out.print("Enter a number:");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        in.close();
        System.out.println(recursion.fact(num));
        

    }
}
