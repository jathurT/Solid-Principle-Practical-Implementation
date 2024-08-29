package Dependency_Inversion;

import java.util.List;

//High Level Modules — understand it as a College
public class College {
  private List<Teacher> teachers;

  College(List<Teacher> teachers) {
    this.teachers = teachers;
  }

  public void getAllSubjects() {
    for (Teacher teacher : teachers) {
      System.out.println(teacher.getSubjects());    }
  }
}
