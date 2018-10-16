package DrawProgram;

/**
* Square co quan he is-a voi Rectangle
*/

public class Square extends Rectangle
{
	public Square (double x, double y, double size, String color){
		super(x, y, size, color);
	}
	public void getInfo(){
		System.out.print("This is a square: ");
		super.getInfo();
	}
}
