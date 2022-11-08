package j09_클래스.Student풀이;

public class Student {

    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    void increaseStudentYear() {
        studentYear++;
        if(studentYear > 5) {
            System.out.println("더 이상 학년을 증가시킬 수 없습니다.");
            System.out.println();
            studentYear--;
            return;
        }
        showStudentInfo();
    }

    void increaseStudentYear(int year) {
        studentYear += year;
        if(studentYear > 5) {
            System.out.println(year + "학년을 더하면 " + studentYear + "학년이 되어서 5학년을 넘어섭니다.");
            System.out.println();
            studentYear -= year;
            return;
        }
        showStudentInfo();
    }

    void showStudentInfo() {
        System.out.println("학교: " + schoolName);
        System.out.println("학번: " + studentCode);
        System.out.println("학년: " + studentYear);
        System.out.println("이름: " + name);
        System.out.println();
    }

}
