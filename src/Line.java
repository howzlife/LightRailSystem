/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0-409397c modeling language!*/



// line 2 "model.ump"
// line 55 "model.ump"
public class Line
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Line State Machines
  public enum Direction { A, B }
  private Direction direction;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Line()
  {
    setDirection(Direction.A);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getDirectionFullName()
  {
    String answer = direction.toString();
    return answer;
  }

  public Direction getDirection()
  {
    return direction;
  }

  public boolean setDirection(Direction aDirection)
  {
    direction = aDirection;
    return true;
  }

  public void delete()
  {}

}