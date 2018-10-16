package DrawProgram;
import java.util.*;
/**
* class Diagram chua cac layer
*/
public class Diagram{
	private ArrayList<Layer> layers;
	/**
	* constructor
	*/
	public Diagram(){
		layers = new ArrayList<Layer>();
	}
	/**
	* them layer
	*@param l layer 
	*/
	public void addLayer(Layer l){
		layers.add(l);
	}
	/**
	* xoa cac circle trong diagram
	*/
	public void removeCircle(){
		for (int i = 0; i < layers.size(); i++)
			layers.get(i).deleteCircle();
	}
	/**
	* in ra cac phan tu trong diagram
	*/
	public void printDiagram(){
		for (int i = 0; i < layers.size(); i++){
			layers.get(i).printLayer();
		}
	}
}
