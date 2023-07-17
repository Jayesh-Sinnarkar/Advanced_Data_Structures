package utils;

import java.util.Stack;

public class PostfixEvaluation {

	public static int evaluatePrefix(String prefix) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < prefix.length(); i++) {
			char sym = prefix.charAt(i);
			if (Character.isDigit(sym)) {
				String op = Character.toString(sym);
				s.push(Integer.parseInt(op));
			} else {
				int b = s.pop();
				int a = s.pop();
				int c = calc(a, b, sym);
				s.push(c);
			}
		}
		return s.pop();
	}

	public static int calc(int a, int b, char operator) {

		switch (operator) {
		case '$':
			return (int) Math.pow(a, b);

		case '*':
			return a * b;

		case '%':
			return a % b;

		case '/':
			return a / b;

		case '+':
			return a + b;

		case '-':
			return a - b;
		}
		return 0;
	}

}
