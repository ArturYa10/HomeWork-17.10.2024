import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentNames {

    public static void main(String[] args) {
        // Инициализация списка имён
        List<String> names = new ArrayList<>();
        names.add("Mary");
        names.add("Jane");
        names.add("Tom");
        names.add("Tim");
        names.add("Mark");
        names.add( "Ann");
        names.add(null);
        // a) Выводим имена, состоящие из 4 букв
        System.out.println("Names with 4 letters:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name != null && name.length() == 4) {
                System.out.println(name);
            }
        }

        // b) Удаляем null и пустые строки
        iterator = names.iterator();  // Снова создаём итератор для удаления
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name == null || name.isEmpty()) {
                iterator.remove();  // Удаляем элементы, если они null или пустые строки
            }
        }

        // Выводим оставшиеся имена после удаления
        System.out.println("Names after removing null and empty strings:");
        System.out.println(names);
    }

}
