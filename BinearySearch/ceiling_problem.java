package BinearySearch;

public class ceiling_problem {
    public static void main(String[] args) {
        int []arr ={15,16,17,18,20,22};
        int target = 21;
       int value= cellingProblem(arr,target);
        System.out.println(value);



    }
    static int cellingProblem(int []a,int tar){
        int start = 0;
        int end = a.length -1;

        while (start<=end){
            int mid = (start+end)/2;
            if (a[mid] == tar){
                return mid;

            }
            else if (a[mid]<tar){
                start=mid+1;
            }
            else if (a[mid]>tar){
                end=mid-1;
            }
        }
        return  start;
    }}



