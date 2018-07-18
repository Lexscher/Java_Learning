public class AreaCalculator {
    public static void main(String[] args) {
        area(5.0);
        area(-1);
        area(5.0, 4.0);
        area(-1.0, 4.0);
    }

    // Write a method named area with one double parameter, radius.
    // The method needs to return a double value that represents
        // the area of a circle.
    // if the parameter, radius, is negative, then return -1.0

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double pi = 3.14159;

        double a = radius * radius * pi;
        System.out.println(a);
        return a;

    }

    // Write another overloaded method with 2 parameters, x and y (doubles).
    // The method needs to return an area of a rectangle.
    // if any of the parameters are negative, return -1.0
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        double a = x * y;
        System.out.println(a);
        return a;
    }
}
