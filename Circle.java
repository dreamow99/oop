package DrawProgram;


/**
* Circle co quan he is-a voi shape
*/

public class Circle extends Shape
{
	public Circle (double x, double y, double size, String color){
		super(x, y, size, color);
	}
	public void getInfo(){
		System.out.print("This is a circle: ");
		super.getInfo();
	}
}
