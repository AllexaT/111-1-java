import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 4, 9, 8, 1, 2 };
        float alls = 0;
        Arrays.sort(arr);
        System.out.printf("MAX:%d\n", arr[arr.length - 1]);
        System.out.printf("MIN:%d\n", arr[0]);
        for (int i = 0; i < arr.length; i++) {
            alls += arr[i];
        }
        System.out.printf("AVR:%f\n", alls / arr.length);
        System.out.printf("MID:%d\n", arr[(arr.length - 1) / 2]);

    }
}
