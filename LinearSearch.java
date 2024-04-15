public class LinearSearch {
    public static void main(String [] arg){
        System.out.println("LinearSearch and return value is index");
        int []a ={1,2,14,54,25,45,20};
        int value = LinearSearch(a,20);
        System.out.println(value);

        System.out.println("LinearSearch and return value true and false");
        int []aa ={1,2,14,54,25,45,20};
        boolean value1 = LinearSearch1(aa,20);
        System.out.println(value1);

        System.out.println("LinearSearch and return value is element");
        int []aaa ={1,2,14,54,25,45,20};
        int value2 = LinearSearch2(aaa,20);
        System.out.println(value2);
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
    static boolean LinearSearch1(int[]arr,int Target){
        //if the lenth is empty
        if (arr.length==0){
            return false;
        }
        // travel and check index by index
        for (int index =0 ; index <arr.length; index++){
            int element = arr[index];
            if (element==Target){
                return true;
            }

        }
        // all travel is done but element is not present in array
        return false;

    }
    static int LinearSearch2(int[]arr,int Target){
        //if the lenth is empty
        if (arr.length==0){
            return Integer.MAX_VALUE;
        }
        // travel and check index by index
        for (int index =0 ; index <arr.length; index++){
            int element = arr[index];
            if (element==Target){
                return element;
            }

        }
        // all travel is done but element is not present in array
        return Integer.MAX_VALUE;

    }
}
