package dev.labs.s3;

public class Arguments {

    public static void main(String[] args) {
        Circle oval = new Circle(5,5);
        System.out.println(Circle.numberOfCircles);

        Circle round = new Circle(1,1);
        System.out.println(Circle.numberOfCircles);
    }
}

// Ref: https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
class Circle {
    private int originOne;
    private int originTwo;

    // Class Variable
    public static int numberOfCircles;

    static final double PI = 3.1416;


    public Circle(int originOne, int originTwo) {
        this.originOne = originOne;
        this.originTwo = originTwo;
        ++numberOfCircles;
    }

    public static int getNumberOfCircles(){
//        return originOne; // Not possible
//        int test = new Circle(2,2).originOne; // Work around
        return numberOfCircles;
    }

    public int getOriginOne() {
        return originOne;
    }

    public void setOriginOne(int originOne) {
        this.originOne = originOne;
    }

    public int getOriginTwo() {
        return originTwo;
    }

    public void setOriginTwo(int originTwo) {
        this.originTwo = originTwo;
    }


}
