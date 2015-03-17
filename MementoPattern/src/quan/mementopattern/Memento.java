package quan.mementopattern;
/***
 * 
 * @author nguyen-trung-quan
 * Memento la lop de chua nhung gia tri ma Originator can luu
 * No khong chi don gian la 1 bien state
 * Ma co the la 1 object phuc tap
 * Nen can dinh nghia rieng 1 lop de quan ly
 * Do do can toi 3 actors (Originator, Memento, CareTaker)
 * Chu khong phai chi 2 actors (Originator, Memento)
 */
public class Memento {
	private String state;
	
	public Memento(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	/***
	 * Built a NUllObject
	 */
//	private class MementoNullObject{
//		private static Memento memento = new Memento("NULL");
//		private MementoNullObject(){}
//	}
}
