package quan.statepattern;

public abstract class State {
	protected String STATE;
	public State() {
		STATE = "NULL";
	}
	
	public String getState() {
		return this.STATE;
	}
	public abstract void doAction(Context context);
}
