package leetcode75.slidingWindow;

public class MaximumNumofVowelsInASubstring {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        s = s.toLowerCase();

        int count = 0;
        // first window vowel counts
        for(int i = 0; i < k; i++){
            if(vowels.indexOf(s.charAt(i)) >= 0){
                count++;
            }
        }

        int max = count;

        for(int i = k; i < s.length(); i++){
            // if the next vowel contains vowels increase count
            if(vowels.indexOf(s.charAt(i)) >= 0){
                count++;
            }
            // i-k is the previous count. we should subtract it. Not for the "now" window.
            if(vowels.indexOf(s.charAt(i-k)) >= 0){
                count--;
            }
            max = Math.max(count, max);

        }

        return max;





    }
}
