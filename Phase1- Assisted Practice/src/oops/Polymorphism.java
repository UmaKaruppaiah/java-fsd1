package oops;

class Shape {
	public void Shapearea() {
		System.out.println("Shape for different area");
	}
}
class Rectangle extends Shape{
	public void area() {
		System.out.println("Rectangle is length * breath");
	}
	class square extends Shape{
		public void area() {
			System.out.println("square is 4 * a");
		}
	}
	public class Polymorphism{
		public void main(String[] args) {
			Shape myShape = new Shape();
			Shape myRectangle= new Rectangle();
			Shape mysquare=new square();
			myShape.Shapearea();
			myRectangle.Shapearea();
			myShape.Shapearea();
			mysquare.Shapearea();
		}
	}
	

}
