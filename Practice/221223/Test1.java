
//不透過分類尋找目標值
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 4, 9, 8, 1, 2 };
        int[] arr2 = { 0, 1000, 1, 0, 0 };
        int[] flag = { 0, 0, 0, 0, 0, 0, 0 };
        float alls = 0;
        for (int i = 0; i < arr.length * arr.length; i++) {
            if (arr[i % arr.length] > arr2[0]) {
                arr2[0] = arr[i % arr.length];
            } else if (arr[i % arr.length] < arr2[1]) {
                arr2[1] = arr[i % arr.length];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            alls += arr[i];
        }
        for (int i = 0; i < (arr.length / 2) + 1; i++) {
            arr2[2] = arr2[0];
            for (int j = 0; j < arr.length; j++) {
                if (arr2[2] > arr[j] && flag[j] == 0) {
                    arr2[2] = arr[j];
                    arr2[3] = j;
                }
            }
            flag[arr2[3]] = 1;
        }
        System.out.printf("MAX:%d\n", arr2[0]);
        System.out.printf("MIN:%d\n", arr2[1]);
        System.out.printf("AVR:%f\n", alls / arr.length);
        System.out.printf("MID:%d\n", arr2[2]);
    }
}