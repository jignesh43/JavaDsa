package LinearSearch;

import java.util.Arrays;

public class StringLinearSearch {
    public static void main(String[] args) {
        String name = "Hacker";
        char Target ='i';
        boolean v = CharSearchInString(name,Target);
        System.out.println(v);
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static boolean CharSearchInString(String name, char Target){
        if (name.length()==0){
            return false;
        }
       /* for (int i =0 ; i<name.length(); i++){
            if (name.charAt(i)==Target){
                return true;
            }*/
        for (char a : name.toCharArray()) {
            // Compare each character with the target character
            if (a == Target) {
                return true;
            }
        }

        return false;


    }
}
