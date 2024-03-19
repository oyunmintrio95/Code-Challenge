package hackerRankWeek1;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        // Declare a variable for counting pairs.
        int pair = 0;

        // If n is less than two, pairs cannot exist.
        if(n <2){
            return pair;
        }

        //Use HashSet Data type to find unique value.
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i =0; i< ar.size(); i++){
            //If the one of pair is already in the set, than remove it and add count to 'pair' variable.
            if(s.contains(ar.get(i))){
                pair++;
                s.remove(ar.get(i));
            }else{
                // If there's no item in the set, then create new item in the Set.
                s.add(ar.get(i));
            }
        }

        return pair;
    }

}
public class SalesByMatch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
