import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex03 {
    public static void main(String[] args) {
        List<String> list3 = List.of("20","40","70","70","80","70","100");
        Set<String> set = new HashSet<>(list3);
        List<String> list2 = new ArrayList<>();
        List<String> list = new ArrayList<>();
        int max_num_idx = 0;
        String max_num = "0";
        for (String i :set){
            list.add("20");
            list.add("40");
            list.add("70");
            list.add("70");
            list.add("80");
            list.add("70");
            list.add("100");
            list2.add((String)i);
            list.retainAll(list2);
            if (max_num_idx < list.size()){
                max_num = i;
                max_num_idx = list.size();
            }
            list2.clear();
            list.clear();
        }
        System.out.println("max : " + max_num);
    }
}
