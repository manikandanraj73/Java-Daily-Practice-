import java.util.Scanner;
class Reversing {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
    base.reversNumber();
    }
    public static void reversNumber(){
        System.out.print("Enter Number: ");
        int num=scanner.nextInt();
        int last,revers=0;
            while(num>0){
                last=num%10;
                revers=(revers*10)+last;
                num=num/10;
            }
            System.out.println(revers);
        
    }
}
