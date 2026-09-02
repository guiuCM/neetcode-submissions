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
    //Map con el valor del nodo por evitar bucles
    private HashMap<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        //base case 1
        if (node == null) return null;

        //base case 2
        if(map.containsKey(node)){
            return map.get(node);
        }

        //creamo el nuevo nodo
        Node clone = new Node(node.val);
        map.put(node, clone);

        //assignamos todos los vecinos
        for(Node nei : node.neighbors){
            clone.neighbors.add(cloneGraph(nei));
        }
        return clone;

    }
}