package Interface_Segregation;

public class Bumrah implements Bowler {
  @Override
  public void bowler() {
    System.out.println("Bumrah is a bowler");
  }

  @Override
  public String getTeamName() {
    return "INDIA ✨";
  }


}
