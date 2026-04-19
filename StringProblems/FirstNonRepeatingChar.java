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

    public static void main(String[] args) {
        FirstNonRepeatingChar.firstNonRepeatingChar("abcdabd");
    }
}