class Node {
    Node next = null;
    int value;

    public Node(int val){
        value = val;
    }

    void addNode(Node end){
       Node n = this;
       while (n.next != null){
           n = n.next;
       }
       n.next = end;
    }
}
