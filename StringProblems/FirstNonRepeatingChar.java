package StringProblems;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatingChar{
    public static void firstNonRepeatingChar(String word){
        LinkedHashMap<Character,Integer>map=new LinkedHashMap();
        for(char c:word.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
           
        }
        for(char c:map.keySet()){
            if(map.get(c)==1){
                System.out.println("First non repeating character: " +c);
                break;
            }
        }
    }
// Brute force for this
public static void nonRepeatingChar(String word){
    for(int i=0;i<word.length();i++){
        int count=1;
        for(int j=i+1;j<word.length();j++){
            if(i!=j&&word.charAt(i)==word.charAt(j)){
                count++;
            }
            
        }if(count==1){
                System.out.println("First non repeating character: " +word.charAt(i));
                break;
            }
    }
}
    public static void main(String[] args) {
        FirstNonRepeatingChar.nonRepeatingChar("abcdabd");
    }
}