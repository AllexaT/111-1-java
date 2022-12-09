public class Test2 {
    public static void main(String args[]) {
        int[] iArr = { 7, 3, 4, 9, 6, 8, 2 }, temp = { 0, 0, 0, 0 };
        int number = 7, min = 0, max = 0, x = 1, run = 0; // Number是大小
        int runtimes = number;
        while (number / x > 1) {
            min = x - 1;
            max = x - 1;
            for (int i = runtimes - (x - 1); i > (x - 1); i--) {
                run++;
                if (iArr[i - 1] > iArr[max]) {
                    max = i - 1;
                } else if (iArr[i - 1] < iArr[min]) {
                    min = i - 1;
                }
            }
            temp[0] = iArr[x - 1];
            temp[1] = iArr[number - (x - 1) - 1];
            temp[2] = iArr[min];
            temp[3] = iArr[max];
            System.out.printf("Before: %d %d %d %d %d %d %d\n", iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5],
                    iArr[6]);
            System.out.printf("min:%d max:%d\n", iArr[min], iArr[max]);
            iArr[x - 1] = temp[2];
            iArr[number - (x - 1) - 1] = temp[3];
            System.out.printf("test1: %d %d %d %d %d %d %d\n", iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5],
                    iArr[6]);
            if (number / (x + 1) > 1) {
                System.out.printf("RUN FIRST\n");
                if (temp[0] != temp[3]) {
                    iArr[min] = temp[0];
                }
                if (temp[1] != temp[2]) {
                    iArr[max] = temp[1];
                }
            } else {
                System.out.printf("RUN SECOND\n");
                iArr[min] = temp[0];
            }
            System.out.printf("test2: %d %d %d %d %d %d %d\n", iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5],
                    iArr[6]);
            x++;
        }
        System.out.printf("%d %d %d %d %d %d %d\n", iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], iArr[6]);
        System.out.print(run);
    }
}