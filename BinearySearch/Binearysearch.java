package BinearySearch;

public class Binearysearch {
    public static void main(String[] args) {
        int[] arr={10,24,255,264,54,52,35,85,8744,545,45};
        int Tra =10;
        int value = binearysearch(arr,Tra);
        System.out.println(value);
    }
    static int binearysearch(int []arr,int ta){

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == ta) {
                System.out.println("Your number is found");
                return 1;
            } else if (arr[mid] < ta) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;






        }
       }


