import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Person
        System.out.println("Enter Person Details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Contact Number: ");
        String contactNumber = scanner.nextLine();

        // Input for Student
        System.out.println("\nEnter Student Details:");
        System.out.print("Enrolled (true/false): ");
        boolean enrolled = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline
        String dateOfEnrollment = "";
        int studentNumber = 0;
        String course = "";
        int yearLevel = 0;
        if (enrolled) {
            System.out.print("Date of Enrollment: ");
            dateOfEnrollment = scanner.nextLine();
            System.out.print("Student Number: ");
            studentNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Course: ");
            course = scanner.nextLine();
            System.out.print("Year Level: ");
            yearLevel = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        }

        // Input for Employee
        System.out.println("\nEnter Employee Details:");
        System.out.print("Employee Number: ");
        int employeeNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Employment Date: ");
        String employmentDate = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        // Create instances
        Person person = new Person(firstName, middleName, lastName, address, contactNumber);
        Student student = new Student(firstName, middleName, lastName, address, contactNumber,
                enrolled, dateOfEnrollment, studentNumber, course, yearLevel);
        Employee employee = new Employee(firstName, middleName, lastName, address, contactNumber,
                employeeNumber, employmentDate, department, salary);

        // Display information
        System.out.println("\nDisplaying Information:");
        System.out.println("-----------------------");
        System.out.println("Person Information:");
        System.out.println("Name: " + person.getFullName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Contact Number: " + person.getContactNumber());

        if (enrolled)
            student.displayStudentInfo();
        else
            System.out.println("Student is not enrolled.");

        employee.displayEmployeeInfo();

        scanner.close();
    }
}