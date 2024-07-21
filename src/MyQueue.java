public class MyQueue<T> {
    private Node<T> font, rear;
    private int size = 0;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (size == 0) {
            font = newNode;
        } else {
            rear.next = newNode;
        }

        rear = newNode;
        this.size++;
    }

    public void addAll(T[] data) {
        for (int i = 0; i < data.length; i++) {
            this.add(data[i]);
        }
    }

    public void put(T data) {
        Node<T> newNode = new Node<>(data);
        if (size == 0) {
            font = newNode;
        } else {
            rear.next = newNode;
        }

        rear = newNode;
        this.size++;
    }

    public T pop() {
        if (font == null) {
            return null;
        }

        Node<T> current = font;
        font = font.next;
        size--;
        return current.data;
    }

    public int size() {
        return this.size;
    }

    public void printAll() {
        Node<T> current = font;
        System.out.println(current.data);
        for (int i = 0; i < this.size - 1; i++) {
            current = current.next;
            System.out.println(current.data);
        }
    }
}
