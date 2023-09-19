public class AreaCalculator {
    public static double area(double radius){
        if(radius<0){
            return -1.0;
        }
        return radius*radius*Math.PI;
    }
    public static double area(double x,double y){
        if(x<0||y<0){
            return -1.0;
        }
        return x*y;
    }
    public static void main(String[] args) {
        double circleArea = area(5.0);
        if (circleArea == -1.0) {
            System.out.println("Invalid radius");
        } else {
            System.out.println("Circle area: " + circleArea);
        }

        // Testing the area method with a rectangle
        double rectangleArea = area(5.0, 4.0);
        if (rectangleArea == -1.0) {
            System.out.println("Invalid side(s)");
        } else {
            System.out.println("Rectangle area: " + rectangleArea);
        }
    }
}
