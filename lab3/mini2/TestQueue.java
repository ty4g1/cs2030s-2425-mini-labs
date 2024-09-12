public class TestQueue {
  static class A implements SalaryMan<A> {
    private int val;
    
    public A(int val) {
      this.val = val;
    }
    
    @Override
    public A higher(A that) {
      if (this.val <= that.val) {
        return this;
      }
      return that;
    }
    
    @Override
    public String toString() {
      return "A{" + this.val + "}";
    }
  }

  static class B1 extends A {
    public B1(int val) {
      super(val);
    }
    
    @Override
    public String toString() {
      return "B1{" + super.toString() + "}";
    }
  }

  static class B2 extends A {
    public B2(int val) {
      super(val);
    }
    
    @Override
    public String toString() {
      return "B2{" + super.toString() + "}";
    }
  }
  public static void main(String[] args) {
    CS2030STest we = new CS2030STest();
    Queue<A> q = new Queue<A>(2);

    we.expect("Queue<A> s = new Stack<A>(2)\nq.toString()", q.toString(), "{ } <-- Back");
    we.expect("q.isEmpty()", q.isEmpty(), true);
    we.expect("q.isFull()", q.isFull(), false);

    q.enqueue(new B1(2));
    q.enqueue(new B2(10));
    we.expect("q.enqueue(new B1(2))\nq.enqueue(new B2(10))\nq.toString()", q.toString(), "{ B1{A{2}} B2{A{10}} } <-- Back");
    we.expect("q.findBoss()", q.findBoss().toString(), "B1{A{2}}");

    q.enqueue(new A(1));
    we.expect("q.enqueue(new A(1))\nq.toString()", q.toString(), "{ B1{A{2}} B2{A{10}} } <-- Back");
  }
}