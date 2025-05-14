import java.util.*;

//Time: O(n),Space: O(1)
class NextPermutation {
    public static void main(String[] args) {
        int[] nums={2,1,5,4,3,0,0};
        nextPermutation(nums);
        
        System.out.println("Answer is: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        
    }
    static void reverseArray(int[] nums,int start,int end){
        int temp;
        while(start<end){
            temp= nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    static void swapElements(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void nextPermutation(int[] nums) {
        int part=-1;
        //1. Finding the longest common substring ie number after which there are greater numbers to swap with
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                part=i;
                break;
            }
        }
        //if there aren't any that means its a last permutation
        if(part==-1){
            reverseArray(nums,0,nums.length-1);
            return;
        }
        //2. Find the smallest number greater than partition
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[part]){
                swapElements(nums,i,part);
                break;
            }
        }
        //3.left side is done, son now just sort the right side
        reverseArray(nums,part+1,nums.length-1);
        return;
    }
}
