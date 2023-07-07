

/**Задание

1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
2) Вывести все простые числа от 1 до 1000
3) Реализовать простой калькулятор
4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
*/
import java.util.Scanner;
public class homework_1 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int number_1, number_2, answer;
            char oper;

            System.out.print("Введите оперцию(+,-,*,/):");
            oper = scan.next().charAt(0);
            System.out.print("Введите первое число:");
            number_1 = scan.nextInt();
            System.out.print("Введите второе число:");
            number_2 = scan.nextInt();

            boolean correct = true;
            switch (oper) {
                case '+':
                    answer = number_1 + number_2;
                    break;
                case '-':
                    answer = number_1 - number_2;
                    break;
                case '*':
                    answer = number_1 * number_2;
                    break;
                case '/':
                    answer = number_1 / number_2;
                    break;
                default:
                    answer = 0;
                    correct = false;
            }
            System.out.println(correct ? "Result: " + answer : "Неверная операция!");
        }
    }
 }

/** 
 * public class homework_1 {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 2; i < n; i++) {
            boolean a = true;
            int q = (int) Math.sqrt(i);
            for (int j = 2; j <= q; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.println(i + " простое");
            }
        }
    }
    }
    */
