public class Add extends Operation {

    Add() {}

    @Override
    public float invoke(float n1, float n2) {
        return n1 + n2;
    }

    @Override
    public String toString() {
        return " + ";
    }
}
