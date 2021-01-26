

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

/**
 * @author viktoriakuznichenko
 * @version 1.0.0.
 */

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("java");
        list.add(null);
        list.add("");
        list.add(" ");

        listHandle(list);

        String[] array = new String[4];
        array[0] = "A";
        array[1] = "V";
        array[2] = "A";
        array[3] = "J";

        arrayHandle(array);

    }
    public static void listHandle (List <String> list){

        if(CollectionUtils.isEmpty(list)){
            System.out.println("Empty list");
        }
        if(CollectionUtils.isNotEmpty(list)){
            System.out.println("List not empty");
        }

    }
    public static void arrayHandle (String[] array){
        CollectionUtils.reverseArray(array);
        System.out.println(Arrays.toString(array));
    }
}
