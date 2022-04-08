public class Node<naszTypZmiennejNode> {
    Node parent;
    Node leftChild;
    Node rightChild;
    naszTypZmiennejNode value;

    public <naszTypZmiennej> Node(naszTypZmiennejNode valueNode) {
        this.value=valueNode;
    }

    public void setValue(naszTypZmiennejNode value) {
        this.value = value;
    }
}
