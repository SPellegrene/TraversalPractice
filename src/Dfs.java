import java.util.*;

public class Dfs {
    public static void traversal(Node node) {

        if(node == null) {
            return;
        } else {
            System.out.println(node.data); //here is the functionality that calling traversal recursively will do
        }
        traversal(node.left);
        traversal(node.right);
    }
}
