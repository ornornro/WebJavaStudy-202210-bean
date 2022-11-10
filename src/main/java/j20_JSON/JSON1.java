package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", "dongbin");
        jsonObject.addProperty("password", "3300");
        jsonObject.addProperty("email", "roornorn@gmail.com");
        jsonObject.addProperty("name", "이동빈");
        jsonObject.addProperty("age", 25);
        // 문자열, 숫자 다 들어감, map 과는 다르다 구조는 동일 속성-값
        // 사람이 읽을 수 있는 텍스트를 사용한다 문자열에 담긴 ""! 메소드는 들어갈 수 없다!

        System.out.println(jsonObject);

        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // 예쁘게 출력해라 ><
        String json = gson.toJson(jsonObject);
        System.out.println(json);

    }
}
