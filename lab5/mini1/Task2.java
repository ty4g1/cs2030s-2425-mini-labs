import shapes.Circle;
import shapes.Point;

public class Task2 {
  public static void main(String[] args) {
    CS2030STest we = new CS2030STest();

    Circle circle = new Circle(Point.of(1, 1), 3);
    we.expect("Circle circle = new Circle(Point.of(1, 1), 3);", circle.toString(), "Circle @ (1,1) with radius 3");

    circle.moveTo(2, 2);
    we.expect("circle.moveTo(2, 2); circle;", circle.toString(), "Circle @ (2,2) with radius 3");

    we.expectCompileWithImport("circle.moveTo(2, 2) should compile", "Circle circle = new Circle(Point.of(1, 1), 3); circle.moveTo(2, 2);", "import shapes.Point; import shapes.Circle;", true);

    we.expectCompileWithImport("circle.getRadius() should not compile", "Circle circle = new Circle(Point.of(1, 1), 3); circle.getRadius();", "import shapes.Point; import shapes.Circle;", false);
  }  
}
