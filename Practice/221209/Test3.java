public class Test3 {
    public static void main(String args[]) {
        int[] iArr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int place = 0, searching = iArr.length, search = 7, runtimes = 0;
        while (searching != search) {
            runtimes++;
            if (iArr[place] > search) {
                searching /= search;
            } else {
                searching++;
            }
            if (search > iArr.length / 2) {
                place = searching;
            } else {
                place = 10 - searching;
            }

            System.out.printf("%d %d \n", search, searching);
        }
        System.out.printf("%d的位置在%d\n", searching, place);
        System.out.printf("運行%d次", runtimes);
    }
}