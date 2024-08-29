package Interface_Segregation;

public class Rohit implements Player{
  @Override
  public String getTeamName() {
    return "INDIA ✨";
  }

  @Override
  public void batsman() {
    System.out.println("Rohit Sharma is a batsman");
  }

  @Override
  public void bowler() {
    System.out.println("Rohit Sharma is not a bowler");
  }

  @Override
  public void wicketKeeper() {
    System.out.println("Rohit Sharma is not a wicket keeper");
  }

  @Override
  public void fielder() {
    System.out.println("Rohit Sharma is a fielder");
  }
}
