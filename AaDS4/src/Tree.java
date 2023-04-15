import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Node root;

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    // 1. Реализовать поиск максимального элемента в дереве. Метод назвать findLast
    public int findLast() {
        return findMax(root).value;
    }

    private Node findMax(Node current) {
        if (current.right != null) {
            return findMax(current.right);
        }
        return current;
    }

    // 2. Реализовать подсчет листьев. Листья - это такие узлы дерева, у которых нет дочерних элементов.
    // Метод назвать getChildrenCount
    public int getChildrenCount() {
        List<Node> nodes = new ArrayList<>();
        int count = 0;
        dfs(root, nodes);
        for (Node node : nodes) {
            if (node.left == null && node.right == null) {
                count++;
            }
        }
        return count;
    }

    private void dfs(Node current, List<Node> nodes) {
        if (current != null) {
            dfs(current.left, nodes);
            nodes.add(current);
            dfs(current.right, nodes);
        }
    }

    // Добавление в дерево
    public void add(int value) {
        root = appendNode(root, value);
    }

    private Node appendNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (current.value > value) {
            current.left = appendNode(current.left, value);
        } else if (current.value < value) {
            current.right = appendNode(current.right, value);
        }
        return current;
    }
}