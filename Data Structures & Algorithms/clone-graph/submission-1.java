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
    private HashMap<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        //base case 1
        if (node == null) return null;

        //base case 2
        if(map.containsKey(node)){
            return map.get(node);
        }

        Node clone = new Node(node.val);
        map.put(node, clone);

        for(Node nei : node.neighbors){
            clone.neighbors.add(cloneGraph(nei));
        }
        return clone;

    }
}