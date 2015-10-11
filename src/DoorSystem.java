/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0-409397c modeling language!*/



// line 22 "model.ump"
// line 75 "model.ump"
public class DoorSystem extends Train
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoorSystem State Machines
  public enum DoorActions { Opening, Open, Closing, Closed }
  private DoorActions doorActions;

  //DoorSystem Do Activity Threads
  Thread doActivityDoorActionsOpenThread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DoorSystem(DoorSystem aDoors, Station aCurrentStation)
  {
    super(aDoors, aCurrentStation);
    setDoorActions(DoorActions.Opening);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getDoorActionsFullName()
  {
    String answer = doorActions.toString();
    return answer;
  }

  public DoorActions getDoorActions()
  {
    return doorActions;
  }

  public boolean openingCompleted()
  {
    boolean wasEventProcessed = false;
    
    DoorActions aDoorActions = doorActions;
    switch (aDoorActions)
    {
      case Opening:
        setDoorActions(DoorActions.Open);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean passengersLoaded()
  {
    boolean wasEventProcessed = false;
    
    DoorActions aDoorActions = doorActions;
    switch (aDoorActions)
    {
      case Open:
        exitDoorActions();
        setDoorActions(DoorActions.Closing);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean closingCompleted()
  {
    boolean wasEventProcessed = false;
    
    DoorActions aDoorActions = doorActions;
    switch (aDoorActions)
    {
      case Closing:
        setDoorActions(DoorActions.Closed);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean arriveAtStation()
  {
    boolean wasEventProcessed = false;
    
    DoorActions aDoorActions = doorActions;
    switch (aDoorActions)
    {
      case Closed:
        setDoorActions(DoorActions.Opening);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitDoorActions()
  {
    switch(doorActions)
    {
      case Open:
        if (doActivityDoorActionsOpenThread != null) { doActivityDoorActionsOpenThread.interrupt(); }
        break;
    }
  }

  private void setDoorActions(DoorActions aDoorActions)
  {
    doorActions = aDoorActions;

    // entry actions and do activities
    switch(doorActions)
    {
      case Opening:
        // line 25 "model.ump"
        break;
      case Open:
        // line 29 "model.ump"
        doActivityDoorActionsOpenThread = new DoActivityThread(this,"doActivityDoorActionsOpen");
        break;
      case Closing:
        // line 34 "model.ump"
        break;
      case Closed:
        // line 38 "model.ump"
        break;
    }
  }

  private void doActivityDoorActionsOpen()
  {
    try
    {
      wait(4000);
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private static class DoActivityThread extends Thread
  {
    DoorSystem controller;
    String doActivityMethodName;
    
    public DoActivityThread(DoorSystem aController,String aDoActivityMethodName)
    {
      controller = aController;
      doActivityMethodName = aDoActivityMethodName;
      start();
    }
    
    public void run()
    {
      if ("doActivityDoorActionsOpen".equals(doActivityMethodName))
      {
        controller.doActivityDoorActionsOpen();
      }
    }
  }

  public void delete()
  {
    super.delete();
  }

}