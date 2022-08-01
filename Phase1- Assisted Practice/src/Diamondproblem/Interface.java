package Diamondproblem;

public class Interface implements MyInterface1, MyInterface2{
	   public void display(){
	MyInterface1.super.display();
    //or,
    MyInterface2.super.display();
 }
 public static void main(String args[]) {
    Interface obj = new Interface();
    obj.display();
	}
}
 