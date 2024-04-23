package BinearySearch;

import java.util.Arrays;

public class firsrandlastpostionOfelement {
    public static void main(String[] args) {
        int[] ans ={-1,-1};
        int[] arr={5,7,7,7,8,8,10};
        int Tra =8;
        int start = binearysearch(arr,Tra,true);
       int end =binearysearch(arr,Tra,false);
       ans[0]=start;
       ans[1]=end;
        System.out.println( Arrays.toString(ans));

    }
    static int binearysearch(int []arr,int ta,boolean firstindex){
        int ans =-1;
    int start = 0;
    int end = arr.length - 1;
        while (start <= end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == ta) {

           ans= mid;
           if(firstindex){
               end=mid-1;
           }
           else {
               start=mid+1;
           }
        } else if (arr[mid] < ta) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
        return ans;
}}

