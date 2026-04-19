public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing MyArrayList ---");
        MyArrayList<Integer> arrList = new MyArrayList<>();
        arrList.add(5);
        arrList.addFirst(3);
        arrList.addLast(10);
        arrList.add(1, 1); // 3, 1, 5, 10
        System.out.println("Size: " + arrList.size()); // 4
        System.out.println("Exists 3? " + arrList.exists(3)); // true

        arrList.sort();
        System.out.println("After sort, index 0 is: " + arrList.get(0)); // 1

        arrList.removeFirst(); // 3, 5, 10
        arrList.removeLast(); // 3, 5
        System.out.println("New size: " + arrList.size()); // 2

        System.out.print("Original list: ");
        for (int i = 0; i < arrList.size(); i++)
        {
            System.out.print(arrList.get(i) + " ");
        }

        System.out.println("\n\n--- Testing MyLinkedList ---");
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Zebra");
        linkedList.addFirst("Apple");
        linkedList.addLast("Mango"); // Apple, Zebra, Mango

        linkedList.sort(); // Apple, Mango, Zebra
        System.out.println("First element: " + linkedList.getFirst()); // Apple
        System.out.println("Last element: " + linkedList.getLast()); // Zebra

        System.out.println("Size before clear: " + linkedList.size()); // 3
        linkedList.clear();
        System.out.println("Size after clear: " + linkedList.size()); // 0

        System.out.println("\n--- Testing Logical Structures ---");

        // Stack Test
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack Peek: " + stack.peek()); // 20

        // Queue Test
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("Queue Dequeue: " + queue.dequeue()); // 1

        // MinHeap Test
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(50);
        heap.insert(10);
        heap.insert(30);
        System.out.println("Heap Min: " + heap.extractMin()); // 10
        System.out.println("Next Heap Min: " + heap.extractMin()); // 30
    }
}