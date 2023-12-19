import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practika {

    // Реализуйте структуру телефонной книги с помощью HashMap.
    // Программа также должна учитывать, что в во входной структуре будут
    // повторяющиеся имена с разными телефонами, их необходимо считать, как одного
    // человека с разными телефонами. Вывод должен быть отсортирован по убыванию
    // числа телефонов.
    public static void main(String[] args) {

        public class PhoneBook {
            private Map<String, Set<String>> phoneBookMap = new HashMap<>();

            // Метод для добавления номера телефона
            public void addPhoneNumber(String name, String phoneNumber) {
                phoneBookMap.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
            }

            // Метод для получения отсортированного списка
            public void printSortedPhoneBook() {
                phoneBookMap.entrySet().stream()
                        .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size())) // сортировка
                                                                                                         // по убыванию
                                                                                                         // числа
                                                                                                         // телефонов
                        .forEach(e -> {
                            System.out.println(e.getKey() + ": " + e.getValue());
                        });
            }

            public static void main(String[] args) {
                PhoneBook phoneBook = new PhoneBook();
                // Добавление телефонов
                phoneBook.addPhoneNumber("Alice", "12345");
                phoneBook.addPhoneNumber("Bob", "23456");
                phoneBook.addPhoneNumber("Alice", "34567");
                phoneBook.addPhoneNumber("Charlie", "45678");

                // Вывод отсортированной телефонной книги
                phoneBook.printSortedPhoneBook();
            }
        }

    }

}
