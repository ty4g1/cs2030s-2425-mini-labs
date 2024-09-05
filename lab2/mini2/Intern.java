class Intern extends Employee {
  private int overtimeHour;
  private int overtimeRate;
  private int clockedHours;
  private int hourlyRate;

  public Intern(int overtimeHour, int overtimeRate, int clockedHours, int hourlyRate) {
    this.overtimeHour = overtimeHour;
    this.overtimeRate = overtimeRate * 2;
    this.clockedHours = clockedHours;
    this.hourlyRate = hourlyRate;
  }

  @Override
  public int getMonthlySalary() {
    return (this.overtimeHour * this.overtimeRate) + (this.hourlyRate * this.clockedHours);
  }

  @Override
  public String toString() {
    return "FullTime" + super.toString();
  }
}