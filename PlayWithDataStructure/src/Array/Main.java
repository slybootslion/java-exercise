package Array;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] scores = {100, 99, 98};
        scores[0] = 90;
        for (int score : scores)
            System.out.println(score);
    }
}
