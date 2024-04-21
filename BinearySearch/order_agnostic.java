package BinearySearch;

public class order_agnostic {

    public static void main(String[] args) {
        //order is in assending like is in must be in sorted array is here
        int[]arr = {10,14,25,45,64,78,598};
        int Target =64;
        int value = OrderAgnostic(arr,Target);
        System.out.println(value);

    }
    static int OrderAgnostic(int []a ,int tar) {
        int start = 0;
        int last = a.length - 1;
        int middle = start + last / 2;
        boolean agon = a[start] < a[last];
        while (start <= last) {
            if (agon) {
                if (a[middle] == tar) {
                    return middle;
                } else {
                    middle = start++;
                }


            } else {
                if (a[middle] == tar) {
                    return middle;
                } else {
                    middle = last--;
                }

            }
        }

return -1;
    }
    }

