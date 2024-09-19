public class Point {
  private int x;
  private int y;

  private static Point ORIGIN = new Point(0, 0);

  private Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Point moveTo(int x, int y) {
    if (this.x == x && this.y == y) {
      return this;
    }
    return new Point(x, y);
  }

  public static Point of(int x, int y) {
    if (x == 0 && y == 0) {
      return Point.ORIGIN;
    }
    
    if (x < 0 || y < 0) {
      return null;
    }
    return new Point(x, y);
  }

  @Override
  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }
}
