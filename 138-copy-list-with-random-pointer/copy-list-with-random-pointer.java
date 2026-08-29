/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> nodeMapper = new HashMap<>();
        nodeMapper.put(null, null);

        Node current = head;
        while(current!=null) {
            Node copy = new Node(current.val);
            nodeMapper.put(current, copy);
            current = current.next;
        }

        current = head;
        while(current != null) {
            Node copy = nodeMapper.get(current);
            copy.next = nodeMapper.get(current.next);
            copy.random = nodeMapper.get(current.random);
            current = current.next;
        }

        return nodeMapper.get(head);
    }
}