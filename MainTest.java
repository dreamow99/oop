/**
* DrawProgram
*@author Pham Duc Duy
*@since 09/10/2018
*@version 1.0
*/
package DrawProgram;
import java.util.*;

public class MainTest{
  public static void main(String[] args) {
    Layer l1 = new Layer();
    Triangle t1 = new Triangle(1, 2, 3, "red");
    Triangle t2 = new Triangle(2, 2, 2, "blue");
    Circle c1 = new Circle(3, 3, 5, "black");
    Square s1 = new Square(5, 4, 3, "yellow");
    l1.addShape(t1);
    l1.addShape(t2);
    l1.addShape(c1);
    l1.addShape(s1);
    l1.printLayer();
    l1.deleteCircle();
    l1.printLayer();
    Diagram d1 = new Diagram();
    d1.addLayer(l1);
    d1.printDiagram();
    d1.removeCircle();
    d1.printDiagram();
  }
}
