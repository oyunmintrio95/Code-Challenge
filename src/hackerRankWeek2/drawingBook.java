package hackerRankWeek2;

public class drawingBook {
    public static int pageCount(int n, int p) {
        // page count from front;
        int front = p/2;
        // page count from back;
        // or int back = n/2 - front;
        int back = 0;
        if(n %2 ==0 && n-p ==1){
            back = 1;
        }else{
            back = (n-p)/2;
        }

        return Math.min(front, back);

    }
}
