package ShortingAlgoretham;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr ={4,5,7,545,80};
        sortarray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int sortarray(int[]a){
        for (int i = 0 ; i <= a.length; i++){
            for (int j =1;j<=a.length-1;j++){
                if (a[j-1]>a[j]){
                   int temp=a[j-1];
                   a[j-1]=a[j];
                   a[j]=temp;

                }
            }
        }
        return -1;
    }
}
