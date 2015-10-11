/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0-409397c modeling language!*/



// line 21 "model.ump"
// line 70 "model.ump"
public class Train
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Train Attributes
  private DoorSystem doors;
  private Station currentStation;

  //Train State Machines
  public enum Direction { A, B }
  private Direction direction;
  public enum TrainActions { Moving, Stopped }
  private TrainActions trainActions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Train(DoorSystem aDoors, Station aCurrentStation)
  {
    doors = aDoors;
    currentStation = aCurrentStation;
    setDirection(Direction.A);
    setTrainActions(TrainActions.Moving);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDoors(DoorSystem aDoors)
  {
    boolean wasSet = false;
    doors = aDoors;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentStation(Station aCurrentStation)
  {
    boolean wasSet = false;
    currentStation = aCurrentStation;
    wasSet = true;
    return wasSet;
  }

  public DoorSystem getDoors()
  {
    return doors;
  }

  public Station getCurrentStation()
  {
    return currentStation;
  }

  public String getDirectionFullName()
  {
    String answer = direction.toString();
    return answer;
  }

  public String getTrainActionsFullName()
  {
    String answer = trainActions.toString();
    return answer;
  }

  public Direction getDirection()
  {
    return direction;
  }

  public TrainActions getTrainActions()
  {
    return trainActions;
  }

  public boolean setDirection(Direction aDirection)
  {
    direction = aDirection;
    return true;
  }

  public boolean setTrainActions(TrainActions aTrainActions)
  {
    trainActions = aTrainActions;
    return true;
  }

  public void delete()
  {}


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "doors" + "=" + (getDoors() != null ? !getDoors().equals(this)  ? getDoors().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "currentStation" + "=" + (getCurrentStation() != null ? !getCurrentStation().equals(this)  ? getCurrentStation().toString().replaceAll("  ","    ") : "this" : "null")
     + outputString;
  }
}