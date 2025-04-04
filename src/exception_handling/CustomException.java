package exception_handling;

//  Create Custom Exception
class InvalidAgeException extends Exception 
{
    public InvalidAgeException(String message) 
    {
        super(message);
    }
}

//  Use Custom Exception
public class CustomException {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException 
    {
        if (age < 18) 
        {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age.");
    }

    public static void main(String[] args)
    {
        try {
            validateAge(16);  // Throws custom exception
        }
        catch (InvalidAgeException e)
        {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
