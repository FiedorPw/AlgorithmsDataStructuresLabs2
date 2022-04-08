package Lab3;
public class Graph {

        private class nodesOfGraph {
            private LRUCache.Node first, last;
            public nodesOfGraph() {
                first = last = null;
            }

            private void addNodeToFront(final LRUCache.Node node) {
                //pusta lista ustawianie linków
                if(last == null) {
                    first = last = node;
                    return;
                }
                node.next = first;
                first.prev = node;
                first = node;
            }

            public void modeNodeToFront(final LRUCache.Node node) {
                if(first == node) {
                    return;
                }

                if(node == last) {
                    last = last.prev;
                    last.next = null;
                } else {
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                }

                node.prev = null;
                node.next = first;
                first.prev = node;
                first = node;
            }
            //overflow elementów
            private void removeNodeFromRear() {
                if(last == null) {
                    return;
                }

                System.out.println("Deleting key: " + last.key);
                if(first == last) {
                    first = last = null;
                } else {
                    last = last.prev;
                    last.next = null;
                }
            }

            private int getRearKey() {
                //    return rear.key;
                return 0;
            }
        }
    private class Node {
        Integer key;
        Integer value;
        LRUCache.Node next, prev;
        public Node(final int key, final int value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
}
