package ArraysProblem;
public class MajorityElement{
    public static void majorityElement(int[] arr){
        int count=1;
        int elment=arr[0];                           
        // 1,2,3,2,1,4
        for(int i=0;i<arr.length;i++){//1-2-3
            if(arr[i]==elment){ //true-false
                count++;//2- -
            }
            else{// -true-true-
                
                count--;//1-0
            }
            if(count==0){//false-false-true-
                elment=arr[i];//
                count=1;
            }
        }System.out.println("Majority Elment : "+elment);
    }
    public static void main(String[] args) {
        int[] arr={1,1,3,3};
        MajorityElement.majorityElement(arr);
    }
}