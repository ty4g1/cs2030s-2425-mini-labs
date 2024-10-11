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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true; // optional, for efficiency
    }
    if (obj instanceof Pair<?, ?>) {
      Pair<?, ?> pair = (Pair<?, ?>) obj;
      
      if (this.first == null && this.second == null) {
        return pair.first == null && pair.second == null;
      }
      if (this.first == null) {
        return pair.first == null && this.second.equals(pair.second);
      }
      if (this.second == null) {
        return this.first.equals(pair.first); && pair.second == null;
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