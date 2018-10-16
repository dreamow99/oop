package DrawProgram;
import java.util.*;
/**
* class Layer chua cac shapes
*/

public class Layer extends Diagram {
	private ArrayList<Shape> shapes;
	private boolean visible;
	/**
	* constructor
	*/
	public Layer(){
		shapes = new ArrayList<Shape>();
	}
	/**
	* getter
	*/
	public boolean getVisibility(){
			return this.visible;
	}
	/**
	* setter
	*/
	public void setVisibility(boolean v){
		this.visible = v;
	}
	/**
	* kiem tra 2 hinh co giong nhau hay ko
	*@param a
	*@param b
	*@return true hoac false
	*/
	public boolean isTheSame(Shape a, Shape b){
		if (a.getClass() == b.getClass()){
			if (a.getPosX() != b.getPosX()) return false;
			if (a.getPosY() != b.getPosY()) return false;
			if (a.getSize() != b.getSize()) return false;
			return true;
		}
		return false;
	}
	/**
	* xoa cac hinh trung nhau
	*/
	public void deleteSameShapes(){
		for (int i = 0; i < shapes.size(); i++) {
			for (int j = 0; j < shapes.size(); j++){
					if ((i != j) && isTheSame(shapes.get(i), shapes.get(j))){
						shapes.remove(j);
					}
			}
		}
	}
	/**
	*them shape
	*/
	public void addShape(Shape s){
		shapes.add(s);
	}
	/**
	* xoa tat cac cac Triangle
	*/
	public void deleteTriangle(){
		for (int i = 0; i < shapes.size(); i++){
				if (shapes.get(i) instanceof Triangle)
					shapes.remove(i);
		}
	}
	/**
	* xoa tat cac cac Circle trong Layer
	*/
	public void deleteCircle(){
		for (int i = 0; i < shapes.size(); i++){
			if (shapes.get(i) instanceof Circle)
				shapes.remove(i);
		}
	}
	/**
	in ra cac hinh trong layer
	*/
	public void printLayer(){
		for (int i = 0; i < shapes.size(); i++){
			shapes.get(i).getInfo();
		}
	}
}
