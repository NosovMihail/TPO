import java.util.ArrayList;

public class TreeService<T extends Comparable> {
    private Node<T> root;

    public TreeService(){
        this.root = null;
    }

    public TreeService(Node<T> node){
        this.root = node;
    }

    public boolean insert (T data){
        Node<T> newNode = new Node<T>(data);
        Node<T> current = root;
        if(current == null){
            root = newNode;
        }
        while (current != null){
            if(current.getData().compareTo(data) >= 0){
                if(current.getLeft() == null){
                    current.setLeft(newNode);
                    return true;
                }else{
                    current = current.getLeft();
                }
            }
            if(current.getData().compareTo(data) < 0){
                if(current.getRight() == null){
                    current.setRight(newNode);
                    return true;
                }else{
                    current = current.getRight();
                }
            }
        }
        return false;
    }

    public Node<T> find(T data){
        Node<T> current = root;
        while (current != null){
            if(current.getData().compareTo(data) > 0){
                if(current.getLeft() == null){
                    return null;
                }else{
                    current = current.getLeft();
                }
            }
            if(current.getData().compareTo(data) < 0){
                if(current.getRight() == null){
                    return null;
                }else{
                    current = current.getRight();
                }
            }
            if(current.getData().compareTo(data) == 0){
                return current;
            }
        }
        return null;
    }

    public void remove(T data) {
        if(data == null){
            System.out.println("Удаляемые данные не могут быть пустыми!");
            return;
        }
        root = remove(data, root);
    }

    private Node<T> remove(T data, Node<T> node){
        if(node == null){
            return node;
        }
        int result = data.compareTo(node.getData());
        if(result < 0){// Рекурсивно удаляем влево
            node.setLeft(remove(data, node.getLeft()));
        }else if(result > 0){// Рекурсивно удаляем вправо
            node.setRight(remove(data, node.getRight()));
        }else{// result = 0 означает найти узел, в котором находятся удаляемые данные
            if(node.getLeft() != null && node.getRight() != null){// Удаляемый узел имеет двух потомков
                // (1) Находим элемент наименьшего узла в правом поддереве и заменяем удаляемый элемент
                node.setData(findMax(node.getLeft()).getData());
                // (2) Удаляем узел, используемый для замены
                node.setLeft(remove(node.getData(), node.getLeft()));
            }else{
                // Удаляем только одного потомка и удаляем листовой узел
                node = (node.getLeft() == null) ? node.getRight() : node.getLeft();
            }
        }
        return node;
    }

    private Node<T> findMax(Node<T> p){
        if(p == null){// Рекурсивное конечное условие
            return null;
        }
        if(p.getRight() == null){// Если левого потомка нет, p - наименьшее
            return p;
        }
        return findMax(p.getRight());
    }

    public ArrayList<T> printTree (Node node, ArrayList<T> list){
        list.add((T) node.getData());
        if (node.getLeft() != null) printTree(node.getLeft(), list);
        if (node.getRight() != null) printTree(node.getRight(), list);
        return list;
    }

    public Node<T> getRoot() {
        return root;
    }
}
