package Single_Responsibility_Principle;

public class EmployeeUpdater {
  public void updateEmployeeSalary(Employee employee, Double newSalary, String newPosition, String newName) {
    employee.setSalary(newSalary);
    employee.setPosition(newPosition);
    employee.setName(newName);
  }
}
