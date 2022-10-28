public class Test1 {
    public static void main(String[] args) {
        int star = 5;
        for (int runtimes = 0; runtimes < 6 * 6; runtimes++) {
            if (runtimes % 6 == 0 && runtimes != 0) {
                star = 5 - runtimes / 6;
                System.out.println();
            }
            if (runtimes % 6 < star) {
                System.out.printf("*");
            } else {
                System.out.printf("%d", star - (4 - runtimes / 6));
                star += 1;
            }
        }
    }
}