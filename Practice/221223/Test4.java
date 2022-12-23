
//找第幾個大的
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        float compare = 2, paint = 0;
        float[] arr = { 7, 5, 4, 9, 8, 1, 2 };
        System.out.printf("雙雙平均值是：");
        for (int i = 0; i < arr.length - 1; i += compare) {
            for (int j = 0; j < compare; j++) {
                if (i + j < arr.length - 1) {
                    paint += arr[i + j];
                }
            }
            System.out.printf("%.1f ", paint / compare);
            paint = 0;
        }
        if (arr.length % compare != 0) {
            for (int i = 1; i < ((arr.length % compare) + 1); i++) {
                System.out.printf("%.1f ", arr[arr.length - i]);
            }
        }
    }
}