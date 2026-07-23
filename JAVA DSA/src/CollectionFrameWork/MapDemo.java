package CollectionFrameWork;

import java.util.ArrayList;
import java.util.*;


public class MapDemo {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(8);
        list.add(2);
        list.add(90);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
