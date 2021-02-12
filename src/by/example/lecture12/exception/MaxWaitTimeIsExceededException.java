package by.example.lecture12.exception;

public class MaxWaitTimeIsExceededException extends RuntimeException {

    public MaxWaitTimeIsExceededException() {
        super("Max wait time is exceeded.");
    }

}
