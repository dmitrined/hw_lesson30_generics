/*
Задача 1
Написать generic метод, который считает, сколько раз заданный объект встречается в данном листе.
Ваш метод должен работать с листом любого типа

 */

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,3,1,2,1);
        System.out.println(countNumberOfObjects(integerList, 1));

        List<String> stringList = List.of("jo","mo","jo","flo","jo");
        System.out.println(countNumberOfObjects(stringList, "jo"));


    }

    public static <T> int countNumberOfObjects(List<T> list, T givenObject) {
        int counter = 0;
        for (T element : list) {
            if (element.equals(givenObject)) {
                counter++;
            }
        }
        return counter;
    }
}