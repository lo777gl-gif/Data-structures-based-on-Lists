// Minimum Heap Logical Data Structure based on MyArrayList.
public class MyMinHeap<T extends Comparable<T>> {
    private final MyArrayList<T> list;

    public MyMinHeap() {
        list = new MyArrayList<>();
    }

    public void insert(T item) {
        list.addLast(item);
        heapifyUp(list.size() - 1);
    }

    public T extractMin() {
        if (list.size() == 0) throw new RuntimeException("Heap is empty");
        T min = list.getFirst();
        T last = list.getLast();
        list.removeLast();

        if (list.size() > 0) {
            list.set(0, last);
            heapifyDown(0);
        }
        return min;
    }

    public T getMin() {
        if (list.size() == 0) throw new RuntimeException("Heap is empty");
        return list.getFirst();
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (list.get(index).compareTo(list.get(parentIndex)) < 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        int size = list.size();
        while (index < size) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallest = index;

            if (leftChild < size && list.get(leftChild).compareTo(list.get(smallest)) < 0) {
                smallest = leftChild;
            }
            if (rightChild < size && list.get(rightChild).compareTo(list.get(smallest)) < 0) {
                smallest = rightChild;
            }

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}