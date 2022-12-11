import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

public class q2 {
    public static void main(String[] args) {

        Map<String, Integer> countNames = new HashMap<>();

        ArrayList<String> employes = new ArrayList<>();

        employes.add("Andrey");
        employes.add("Andrey");
        employes.add("Ivan");
        employes.add("Ivan");
        employes.add("Andrey");
        employes.add("Andrey");
        employes.add("Arseniy");
        employes.add("Igor");
        employes.add("Andrey");
        employes.add("Ilya");
        employes.add("Andrey");
        employes.add("Ivan");
        employes.add("Igor");

        for (int i = 0; i < employes.size(); i++) {
            if (!(countNames.containsKey(employes.get(i)))) {
                countNames.putIfAbsent(employes.get(i), 1);
            } else {
                countNames.put(employes.get(i), countNames.get(employes.get(i)) + 1);
            }
        }
        System.out.println(countNames);

        List<Map.Entry<String, Integer>> valuesList = new ArrayList(countNames.entrySet());

        Collections.sort(valuesList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println(valuesList);
    }
}
