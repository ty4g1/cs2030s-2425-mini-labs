public class TestStack {
  static class A implements Filterable<A> {
    private int val;
    
    public A(int val) {
      this.val = val;
    }
    
    @Override
    public boolean isOK(A other) {
      return this.val >= other.val;
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
    Stack<A> s = new Stack<A>(2);

    we.expect("Stack<A> s = new Stack<A>(2)\ns.toString()", s.toString(), "{ } <-- Top");
    we.expect("s.isEmpty()", s.isEmpty(), true);
    we.expect("s.isFull()", s.isFull(), false);

    s.push(new A(3));
    we.expect("s.push(new A(3))\ns.toString()", s.toString(), "{ A{3} } <-- Top");

    s.push(new B1(2));
    we.expect("s.push(new B1(2))\ns.toString()", s.toString(), "{ A{3} } <-- Top");

    s.push(new B2(4));
    we.expect("s.push(new B2(4))\ns.toString()", s.toString(), "{ A{3} B2{A{4}} } <-- Top");

    s.push(new B2(100));
    we.expect("s.push(new B2(100))\ns.toString()", s.toString(), "{ A{3} B2{A{4}} } <-- Top");

    we.expect("s.pop()", s.pop().toString(), "B2{A{4}}");
    we.expect("s.toString()", s.toString(), "{ A{3} } <-- Top");

    s.push(new B1(100));
    we.expect("s.push(new B1(100))\ns.toString()", s.toString(), "{ A{3} B1{A{100}} } <-- Top");
  }
}