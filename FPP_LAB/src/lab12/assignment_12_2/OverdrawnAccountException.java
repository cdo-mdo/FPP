package lab12.assignment_12_2;

public class OverdrawnAccountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8286207035863812324L;

	public OverdrawnAccountException() {
	}

	public OverdrawnAccountException(String message) {
		super(message);
	}

	public OverdrawnAccountException(Throwable cause) {
		super(cause);
	}

	public OverdrawnAccountException(String message, Throwable cause) {
		super(message, cause);
	}

	public OverdrawnAccountException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
