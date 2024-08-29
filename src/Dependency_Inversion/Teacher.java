package Dependency_Inversion;


import java.util.List;

//Low Level Modules — take it as Teacher
public class Teacher {
  private List<String> subjects;

  public List<String> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<String> subjects) {
    this.subjects = subjects;
  }
}
