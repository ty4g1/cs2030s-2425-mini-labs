/open Employee.java
/open Payroll.java

Employee manager = new Employee(1, 10000);
Employee fulltime = new Employee(2, 5000, 5, 100);
Employee intern = new Employee(3, 40, 50, 160, 25);
Payroll pr = new Payroll();

pr.register(manager);
pr.register(fulltime);
pr.register(intern);

// pr
// pr.getTotalSalary()