package leetcode75.hashMapSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurences {
    public boolean uniqueOccurrences(int[] arr) {
        // Do we need two Data structure?
        // HashMap to store elements and their counts.
        Map<Integer, Integer> hsm = new HashMap<Integer, Integer>();
        for(int n: arr){
            if(hsm.get(n) == null){
                hsm.put(n,1);
            }else{
                hsm.put(n,hsm.get(n)+1);
            }
        }

        //Then with Set data structure check for the unique count.
        Set<Integer> hs = new HashSet<Integer>();
        //loop through hsm first
        for(Map.Entry<Integer, Integer> e: hsm.entrySet()){
            if(hs.contains(e.getValue())){
                return false;
            }else{
                hs.add(e.getValue());
            }
        }

        return true;
    }
}
