package Interface_Segregation;

public class Bumrah implements Player{
  @Override
  public String getTeamName() {
    return "INDIA ✨";
  }

  @Override
  public void batsman() {
    System.out.println("Jasprit Bumrah is not a batsman");
  }

  @Override
  public void bowler() {
    System.out.println("Jasprit Bumrah is a bowler");
  }

  @Override
  public void wicketKeeper() {
    System.out.println("Jasprit Bumrah is not a wicket keeper");
  }

  @Override
  public void fielder() {
    System.out.println("Jasprit Bumrah is a fielder");
  }
}
