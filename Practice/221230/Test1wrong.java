
//找第幾個大的
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int find = 2, count = 0;
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int leng = arr.length / 2;
        while (find != arr[leng]) {
            if (arr[leng] < find) {
                leng /= 2;
            } else {
                leng += 1;
            }
            count++;
        }
        System.out.printf("count:%d\n", count);
        System.out.printf("ANS:%d\n", leng);
    }
}