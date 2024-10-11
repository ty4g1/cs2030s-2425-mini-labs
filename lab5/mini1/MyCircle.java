import shapes.Circle;
import shapes.Point;

public class MyCircle extends Circle {
  public MyCircle(int radius) {
    super(Point.of(0, 0), radius);
  }
  
  public boolean isSmallerThan(int radius) {
    return this.getRadius() < radius;
  }
}
