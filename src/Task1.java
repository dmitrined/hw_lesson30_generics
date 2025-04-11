/*
Задача 1
Написать generic метод, который считает, сколько раз заданный объект встречается в данном листе.
Ваш метод должен работать с листом любого типа

 */

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(1);
        integerList.add(2);
        integerList.add(1);
        System.out.println(countNumberOfObjects(integerList, 1));

        List<String> stringList = new ArrayList<>();
        stringList.add("jo");
        stringList.add("mo");
        stringList.add("jo");
        stringList.add("flo");
        stringList.add("jo");
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