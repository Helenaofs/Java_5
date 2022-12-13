// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, 
// которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class task2 {
    public static void main(String[] args) {
        String[] str = { "Иванов Иван", "Сидоров Иван", "Белов Николай", "Чернов Николай", "Романов Николай",
                "Петров Петр" };
        ArrayList<String> people = new ArrayList<>(Arrays.asList(str));
        TreeMap<Integer, String> names = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < people.size(); i++) {
            String[] FIO = people.get(i).split(" ");
            String name = FIO[1];
            int count = 0;
            for (int j = 0; j < people.size(); j++) {
                String[] FIO1 = people.get(j).split(" ");
                String name1 = FIO1[1];
                if (name.equals(name1)) {
                    count++;
                }
            }
            if (!names.containsValue(name)) {
                names.put(count, name);
            }
        }
        for (var el : names.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
    }
}
