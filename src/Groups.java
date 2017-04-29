import java.util.*;

/**
 * Created by julia on 29/04/2017.
 */
public class Groups {

    public static boolean groupCheck(String s) {

        

        Deque <Character> openingBraces = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                openingBraces.addFirst(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                openingBraces.poll(s.charAt(i));
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "{}";
        String s2 = "{]";
        String s3 = "ABC()([]{})";
        boolean test1 = Groups.groupCheck(s1);
        boolean test2 = Groups.groupCheck(s2);
        boolean test3 = Groups.groupCheck(s3);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }

}
