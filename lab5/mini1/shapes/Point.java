package shapes;

public final class Point {
  private final int x;
  private final int y;
  private static Point ORIGIN = new Point(0, 0);

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public static Point of(int x, int y) {
    if (x == 0 && y == 0) {
      return Point.ORIGIN;
    }
    return new Point(x, y);
  }

  public Point moveTo(int x, int y) {
    return new Point(x, y);
  }

  @Override
  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj instanceof Point) {
      Point pt = (Point) obj;
      return this.x == pt.x && this.y == pt.y;
    }
    return false;
  }
}
