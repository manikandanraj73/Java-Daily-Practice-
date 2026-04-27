package StringProblems;

import java.util.HashMap;

public class CharCount {
    public static void charCount(String word){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            if(map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
            }
            else{
                map.put(word.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        CharCount.bruteForceForCountChar("aabbcddeff");
    }

    // BRUTE FORCE
    public static void bruteForceForCountChar(String word){
        StringBuffer word1=new StringBuffer(word);
        for(int i=0;i<word1.length();i++){
            int count=1;
            for(int j=0;j<word1.length();j++){
                if(i!=j&& word1.charAt(i)==word1.charAt(j)){
                    count++;
                    word1.deleteCharAt(j);
                }
            }
            System.out.print(word1.charAt(i)+""+count+"");
        }
    }
}
