package leetcode75.hashMapSet;

import java.util.*;

public class UniqueNumberofOccurences2 {
    /*
    1. Create an unordered map freq to store the frequency of each element in the array
    2. Iterate through each element of the input array(arr)
    3. Update the frequency count in the freq map.
    4. Create an unordered set s to store unique frequencies
    5. Itereate through the entries in the freq map and insert the frequencies into the set s.
    6. Check if the size of the freq map is equal to the size
    fo the set s. If they are equal, it means that the occurences of frequences are unique
    *
    * */
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Set<Integer> s = new HashSet<>();
        for (int x : freq.values()) {
            s.add(x);
        }

        return freq.size() == s.size();
    }
}
