package j25_문자열;

public class String1 {
    public static void main(String[] args) {

        String filePath = "C:/Users/junil/java-study/src/main/java/String.java";
        String filePath2 = "C:/Users/junil/project/java-study2/src/main/java/Integer.java";

        /*
            subString() -> 문자열을 잘라준다
            indexOf() -> 내가 찾는 문자열의 위치 인덱스를 반환
         */

        int srcIndex = filePath.indexOf("/src");
        String projectPath = filePath.substring(0, srcIndex);

        String projectName = projectPath.substring(projectPath.lastIndexOf("/") + 1);
        String fileName = filePath.substring(filePath.lastIndexOf("/") + 1, filePath.lastIndexOf("."));
        String extension = filePath.substring(filePath.lastIndexOf("."));

        System.out.println("프로젝트명: " + projectName);
        System.out.println("파일명: " + fileName);
        System.out.println("확장자명: " + extension);

    }
}
