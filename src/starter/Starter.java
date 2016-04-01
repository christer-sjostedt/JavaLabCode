package starter;

public class Starter 
{
    StarterGUI _starterGui;
    
    public Starter( StarterGUI starterGui )
    {
        _starterGui = starterGui;
    }

    public void startProgram( String program )
    {
        System.out.println( "Executing " + program +  "..." );
        
        // TODO: Starta ett annat program här!
    }
    
    public void printMessage()
    {
        System.out.println( "Printing a test message..." );
        
        // (Den här metoden är bara för test!)
    }
}
