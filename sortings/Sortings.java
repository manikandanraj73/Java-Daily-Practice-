package sortings;

import java.util.Arrays;

public class Sortings{
    public static void main(String[] args) {
        int []array={1,-2,-3,4,5,33,44,1,-8,-9,55};
        System.out.println("Before sorting = "+Arrays.toString(array));
        Sortings.ascendingOrder(array);
        Sortings.descendingOrder(array);
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
}