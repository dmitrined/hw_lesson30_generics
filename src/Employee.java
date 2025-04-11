public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }


    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Position: %s", name, position);
    }

    public static class Programmer extends Employee {
        public Programmer(String name) {
            super(name, "Programmer");
        }

    }

    public static class QAEngineer extends Employee {
        public QAEngineer(String name) {
            super(name, "QAEngineer");
        }
    }

    public static class FrontEndProgrammer extends Programmer {
        public FrontEndProgrammer(String name) {
            super(name);
        }
    }

    public static class BackEndProgrammer extends Programmer {
        public BackEndProgrammer(String name) {
            super(name);
        }
    }
}