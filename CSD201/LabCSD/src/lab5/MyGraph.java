package lab5;

/**
 * @date Jul 6, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MyGraph {

    int vertex;
    int[][] edge;

    public MyGraph() {
    }

    public MyGraph(int vertex) {
        this.vertex = vertex;
        edge = new int[vertex][vertex];
    }

    public void addEdge(int source, int destination) {
        edge[source][destination] = 1;
        edge[destination][source] = 1;
    }

    public void randomGraph() {
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                edge[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    public void display() {
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.print(edge[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < vertex; i++) {
            System.out.print("The vertex " + i + " is connected to: ");
            for (int j = 0; j < vertex; j++) {
                if (edge[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        MyGraph myGraph = new MyGraph(5);
        myGraph.randomGraph();
        myGraph.display();
    }
}
