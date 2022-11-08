package j19_컬렉션;

import java.util.*;

public class StringSet {

    public static void main(String[] args) {

        Set<String> strSet = new HashSet<String>(); // 중복 제외용으로 많이 사용함

        List<String> strList = new ArrayList<String>();
        strList.add("칠동빈");
        strList.add("팔동빈");
        strList.add("구동빈");
        strList.add("십동빈");
        strList.add("십일동빈");
        strList.add("이동빈");

        // 값 추가
        strSet.add("이동빈");
        strSet.add("삼동빈");
        strSet.add("사동빈");
        strSet.add("오동빈");
        strSet.add("육동빈");

        System.out.println(strSet);
        strSet.addAll(strList);
        System.out.println(strSet);

        // 값 조회
        String searchName = "이동빈";

        /*
            strSet 에 이동빈이 있으면 true 없으면 false
         */

        boolean isTrue = false;

        for(String name : strSet) {
            if(name.equals(searchName)) {
                isTrue = true;
                break;
            }
        }

        System.out.println(isTrue);

        // 수정
        /*
            strSet 에서 삼동빈 > 십이동빈으로 바꿔라
         */

        for(String name : strSet) {
            if(name.equals(searchName)) {
                strSet.remove(searchName);
                strSet.add("십이동빈");
                break;
            }
        }

        System.out.println(strSet);

        searchName = "이동빈";

        System.out.println(strSet.contains(searchName));

        if(strSet.contains(searchName)) {
            strSet.remove(searchName);
            strSet.add("십이동빈");
        }

        System.out.println(strSet);

    }

}
