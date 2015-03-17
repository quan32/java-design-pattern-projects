package quan.interpreterpattern.test;

import quan.interpreterpattern.AndExpression;
import quan.interpreterpattern.OrExpression;
import quan.interpreterpattern.TerminalExpression;

public class InterpreterPatternDemo {
	public static void main(String[] args) {
		//Simple expression
		TerminalExpression terminalExpression = new TerminalExpression("Quan");
		System.out.println(terminalExpression.interpret("Nguyen Trung Hiep"));
		
		//And expression
		AndExpression andExpression = new AndExpression(new TerminalExpression("Quan"), 
				new TerminalExpression("12A3"));
		System.out.println(andExpression.interpret("NTQuan is a 12A3 member"));
		
		//Or expression
		OrExpression orExpression = new OrExpression(new TerminalExpression("Quan"),
				new TerminalExpression("12A3"));
		System.out.println(orExpression.interpret("NTHiep is a 14A3 member"));
	}
}
