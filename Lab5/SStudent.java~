import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
    private String regNo;
    private String name;
    private String email;
    private String phone;
    private String studentClass;
    private String department;
    
    public Student(String regNo, String name, String email, String phone, String studentClass, String department) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.studentClass = studentClass;
        this.department = department;
        saveDetailsToFile(); // Save student details to a file
    }
    
    public void printDetails() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Class: " + studentClass);
        System.out.println("Department: " + department);
    }

    private void saveDetailsToFile() {
        String fileName = name + ".txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Registration Number: " + regNo + "\n");
            writer.write("Name: " + name + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Phone: " + phone + "\n");
            writer.write("Class: " + studentClass + "\n");
            writer.write("Department: " + department + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Getter and Setter methods for all fields
    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class SStudent {
    private static final int MAX_STUDENTS = 100;
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int studentCount = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    searchStudent(scanner);
                    break;
                case 3:
                    displayAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
			}
    		} 
	while (choice != 4);
    	scanner.close();
	}

private static void addStudent(Scanner scanner) {
    if (studentCount == MAX_STUDENTS) {
        System.out.println("Cannot add more students! Maximum limit reached.");
        return;
    }
    System.out.print("Enter registration number: ");
    String regNo = scanner.nextLine();
    System.out.print("Enter name: ");
    String name = scanner.nextLine();
    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    System.out.print("Enter phone: ");
    String phone = scanner.nextLine();
    System.out.print("Enter class: ");
    String studentClass = scanner.nextLine();
    System.out.print("Enter department: ");
    String department = scanner.nextLine();
    
    Student student = new Student(regNo, name, email, phone, studentClass, department);
    students[studentCount++] = student;
    System.out.println("Student added successfully!");
}

private static void searchStudent(Scanner scanner) {
    System.out.println("Search for a student:");
    System.out.println("1. By name");
    System.out.println("2. By registration number");
    System.out.print("Enter your choice: " + "\n");
    int choice = scanner.nextInt();
    scanner.nextLine(); // Consume newline character
    
    switch (choice) {
        case 1:
            System.out.print("Enter name to search: ");
            String name = scanner.nextLine();
            searchStudentByName(name);
            break;
        case 2:
            System.out.print("Enter registration number to search: ");
            String regNo = scanner.nextLine();
            searchStudentByRegNo(regNo);
            break;
        default:
            System.out.println("Invalid choice! Please try again.");
            break;
    }
}

private static void searchStudentByName(String name) {
    boolean found = false;
    for (int i = 0; i < studentCount; i++) {
        if (students[i].getName().equalsIgnoreCase(name)) {
            students[i].printDetails();
            found = true;
        }
    }
    if (!found) {
        System.out.println("Student not found!");
    }}

private static void searchStudentByRegNo(String regNo) {
    boolean found = false;
    for (int i = 0; i < studentCount; i++) {
        if (students[i].getRegNo().equalsIgnoreCase(regNo)) {
            students[i].printDetails();
            found = true;
        }
    }
    if (!found) {
        System.out.println("Student not found!");
    }
}

private static void displayAllStudents() {
    if (studentCount == 0) {
        System.out.println("No students to display!");
        return;
    }
    System.out.println("Details of all students:" + "\n");
    for (int i = 0; i < studentCount; i++) {
        students[i].printDetails();
        System.out.println("------------------------");
    }
}
}
