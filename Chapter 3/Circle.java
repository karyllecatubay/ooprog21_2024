public class Circle {

    private static double radius;
    private static double diameter;
    private static double area;

    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    public static void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Radius of the initial circle: " + c.getRadius());
        System.out.println("Diameter of the initial circle: " + c.getDiameter());
        System.out.println("Area of the initial circle: " + c.getArea()); 
        
        //Testing
        c.setRadius(7);
        System.out.println("Radius of the updated circle: " + c.getRadius());
        System.out.println("Diameter of the updated circle: " + c.getDiameter());
        System.out.println("Area of the updated circle: " + c.getArea());
    }
}
