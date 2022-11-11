package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User {
    private String username;
    private String password;
    private String email;
    private String name;
}

public class JSON2 {
    public static void main(String[] args) {
        // Gson 으로 변환 할 수 있는 객체의 종류
        // jsonObject, Object, Map

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create(); // 대신 빌더는 속성들을 잡아줄 수 있다
        Gson gson = new Gson(); // 윗줄과 똑같음

        String userJson = null;
        String studentJson = null;
        String productJson = null;

        // Object (객체) -> JSON
        User user = new User("dongbin", "1234", "roornorn@gmail.com", "이동빈");
        System.out.println(gsonBuilder.toJson(user));
        System.out.println(gson.toJson(user)); // prettyPrinting 을 사용하는 gsonBuilder 를 써주는게 더 좋다
        userJson = gsonBuilder.toJson(user);

        // JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "20220001");
        jsonObject.addProperty("studentName", "이동빈");
        jsonObject.addProperty("studentYear", "2");
        System.out.println(gsonBuilder.toJson(jsonObject));
        studentJson = gsonBuilder.toJson(jsonObject);

        // Map -> JSON
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode", "P-20220001");
        map.put("productName", "삼성 노트북");
        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);

        // JSON -> Map
        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData.get("name"));

        jsonData = convertJsonToMap(studentJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);

        // JSON -> JsonObject
        JsonObject jsonObj = convertJsonToJsonObject(userJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(studentJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(productJson);
        System.out.println(jsonObj);

        // JSON -> User
        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);

    }

    public static Map convertJsonToMap(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Map.class); // 제이슨 형식을 보고 맵을 만들어준다!
    }

    public static JsonObject convertJsonToJsonObject(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, JsonObject.class);
    }

    public static User convertJsonToUser(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, User.class);
    }

}
