class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String contactNumber;

    public Person(String firstName, String middleName, String lastName, String address, String contactNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}

class Student extends Person {
    private boolean enrolled;
    private String dateOfEnrollment;
    private int studentNumber;
    private String course;
    private int yearLevel;

    public Student(String firstName, String middleName, String lastName, String address, String contactNumber,
                   boolean enrolled, String dateOfEnrollment, int studentNumber, String course, int yearLevel) {
        super(firstName, middleName, lastName, address, contactNumber);
        this.enrolled = enrolled;
        this.dateOfEnrollment = dateOfEnrollment;
        this.studentNumber = studentNumber;
        this.course = course;
        this.yearLevel = yearLevel;
    }

    public void displayStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + getFullName());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("Enrolled: " + (enrolled ? "Yes" : "No"));
        if (enrolled) {
            System.out.println("Date of Enrollment: " + dateOfEnrollment);
            System.out.println("Student Number: " + studentNumber);
            System.out.println("Course: " + course);
            System.out.println("Year Level: " + yearLevel);
        }
    }
}

class Employee extends Person {
    private int employeeNumber;
    private String employmentDate;
    private String department;
    private double salary;

    public Employee(String firstName, String middleName, String lastName, String address, String contactNumber,
                    int employeeNumber, String employmentDate, String department, double salary) {
        super(firstName, middleName, lastName, address, contactNumber);
        this.employeeNumber = employeeNumber;
        this.employmentDate = employmentDate;
        this.department = department;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + getFullName());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Date of Employment: " + employmentDate);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
