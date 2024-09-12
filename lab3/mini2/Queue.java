public class Queue<T extends SalaryMan<T>> {
  private T[] queue;
  private int curr;
  
  public Queue(int size) {
    @SuppressWarnings({"unchecked", "rawtypes"})
    T[] tmp = (T[]) new SalaryMan[size];
    this.queue = tmp;
    this.curr = 0;
  }
  
  public void enqueue(T elem) {
    if (this.isFull()) {
      return;
    }
    this.queue[this.curr] = elem;
    this.curr += 1;
  }
  
  public T findBoss() {
    if (this.isEmpty()) {
      return null;
    }
    T res = this.queue[0];
    for (int i = 1; i < this.curr; i += 1) {
      res = this.queue[i].higher(res);
    }
    return res;
  }
  
  public boolean isEmpty() {
    return this.curr == 0;
  }
  
  public boolean isFull() {
    return this.curr == this.queue.length;
  }
  
  @Override
  public String toString() {
    String res = "{ ";
    for (int i = 0; i < this.curr; i += 1) {
      res += this.queue[i] + " ";
    }
    return res + "} <-- Back";
  }
}