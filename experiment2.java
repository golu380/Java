abstract class Area{
    // abstract void area();
    int side ;
    int radius;
    Area(int val1,int val2){

    }
}

class Square extends  Area{
void area(){
  
    System.out.println("the area of the square is: "+ side*side);
}
}
class Circle extends Area{
    void area(){
       
        System.out.println("Area of the circle is "+3.14f*radius*radius);
    }
}

public class experiment2 {
    public static void main(String[] args){
        System.out.println("hello ");
       
        Square sq = new Square();
        sq.area();
        Circle c1 = new Circle();
        c1.area();
    }
}
