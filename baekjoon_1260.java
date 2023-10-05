import java.util.*;

/*
정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000),
 */
public class baekjoon_1260 {
    static int[][] graph;
    static int N;
    static int M;
    static int V;
    static boolean visit[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 정점의 개수 4
        M = sc.nextInt(); // 간선 개수 5
        V = sc.nextInt();// 탐색을 시작 할 정점의 번호 1

        graph = new int[1001][1001];
        visit = new boolean[10001]; //방문한곳


        for (int i = 1; i <= M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a][b] = graph[b][a] = 1;

        }

        dfs(V);
        for (int j = 1; j <= N; j++) {
            visit[j] = false;
        }
        System.out.println();
        bfs(V);

    }

    public static void dfs(int index) {
        visit[index] = true;
        System.out.print(index + " ");

        for (int i = 1; i <= N; i++) {
            if (graph[index][i] == 1 && visit[i] == false) {
                dfs(i);
            }
        }

    }


    public static void bfs(int index) {

        Queue<Integer> que = new LinkedList<Integer>();

        que.offer(index);
        visit[index] = true;
        System.out.print(index + " ");

        int temp;

        while (!que.isEmpty()) {
            temp = que.poll();

            for (int j = 0; j < N + 1; j++) {
                if (graph[temp][j] == 1 && visit[j] == false) {
                    que.offer(j);
                    visit[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }
}
