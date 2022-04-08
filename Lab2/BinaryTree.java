

import java.util.Iterator;

public class BinaryTree<naszTypZmiennejTree> implements Iterable<naszTypZmiennejTree> {

    public Node lastParrent = null;
    public Node rootNode = null;
   boolean completness = true;
    public void addNode(naszTypZmiennejTree value){
        Node currentNode = rootNode;
        if (rootNode == null){
            rootNode = new Node(value);
        }else{
            while(true) {
                if (currentNode.leftChild == null) {
                    currentNode.leftChild = new Node(value);
                    currentNode.leftChild.parent = currentNode;
                    lastParrent = currentNode;
                    break;
                } else if (currentNode.rightChild == null) {
                    currentNode.rightChild = new Node(value);
                    currentNode.rightChild.parent = currentNode;

                    lastParrent = currentNode;
                    break;
                } else {
                    if ((currentNode.leftChild.leftChild == null) || (currentNode.leftChild.rightChild == null)) {
                        currentNode = currentNode.leftChild;
                    } else if(((currentNode.rightChild.leftChild == null) || (currentNode.rightChild.rightChild == null))){
                        currentNode = currentNode.rightChild;
                    }else currentNode = currentNode.leftChild;
                }
            }
        }
    }
    public boolean chceckComplete(){
        Node currentNode = rootNode;
        if (rootNode == null){
            completness = false;
        }else{
            reverseTree(rootNode);
        }

    return completness;
    }
    void reverseTree(Node root){
        if(root == null){
            return;
        }else {
            reverseTree(root.leftChild);
            reverseTree(root.rightChild);
            if(root.leftChild == null && root.rightChild != null){
                completness = false;
            }
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
