package com.preparation.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//source: https://www.java2blog.com/breadth-first-search-in-java/
public class BreadthFirstSearchExample {
    private Queue<Node> queue;
    static List<Node> nodes = new ArrayList<>();

    public BreadthFirstSearchExample() {
        this.queue = new LinkedList<>();
    }

    static class Node {
        int data;
        boolean visited;

        Node(int data) {
            this.data = data;
        }
    }

    public List<Node> findNeighbours(int adjacency_matrix[][], Node x) {
        int nodeIndex = -1;

        List<Node> neighbours = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).equals(x)) {
                nodeIndex = i;
                break;
            }
        }

        if (nodeIndex != -1) {
            for(int j = 0; j < adjacency_matrix[nodeIndex].length; j++) {
                if (adjacency_matrix[nodeIndex][j]==1) {
                    neighbours.add(nodes.get(j));
                }
            }
        }

        return neighbours;
    }

    public void bfs(int adjacency_matrix[][], Node node) {
        queue.add(node);
        node.visited = true;
        while(!queue.isEmpty()) {
            Node element = queue.remove();
            System.out.println(element.data + "\t");
            List<Node> neighbours = findNeighbours(adjacency_matrix, node);
            for(int i = 0; i < neighbours.size(); i++) {
                Node n = neighbours.get(i);
                if (n != null && !n.visited) {
                    queue.add(n);
                    n.visited = true;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
