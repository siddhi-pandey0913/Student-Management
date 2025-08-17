import java.util.*;

public class StudentManagement {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Added successfully");
    }

    public void viewAllStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student searchStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    public void removeStudent(int id) {
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            if (itr.next().getId() == id) {
                itr.remove();
            }
        }
    }

    public void getTopper() {
        if (students.isEmpty()) {
            System.out.println("No student is available");
            return;
        }

        Student topper = students.get(0);
        for (Student s : students) {
            if (s.getMarks() > topper.getMarks()) {
                topper = s;
            }
        }
        System.out.println("The topper is:" + topper);
    }
    public void updateMarks(int id, double marks) {
    for (Student s : students) {
        if (s.getId() == id) {
            s.setMarks(marks); // use setter
            System.out.println("Marks updated for student ID: " + id);
            return;
        }
    }
    System.out.println("Student with ID " + id + " not found.");
}

}
