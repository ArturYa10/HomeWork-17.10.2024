import java.util.ArrayList;
import java.util.List;

public class School {

    // Список списков студентов, распределённых по классам
    private List<List<String>> studentGrades = new ArrayList<>();

    // Метод для добавления класса со студентами
    public void addClass(List<String> studentClass) {
        studentGrades.add(studentClass);
    }

    // Метод для подсчёта общего количества студентов
    public int countTotalAmount() {
        int total = 0;
        for (List<String> studentClass : studentGrades) {
            total += studentClass.size();  // Считаем количество студентов в каждом классе
        }
        return total;
    }

    // Метод для подсчёта количества студентов с определённым именем
    public int countAmountWithName(String name) {
        int count = 0;
        for (List<String> studentClass : studentGrades) {
            for (String student : studentClass) {
                if (student.equals(name)) {  // Если имя совпадает, увеличиваем счётчик
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        School school = new School();

        // Пример классов с именами студентов
        List<String> class1 = new ArrayList<>();
        class1.add("Ivan");
        class1.add("Maria");
        class1.add("Sergey");

        List<String> class2 = new ArrayList<>();
        class2.add("Olga");
        class2.add("Ivan");
        class2.add("Nikolay");

        // Добавляем классы в школу
        school.addClass(class1);
        school.addClass(class2);

        // Подсчёт общего количества студентов
        System.out.println("Total number of students: " + school.countTotalAmount());

        // Подсчёт количества студентов с именем "Ivan"
        System.out.println("Number of students with the name 'Ivan': " + school.countAmountWithName("Ivan"));
    }
}
