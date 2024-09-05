abstract class Employee {
  /**
   * Employee id.
   */
  public static int lastId = 0;
  private final int id;

  /**
   * Constructor for employee.
   */
  public Employee() {
    // Update id
    this.id = Employee.lastId;
    Employee.lastId += 1;
  }

  public abstract int getMonthlySalary();

  @Override
  public String toString() {
    return this.id + "";
  }
}