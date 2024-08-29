package Liskov_Substitution_Principle;

public class EngineeringStudent extends Student {
  public EngineeringStudent(String name, int age, String grade) {
    super(name, age, grade);
  }

  public void learnMusic() {
    System.out.println("Don't learn music");
  }

  public static void main(String[] args) {
    EngineeringStudent engineeringStudent = new EngineeringStudent("John", 20, "A");
    engineeringStudent.learnMusic();
    engineeringStudent.learnEnglish();
  }
}
