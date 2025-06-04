

import java.util.*;
public class pract {
   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a amount:");
        int a=scanner.nextInt();
        System.out.print("Enter a percentage:");
        double p=scanner.nextDouble();

        scanner.close();
        double total=(a*p)/100;
        System.out.printf("%f %% of Rs %d  is :"+p,a,total);
    }
}
