package BinearySearch;

public class rotionarry {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,2};
        int value= mountedvalueinarray(arr);
        System.out.println(value);

    }
    static int mountedvalueinarray(int[]a)
    {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If mid is greater than the next element, then mid is the pivot
            if (mid< right && a[mid] > a[mid + 1]) {
                return mid ;
            }

            // If mid is smaller than the previous element, then mid-1 is the pivot
            if (mid>left&&a[mid] < a[mid - 1]) {
                return mid-1;
            }

            // If the left half is sorted, search in the right half
            if (a[mid] <= a[left]) {
                right=mid-1;
            } else { // If the right half is sorted, search in the left half
                left = mid +1;
            }
        }

        // If no pivot is found, the array is not rotated, so return 0
        return 0;
    }
}
   
