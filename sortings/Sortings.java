package sortings;

import java.util.Arrays;

public class Sortings{
    public static void main(String[] args) {
        int []array={1,-2,-3,4,5,33,0,44,1,-8,-9,55};
        System.out.println("Before sorting = "+Arrays.toString(array));
        Sortings.ascendingOrder(array);
        Sortings.descendingOrder(array);
        Sortings.moveNegagive(array);
    }

    public static void ascendingOrder(int []arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Ascending Order"+Arrays.toString(arr));
    }

    // Decending order
    public static void descendingOrder(int []arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Descending Order"+Arrays.toString(arr));
    }
        // Move all negative elements in starting
public static void moveNegagive(int []arr){
int index=0;
System.out.println("befor: "+Arrays.toString(arr));
int []a=new int[arr.length];
for(int i=0;i<arr.length;i++){
    if(arr[i]<0){
        a[index]=arr[i];
        index+=1;
    }}
    for(int i=0;i<arr.length;i++){
    if(arr[i]>=0){
        a[index]=arr[i];
        index+=1;
    }
}
System.out.println("Move all negative elements in starting posisition (after): "+Arrays.toString(a));
}

}