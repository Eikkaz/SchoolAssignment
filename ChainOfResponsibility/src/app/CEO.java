package app;

public class CEO extends Handler{
	
public CEO() {
		
	}

	@Override
	public void processRaise(RaiseRequest request) {
			System.out.println("CEO will approve "+ request.getRaise() + " percent raise");
	}
	
	@Override
	public void setSuccessor(Handler successor) {
		super.setSuccessor(successor);
	}
	
}
