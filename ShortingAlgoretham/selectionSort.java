package ShortingAlgoretham;

import java.sql.Array;
import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[]arr={2,5,4,6,8,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]a){
        for (int i=0;i<a.length;i++) {
            int last = a.length - i - 1;
            int number = max(a, 0, last);
            swap(a, number, last);
        }
    }
    static int max(int[]a,int start,int last){

        int maximum =start;
        for (int i=start;i<=last;i++)
        {

            if (a[maximum]<a[i]){
               maximum=i;
            }

        }
        return maximum;

    }
    static void swap(int []a,int first,int second){
        int temp = a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
