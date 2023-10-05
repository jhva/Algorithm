package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class level2배달 {
    static List<ArrayList<Edge>> graph;
    static int ans;

    static class Edge implements Comparable<Edge> {
        int index;//위치
        int cost; // 간선
        int l;

        Edge(int index, int cost, int l) {
            this.index = index;
            this.l = l;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) {
        solve(5, new int[][] {{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}}, 3);
    }

    static void solve(int N, int[][] road, int K) {

        int answer = 0;


        ans = 1;//무조건 마을은 첫번째
        graph = new ArrayList<>();


        int[] visit = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < road.length; i++) {
            graph.get(road[i][0]).add(new Edge(road[i][0], road[i][1], road[i][2]));
            graph.get(road[i][1]).add(new Edge(road[i][0], road[i][0], road[i][2]));
        }

        bfs(N, K, visit);

        answer = ans;

        System.out.println(answer);

    }

    static void bfs(int n, int k, int[] visit) {
        Queue<Edge> que = new LinkedList<>();

        for (int i = 2; i < visit.length; i++) {
            visit[i] = Integer.MAX_VALUE;
        }

        que.addAll(graph.get(1)); // 1 번에서 갈수 있는 모든 길

        while (!que.isEmpty()) {
            Edge e = que.poll();

            if (!(visit[e.cost] <= visit[e.index] + e.l)) {
                visit[e.cost] = visit[e.index] + e.l;
                que.addAll(graph.get(e.cost));
            }

        }

        for (int i = 2; i < n + 1; i++) {
            if (visit[i] <= k) {
                ans++;
            }
        }

    }

    // static void dijkstra(int n, int start) {
    //     boolean[] check = new boolean[n + 1];
    //     int[] dist = new int[n + 1];
    //
    //     Arrays.fill(dist, Integer.MAX_VALUE);
    //
    //     dist[start] = 0;
    //
    //     PriorityQueue<Edge> pq = new PriorityQueue<>();
    //
    //     pq.offer(new Edge(start, 0));
    //
    //     while (!pq.isEmpty()) {
    //         int newV = pq.poll().index;
    //         if (check[newV])
    //             continue;
    //         check[newV] = true;
    //
    //         for (Edge e : graph[newV]) {
    //             if (dist[e.index] > dist[newV] + e.cost) {
    //                 dist[e.index] = dist[newV] + e.cost;
    //                 pq.offer(new Edge(e.index, dist[e.index]));
    //             }
    //         }
    //     }
    //
    //     for (int i : dist) {
    //         if (i == Integer.MAX_VALUE)
    //             System.out.print(0 + " ");
    //         else
    //             System.out.print(i + " ");
    //     }
    //
    // }

}
