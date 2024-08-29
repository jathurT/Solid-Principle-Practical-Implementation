package Interface_Segregation;

public class Rohit implements Batsman, Fielder {
  @Override
  public void batsman() {
    System.out.println("Rohit is a batsman");
  }

  @Override
  public void fielder() {
    System.out.println("Rohit is a fielder");
  }

  @Override
  public String getTeamName() {
    return "INDIA ✨";
  }


}
