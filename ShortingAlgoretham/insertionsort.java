package ShortingAlgoretham;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[]arr={5,3,4,1,2 };
        insertsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertsort(int[]a){
        for (int i = 0; i<=a.length-2;i++){
            for (int j=i+1;j>0;j--){
                if (a[j]<a[j-1]){
                    swap(a,j,j-1);
                }
            }
        }
    }
    static void swap(int []a,int first,int second){
        int temp = a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
