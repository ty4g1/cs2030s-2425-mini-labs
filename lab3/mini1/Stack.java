public class Stack<T extends Filterable<T>> {
  private T[] array;
  private int top;
  
  public Stack(int size) {
    @SuppressWarnings({"unchecked", "rawtypes"})
    T[] temp = (T[]) new Filterable[size];
    this.array = temp;
    this.top = -1;
  }
  
  public void push(T elem) {
    if (!this.isEmpty()) {
      T top = this.array[this.top];
      if (!elem.isOK(top)) {
        return;
      }
    }
    if (this.isFull()) {
      return;
    }
    this.top += 1;
    this.array[this.top] = elem;
  }
  
  public T pop() {
    if (this.isEmpty()) {
      return null;
    }
    T top = this.array[this.top];
    this.top -= 1;
    return top;
  }
  
  public boolean isEmpty() {
    return this.top == -1;
  }
  
  public boolean isFull() {
    return this.top == this.array.length - 1;
  }
  
  @Override
  public String toString() {
    String res = "{ ";
    for (int i = 0; i <= this.top; i += 1) {
      res += this.array[i] + " ";
    }
    return res + "} <-- Top";
  }
}