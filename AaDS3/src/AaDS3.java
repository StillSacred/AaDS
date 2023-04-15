public class AaDS3 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println("Size: " + size(listNode));
        System.out.println();
        System.out.println("ListNode as string " + asString(listNode));
        System.out.println();
        System.out.println(getByIndex(listNode, 1));
    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    //Реализовать следующие методы
    /**
     * Посчитать размер списка.
     */
    static int size(ListNode head) {
        int size = 0;
        ListNode node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    /**
     * Написать строковое представление списка в формате
     * [first_value -> second_value -> ... -> last_value]
     */
    static String asString(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode node = head;
        if (node == null) {
            return null;
        } else {
            stringBuilder.append('[');
            while (node != null) {
                if (node.next != null) {
                    stringBuilder.append(node.value).append(" -> ");
                } else {
                    stringBuilder.append(node.value).append(']');
                }
                node = node.next;
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Найти значение по индексу
     */
    static Integer getByIndex(ListNode head, int index) {
        int counter = 0;
        ListNode node = head;
        while (counter != index) {
            counter++;
            node = node.next;
        }
        if (node == null) {
            return null;
        } else return node.value;
    }
}