package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        String searchName = "김규민";

        for(Student student : students) {
            if(student.getName().equals(searchName)) {
                System.out.println(searchName + " 학생의 학번: " + student.getId());
                break;
            }
        }

        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getName().equals(searchName)) {
                System.out.println(searchName + " 학생의 학번: " + student.getId());
                break;
            }
        }

        int searchId = 20220002;

        for(Student student : students) {
            if(student.getId() == searchId) {
                students.remove(students.indexOf(student));
                break;
            }
        }

        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getId() == searchId) {
                students.remove(i);
                break;
            }
        }

        System.out.println(students);


    }
}
