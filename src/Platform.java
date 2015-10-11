/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0-409397c modeling language!*/



// line 17 "model.ump"
// line 65 "model.ump"
public class Platform
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Platform Attributes
  private boolean isAvailable;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Platform(boolean aIsAvailable)
  {
    isAvailable = aIsAvailable;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsAvailable(boolean aIsAvailable)
  {
    boolean wasSet = false;
    isAvailable = aIsAvailable;
    wasSet = true;
    return wasSet;
  }

  public boolean getIsAvailable()
  {
    return isAvailable;
  }

  public boolean isIsAvailable()
  {
    return isAvailable;
  }

  public void delete()
  {}


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "isAvailable" + ":" + getIsAvailable()+ "]"
     + outputString;
  }
}