package Interface_Segregation;

public class Bumrah implements Bowler,Fielder {
  @Override
  public void bowler() {
    System.out.println("Bumrah is a bowler");
  }

  @Override
  public String getTeamName() {
    return "INDIA ✨";
  }


  @Override
  public void fielder() {
    System.out.println("Bumrah is a fielder");
  }
}
