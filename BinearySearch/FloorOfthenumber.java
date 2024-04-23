package BinearySearch;

public class FloorOfthenumber {
    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 15, 25, 256, 455};
        int target = 400;
        int value = foorOfThenumber(arr, target);
        System.out.println(value);

    }

    static int foorOfThenumber(int[] a, int t) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == t) {
                return mid;
            } else if (a[mid] < t) {
                start = mid + 1;
            } else if (a[mid] > t) {
                end = mid - 1;

            }

        }
        return end;
    }
}