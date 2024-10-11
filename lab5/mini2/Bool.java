public abstract class Bool<T> {
  private T value;

  private Bool(T value) {
    this.value = value;
  }

  public static <T> Bool<T> test(boolean cond) {
    if (cond) {
      return new True<T>(null);
    }
    return new False<T>(null);
  }

  public T getVal() {
    return this.value;
  }

  public abstract Bool<T> doThen(T val);

  public abstract Bool<T> doElse(T val);

  private static class True<T> extends Bool<T> {
    private True(T value) {
      super(value);
    }

    @Override
    public Bool<T> doThen(T val) {
      return new True<T>(val);
    }

    @Override
    public Bool<T> doElse(T val) {
      return this;
    }
  }

  private static class False<T> extends Bool<T> {
    private False(T value) {
      super(value);
    }

    @Override
    public Bool<T> doThen(T val) {
      return this;
    }

    @Override
    public Bool<T> doElse(T val) {
      return new False<T>(val);
    }
  }
}
