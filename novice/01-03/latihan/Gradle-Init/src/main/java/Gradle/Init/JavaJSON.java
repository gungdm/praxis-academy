package Gradle.Init;

import java.util.HashMap;
import com.google.gson.Gson;

public class JavaJSON {
    private final Gson serializer = new Gson();

    public void JSONEncode(){

        HashMap<String, Object> obj = new HashMap<>();

        obj.put("name", "foo");
        obj.put("num", (100));
        obj.put("balance",(1000.21));
        obj.put("is_vip",(true));

        String json = this.serializer.toJson(obj);
        System.out.println(json);
    }
    public static void main(String[] args) {
        new JavaJSON().JSONEncode();
     }
}
