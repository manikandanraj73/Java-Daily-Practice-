package sortings;

import java.util.Arrays;

public class Sortings{
    public static void main(String[] args) {
        int []array={1,3,3,-9,-6,-11,57,0,44};
        System.out.println("Before sorting = "+Arrays.toString(array));
        Sortings.ascendingOrder(array);
        Sortings.descendingOrder(array);
        Sortings.moveNegagive(array);
        Sortings.minMaxValue(array);
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

// find the minimum and maximum value from given array
public static void minMaxValue(int[]arr){
int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        else if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("Min Value = "+min);
System.out.println("Max Value = "+max);
}

}
