public class IntToBinary {
    public static void intToBinary(int num){
        int temp=num;
        String binary="";
        while(temp>=1){
          
            int value=temp % 2;
            binary=value+binary;
            temp=temp/2;
           
        }
    System.out.println(binary);
    }
    public static void main(String[] args) {
        IntToBinary.intToBinary(5);
    }
}
