/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0-409397c modeling language!*/



// line 10 "model.ump"
// line 60 "model.ump"
public class Station
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Station Attributes
  private int number;
  private Platform a;
  private Platform b;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Station(int aNumber, Platform aA, Platform aB)
  {
    number = aNumber;
    a = aA;
    b = aB;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNumber(int aNumber)
  {
    boolean wasSet = false;
    number = aNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setA(Platform aA)
  {
    boolean wasSet = false;
    a = aA;
    wasSet = true;
    return wasSet;
  }

  public boolean setB(Platform aB)
  {
    boolean wasSet = false;
    b = aB;
    wasSet = true;
    return wasSet;
  }

  public int getNumber()
  {
    return number;
  }

  public Platform getA()
  {
    return a;
  }

  public Platform getB()
  {
    return b;
  }

  public void delete()
  {}


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "number" + ":" + getNumber()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "a" + "=" + (getA() != null ? !getA().equals(this)  ? getA().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "b" + "=" + (getB() != null ? !getB().equals(this)  ? getB().toString().replaceAll("  ","    ") : "this" : "null")
     + outputString;
  }
}