import java.util.ArrayList;
import java.util.List;

public class College implements OrganizationUnit {
    private String name;
    private List<OrganizationUnit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void addUnit(OrganizationUnit unit) {
        units.add(unit);
    }

    public void displayDetails() {
        System.out.println("College: " + name);
        for (OrganizationUnit unit : units) {
            unit.displayDetails();
        }
    }

    public int getStudentCount() {
        int count = 0;
        for (OrganizationUnit unit : units) {
            count += unit.getStudentCount();
        }
        return count;
    }

    public double getBudget() {
        double budget = 0;
        for (OrganizationUnit unit : units) {
            budget += unit.getBudget();
        }
        return budget;
    }
}