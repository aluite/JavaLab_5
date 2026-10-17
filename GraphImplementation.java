public class GraphImplementation {

    public static void main(String[] args) { 
        Graph ourGraph = new Graph();
        
        Vertex vA = new Vertex("A"); 
        Vertex vB = new Vertex("B"); 
        Vertex vC = new Vertex("C");
        Vertex vD = new Vertex("D");
        Vertex vE = new Vertex("E");
        Vertex vF = new Vertex("F");
        Vertex vG = new Vertex("G");
        
        ourGraph.AddVertex(vA);
        ourGraph.AddVertex(vB);
        ourGraph.AddVertex(vC);
        ourGraph.AddVertex(vD);
        ourGraph.AddVertex(vE);
        ourGraph.AddVertex(vF);
        ourGraph.AddVertex(vG);
        
        int w = 1;

        //A
        ourGraph.AddEdge(vA, vB, w); ourGraph.AddEdge(vB, vA, w);
        ourGraph.AddEdge(vA, vC, w); ourGraph.AddEdge(vC, vA, w);
        ourGraph.AddEdge(vA, vD, w); ourGraph.AddEdge(vD, vA, w);
        ourGraph.AddEdge(vA, vE, w); ourGraph.AddEdge(vE, vA, w);
        ourGraph.AddEdge(vA, vF, w); ourGraph.AddEdge(vF, vA, w);
        ourGraph.AddEdge(vA, vG, w);
        ourGraph.AddEdge(vG, vA, w);

        // B
        ourGraph.AddEdge(vB, vC, w); ourGraph.AddEdge(vC, vB, w);
        ourGraph.AddEdge(vB, vD, w); ourGraph.AddEdge(vD, vB, w);
        ourGraph.AddEdge(vB, vE, w); ourGraph.AddEdge(vE, vB, w);
        ourGraph.AddEdge(vB, vF, w);
        ourGraph.AddEdge(vF, vB, w);
        ourGraph.AddEdge(vB, vG, w); ourGraph.AddEdge(vG, vB, w);

        // С
        ourGraph.AddEdge(vC, vD, w); ourGraph.AddEdge(vD, vC, w);
        ourGraph.AddEdge(vC, vE, w);
        ourGraph.AddEdge(vE, vC, w);
        ourGraph.AddEdge(vC, vF, w);
        ourGraph.AddEdge(vF, vC, w);
        ourGraph.AddEdge(vC, vG, w); ourGraph.AddEdge(vG, vC, w);

        //  D
        ourGraph.AddEdge(vD, vE, w); ourGraph.AddEdge(vE, vD, w);
        ourGraph.AddEdge(vD, vF, w); ourGraph.AddEdge(vF, vD, w);
        ourGraph.AddEdge(vD, vG, w); ourGraph.AddEdge(vG, vD, w);

        // E
        ourGraph.AddEdge(vE, vF, w); ourGraph.AddEdge(vF, vE, w);
        ourGraph.AddEdge(vE, vG, w); ourGraph.AddEdge(vG, vE, w);

        // F
        ourGraph.AddEdge(vF, vG, w); ourGraph.AddEdge(vG, vF, w);
        
        System.out.println("Список смежности графа:");
        ourGraph.printGraph();
        
    }
}
