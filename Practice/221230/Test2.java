
//找位置
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int find = 2, count = 0, answer = 0;
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int leng = arr.length;
        while (find != arr[answer]) {
            leng /= 2;
            if (arr[answer] < find) {
                answer -= leng;
            } else {
                answer += leng;
            }
            count++;
            System.out.printf("Debug Answer:%d\n", answer);
        }
        System.out.printf("Total run:%d\n", count);
        System.out.printf("Finall Answer:%d\n", answer);
    }
}