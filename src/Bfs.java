import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    static void traversal(Node node) {

        //Use a Queue (FIFO)
        //Create Queue
        Queue<Node> q = new LinkedList<Node>();

        q.add(node); //add start node

        while(!q.isEmpty()) { //while queue has nodes in it

            node = q.remove(); //remove the node from Queue

            System.out.println(node.data + " "); //print the nodes value

            if (node.left != null) { //if the node has a left child
                q.add(node.left); //add that child to the Queue
            }
            if (node.right != null) { //if the node has a right child
                q.add(node.right); // dd that child to the Queue
            }
        }
    }
}
