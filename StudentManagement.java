import java.util.*;

public class StudentManagement {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
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

}
