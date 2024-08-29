package Single_Responsibility_Principle;

public class GenerateReport {
  public void generateReport(Employee employee) {
    System.out.println("Employee name: " + employee.getName());
    System.out.println("Employee position: " + employee.getPosition());
    System.out.println("Employee salary: " + employee.getSalary());
  }
}
