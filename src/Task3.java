/*
Задача 3
Допустим у нас в программе Programmer, QA Engineer, BackEnd Programmer,
FrontEnd Programmer
Вам необходимо реализовать класс Manger, который должен содержать информацию о команде, которой управляет Manger).
Т.е. у Manager должен быть список (List) членов команды.
Важное ограничение: создавая менеджера мы определяем “специализацию менеджера” т.е.командой каких специалистов он может руководить:
 например, только специалистами тестирования, или только программистами, или только фронт-энд программистами.
Реализуйте метод добавления работника в команду. Естественно, в команду  Programmer не должно быть возможным добавить QAEngineer
 */

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        // создаю менеджеров по специализации
        Manager<Employee.Programmer> programmerManager = new Manager<>("Alis");
        Manager<Employee.QAEngineer> qaEngineerManager = new Manager<>("Bob");

        // добавляю программистов в List<T> team программистов
        programmerManager.addEmployee(new Employee.FrontEndProgrammer("Flo"));
        programmerManager.addEmployee(new Employee.BackEndProgrammer("Mo"));

        // пытаюсь добавить тестировщика в команду программистов - ошибка(это ОК)
        // programmerManager.addEmployee(new Employee.QAEngineer("Mike"));

        // добавляю тестировщиков в List<T> team тестировщиков
        qaEngineerManager.addEmployee(new Employee.QAEngineer("Jo"));
        qaEngineerManager.addEmployee(new Employee.QAEngineer("Tim"));

        //печать List<T> team менеджеров
        printManagerTeam(programmerManager, programmerManager.getTeam());
        printManagerTeam(qaEngineerManager, qaEngineerManager.getTeam());

    }

    //Метод для печати команд по специализации
    public static <T> void printManagerTeam(Manager manager, List<T> list) {
        System.out.println(manager.getPosition() + ": " + manager.getName());
        for (T value : list) {
            System.out.println(value);
        }
    }


}

