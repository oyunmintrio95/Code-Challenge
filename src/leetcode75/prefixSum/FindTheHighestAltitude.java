package leetcode75.prefixSum;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        // we need an array of altitueds
        int[] alti = new int[gain.length+1];
        alti[0] = 0;

        int max = 0;

        for(int i = 0; i< gain.length; i++){
            if(i == 0){
                alti[i+1] = gain[i];
            }else{
                alti[i+1] = gain[i] + alti[i];
            }

            max = Math.max(alti[i+1], max);
        }

        return max;


    }

    //The optimized version
    /*
    * int n = gain.length;
    * int max_so_far = 0;
    * int max_fianl = 0;
    * for(int i = 0; i< n; i++){
    *   max_so_far += gain[i];
    *   max_final = Math.max(max_fianl, max_so_far);
    * }
    * return max_final
    * */
}
