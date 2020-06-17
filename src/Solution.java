public class Solution {
    public static void main(String[] args) {



    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && !vacation)
            return false;
        else
            return true;
    }

    public int sumDouble(int a, int b) {
        if (a == b)
            return a*4;
        else
            return a + b;
    }

    public String altPairs(String str) {
        String result = "";
        for (int i = 1; i < str.length(); i = i + 2) {
            result += str.charAt(i-1) + str.charAt(i);
        }
        return result;
    }







}
