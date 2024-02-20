package leetcode75.stringProb;

import java.util.ArrayList;
import java.util.List;

public class stringCompression {
    public int compress(char[] chars) {
        //    int ans = 0; // keep track of current position in compressed

        //    // iterate through input array using i pointer
        //    for(int i = 0; i < chars.length;){
        //        final char letter chars[i]; // current character being compressed
        //        int count = 0; // count of consecutive occurences of letter

        //        //count consecutive occurrences of letter in input array
        //        while(i< chars.length && chars[i] == letter){
        //            ++count;
        //            ++i;
        //        }

        //        //wirte letter to compressed array
        //        chars[ans++] = letter;

        //        // if count iss greater than 1, write count as string to compressed array
        //        if( count > 1){
        //            //convert count to string and iterate over each character in string
        //             for(final char c: String.valueOf(count).toCharArray()){
        //                 chars[ans+] = c;
        //             }

        //        }
        //    }

        //    //return length of compressed array
        //    return ans;

        List<Character> list = new ArrayList<>();
        int count = 1;
        for(int i = 0; i < chars.length-1; i++){
            if(chars[i] == chars[i+1]){
                count++;
            }else{
                list.add(chars[i]);
                if(count  > 1){
                    for ( char digit : Integer.toString(count).toCharArray()){
                        list.add(digit);
                    }
                }
                count = 1;
            }
        }
        list.add(chars[chars.length - 1]);
        if(count > 1){
            for(char digit : Integer.toString(count).toCharArray()){
                list.add(digit);
            }
        }
        for(int i =0; i< list.size(); i++){
            chars[i] = list.get(i);
        }

        return list.size();

    }
}
