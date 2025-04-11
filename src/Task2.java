import java.util.ArrayList;
import java.util.List;

/*
Задача 2
Написать метод, получает два List одного и того же типа и возвращает List из элементов,
 которые присутствуют и в том и в том листе на одинаковых позициях

 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> integerList1 = List.of(1, 4, 6, 7);
        List<Integer> integerList2 = List.of(1, 2, 6);
        System.out.println(getListEqualsElements(integerList1, integerList2));

        List<String> stringList1 = List.of("jack", "nick");
        List<String> stringList2 = List.of("jack", "nick", "ann");
        System.out.println(getListEqualsElements(stringList1, stringList2));

    }

    public static <T> List<T> getListEqualsElements(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        for (T element1 : list1) {
            for (T element2 : list2) {
                boolean equals = element1.equals(element2);
                if (equals) {
                    result.add(element1);
                }
            }
        }
        return result;
    }

}
