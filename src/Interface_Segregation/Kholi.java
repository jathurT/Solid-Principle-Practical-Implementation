package Interface_Segregation;

public class Kholi implements Batsman, Fielder {

  public String getTeamName() {
    return "India";
  }

  @Override
  public void batsman() {
    System.out.println("Kholi is a batsman");
  }

  @Override
  public void fielder() {
    System.out.println("Kholi is a fielder");
  }
}
