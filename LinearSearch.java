public class LinearSearch {
    public static void main(String [] arg){
        System.out.println("LinearSearch and return value is index");
        int []a ={1,2,14,54,25,45,20};
        int value = LinearSearch(a,20);
        System.out.println(value);
    }
    static int LinearSearch(int[]arr,int Target){
        //if the lenth is empty
        if (arr.length==0){
            return -1;
        }
        // travel and check index by index
        for (int index =0 ; index <arr.length; index++){
            int element = arr[index];
            if (element==Target){
                return index;
            }

        }
        // all travel is done but element is not present in array
        return -1;

    }
}
