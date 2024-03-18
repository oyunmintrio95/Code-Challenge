package leetcode75.hashMapSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindtheDifferenceofTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        // Make an answer array
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // Make 2 inner arrays to add
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();

        // Make two sets
        Set<Integer> hs1 = new HashSet<Integer>();
        Set<Integer> hs2 = new HashSet<Integer>();

        //Add elements to each set
        for(int n: nums1) hs1.add(n);
        for(int n: nums2) hs2.add(n);

        //check if there's same nums for each loop
        for(int n: hs1){
            if(hs2.contains(n) == false){
                ans1.add(n);
            }
        }
        for(int n: hs2){
            if(hs1.contains(n) == false){
                ans2.add(n);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        return ans;

        //Time complexity O(n)



    }
}
