public class Node<T extends Comparable> {
    private Node<T> left;// левый потомок
    private Node<T> right;// правый ребенок
    private T data;// данные

    public Node(Node<T> left, Node<T> right, T data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public Node(T data) {
        this(null, null, data);
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }

    public T getData() {
        return data;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public void setData(T data) {
        this.data = data;
    }
}
