public class Course
{
    String courseName;
    int numberOfStudents;
    int studentsPassed;
    // Static variables: one shared copy for all Course objects
    static int totalStudents = 0;
    static int totalPassed = 0;

    Course(String courseName, int numberOfStudents, int studentsPassed)
    {
        this.courseName = courseName;
        this.numberOfStudents = numberOfStudents;
        this.studentsPassed = studentsPassed;

        // Each new course adds its numbers to the shared static totals
        totalStudents += numberOfStudents;
        totalPassed += studentsPassed;
    }

    void showStatistics()
    {
        double passPercentage = (studentsPassed * 100.0) / numberOfStudents;

        System.out.println("Course: " + courseName);
        System.out.println("Number of students: " + numberOfStudents);
        System.out.println("Students passed: " + studentsPassed);
        System.out.println("Pass percentage: " + passPercentage + "%");
        System.out.println();
    }

    public static void main(String[] args)
    {
        Course java = new Course("Java", 20, 17);
        Course database = new Course("Database", 30, 24);
        Course networking = new Course("Networking", 30, 21);

        java.showStatistics();
        database.showStatistics();
        networking.showStatistics();

        double universityPassRate = (totalPassed * 100.0) / totalStudents;

        System.out.println("University-wide statistics");
        System.out.println("Total students in the university: " + totalStudents);
        System.out.println("Total students passed: " + totalPassed);
        System.out.println("University pass percentage: " + universityPassRate + "%");
    }
}