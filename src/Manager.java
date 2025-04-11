import java.util.ArrayList;
import java.util.List;

public class Manager<T extends Employee> {
    private String name;
    private String position;
    private List<T> team;

    public Manager(String name) {
        this.name = name;
        this.position = "Manager";
        this.team = new ArrayList<>();
    }

    public void addEmployee(T employee) {
        team.add(employee);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public List<T> getTeam() {
        return team;
    }
}