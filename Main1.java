import java.util.*;

public class Main1{
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: "); 
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Name: "); 
                    String name = sc.nextLine();
                    System.out.print("Enter Course: "); 
                    String course = sc.nextLine();
                    System.out.print("Enter Marks: "); 
                    double marks = sc.nextDouble();
                    sm.addStudent(new Student(id, name, course, marks));
                    break;
                case 2:
                    sm.viewAllStudents();
                    break;
                case 3:
                    System.out.print("Enter ID: "); 
                    id = sc.nextInt();
                    Student s = sm.searchStudentById(id);
                    System.out.println(s != null ? s : "Not found");
                    break;
                case 4:
                    System.out.print("Enter ID: "); 
                    id = sc.nextInt();
                    sm.removeStudent(id);
                    System.out.println("Removed if existed.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

