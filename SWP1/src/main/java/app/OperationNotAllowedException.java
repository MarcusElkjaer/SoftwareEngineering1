package app;

public class OperationNotAllowedException extends Exception {

    // from material given during the course
    private static final long serialVersionUID = 5644804383994321392L;

    /**
     * A new exception is constructed with error message errorMessage.
     * @param errorMessage the error message of the exception
     */
    public OperationNotAllowedException(String errorMessage) {
        super(errorMessage);
    }

}
