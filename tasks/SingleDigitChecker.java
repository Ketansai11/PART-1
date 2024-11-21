class SingleDigitException extends Exception {
    public SingleDigitException(String message) {
        super(message);
    }
}

public class SingleDigitChecker {
    // Method to check if the number is a single digit
    public void checkSingleDigit(int number) throws SingleDigitException {
        if (number < -9 || number > 9) {
            throw new SingleDigitException("The number " + number + " has more than one digit.");
        }
    }
}
