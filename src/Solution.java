public class Solution {
    public static void main(String[] args) {

        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
        System.out.println();

        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
        System.out.println();

        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
        System.out.println();

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && !vacation)
            return false;
        else
            return true;
    }

    public static int sumDouble(int a, int b) {
        if (a == b)
            return a*4;
        else
            return a + b;
    }

    public static String altPairs(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (((i / 2) % 2) == 0) {
                result += str.charAt(i);
            }
        }

        return result;

    }









}
