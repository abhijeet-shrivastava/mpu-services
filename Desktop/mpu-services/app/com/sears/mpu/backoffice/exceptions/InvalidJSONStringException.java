package com.sears.mpu.backoffice.exceptions;
public class InvalidJSONStringException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidJSONStringException(Throwable throwable)
    {
        super(throwable);
    }
	
	/**
	 * @param message
	 * @param cause
	 */
	public InvalidJSONStringException(String message, Throwable cause) {
		super(cause.getMessage()==null?message:cause.getMessage()
				, cause.getCause()==null?cause:cause.getCause());
		fillInStackTrace();
	}
}