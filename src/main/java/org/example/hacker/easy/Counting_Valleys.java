package org.example.hacker.easy;

public class Counting_Valleys {
    public static void main(String[] args) {
        solve(10, "UDUUUDUDDD");
    }

    static void solve(int steps, String path) {

        int sealevel = 0; //레벨
        int ans = 0; //개수

        for (int i = 0; i < steps; i++) {
            int currentlevel = sealevel; //
            if (path.charAt(i) == 'U') {
                sealevel++; // up일땐 산이니까 ++
            } else if (path.charAt(i) == 'D') {
                sealevel--; // down 일땐 계곡
            }

            if (currentlevel < 0 && sealevel == 0) { // sealevel이 0 이되면 그것이 계곡하나 찾은거기때문에
                ans++;
            }
        }
        System.out.println(ans);
    }
}
