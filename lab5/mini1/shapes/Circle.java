package shapes;

public class Circle {
  private Point center;
  private int radius;

  public Circle(Point center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  public void moveTo(int x, int y) {
    this.center = new Point(x, y);
  }

  protected int getRadius() {
    return this.radius;
  }

  @Override
  public String toString() {
    return "Circle @ " + this.center + " with radius " + this.radius;
  }
}
