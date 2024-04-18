package LinearSearch;

public class MaxMinIn2Darray {
    public static void main(String[] args) {
        int[][]arr={
                {1,45,78,74},
                {47,74,85,24},
                {45,747,58,44}
        };
        System.out.println("this is the max number in the 2d array");
        int value = maxvalue(arr);
        System.out.println(value);
        System.out.println("this is the min number in the 2d array");
        int minvalue = minvalue(arr);
        System.out.println(minvalue);

    }
static int maxvalue(int [][]arr){
        int max = Integer.MIN_VALUE;
        for (int[] i: arr){
            for (int j:i){
                if(j>max){
                    max=j;

                }

            }

        }
        return max;


}
    static int minvalue(int [][]arr){
        int min = Integer.MAX_VALUE;
        for (int[] i: arr){
            for (int j:i){
                if(j<min){
                    min=j; 

                }

            }

        }
        return min;
    }

}
