import java.util.ArrayList;
import java.util.List;

class Graph {
    private List<Vertex> nodes;
    private int[][] adjMatrix;
    private final int MAX_VERTICES = 10;

    public Graph() {
        nodes = new ArrayList<>();
        adjMatrix = new int[MAX_VERTICES][MAX_VERTICES];
    }

    public boolean AddVertex(Vertex v) {
        if (!nodes.contains(v)) {
            nodes.add(v);
            return true;
        }
        return false;
    }

    public boolean AddEdge(Vertex v1, Vertex v2, int weight) {
        int index1 = nodes.indexOf(v1);
        int index2 = nodes.indexOf(v2);

        if (index1 != -1 && index2 != -1) {
            adjMatrix[index1][index2] = weight;
            return true;
        }
        return false;
    }

    public void printGraph() {
        // Шапка таблицы с именами вершин
        System.out.print("   ");
        for (Vertex v : nodes) {
            System.out.print(v.getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < nodes.size(); i++) {
            System.out.print(nodes.get(i).getName() + "  ");
            for (int j = 0; j < nodes.size(); j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
