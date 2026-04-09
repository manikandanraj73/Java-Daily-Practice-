package ArraysProblem;

import java.util.ArrayList;

public class LeaderElements {
    public static void main(String[] args) {
        int[]arr={15,17,3,4,5,1};
    //    LeaderElements.optSltnForLeaderElmt(arr);
      System.out.println(LeaderElements.leaderElements(arr));
    }
    //  leader elements means which elements dont have higher elements than itself on right side of the array
    // Example [16,17,3,5,2] = output =[17,5,2] because these twi elements dont have higher elements than itself on righy side.
    public static ArrayList<Integer> leaderElements(int [] arr){
        ArrayList<Integer>alist=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    flag=false;
                }
            }
            if(flag){
                alist.add(arr[i]);
            }
        }
        return alist;
    }
    public static void optSltnForLeaderElmt(int[] arr){
        int max=arr[arr.length-1];System.out.print(max+" ");
        for(int i=arr.length-2;i>=0;i--){
    if(arr[i]>max){
        max=arr[i];
        System.out.print(max+" ");
    }            
        }
    }
}
