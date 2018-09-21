import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    private LinkedList<Integer> adj[];

    boolean visited[];

    Graph(int v) {
        adj = new LinkedList[v];
        for(int i = 0;i<v;i++){
            adj[i] = new LinkedList();
        }
        visited = new boolean[v];
    }

    public void addEdge(int v,int w) {
       adj[v].add(w);
    }

    void calculateDFS(int v) {
        visited[v] = true;
        System.out.println(v+" ");

        Iterator<Integer> i = adj[v].listIterator();

        while (i.hasNext()){
            int n = i.next();
            if(!visited[n])
                calculateDFS(n);
        }
    }

}
