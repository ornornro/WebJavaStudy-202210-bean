package j10_접근지정자.캡슐화;


public class StudentService {

    public void registerStudent() {
        System.out.println("[ 학생 정보 등록 메뉴 ]");
        System.out.println("먼저 중복된 학생 정보인지 확인합니다.");
        doubleCheckStudent("김준일");
        System.out.println("학생정보를 등록합니다.");
    }

    private boolean doubleCheckStudent(String studentName) {

        if(studentName.equals("김준일")) {
            return false;
        }

        return true;
    }

}
