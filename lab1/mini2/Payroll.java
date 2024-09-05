import java.util.ArrayList;

class Payroll {
  /**
   * List of employees.
   */
  private ArrayList<Employee> employees = new ArrayList<Employee>();

  /**
   * Register the employee.
   * 
   * @param employee The employee.
   */
  public void register(Employee employee) {
    employees.add(employee);
  }

  /**
   * Compute and return the total salary for this month.
   * 
   * @return The total salary for this month.
   */
  public int getTotalSalary() {
    int totalSalary = 0;

    /**
     * TODO: Refactor this poorly written for loop
     */
    for (Employee employee : employees) {
      totalSalary += employee.getMonthlySalary();
    }
    return totalSalary;
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < employees.size(); i++) {
      str.append(employees.get(i).toString());
      if (i < employees.size() - 1) {
        str.append(" ");
      }
    }
    return str.toString();
  }
}