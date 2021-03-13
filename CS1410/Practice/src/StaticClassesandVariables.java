public class StaticClassesandVariables {
    public static void main(String[] args) {
        Circle object1 = new Circle();
        Circle object2 = new Circle(3);
        Circle object3 = new Circle(4);
        Circle object4 = new Circle(5);

        System.out.println("area of object1: " + object1.getArea());
        System.out.println("area of object2: " + object2.getArea());
        System.out.println("area of object3: " + object3.getArea());
        System.out.println("area of object4: " + object4.getArea());

        System.out.println("number of circle objects : " + Circle.getNumOfCircles());

    }
}


class Circle{
    static int numOfCircles = 0;
    int radius;

    Circle(){
        this.radius = 2;
        numOfCircles++;
    }
    Circle(int radius){
        this.radius = radius;
        numOfCircles++;
    }

    double getArea(){
        return 2 * 3.14 * this.radius;
    }


    //static methods can only use static variables, they cant use instance variables
    static int getNumOfCircles(){
        return numOfCircles;
    }

}
