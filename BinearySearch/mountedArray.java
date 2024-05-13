package BinearySearch;

public class mountedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,4,3,2,1};
        int value= mountedvalueinarray(arr);
        System.out.println(value);

    }
    static int mountedvalueinarray(int[]a)
    {
        int start = 0;
        int end = a.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if (a[mid]<a[mid+1]){
                start=mid+1;
            }
            else {
                end=mid;
            }

        }
        return start;
    }
}
