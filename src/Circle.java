public class Circle {
    private static final double Pi = 3.114;
    public Circle() {
    }
    public static double area(int radius) {
        return Pi * (radius * radius);
    }
    public static double circumference(int radius) {
        return Pi * 2 * radius;
    }


}
