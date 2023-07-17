package utils;

import java.util.Stack;

public class PrefixEvaluation {
	
public static int evaluatePreFix(String prefix) {
		Stack<Integer> s = new Stack<>();
		
		for(int i=prefix.length()-1;i>=0;i--) {
			char sym = prefix.charAt(i);
			if(Character.isDigit(sym)) {
				String operand = Character.toString(sym);
				s.push(Integer.parseInt(operand));
				
			}
			else {
				int a = s.pop();
				int b = s.pop();				
				int c = calc(a,b,sym);
				s.push(c);
			}
		}
				
		return s.pop();
	}
static public int calc(int a, int b, char operand) {
		switch (operand) {
		case '$': return (int) Math.pow(a, b);
		case '*': return a*b;
		case '/': return a/b;
		case '%': return a%b;
		case '+': return a+b;
		case '-': return a-b;	
		}
				
		return 0;
	}
	
	
}
