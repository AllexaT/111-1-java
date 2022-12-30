import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[][] data2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        for (int i = (data2.length) * (data2[0].length) - 1; i > -1; i--) {
            System.out.print(data2[i / data2[0].length][i % data2[0].length]);
        }
    }
}