import java.util.HashSet;

class Graph {
    private HashSet<Vertex> nodes;
    
    public Graph() {
        nodes = new HashSet<>();
    }
    
    public boolean AddEdge(Vertex v1, Vertex v2, int weight) { // поскольку это направленный граф
        return v1.getEdges().add(new Edge(v2, weight));
    }
    /* Если вы хотите реализовать неориентированный граф,
    * добавьте v2.getEdges().add(new Edge (v1, weight)) Takжe
    */
    
    public boolean AddVertex(Vertex v) {
        return nodes.add(v);
    }
    
    public void printGraph() {
        for (Vertex v : nodes) { 
            System.out.print("vertex name: " + v.getName() + ": "); 
            
            // Fixed: Added the missing colon (:)
            for (Edge e : v.getEdges()) {
                System.out.print("destVertex: " + e.getDestVertex().getName() + " weight: " + e.getWeight() + " | ");
            }
            
            // Fixed: Removed 's:' and changed to println() for a clean newline
            System.out.println();
        }
    }
}
