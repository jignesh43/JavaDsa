package LinearSearch;

public class MinNumberFound {
    public static void main(String[] args) {
        int[] arr ={1,4,2,5,7,0,8,6,4,5,7,8,99};
        int value=min(arr);
        System.out.println(value);



    }
    static int min(int[]arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];

            }
        }
          return ans;
    }
}
