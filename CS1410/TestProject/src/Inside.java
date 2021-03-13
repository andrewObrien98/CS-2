/**
 * Assignment 3 for CS 1410
 * This program determines if points are contained within circles or rectangles.
 */
public class Inside {
    /**
     * This is the primary driver code to test the "inside" capabilities of the
     * various functions.
     */
    public static void main(String[] args) {
        double[] ptX = { 1, 2, 3, 4 };
        double[] ptY = { 1, 2, 3, 4 };
        double[] circleX = { 0, 5 };
        double[] circleY = { 0, 5 };
        double[] circleRadius = { 3, 3 };
        double[] rectLeft = { -2.5, -2.5 };
        double[] rectTop = { 2.5, 5.0 };
        double[] rectWidth = { 6.0, 5.0 };
        double[] rectHeight = { 5.0, 2.5 };

        //This is where I create the circle part of the project
        System.out.println("--- Report of Points and Circles ---\n");
        for(int i = 0; i < 2; i++){
            double cirX = circleX[i];
            double cirY = circleY[i];
            double cirR = circleRadius[i];
            for(int k = 0; k < ptX.length; k++){
                double x = ptX[k];
                double y = ptY[k];
                reportPoint(x,y);
                boolean within = isPointInsideCircle(x, y, cirX, cirY, cirR);
                if(within){
                    System.out.print(" is inside ");
                }
                else{
                    System.out.print(" is outside ");
                }
                reportCircle(cirX, cirY, cirR);
                System.out.println("");
            }
        }
        // This is where I create the rectangle part of the project
        System.out.println("\n--- Report of Points and Rectangles ---\n");
        for(int i = 0; i < 2; i++){
            double left = rectLeft[i];
            double top = rectTop[i];
            double right = rectWidth[i] + left;
            double bottom = top - rectHeight[i];
            for(int k = 0; k < ptX.length; k++){
                double x = ptX[k];
                double y = ptY[k];
                reportPoint(x,y);
                boolean within = isPointInsideRectangle(x, y, left, top, rectWidth[i], rectHeight[i]);
                if(within){
                    System.out.print(" is inside ");
                }
                else{
                    System.out.print(" is outside ");
                }
                reportRectangle(left, top, right, bottom);
                System.out.println("");
            }
        }
    }
    public static void reportPoint(double x, double y){
        System.out.printf("point(%.1f, %.1f)", x , y);
    }
    public static void reportCircle(double x, double y, double r){
        System.out.printf("Circle(%.1f, %.1f) Radius: %.1f", x, y, r);
    }
    public static void reportRectangle(double left, double top, double width, double height){
        System.out.printf("Rectangle(%.1f, %.1f, %.1f, %.1f)", left, top, width, height);
    }
    public static boolean isPointInsideCircle(double ptX, double ptY, double circleX, double circleY, double circleRadius){
        double x = ptX - circleX;
        double y = ptY - circleY;
        double radius = circleRadius * circleRadius;
        double answer = (x * x) + (y * y);
        if(answer <= radius){
            return true;
        }
        return false;
    }
    public static boolean isPointInsideRectangle(double ptX, double ptY, double rLeft, double rTop, double rWidth, double rHeight){
        if ((ptX >= rLeft && ptX <= rWidth + rLeft)&&(ptY <= rTop && ptY >= rTop - rHeight)){
            return true;
        }
        return false;
    }
}
