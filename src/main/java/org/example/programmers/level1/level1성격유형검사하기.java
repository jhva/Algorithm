package org.example.programmers.level1;

public class level1성격유형검사하기 {
    public static void main(String[] args) {
        solve(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
    }

    static void solve(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        int R = 0, T = 0, C = 0, F = 0, J = 0, M = 0, A = 0, N = 0;
        String a1 = "R", a2 = "C", a3 = "J", a4 = "A";

        for (int i = 0; i < survey.length; i++) {
            String str = survey[i];
            /// AN
            String strType = choices[i] > 4 ? str.substring(1, 2) : str.substring(0, 1);
            // A, M , C , F
            int score = Math.abs(choices[i] - 4);
            switch (strType) {
                case "R":
                    R += score;
                    break;
                case "T":
                    T += score;
                    break;
                case "C":
                    C += score;
                    break;
                case "F":
                    F += score;
                    break;
                case "J":
                    J += score;
                    break;
                case "M":
                    M += score;
                    break;
                case "A":
                    A += score;
                    break;
                case "N":
                    N += score;
                    break;
            }
        }
        if (R < T) a1 = "T";
        if (C < F) a2 = "F";
        if (J < M) a3 = "M";
        if (A < N) a4 = "N";

        sb.append(a1).append(a2).append(a3).append(a4);

        System.out.println(sb);
    }

}
