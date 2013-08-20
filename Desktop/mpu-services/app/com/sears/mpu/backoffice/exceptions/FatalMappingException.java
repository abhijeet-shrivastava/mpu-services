package com.sears.mpu.backoffice.exceptions;

/**
* The entity was not compatible.
*/
public class FatalMappingException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FatalMappingException(Throwable throwable)
    {
        super(throwable);
    }
	
	/**
	 * @param message
	 * @param cause
	 */
	public FatalMappingException(String message, Throwable cause) {
		super(cause.getMessage()==null?message:cause.getMessage()
				, cause.getCause()==null?cause:cause.getCause());
		fillInStackTrace();
	}
	
}