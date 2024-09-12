public abstract class Company implements Filterable<Company> {
  private String name;

  public Company(String name) {
    this.name = name;
  }

  public void oneYear() {
    // Do nothing
  }

  @Override
  public boolean isOK(Company other) {
    return this.name.compareTo(other.name) > 0;
  }

  @Override
  public String toString() {
    return this.name;
  }
}