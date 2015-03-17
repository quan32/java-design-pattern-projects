package quan.statepattern;

public class StopState extends State{
	public StopState() {
		STATE = "STOP";
	}
	
	@Override
	public void doAction(Context context) {
		context.setState(this);
	}
}
