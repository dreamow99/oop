package DrawProgram;


/**
* Circle co quan he is-a voi shape
*/

public class Triangle extends Shape
{
	public Triangle (double x, double y, double size, String color){
		super(x, y, size, color);
	}
	public void getInfo(){
		System.out.print("This is a Triangle: ");
		super.getInfo();
	}
}
