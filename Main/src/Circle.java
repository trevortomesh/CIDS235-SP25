public class Circle {
    static int numberOfObjects = 0;
    double radius;

    Circle(){
        radius = 1.0;
        numberOfObjects++;
    }

    Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }


    double getArea(){
        return Math.PI * radius * radius;
    }

    double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    void printStuff(){
        System.out.println(getNumberOfObjects()); // access a static method
        System.out.println(getArea()); // access an instance method
        System.out.println(radius); // access an instance variable
        System.out.println(numberOfObjects); // access a static variable
    }
}
