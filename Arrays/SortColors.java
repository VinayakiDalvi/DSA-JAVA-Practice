// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
//Better - O(n)
// class SortColors {
//     public static void main(String[] args) {
//         int[] nums={2,1,1,0,2,1};
//         sortColors(nums);
//         for(int i=0;i<nums.length;i++){
//             System.out.print(nums[i]+" ");
//         }
//     }

//     public static void sortColors(int[] nums) {
//         int r=0,w=0;

//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0)r++;
//             else if(nums[i]==1)w++;
//             else continue;
//         }
//         System.out.println(r+" "+w);
//         for(int i=0;i<r;i++){
//             nums[i]=0;
//         }

//         for(int i=r;i<r+w;i++){
//             nums[i]=1;
//         }

//         for(int i=r+w;i<nums.length;i++){
//             nums[i]=2;
//         }
// }
// }
//DutchNational Flag - Optimal O(n)
class SortColors {
    public static void main(String[] args) {
        int[] nums={2,1,1,0,2,1};
        sortColors(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
}
