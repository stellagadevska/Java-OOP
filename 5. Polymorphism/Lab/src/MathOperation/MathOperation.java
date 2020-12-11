package MathOperation;

public class MathOperation {
    // This class is intended to be used as static methods only

    public MathOperation() {
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return add(a, b) + c;
    }

    public int add(int a, int b, int c, int d) {
        return add(a, b) + add(c, d);
    }
}
