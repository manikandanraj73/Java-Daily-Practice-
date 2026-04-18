package StringProblems;

public class RemoveDuplicate {
    public static void RemoveDuplicate(String word){
        StringBuffer word1=new StringBuffer(word);
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word1.length();j++)
            if(i!=j && word1.charAt(i)==word1.charAt(j)){
                word1.deleteCharAt(j);
            }
        }
        System.out.println(word1);
    }
    public static void main(String[] args) {
        RemoveDuplicate.RemoveDuplicate("manikandan");
    }
}
