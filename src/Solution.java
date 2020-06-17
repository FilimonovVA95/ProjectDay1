import java.sql.SQLOutput;

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

    public  static void hardTask(String str) {
        String buf = str;
        int n, m, k = 0;

        String masString[] = str.split("/n");

        String arg[] = masString[0].split(" ");
        n = Integer.parseInt(arg[0]);
        m = Integer.parseInt(arg[1]);
        k = Integer.parseInt(arg[2]);
        int matrix[] [] = new int[n][m];

        for (int i = 1; i <= n; i++) {
            String nString[] = masString[i].split(" ");
            for (int j = 0; j < m; j++)
                matrix[i][j] = Integer.parseInt(nString[j]);
        }

        for(int i = n + 1; i <= n + k; i++) {
            String kString[] = masString[i].split(" ");
            String query = kString[0];
            int firstIndex = Integer.parseInt(kString[1]) - 1;
            int secondIndex = Integer.parseInt(kString[2]) - 1;

            switch (query) {
                case ("c"):
                    int buff;
                    for (int j = 0; j < n; j++) {
                        buff = matrix[j][firstIndex];
                        matrix[j][firstIndex] = matrix[j][secondIndex];
                        matrix[j][secondIndex] = buff;
                    }

                    break;

                case ("r"):
                    int buff1;
                    for (int j = 0; j < n; j++) {
                        buff1 = matrix[firstIndex][j];
                        matrix[firstIndex][j] = matrix[secondIndex][j];
                        matrix[secondIndex][j] = buff1;
                    }

                    break;


                case ("g"):
                    System.out.println(matrix[firstIndex][secondIndex]);

                    break;
            }
        }

    }

}
