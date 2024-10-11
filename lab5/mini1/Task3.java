public class Task3 {
  public static void main(String[] args) {
    CS2030STest we = new CS2030STest();

    we.expect("new MyCircle(3).isSmallerThan(4) returns true", new MyCircle(3).isSmallerThan(4), true);

    we.expect("new MyCircle(5).isSmallerThan(4) returns false", new MyCircle(5).isSmallerThan(4), false);
  }  
}
