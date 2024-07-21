public class MyStack<T> {
    private Node<T> top;
    private int size = 0;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        this.size++;
    }

    public void addAll(T[] data) {
        for (int i = 0; i < data.length; i++) {
            this.add(data[i]);
        }
    }

    public void put(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        this.size++;
    }

    public void pop() {
        if (top == null) {
            System.out.println("array is null");
        }

        Node<T> current = top;
        top = top.next;
        size--;
        System.out.println(current.data);
    }

    public int size() {
        return this.size;
    }

    public void printAll() {
        Node<T> current = top;
        System.out.println(current.data);
        for (int i = 0; i < this.size - 1; i++) {
            current = current.next;
            System.out.println(current.data);
        }
    }
}
