
package conferencefinallab;

public class InvalidFeeException extends Exception{
    
    public InvalidFeeException() { 
        super("Invalid Fee");
    }
    public InvalidFeeException(String msg) { 
        super(msg);
    }
    
    
}
