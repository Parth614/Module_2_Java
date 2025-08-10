import java.io.IOException;
import java.util.logging.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Code9 {
    private static final Logger logger = Logger.getLogger(Code9.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("error.log", true);
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);

        try {
            validateAge(16);
        } catch (InvalidAgeException e) {
            logger.severe(e.getMessage());
        }
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age must be at least 18. Provided: " + age);
    }
}
