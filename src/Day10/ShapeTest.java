package Day10;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Square(4);
		shapes[1] = new Circle(4);
		shapes[2] = new Hexagon(4);
		maxArea(shapes);
		

	}
	public static void maxArea(Shape[] shapes){
		double max = shapes[0].area();
		int maxIndex = 0;
		for(int i=0;i<shapes.length;i++){
			if(max < shapes[i].area()){
				max = shapes[i].area();
				maxIndex = i;
			}
		}
		System.out.println("the bigest is:"+max+",xia biao wei:"+maxIndex);
	}

}
abstract class Shape{
	protected double c;
	abstract double area();
}
class Square extends Shape{
	public Square (double c){
		this.c = c;
	}
	public double area(){
		return 0.0625*c*c;
	}
}
class Circle extends Shape{
	public Circle (double c){
		this.c = c;
	}
	public double area(){
		return 0.0796*c*c;
	}
}
class Hexagon extends Shape{
	public Hexagon (double c){
		this.c = c;
	}
	public double area(){
		return 0.0721*c*c;
	}
}
