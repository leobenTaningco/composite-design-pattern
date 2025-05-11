public class Teacher implements OrganizationUnit {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("    Teacher: " + name + ", Subject: " + subject + ", Salary: " + salary);
    }

    public int getStudentCount() {
        return 0;
    }

    public double getBudget() {
        return -salary;
    }
}
