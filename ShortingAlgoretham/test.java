package ShortingAlgoretham;

import javax.xml.stream.events.EndDocument;

public class test {
    public static void main(String[] args) {
        int[] nums = {6,5,4,3,2,3,2};

        int value = findInsertvalue(nums );
        System.out.println(value);

    }

    static int findInsertvalue(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // If mid element is greater than its next element, potential peak is on the left
                end = mid;
            } else {
                // If mid element is less than or equal to its next element, potential peak is on the right
                start = mid + 1;
            }
        }
return start;
    }
}

