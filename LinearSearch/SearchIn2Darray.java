package LinearSearch;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][]arr={
                {1,45,78,74},
                {47,74,85,24},
                {45,747,58,44}
        };
         int Target1 = 78;
        //System.out.println(searchInarr(arr,Target1));
       int[]ans=searchInarr2(arr,Target1);
        System.out.println(Arrays.toString(ans));


        }

    static boolean searchInarr( int[][]arr,int T) {
        if(arr.length == 0){
            System.out.println("lenth of the array is zero"
            );
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == T) {
                    return true;
                }
            }


        }
        return false;
    }
    // print the value in cordinate form

    static int[] searchInarr2(int[][]arr, int T) {
        if(arr.length == 0){
            System.out.println("lenth of the array is zero"
            );
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == T) {
                    return new int[]{i,j};
                }
            }


        }
        return new int[]{-1};}

}




