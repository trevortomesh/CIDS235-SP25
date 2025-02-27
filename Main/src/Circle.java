/**
 * Circle.java
 *
 * @author Dr. Trevor Tomesh
 * @version 1.0
 * @since 2025-02-24
 *
 * This class represents a circle with a specified radius. It provides methods to calculate
 * the area and perimeter of the circle, set and get the radius, and track the number of Circle
 * objects created.
 */

public class Circle {
    /**
     * The number of Circle objects created.
     */
    private static int numberOfObjects = 0;

    /**
     * The radius of the Circle.
     */
    private double radius;

    /**
     * Default constructor that creates a Circle with a default radius of 1.0
     * and increments the number of Circle objects.
     */
    public Circle() {
        radius = 1.0;
        numberOfObjects++;
    }

    /**
     * Constructor that creates a Circle with the specified radius
     * and increments the number of Circle objects.
     *
     * @param newRadius the desired radius of the circle
     */
    public Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /**
     * Calculates and returns the area of the circle.
     *
     * @return the area of the circle
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

//    private double rsquared(){
//        return radius * radius;
//    }
    /**
     * Calculates and returns the perimeter (circumference) of the circle.
     *
     * @return the perimeter of the circle
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Sets the radius of the circle to the specified value.
     *
     * @param newRadius the new radius to set; should be a non-negative value
     */
    public void setRadius(double newRadius) {
        if(newRadius > 0) {
            radius = newRadius;
        }
        else{radius = 1;}
    }

    /**
     * Returns the current radius of the circle.
     *
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Returns the total number of Circle objects created.
     *
     * @return the number of Circle objects
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /*
     * The commented-out printStuff() method demonstrates how static and instance
     * members can and cannot be accessed within static methods.
     *
     * Note: Accessing instance methods or variables from a static context will
     * result in compilation errors.
     */
//    static void printStuff(){
//        System.out.println(getNumberOfObjects()); // Valid: static method access
//        System.out.println(getArea()); // Invalid: cannot access instance method from static context
//        System.out.println(radius); // Invalid: cannot access instance variable from static context
//        System.out.println(numberOfObjects); // Valid: static variable access
//    }
}