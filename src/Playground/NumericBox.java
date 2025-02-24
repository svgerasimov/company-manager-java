package Playground;

public class NumericBox<T extends Number> {
    private T value;
    public NumericBox(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
      this.value = value;
    }
}
