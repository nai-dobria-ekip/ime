import java.util.Scanner;

class Student {
    String name;
    int age;
    double grade;

    // Constructor to initialize student details
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];  // We will allow storing information for 5 students
        int count = 0;

        while (count < 5) {
            System.out.println("Enter the details of student " + (count + 1));

            // Input student name
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            // Input student age
            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            // Input student grade
            System.out.print("Enter grade: ");
            double grade = Double.parseDouble(scanner.nextLine());

            // Create a new student object
            students[count] = new Student(name, age, grade);
            count++;

            // Option to add more students
            if (count < 5) {
                System.out.println("Would you like to enter details for another student? (yes/no)");
                String response = scanner.nextLine().toLowerCase();
                if (response.equals("no")) {
                    break;
                }
            }
        }

        // Display all student details
        System.out.println("\nStudent Details:");
        for (int i = 0; i < count; i++) {
            students[i].displayStudentDetails();
        }

        scanner.close();
    }
}
