import java.util.function.Consumer;

public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(5);
        tree.add(7);
        tree.add(2);
        tree.add(3);
        System.out.println(tree.findLast());
        System.out.println(tree.getChildrenCount());
    }
}