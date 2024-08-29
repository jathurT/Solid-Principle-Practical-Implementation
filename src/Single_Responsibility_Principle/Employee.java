package Single_Responsibility_Principle;

public class Employee {
  private String name;
  private String position;
  private Double salary;

  public Employee(String name, String position, Double salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
