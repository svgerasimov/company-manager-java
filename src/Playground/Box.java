package Playground;

public class Box<T> {
    private T value;
    public Box(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}

// BOx<Integer> box = new Box<>()

//public class Box {
//    private Integer value;
//    public Box(Integer value) {
//        this.value = value;
//    }
//    public Integer getValue() {
//        return value;
//    }
//}

