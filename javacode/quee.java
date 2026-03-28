public class quee{
    public static void main(String[] args) { 
data d1=new data();
       
        d1.enquee(32);
         d1.enquee(31);
        d1.enquee(32);
         d1.enquee(31);
        d1.enquee(32);
         d1.enquee(31);
        d1.enquee(32);
        d1.enquee(32);
        d1.enquee(32);
        d1.enquee(35);
        d1.enquee(35);
        // System.err.println(d1.dequee());
        System.out.println(d1.countOfValue);
       
    }
}
class data{
    int arr[]=new int[10];
    int first=0;
    int index=-1;
    int countOfValue=0;
    void enquee(int x){
        index++;
        if(index< arr.length){
        arr[index]=x;
        
        countOfValue++;}
    }
    int dequee(){
        countOfValue--;
        return arr[first++];
        
    }
}
