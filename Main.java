public class Main {
    public static void main(String[] args) {
        College cics = new College("College of Information and Computer Studies");
        Department csDept = new Department("Computer Science");
        Department itDept = new Department("Information Technology");

        Teacher t1 = new Teacher("Prof. Love", "SoftEng 1", 6789);
        Teacher t2 = new Teacher("Prof. Lynn", "SoftEng 2", 1234);

        Student s1 = new Student("John", "22-10995-540", 16423);
        Student s2 = new Student("Jane", "22-10995-541", 12365);
        Student s3 = new Student("Doe", "22-10995-542", 7689);

        csDept.addUnit(t1);
        csDept.addUnit(s1);
        csDept.addUnit(s2);

        itDept.addUnit(t2);
        itDept.addUnit(s3);

        cics.addUnit(csDept);
        cics.addUnit(itDept);

        cics.displayDetails();
        System.out.println("\nTotal Students in CICS: " + cics.getStudentCount());
        System.out.println("Total Budget of CICS: " + cics.getBudget());
    }
}
