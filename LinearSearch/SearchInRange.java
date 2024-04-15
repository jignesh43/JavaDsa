package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        String name = "Hacker";
        char Target ='c';
        int t=2;
        int x=4;
        boolean v = SearchInRange(name,Target,t,x);
        System.out.println(v);
    }
    static boolean SearchInRange(String name, char Target ,int t ,int x){
        if (name.length()==0){
            return false;
        }
       /* for (int i =0 ; i<name.length(); i++){
            if (name.charAt(i)==Target){
                return true;
            }*/
        for (int i =t ; i<x; i++) {
            // Compare each character with the target character
            if (name.charAt(i) == Target) {
                return true;
            }
        }

        return false;


    }
}

