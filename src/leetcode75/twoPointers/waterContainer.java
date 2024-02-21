package leetcode75.twoPointers;

public class waterContainer {
    public int maxArea(int[] height) {
        //area : (end-str)*Math.min(height[str], hegiht[end])

        //set two pointers
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            int currentArea = Math.min(height[left], height[right]) * (right-left);
            maxArea = Math.max(maxArea, currentArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;


    }
}
