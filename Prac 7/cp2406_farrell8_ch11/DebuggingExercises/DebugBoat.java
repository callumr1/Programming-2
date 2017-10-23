package DebuggingExercises;

public abstract class DebugBoat
{
   private String boatType = "";
   int passengers;
   String power = "";
   DebugBoat(String bt)
   {
      boatType = bt;
   }
   // override equals() method to satisfy
   // requirements of Debug Exercise 3.
   public boolean equals(DebugBoat otherBoat)
   {
      boolean result;
      if((passengers == otherBoat.passengers) && (power.equals(otherBoat.power)))
         result = true;
      else
         result = false;
      return result;
   }
   public String toString()
   {
      return("This " + boatType + "boat carries " + passengers +
        " and is powered by " + power);
   }
   public abstract void setPower();
   public abstract void setPassengers();
}