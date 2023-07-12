
// Урок 3. Коллекции JAVA: Введение
// Формат сдачи: ссылка на подписанный git-проект.

// Задание

// Реализовать алгоритм сортировки слиянием
// Пусть дан произвольный список целых чисел, удалить из него четные числа
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
// Вы продлили срок сдачи задания до 14 июля, 10:00 +03:00 UTC

// //Задача № 1

import java.util.Arrays;

public class homework_3 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 23, 45, 67, 24,-5 };
        System.out.println(Arrays.toString(arr));
        sort(arr);

    }

    public static void sort(int[] arrSort) {
        int min;
        for (int i = 0; i < arrSort.length - 1; i++) {
            min = i;
            for (int j = i; j < arrSort.length; j++) {
                if (arrSort[min] > arrSort[j]) {
                    min = j;
                }
               

            }
            int a = arrSort[i];
            arrSort[i] = arrSort[min];
            arrSort[min] = a;
        }
        System.out.println(Arrays.toString(arrSort));

    }
  
}




// //Задача № 2

// import java.util.ArrayList;

// public class homework_3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<>();
//         numbers.add(11);
//         numbers.add(6);
//         numbers.add(7);
//         numbers.add(22);
//         numbers.add(27);
//         numbers.add(32);
//         numbers.add(39);

//         System.out.println("Список: " + numbers);

//         numbers.removeIf(n -> n % 2 == 0);

//         System.out.println("Список без четных чисел: " + numbers);

//     }
// }

// //Задача № 3

// import java.util.ArrayList;
// import java.util.Collections;

// public class homework_3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(3);
//         list.add(12);
//         list.add(56);
//         list.add(23);
//         list.add(8);
//         list.add(28);
//         list.add(10);

//         System.out.println("Список: " + list);

//         int min = Collections.min(list);
//         int max = Collections.max(list);
//         double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

//         System.out.println("Минимальное значение: " + min);
//         System.out.println("Максимальное значение: " + max);
//         System.out.println("Среднее арифметическое значение: " + average);
//     }
// }