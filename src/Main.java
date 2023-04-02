package lab5 ;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    // Импорт необходимых классов
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // Объявляем и инициализируем пустой HashSet для хранения строк
        Scanner scanner = new Scanner(System.in);
    // Создаем объект Scanner для чтения пользовательского ввода
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Удалить элемент");
            System.out.println("3. Выйти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите элемент: ");
                    String elementToAdd = scanner.next();
                    set.add(elementToAdd);
                    System.out.println("Текущий список элементов: " + set);
                    break;
                case 2:
                    System.out.print("Введите элемент: ");
                    String elementToRemove = scanner.next();
                    set.remove(elementToRemove);
                    System.out.println("Текущий список элементов: " + set);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Некорректный выбор");
            }
        }
    }
}

