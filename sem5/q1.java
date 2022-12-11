import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

public class q1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(123);
        numbers1.add(234);
        numbers1.add(5346);
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(123);
        numbers2.add(234);
        numbers2.add(5346);
        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.add(4444);
        numbers3.add(5334);
        numbers3.add(63546);

        Map<String, ArrayList<Integer>> phoneBooks = new HashMap<>();

        phoneBooks.put("Ivanov Egor", numbers1);
        phoneBooks.put("Petrov Petr", numbers2);
        phoneBooks.put("Egorov Maks", numbers3);

        System.out.println(phoneBooks);
    }
}