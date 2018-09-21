import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * Depth First Search
 *
 * @Author: Ramkumar Velmurugan
 *
 */


public class DFS {





    public static void main(String args[]) {

        Graph g = new Graph(7);

        g.addEdge(0,1);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(1,5);
        g.addEdge(0,2);
        g.addEdge(2,6);

        g.calculateDFS(0);

    }

}
