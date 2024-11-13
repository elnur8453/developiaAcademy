package az.developia.balance_management.exception;

import org.springframework.validation.BindingResult;

public class OurRuntimeException extends RuntimeException {

	private String internalMessage;
	private BindingResult br;

	public OurRuntimeException(String m) {

		super(m);

	}

	public OurRuntimeException() {
		super();
	}

	public OurRuntimeException(String message, String internalMessage, BindingResult br) {
		super(message);
		this.internalMessage = internalMessage;
		this.br = br;
	}

	public String getInternalMessage() {
		return internalMessage;
	}

	public void setInternalMessage(String internalMessage) {
		this.internalMessage = internalMessage;
	}

	public BindingResult getBr() {
		return br;
	}

	public void setBr(BindingResult br) {
		this.br = br;
	}

	
	
}
