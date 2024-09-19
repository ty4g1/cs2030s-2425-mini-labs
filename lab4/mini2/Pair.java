public class Pair<S, T> {
  private S first;
  private T second;

  public Pair(S first, T second) {
    this.first = first;
    this.second = second;
  }

  public S getFirst() {
    return this.first;
  }

  public T getSecond() {
    return this.second;
  }

  public void swap(Pair<? extends S, ? super T> pair) {
    this.first = pair.first;
    pair.second = this.second;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj instanceof Pair<?, ?> pair) {
      if (this.first == null || pair.first == null
          || this.second == null || pair.second == null) {
        return false;
      }
      return this.first.equals(pair.first)
          && this.second.equals(pair.second);
    }
    return false;
  } 

  @Override
  public String toString() {
    return "(" + this.first + "," + this.second + ")";
  }
}
