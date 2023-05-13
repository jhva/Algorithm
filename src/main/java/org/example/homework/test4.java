package org.example.homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Edge implements Comparable<Edge> {
    int start, end, weight;

    public Edge(int start, int end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public int compareTo(Edge e) {
        return this.weight - e.weight;
    }
}

public class test4 {
    public static void main(String[] args) {
        int n = 6;
        int[][] graph = {{1,2},{3,5},{4,2},{5,6}};
        int[][] repair = {{3,2,10},{5,4,15}};

        // 간선 리스트 생성
        ArrayList<Edge> edges = new ArrayList<>();
        for (int[] e : graph) {
            edges.add(new Edge(e[0], e[1], 0));
        }
        for (int[] r : repair) {
            edges.add(new Edge(r[0], r[1], r[2]));
        }

        // 간선 가중치 오름차순으로 정렬
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.addAll(edges);

        // Union-Find 구현을 위한 배열 초기화
        int[] parent = new int[n + 1];
        Arrays.fill(parent, -1);

        // Kruskal 알고리즘 수행
        int mstWeight = 0;
        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            int startParent = find(parent, cur.start);
            int endParent = find(parent, cur.end);
            if (startParent != endParent) { // 사이클이 생기지 않으면 연결
                parent[startParent] = endParent;
                mstWeight += cur.weight;
            }
        }

        // 모든 노드가 연결되었는지 확인
        int rootCount = 0;
        for (int i = 1; i <= n; i++) {
            if (parent[i] < 0) {
                rootCount++;
            }
        }
        if (rootCount != 1) {
            System.out.println(-1);
        }
    }

    public static int find(int[] parent, int x) {
        if (parent[x] < 0) {
            return x;
        }
        parent[x] = find(parent, parent[x]);
        return parent[x];
    }
}

