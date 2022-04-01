import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @org.junit.jupiter.api.Test
    void chceckComplete() {
        BinaryTree dzewo = new BinaryTree();
        for (int i = 0; i < 3; i++) {
            dzewo.addNode(i);
        }
        assertTrue(dzewo.chceckComplete()); //sprawdzanie poprawnego drzewa
        dzewo.rootNode.rightChild.rightChild = new Node(7);//psucie drzewa na poziomie liścia
        assertFalse(dzewo.chceckComplete());
        BinaryTree dzewo2 = new BinaryTree();
        for (int i = 0; i < 9; i++) {
            dzewo2.addNode(i);
        }
        assertTrue(dzewo2.chceckComplete());
        dzewo2.rootNode.leftChild.leftChild = null;
        assertFalse(dzewo2.chceckComplete());
    }
}
