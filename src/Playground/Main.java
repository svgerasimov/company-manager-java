package Playground;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       var box =  new Box<String>("Hello World");
       Box<Integer> box1 =  new Box<>(1);


       List<String> stringList = new ArrayList<>();

       NumericBox<Integer> boxNumber = new NumericBox<>(1);
       NumericBox<Double> boxDoble = new NumericBox<>(2.0);
       NumericBox<Byte> byteBox = new NumericBox<>((byte) 2);
//       NumericBox<String> byteBox = new NumericBox<>("asfafd");

        printArray(new Integer[]{1,2,3});
    }


    public static <U> void printArray(U[] array) {
        for (U item : array) {
            System.out.println(item);
        }
    }


}
