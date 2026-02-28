package sortings;

import java.util.Arrays;

public class Sortings{
    public static void main(String[] args) {
        // int []array={-1,-1-22,-33,-44,-2,-2,-44,-55,-55,-77};
        // System.out.println("Before sorting = "+Arrays.toString(array));
        // Sortings.ascendingOrder(array);
        // Sortings.descendingOrder(array);
        // Sortings.moveNegative(array);
        // Sortings.minMaxValue(array);
       
        // Sortings.secondLargestElement(array);
        Sortings.twoDarray();
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
public static void moveNegative(int []arr){
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

public static void secondLargestElement(int []arr){
    int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE,c=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>a){
            c=b;
            b=a;
            a=arr[i];
        }
    else if(arr[i]>b&&arr[i]!=a){b=arr[i];}
    
    else if(arr[i]>c&&arr[i]!=a&&arr[i]!=b){c=arr[i];}
    }
         System.out.println("first = "+a+"\nSecond = "+b+"\nThird = "+c+"");

    }
    public static void twoDarray(){
int [][]array={{2,3,10},
               {5,5,8},
               {31,4,6}};
               int sum=0;
               int value=0;
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array.length;j++){
                    if(i==j){
                        sum+=array[i][j];
                    }
                }
            }
            int target=array.length-1;
             for(int i=0;i<array.length;i++){
                
                for(int j=0;j<array.length;j++){
                    if(target==j){
                        
                        value+=array[i][j];
                        target--;
                        break;
                }
                }
            }
            System.out.println(sum);
            System.out.println(value);
    }

}
