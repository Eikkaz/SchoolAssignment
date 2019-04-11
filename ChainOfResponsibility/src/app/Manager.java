package app;

public class Manager extends Handler{

	private final double MAX = 0.02;
	
	public Manager() {
		
	}

	@Override
	public void processRaise(RaiseRequest request) {
		if(request.getRaise()<MAX) {
			System.out.println("Manager will approve "+ request.getRaise() + " percent raise");
		}
		else {
			super.processRaise(request);
		}
	}
	
	@Override
	public void setSuccessor(Handler successor) {
		super.setSuccessor(successor);
	}

}
