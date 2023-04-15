// Алгоритмы и структуры данных. Урок 2, домашнее задание
// Реализовать сортировку подсчетом

import java.util.Map;
import java.util.TreeMap;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 3, 2, 21, 4, 3, 21, 2, 1};
        countingSort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void countingSort(int[] array) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        int index = 0;
        int counter = 1;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            do{
                array[index] = entry.getKey();
                index++;
                counter++;
            } while (counter <= entry.getValue());
            counter = 1;
        }
    }
}