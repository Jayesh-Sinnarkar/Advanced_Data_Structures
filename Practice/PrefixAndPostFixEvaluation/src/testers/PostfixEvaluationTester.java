package testers;

import utils.PostfixEvaluation;

public class PostfixEvaluationTester {

	public static void main(String[] args) {
		String postfix = "59+4862/-*-173-$+";
		System.out.println(PostfixEvaluation.evaluatePrefix(postfix));
		

	}

}
