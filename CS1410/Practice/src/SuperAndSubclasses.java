public class SuperAndSubclasses {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(2.5, "white");
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
        System.out.println(circle.getDate());

        Circle1 circle2 = new Circle1();
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getColor());
        System.out.println(circle2.getDate());

        Rectangle rectangle = new Rectangle();
        polymorphism(circle2);
        polymorphism(rectangle);

        //example of casting objects and instance operator
        GeometricObjects1 circle1 = new Circle1();
        GeometricObjects1 rectangle2 = new Rectangle();
        rectangle2.tryProtection();
    }

    //this is an example of polymorphism
    public static void polymorphism(GeometricObjects1 object) {
        System.out.println(object.getDate());
        System.out.println(object.getColor());

        //the following else if statement is an example of using instance of
        if (object instanceof Circle1){
            System.out.println("I am a circle");
        }
        else if (object instanceof Rectangle) {
            System.out.println("I am a rectangle");
        }
    }

}

class Circle1 extends GeometricObjects1 {
    double radius;
    Circle1(){
        super("blue");
        this.radius = 3.6;

    }

    Circle1(double radius,String color) {
        this.radius = radius;
        setColor(color);
    }
    double getRadius() {
        return this.radius;
    }
}

class Rectangle extends GeometricObjects1 {
    int width;
    int height;

    Rectangle() {
        super("Green");
        this.width = 5;
        this.height = 6;
        tryProtection();
    }
    int getWidth() {return this.width;}
    int getHeight() {return this.height;}
}

class GeometricObjects1 {
    java.util.Date date;
    String color;

    GeometricObjects1() {
        date = new java.util.Date();
    }
    GeometricObjects1(String color) {
        this.color = color;
        date = new java.util.Date();
    }
    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
    String getDate() {
        return date.toString();
    }

    //protected allows things to be only accessible by the class and the subclasses.
    protected void tryProtection(){
        System.out.println("I am protected");
    }
}
