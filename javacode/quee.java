public class quee{
    public static void main(String[] args) { 
data d1=new data();
        d1.enquee(10);
        d1.enquee(20);
        d1.enquee(21);
        d1.enquee(22);
        System.err.println(d1.dequee());
        System.err.println(d1.dequee());
        System.err.println(d1.dequee());
        d1.enquee(31);
        d1.enquee(32);
        System.err.println(d1.dequee());
        System.err.println(d1.dequee());
    }
}
class data{
    int arr[]=new int[10];
    int first=0;
    int inc=-1;
    void enquee(int x){
        inc++;
        if(arr[inc]<= 9)
        arr[inc]=x;
    }
    int dequee(){
        
        return arr[first++];
        
    }
}
