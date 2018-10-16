package DrawProgram;

/**
* Rectangle the hien cac dac tinh cua hinh chu nhat
*/

public class Rectangle extends Shape
{
	public Rectangle (double x, double y, double size, String color){
		super(x, y, size, color);
	}
	public void getInfo(){
		System.out.print("This is a rectangle: ");
		super.getInfo();
	}
}
