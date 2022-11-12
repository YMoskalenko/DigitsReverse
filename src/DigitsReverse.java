import java.util.Scanner;

public class DigitsReverse {

    private static void trimAndReverse (long a) {
        while (a > 0) {                 // цикл while поки число недоділиться до мінімального розряду і не буде менше 0
            long l = a % 10;            // залишок від ділення і є число поточного розряду
            System.out.print(l);        // вивід залишку (частини числа)
            a /= 10;                    // перехід до нижчого розряду числа
        }
    }
    public static void main(String[] args) {
//      Ініціалізація Scanner для зчитування даних
        Scanner in = new Scanner(System.in);
//      Отримання вхідного числа а
        System.out.println("Введіть любе число, що > 0 (наприклад: 789)");
        long a = in.nextLong();

        trimAndReverse(a);          // виклик методу, з передачею даних у вигляді Long (8 Байт), максимальний діапазон цілих чисел
    }
}