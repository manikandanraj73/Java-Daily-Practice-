package ArraysProblem;

public class LongestSubArray{
    public static void main(String[] args) {
        int[]arr={1,-2,-3,2,-1,4,-2,5,-6};
        LongestSubArray.longestSubArray(arr);    }
    // i tried to find the sum longest sub array
    // with help of Kadane's Algorithm
    public static void longestSubArray(int [] arr){
        int sum=0, max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int temp=sum+arr[i];
            if(temp<arr[i]){
                sum=arr[i];

            }
            else{
                sum=temp;
            }
            if(sum>max){
                max=sum;
            }
        }System.out.println("longest sub array sum : "+max);
    }
}