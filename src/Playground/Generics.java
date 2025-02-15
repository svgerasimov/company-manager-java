package Playground;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    static List<String> stringList = new ArrayList();
    static List<Integer> intList = new ArrayList();




    public static void main(String[] args) {
        stringList.add("first");
        intList.add(1);

        for (int i = 0; i < stringList.size(); i++) {
            var s = stringList.get(i);

//            System.out.println(stringList.get(i));

        }

    }

}
