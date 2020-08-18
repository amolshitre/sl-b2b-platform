package com.newco.marketplace.exception.core;

/**
 * DataServiceException is thrown by the Data service. This means all the DAO
 * Objects should throw only the DataServiceException. Any Exceptions that are
 * from the component at lower level should be wrapped by the this exception, so
 * a meaningful error message can be returned.
 * 
 * @author Anil S. Karkera
 */
public class DataServiceException extends ResolvableException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new <code>DataServiceException</code> with a detail message.
     * 
     * @param message
     *            Error message that identifies the application problem.
     * @param cause
     *            The actual exception that was caught.
     */
    public DataServiceException(String message, Exception cause) {

        super(message, cause);
    }

    /**
     * Creates new <code>DataServiceException</code> with detail message.
     * 
     * @param message
     *            Error message that identifies the application problem.
     */
    public DataServiceException(String message) {
        super(message);
    }
}