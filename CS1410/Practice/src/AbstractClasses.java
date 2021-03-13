public class AbstractClasses {
    public static void main(String[] args) {
        geometricObject1 circle = new circle1(1);
        geometricObject1 rectangle = new rectangle1(1, 4);
        System.out.println(equalArea(circle, rectangle));

        rectangle.setColor("yellow");
        System.out.printf("the color of the circle is %s \n", circle.getColor());
        System.out.printf("the color of the rectangle is %s", rectangle.getColor());

    }

    //this wouldnt work unless this method was defined in an abstract class
    public static boolean equalArea (geometricObject1 object1, geometricObject1 object2) {
        return object1.getArea() == object2.getArea();
    }
}

//if a class has an abstract method than it must be abstract
//abstract methods are great if the super class cant implement it but it works for the subclasses
//you need to use it for equal methods as shown above
abstract class geometricObject1 {
    String color;
    geometricObject1(){
        this.color = "blue";
    }
    void setColor(String color) {this.color = color;}
    String getColor() {return this.color;}
    abstract double getArea();
}

class circle1 extends geometricObject1 {
    double radius;
    circle1(double radius) {
        this.radius = radius;
    }
    double getRadius() { return this.radius; }
    void setRadius(double radius) {this.radius = radius;}
    double getArea(){
        return this.radius * this.radius * 3.14;
    }
}
class rectangle1 extends geometricObject1 {
    int width;
    int height;
    rectangle1(int width, int height){
        this.width = width;
        this.height = height;
    }
    int getWidth(){return this.width;}
    void setWidth(int width) {this.width = width;}
    int getHeight() {return this.height;}
    void setHeight(int height) {this.height = height;}
    double getArea(){
        return this.width * this.height;
    }
}
