package lab5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import static java.util.Objects.hash;

/**
 * @date Jul 6, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MyGraphWeight {

    ArrayList<ArrayList<Node>> node = new ArrayList<>();

    public MyGraphWeight(ArrayList<Edge> edges) {
//        for (int i = 0; i < edges.size(); i++) {
//            node.add(i, new ArrayList<>());
//        }
//
//        edges.forEach((e) -> {
//            node.get(e.source).add(new Node(e.dec, e.weight));
//        });

    }

    public void display() {
        int n = node.size();
        int src = 0;
        while (src < n) {
            for (Node edge : node.get(src)) {
                System.out.print(src + " connected to " + edge.value
                        + " with weight = " + edge.weight + "\t");
            }

            System.out.println();
            src++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> listEdge = new ArrayList<>();
        listEdge.add(new Edge(0, 5, 800));
        listEdge.add(new Edge(1, 3, 200));
        listEdge.add(new Edge(2, 4, 1000));
        listEdge.add(new Edge(5, 0, 800));
        listEdge.add(new Edge(3, 1, 200));
        listEdge.add(new Edge(4, 0, 1400));
        MyGraphWeight myGraphWeight = new MyGraphWeight(listEdge);
        myGraphWeight.display();

    }
}
