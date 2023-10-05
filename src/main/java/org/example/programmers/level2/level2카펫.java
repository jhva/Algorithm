package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class level2카펫 {
    public static void main(String[] args) {
        solve(10, 2);
    }

    static void solve(int brown, int yellow) {
        int[] answer = new int[2];
        //노란색격자수는 1이상이여서 3부터 시작

        int sum = brown + yellow;

        for (int i = 3; i < sum; i++) {
            int div = (sum) / i;
            System.out.println(div);

            if (div >= i) {
                if ((i - 2) * (div - 2) == yellow) {//갈색격자는 테두리를무조건갖고있기때문에
                    answer[0] = div;
                    answer[1] = i;
                    break;
                }
            }
        }
//::


    }
}
