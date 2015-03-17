package quan.templatepattern;

public class Basketball extends Game{

	@Override
	public void initialize() {
		System.out.println("Basketball::Initiliaze");
	}

	@Override
	public void startPlay() {
		System.out.println("Basketball::startPlay");
	}

	@Override
	public void endPlay() {
		System.out.println("Basketball::endPlay");
	}

}
