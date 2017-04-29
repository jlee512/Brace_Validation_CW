import java.util.*;

/**
 * Created by Julian on 29/04/2017.
 */
public class Groups {

    public static boolean groupCheck(String s) {

        Map <Character, Character> bracePairing = new HashMap<>();

        bracePairing.put(')', '(');
        bracePairing.put(']', '[');
        bracePairing.put('}', '{');

        Deque <Character> openingBraces = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                openingBraces.addFirst(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                if (openingBraces.peek() == bracePairing.get(s.charAt(i))){
                    openingBraces.remove();
                } else {
                    return false;
                }
            }
        }
        return openingBraces.peek() == null;
    }

    public static void main(String[] args) {

        String s1 = "{}";
        String s2 = "{]";
        String s3 = "ABC()([]{})";
        String s4 = "()[]{({[]})}";
        boolean test1 = Groups.groupCheck(s1);
        boolean test2 = Groups.groupCheck(s2);
        boolean test3 = Groups.groupCheck(s3);
        boolean test4 = Groups.groupCheck(s4);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }

}
