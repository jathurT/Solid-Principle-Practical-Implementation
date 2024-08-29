package Single_Responsibility_Principle;

public class SalaryCalculator {
  public Double calculate(Employee employee) {
    return employee.getSalary();
  }
}
