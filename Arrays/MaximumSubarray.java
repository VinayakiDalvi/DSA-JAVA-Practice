import java.util.*;
// //Brute force O(n^3)
// class MaximumSubarray {
//     public static void main(String[] args) {
//         int arr[]={-2,1,-3,4,-1,2,1,-5,4};
//         int ans=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 int sum=0;
//                 for(int k=i;k<j+1;k++){
//                     sum+=arr[k];
//                 }
//                 ans = Math.max(sum,ans);
//             }
//         }
        
//         System.out.println("Maximum subarray sum is: "+ans);
//     }
// }


//Better ApproachO(n^2)
// class MaximumSubarray {
//     public static void main(String[] args) {
//         int arr[]={-2,1,-3,4,-1,2,1,-5,4};
//         int ans=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             int sum=0;
//             for(int j=i;j<arr.length;j++){
//                 sum+=arr[j];
//                 ans = Math.max(sum,ans);
//             }
//         }
        
//         System.out.println("Maximum subarray sum is: "+ans);
//     }
// }

//Optimal Approach - Kandane's O(n)
class MaximumSubarray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int ans=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
            //if better sum found update ans
            if(sum > ans){
                ans=sum;
            }
            
            //if addition of ith element makes sum negative then no point in considering it hence make sum 0, restart from next element
            if(sum<0){
                sum=0;
            }
        }
        
        System.out.println("Maximum subarray sum is: "+ans);
    }
}
