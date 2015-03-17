package quan.statepattern;

public class Context {
	private State state;
	
	public Context() {
		
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void print() {
		System.out.println("State:"+state.getState());
	}
	
}
