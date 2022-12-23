
//找第幾個小的
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner input = new Scanner(System.in);
        answer = input.nextInt();
        int[] arr = { 7, 5, 4, 9, 8, 1, 2 };
        int[] arr2 = { 0, 1000, 1, 0, 0 };
        int[] flag = { 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < answer; i++) {
            arr2[2] = arr2[1];
            for (int j = 0; j < arr.length; j++) {
                if (arr2[2] > arr[j] && flag[j] == 0) {
                    arr2[2] = arr[j];
                    arr2[3] = j;
                }
            }
            flag[arr2[3]] = 1;
        }
        System.out.printf("ANS:%d\n", arr2[2]);
    }
}