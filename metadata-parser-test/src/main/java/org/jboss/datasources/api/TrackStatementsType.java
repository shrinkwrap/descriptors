package org.jboss.datasources.api; 

/**
 * This class implements the <code> track-statementsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public enum TrackStatementsType
{
   _TRUE("true"),
   _FALSE("false"),
   _NOWARN("nowarn");

   private String value;

   TrackStatementsType (String value) { this.value = value; }

   public String toString() {return value;}

   public static TrackStatementsType getFromStringValue(String value)
   {
      for(TrackStatementsType type: TrackStatementsType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

