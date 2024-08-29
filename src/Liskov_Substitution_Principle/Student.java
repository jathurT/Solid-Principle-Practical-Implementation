package Liskov_Substitution_Principle;

public class Student {
  private String name;
  private int age;
  private String grade;

  public Student(String name, int age, String grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
  }

  public void learnEnglish() {
    System.out.println("Learning English");
  }

  public void learnMath() {
    System.out.println("Learning Math");
  }

  public void learnScience() {
    System.out.println("Learning Science");
  }

  public void learnHistory() {
    System.out.println("Learning History");
  }

  public void learnArt() {
    System.out.println("Learning Art");
  }

  public void learnMusic() {
    System.out.println("Learning Music");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }
}
