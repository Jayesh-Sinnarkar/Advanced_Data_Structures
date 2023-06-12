package testers;

import java.util.Scanner;

import utils.Stack;

public class Tester {

	public static void main(String[] args) throws Exception {
		char[] input = new char[50];
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack(50);
		System.out.println("Enter parrentheses pattern: ");
		input = (sc.nextLine().toCharArray());
		boolean valid = false;

		for (char c : input) {
			valid = false;
			if (c == '(' || c == '{' || c == '[') {
				s.push(c);
			} else if (c == ')' || c == '}' || c == ']') {

				switch (c) {
				case ')':
					if (!s.isEmpty() && s.peep() == '(') {
						s.pop();
						valid = true;
					}

					break;

				case '}':
					if (!s.isEmpty() && s.peep() == '{') {
						s.pop();
						valid = true;
					}
					break;

				case ']':
					if (!s.isEmpty() && s.peep() == '[') {
						s.pop();
						valid = true;
					}
					break;

				default:
					System.out.println("No matching closing pair found for " + c);
					valid = false;
					break;
				}
				if (valid == false) {
//					System.out.println("Invalid parenthesis combination");
				break;
			}
			
		}

		if (valid == true)
			System.out.println("Valid parenthesis combination");
		
	}
	if (!s.isEmpty() && valid==false) {
		valid = false;
		System.out.println("Invalid parenthesis combination");
	}

	}

}
