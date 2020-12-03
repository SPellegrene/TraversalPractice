public class Search {

    public static void main(String[] args) {

        try {
            Node tree = sample_tree();
            System.out.println("Bfs:");
            Bfs.traversal(tree);
            System.out.println("\nDfs:");
            Dfs.traversal(tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Node sample_tree() {

    /*
    *                              A
    *                           B     E
    *                          C D   F G
    *                                  H
    * */



        Node root = new Node("A",
                new Node ("B",
                        new Node("C"), new Node("D")),
                new Node("E",
                        new Node("F"), new Node("G",
                            new Node("H"), null)));

        return root;
    }
}
