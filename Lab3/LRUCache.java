package Lab3;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class LRUCache<T,k> {

    private final int capacity;
    private int size;
    private final Map<k, Node> hashmap;
    private final DoublyLinkedList internalQueue;

    LRUCache(final int capacity) {
        this.capacity = capacity;
        this.hashmap = new HashMap<>();
        this.internalQueue = new DoublyLinkedList();
        this.size = 0;
    }

    public void printNodes(){
        Node currentnode = internalQueue.front;
        for (int i = 0; i < size; i++) {
            System.out.println("key " + currentnode.value);
            currentnode = currentnode.next;

        }

    }

    @Override
    public String toString() {
        return "LRUCache{" +
                "capacity=" + capacity +
                ", size=" + size +
                ", hashmap=" + hashmap +
                ", internalQueue=" + internalQueue +
                '}';
    }

    public T get(final k key) {
        Node node = hashmap.get(key);
        if(node == null) {
            throw new NoSuchElementException();
        }
        internalQueue.modeNodeToFront(node);
        return hashmap.get(key).value;
    }

    public void put(final k key, final T value) {
        Node currentNode = hashmap.get(key);
        //blokada przed pobieraniem
        if(currentNode != null) {
            currentNode.value = value;
            internalQueue.modeNodeToFront(currentNode);
            return;
        }
        //overlow wywalanie elementu
        if(size == capacity) {
            k rearNodeKey = internalQueue.getRearKey();
            internalQueue.removeNodeFromRear();
            hashmap.remove(rearNodeKey);
            size--;
        }
        //dodawanie do queue i
        Node node = new Node(key, value);
        internalQueue.addNodeToFront(node);
        hashmap.put(key, node);
        size++;
    }

    class Node {
        k key;
        T value;
        Node next, prev;
        public Node(final k key, final T value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private class DoublyLinkedList {
        private Node front, rear;
        public DoublyLinkedList() {
            front = rear = null;
        }

        private void addNodeToFront(final Node node) {
            //pusta lista ustawianie linków
            if(rear == null) {
                front = rear = node;
                return;
            }
            node.next = front;
            front.prev = node;
            front = node;
        }

        public void modeNodeToFront(final Node node) {
            if(front == node) {
                return;
            }

            if(node == rear) {
                rear = rear.prev;
                rear.next = null;
            } else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }

            node.prev = null;
            node.next = front;
            front.prev = node;
            front = node;
        }
        //overflow elementów
        private void removeNodeFromRear() {
            if(rear == null) {
                return;
            }

            System.out.println("Deleting key: " + rear.key);
            if(front == rear) {
                front = rear = null;
            } else {
                rear = rear.prev;
                rear.next = null;
            }
        }

        private k getRearKey() {
            return rear.key;
        }
    }
}