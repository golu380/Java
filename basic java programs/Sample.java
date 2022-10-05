class Sample{
    public static void main(String[] args){
        // boolean b = true;
        // if(b){
        //     System.out.println("if bloic");

        // }else{
        //     System.out.println("else block");
        // }
            // for(;;){
            //     System.out.println("for loop");
            // }
            // int [] numbers = {10,20,30,40,50};
            // for(int i: numbers){
            //     System.out.println("i "+i);
            // }
        //     int[] ia = new int[3];
        //     System.out.println(ia.getClass());
        //     System.out.println(ia.getClass().getSuperclass());
        //   int [] a;
        //   a = new int[5];
        //   for(int i:a){
        //     System.out.println(i);
        //   }
            // int ai[] = {1,2,3,4,5};
            // int aic[] = ai;
            // aic[2] = -9;
            // System.out.println((aic[2]));
            // System.out.println((aic[2]));
            // aic = ai.clone();
            // System.out.println(aic[2]);
            // aic[1] = -15;
            // System.out.println(aic[1]);
            // System.out.println(ai[1]);
            // printArraty(new int[]{10,22,44,66});
            //  int[] a=  new int[5]={1,2,3}
            // Pig mypig = new Pig();
            // mypig.animalSound();
            // mypig.sleep();
            // int x = 30, y = 10;
            // My_calculation demo = new My_calculation();
            // demo.addition(x, y);
            // demo.substraction(x, y);
            // demo.multiplication(x, y);
            // Dogs d = new Dogs();
            // d.printColor();
            // xyz obj = new xyz();
            // obj.myMethod();
            // Bank b = new SBI();
            // System.out.println("Rate of interest is: "+b.getRateOfInterest()+"%");
            // b = new PNB();
            // System.out.println("Rate of interest is "+b.getRateOfInterest()+"%");
                // Outer.Inner in = new Outer().new Inner();
                // in.show();
                Outer1 o1 = new Outer1();
                o1.outerMethod();
    }
static void printArraty(int arr[]){
    for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
    
}
abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("zzzzz.....");
    }


}
class Pig extends Animal{
public void animalSound(){
    System.out.println("the sound of pic  weee weee ..");
}
}

class Calculation{
    int z;
    public void addition(int x,int y){
        z = x+y;
        System.out.println("the sum of the givnen numubers "+z);
    }
    public void substraction(int x,int y){
        z = x-y;
        System.out.println("the diffrence between the given numbers:"+z);

    }
}

class My_calculation extends Calculation{
    public void multiplication(int x,int y){
        z = x*y;
        System.out.println("the product of the given number is "+z);
    }
}
//super words for accesing the data of super class if it is same in both;
class Animals{
    String color = "white";
}
class Dogs extends Animals{
    String color = "black";
   void printColor(){
    System.out.println("the color of child class is "+color);
    System.out.println("the color of parent class is"+super.color);
   }


}
//Runtime polymorphism
class ABC{
    public void myMethod(){
        System.out.println("Overrided methods");
    }
}
class xyz extends ABC{
    public void myMethod(){
        System.out.println("Overrideing Methods");
    }
}
//Abstract class
abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){return 7;}
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class Outer{
    class Inner{
        public void show(){
            System.out.println("In a nested class method");
        }
    }
}
class Outer1{
    void outerMethod(){
       
        class Inner{
            void innerMethod(){
                    System.out.println("Inside inner methods");
            }
        }
        Inner y = new Inner();
        y.innerMethod();
        System.out.println("inside outer method");
    }
}
class Demo{
    void show(){
        System.out.println("I am in show method of super class");
    }
}
class Flavor1Demo{
    static Demo d = new Demo();
    void show(){
        super.show();
        System.out.println("");
    }
}
