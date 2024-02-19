package Java_map;
import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("name","Abigail");
        map.put("age", "11");
        map.put("address", "Seoul");

        System.out.println(map.get("name"));
        System.out.println(map.keySet());
        System.out.println(map.size());

        map.remove("name");
        map.replace("age", "30");
        System.out.println(map.keySet());
        for(String key : map.keySet()){
            System.out.println(key+"의 value 값은 "+ map.get(key));
	}
        System.out.println(map.containsKey("aaa"));
        System.out.println(map.containsKey("age"));

	}

}
