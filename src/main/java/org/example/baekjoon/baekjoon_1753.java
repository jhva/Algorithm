package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class baekjoon_1753 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int INF = 100_000_000;
    static int v, e, k;
    static List<Node>[] list;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken()); // 정점
        e = Integer.parseInt(st.nextToken()); // 간선
        k = Integer.parseInt(br.readLine());
        list = new ArrayList[v + 1];
        dist = new int[v + 1];

        Arrays.fill(dist, INF); // 초기화

        for (int i = 0; i <= v; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {

            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken()); // 가중치

            list[start].add(new Node(end, weight)); // 가중치 저장 1-> 2 로가는 가중치를 저장한다
        }

        StringBuilder sb = new StringBuilder();
        dijkstra(k); // 시작 정점 스타트

        for (int i = 1; i <= v; i++) {
            if (dist[i] == INF)
                sb.append("INF\n");
            else
                sb.append(dist[i] + "\n");
        }

        bw.write(sb.toString());
        bw.close();
    }

    static void dijkstra(int start) {
        PriorityQueue<Node> que = new PriorityQueue<>();

        boolean[] visit = new boolean[v + 1];
        que.add(new Node(start, 0));
        dist[start] = 0;

        while (!que.isEmpty()) {
            Node current = que.poll();
            int cur = current.end;
            if (visit[cur] == true)
                continue;
            visit[cur] = true;

            for (Node node : list[cur]) {
                if (dist[node.end] > dist[cur] + node.weight) {
                    dist[node.end] = dist[cur] + node.weight;
                    que.add(new Node(node.end, node.end));
                }
            }

        }
    }

}

class Node implements Comparable<Node> {
    int end, weight;

    public Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}
