package quan.statepattern;

public class StartState extends State{
	public StartState() {
		STATE = "START";
	}
	
	@Override
	public void doAction(Context context) {
		context.setState(this);
	}
}
