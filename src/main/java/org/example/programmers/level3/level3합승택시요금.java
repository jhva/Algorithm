package org.example.programmers.level3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class level3합승택시요금 {
    static class Edge implements Comparable<Edge> {
        int index;//위치
        int cost; // 간선

        Edge(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return cost;
        }
    }

    static final int MAX = 20000001;

    static ArrayList<ArrayList<Edge>> graph;

    public static void main(String[] args) {
        solve(6, 4, 6, 2,
            new int[][] {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66},
                {2, 3, 22}, {1, 6, 25}});

        플로이드_워셜(6, 4, 6, 2,
            new int[][] {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66},
                {2, 3, 22}, {1, 6, 25}});
    }

    static void solve(int n, int s, int a, int b, int[][] fares) {

        int answer = Integer.MAX_VALUE;

        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>()); // n개만큼 넣어준다 ?
        }

        for (int[] i : fares) {
            // System.out.println(i[0]);
            graph.get(i[0]).add(new Edge(i[1], i[2]));
            graph.get(i[1]).add(new Edge(i[0], i[2]));
        }

        int[] startA = new int[n + 1];
        int[] startB = new int[n + 1];
        int[] start = new int[n + 1];

        Arrays.fill(startA, MAX);
        Arrays.fill(startB, MAX);
        Arrays.fill(start, MAX);

        // System.out.println(Arrays.toString(startA));

        startA = dijkstra(a, startA);
        startB = dijkstra(b, startB);
        start = dijkstra(s, start);
        // System.out.println(Arrays.toString(startA));
        // System.out.println(Arrays.toString(start));

        for (int i = 1; i <= n; i++) {
            answer = Math.min(answer, startA[i] + startB[i] + start[i]);

        }

        // System.out.println(answer);

    }

    static int[] dijkstra(int start, int[] costs) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();

        pq.offer(new Edge(start, 0));
        costs[start] = 0;

        while (!pq.isEmpty()) {
            Edge now = pq.poll();

            int nIndex = now.index;
            int nCost = now.cost;

            if (nCost > costs[nIndex])
                continue;

            ArrayList<Edge> edges = graph.get(nIndex);

            for (Edge edge : edges) {
                int cost = costs[nIndex] + edge.cost;
                if (cost < costs[edge.index]) {
                    costs[edge.index] = cost;
                    pq.offer(new Edge(edge.index, cost));
                }

            }
        }
        return costs;

    }
    //플루이드워셜로풀기

    static void 플로이드_워셜(int n, int s, int a, int b, int[][] fares) {
        //결국은 모든정점에서의거리를구하고 최단거리를구해야함

        //다익스트라가 성능적으로 시간, 공간 복잡도에서 많이유리하다

        int[][] map = new int[n + 1][n + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                map[i][j] = 20000001;
            }
            map[i][i] = 0;
        }
        for (int i = 0; i < fares.length; i++) {
            map[fares[i][0]][fares[i][1]] = fares[i][2];
            map[fares[i][1]][fares[i][0]] = fares[i][2];
        }

        System.out.println(Arrays.deepToString(map));

    }

}
