package Java_map;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 문제2 {
	public static void main(String[] args) {
        List<Integer> list3 = List.of(20,40,70,70,80,70,100);
        Set<Integer> set = new HashSet<>(list3);
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int max_num_idx = 0;
        int max_num = 0;
        for (int i :set){
            list.add(20);
            list.add(40);
            list.add(70);
            list.add(70);
            list.add(80);
            list.add(70);
            list.add(100);
            list2.add(i);
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
