import java.util.*;
class Shape{
    void displayShape(){
    System.out.print("The shape of the Figures is");
 }
}
class triangle extends Shape{
 displayShape(){
        super.displayShape();
    System.out.println("Tringle");
    }
}

public class experiment5{
    public static void main(String[] args){
        System.out.println("Hellow world");
        triangle t1 = new triangle();
        t1.displayShape();
    }
}