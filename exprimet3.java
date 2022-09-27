abstract class Banks{
    int balance;
    abstract int getBalance();

}
class Bank1 extends Banks {

int getBalance(){
  balance = 20000;
  return balance;
}
}
class Bank2 extends Banks {

int getBalance(){
  balance = 40000;
  return balance;
}
}
class Bank3 extends Banks {

int getBalance(){
  balance = 50000;
  return balance;
}
}



public class exprimet3 {

    public static void main(String[] args){
Bank1 b1 = new Bank1();
Bank2 b2 = new Bank2();
Bank3 b3 = new Bank3();
System.out.println("the balance of the first banks is: "+ b1.getBalance());
System.out.println("the balance of the second banks is: "+ b2.getBalance());
System.out.println("the balance of the third banks is: "+ b3.getBalance());
int sum = b1.getBalance() + b2.getBalance() + b3.getBalance();
System.out.println("the total money is in the bank is : "+sum);
    }
}
