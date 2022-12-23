
//找第幾個大的
import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int answer = 0, finall = 0, temp = 0, max = 0;
        Scanner input = new Scanner(System.in);
        answer = input.nextInt();
        int[] arr = { 7, 5, 4, 9, 8, 1, 2 };
        int[] flag = { 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < answer; i++) {
            finall = max;
            for (int j = 0; j < arr.length; j++) {
                if (finall < arr[j] && flag[j] == 0) {
                    finall = arr[j];
                    temp = j;
                }
            }
            flag[temp] = 1;
        }
        System.out.printf("ANS:%d\n", finall);
    }
}