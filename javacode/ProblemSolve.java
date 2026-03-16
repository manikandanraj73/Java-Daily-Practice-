import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
class ProblemSolve {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
    Reversing.reversNumber();
    Reversing.reverseString();
    Reversing.checkAnagram();
    Reversing.removeDuplicate();
    }
    public static void reverseString(){
    System.out.print("Enter a Word: ");
    String word=scanner.nextLine();
    for(int i=word.length()-1;i>=0;i--){
        System.out.print(word.charAt(i));
    }
    System.out.println("");
}
    public static void longestSubStr(){
String word="abcabb";
 int max=0;
 for(int i=0;i<word.length();i++){
    boolean[]isHere=new boolean[256];
    for(int j=i;j<word.length();j++){
        char c=word.charAt(j);
        if(isHere[c]){
            break;
        }
        isHere[c]=true;
        max=Math.max(max, j-i+1);
    }
 }
 System.out.println("Max Length : "+max);
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
public static void findTarget(){
    int []arr={1,2,3,44,55,6,3,8,9,10};
    int target=10;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            int sum=0;
            if(i!=j){
            sum=arr[i]+arr[j];
            }
            if(sum==target){System.out.println("index = "+i+" "+j+"\nValues = "+arr[i]+" "+arr[j]);}
        }
    }
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
    public static void removeDuplicate(){
        int [] arr={1,1,1,2,3,0,0,44,0,55,3,5};
        int[] removeDup=new int[arr.length];
        int k=0;
      
        for(int i=0;i<arr.length;i++){
            boolean isExist=false;
            for(int j=0;j<k;j++){
                if(arr[i]==removeDup[j]){
                    isExist=true;
                    break;
                }}
                if(!isExist){
                    removeDup[k]=arr[i];
                    k++;
                }
            }
            for(int i=0;i<k;i++){
                System.out.print(removeDup[i]+" ");
            }
        
    }

    public static void longestSubstr(){
        String word="a";
        int start=0, maxLen=0;
        HashSet<Character>set=new LinkedHashSet<>();
       for(int end=0;end<word.length();end++){
        while(set.contains(word.charAt(end))){
            set.remove(word.charAt(start));
            start++;
        }
        set.add(word.charAt(end));
        
        maxLen=Math.max(maxLen,end-start+1);
       }
        System.out.println("max length : "+maxLen);
    }
    public static void showAllSubStr(){
        String word="abc";
        for(int i=0;i<word.length();i++){
            for(int j=0;j<word.length();j++){
                for(int k=i;k<=j;k++){
                    System.out.print(word.charAt(k));
                }
                System.out.println("");
            }
        }
    }
    }
