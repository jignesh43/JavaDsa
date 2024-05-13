package ShortingAlgoretham;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[]arr={3,5,2,1,4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicsort(int[]a){
        int i =0;
        while (i<a.length){
            int correct = a[i]-1;
            if (a[i]!=a[correct]){
                swap(a,i,correct);
            }
            else {
                i++;
            }
        }

    }
    static void swap(int []a,int first,int second){
        int temp = a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
