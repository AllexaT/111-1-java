public class Test1 {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 4, 8, 1, 2 };
        int temp;
        for (int i = arr.length / 2; i >= 0; i--) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
