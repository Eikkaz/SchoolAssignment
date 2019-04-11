package app;

public abstract class Handler {
	
	private Handler successor;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	
	public void processRaise(RaiseRequest request) {
		if (successor != null) {
			successor.processRaise(request);
		}
	}
}
