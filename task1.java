// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что один человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add(0, " 89097657677, 89096548373");
        list.add(1, " 89096542934");
        list.add(2, " 89076548488, 89788765645");
        list.add(3, " 89007775566");

        LinkedList<String> name = new LinkedList<>();
        name.add(0, "Лена ");
        name.add(1, "Костя ");
        name.add(2, "Ксюша ");
        name.add(3, "Рома ");

        HashMap<String, String> guide = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            guide.put(name.get(i), list.get(i));
        }
        System.out.println(guide);
    }
}
