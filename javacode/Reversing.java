import java.util.Scanner;
class Reversing {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
    base.reversNumber();
    base.reverseString();
    base.checkAnagram();
    }
    public static void revrseString(){
    System.out.print("Enter a Word: ");
    String word=scanner.nextLine();
    for(int i=word.length()-1;i>=0;i--){
        System.out.print(word.charAt(i));
    }
    System.out.println("");
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
    public static void checkAnagram(){
    System.out.print("Enter a word 1 : ");
String word1=scanner.nextLine();
 System.out.print("Enter a word 2 : ");
String word2=scanner.nextLine();
char[]arr1=word1.toCharArray();
char[]arr2=word2.toCharArray();
char temp;
if(arr1.length==arr2.length){
for(int i=0;i<arr1.length;i++){
    for(int j=0;j<arr1.length-1;j++){
        if(arr1[j]>arr1[j+1]){
            temp=arr1[j];
            arr1[j]=arr1[j+1];
            arr1[j+1]=temp;
        }
    }
}
for(int i=0;i<arr2.length;i++){
    for(int j=0;j<arr2.length-1;j++){
        if(arr2[j]>arr2[j+1]){
            temp=arr2[j];
            arr2[j]=arr2[j+1];
            arr2[j+1]=temp;
        }
    }
}
String a=new String(arr1);
String b=new String(arr2);
if(a.equals(b)){
    System.out.println("It's a Anagram word");
}
else System.out.println("It's not a Anagram word");
}
else System.out.println("It's not a anagram word");
}

public static void checkPalindrom(){
    System.out.print("Enter a word : ");
    String word1=scanner.nextLine();
    String word2="";
    for(int i=word1.length()-1;i>=0;i--){
    word2+=word1.charAt(i);
    }
    if(word1.equals(word2)){
    System.out.println(word1+" is a Palindrom");
    }
    else{
    System.out.println(word1+" not a Palindrom");
    }
    }
