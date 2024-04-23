package BinearySearch;

public class charSearch {
    public static void main(String[] args) {
        char[]arr= {'c','f','g'};
        //System.out.println(arr[0]);
        char target='v';
      char val=  ceilingchar(arr,target);
        System.out.println(val);

    }
    static char ceilingchar(char[]a,char ta){

        int start = 0;
        int end = a.length-1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (a[mid] == ta) {
                return a[mid];
            } else if (a[mid] < ta) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return a[start];


        }



}
