import java.util.Arrays;
import java.util.Scanner;
public class factorial{
    static Scanner Scanner=new Scanner(System.in);
public static void main(String[] args) {
    factorial f= new factorial();
System.out.println("factorial value is:"+f.factor(5));
int[]arr=new int[]{2,4,5,3,1,7,10,77};
//sorting array
int temp;
System.out.println("Before sorting:"+Arrays.toString(arr));
for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=(int)arr[j];
            arr[j]=temp;
        }
    }
}
System.out.println(Arrays.toString(arr[i]));
//min max
f.minMax(arr);
//reverse
System.out.println("reverse value is:"+f.reverse(23412344));
//palindrom
f.palindrom();
}
//factorial value 
int factor(int n){
    int fact = 1;
for (int i = 1; i <= n; i++) {
 fact *= i;
}
return fact;
}
//find a min ,max value in given array
public void minMax(int[] a){
int min=1;
int max=0;
for(int i:a){
    if (min > i)
    min=i;
    if (max < i)
    max=i;
    
}
  System.out.println("minimum value is:"+min);
  System.out.println("maximum value is:"+max);
}
//reverse the number without reverse operator
int reverse(int x){
    System.out.println("origional value is:"+x);
int rev=0,temp;
while (x!=0) {
temp=x % 10;
rev =rev*10+temp;
x=x/10;
}
return rev;
}
//reverse string and check palindrom
public void palindrom(){
    System.out.print("Enter a word:");
    String a=factorial.Scanner.next();
    System.out.println("Before :"+a);
   String b="";
    for(int i=a.length()-1;i>=0;i--){
       b=b+a.charAt(i);

    }
    System.out.println("After:"+b);
    String result=a.equals(b)?a+"  is polindrom word":a+"  is not polindrom word";//ternery operator.
    System.out.println(result);

}


}
