/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
class Solution {
    // El mapa guarda: <Nodo Original, Su Copia correspondiente>
    private HashMap<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        // 1. Si ya hemos clonado este nodo antes, devolvemos la copia que ya tenemos
        // Esto evita bucles infinitos en grafos con ciclos.
        if (map.containsKey(node)) {
            return map.get(node);
        }

        // 2. Crear la copia del nodo actual (sin vecinos todavía)
        Node clone = new Node(node.val);
        map.put(node, clone);

        // 3. "Bajar niveles": Recorrer cada vecino del nodo original
        for (Node neighbor : node.neighbors) {
            // Llamada recursiva: "Clona este vecino y añádelo a mis vecinos clonados"
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }
}