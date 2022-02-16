public class MyPrototype implements CloneMe{

    private int a;
    private double c;
    private String mystring;

    public int getA() {
        return a;
    }

    public double getC() {
        return c;
    }

    public String getMystring() {
        return mystring;
    }

    @Override
    public String toString() {
        return "MyPrototype{" +
                "a=" + a +
                ", c=" + c +
                ", mystring='" + mystring + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        return null;
    }
}
