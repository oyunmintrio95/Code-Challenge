package leetcode75.prefixSum;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        //find the totla of nums
        int total = 0;
        for(int i = 0; i< nums.length; i++){
            total += nums[i];
        }

        //set right sum and left sum as 0
        int rightSum = 0;
        int leftSum = total;
        int pivot = 0;

        //set the pointer from the start and calculate the rightsum and left sum
        for(int i =0; i<nums.length; i++){
            leftSum -= nums[i];
            //checks if rightsum and leftsum are equal
            if(rightSum == leftSum){
                return i;
            }else{
                rightSum += nums[i];
            }
        }

        return -1;


    }

    // Optimal
    /*
    * //Initialize total sum of the given array...
    * int totalSum = 0;
    * //Initialize 'leftSum' as sum of first i numbers, not including
    * int leftSum = 0;
    * //Traverse the elements and add them to store the totalSum...
    * for(int ele : nums)
    *   totalSum += ele;
    * for(int i = 0; i< nums.length; leftsum += nums[i++])
    *      //sum to the left == leftsum.
    *       // sum to the right === totalSum - leftsum - nums[i]
    *       // check if leftsum == totalSum - leftsum - nums[i])
    *          if(leftsum * 2 == totalSum - nums[i])
    *           return i;
    *
    * return -1;
    * */
}
