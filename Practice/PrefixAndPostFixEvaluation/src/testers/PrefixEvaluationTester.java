package testers;

import utils.PrefixEvaluation;

public class PrefixEvaluationTester {

	public static void main(String[] args) {
		String prefix= "+-+59*4-8/62$1-73";
		
		System.out.println("\n"+PrefixEvaluation.evaluatePreFix(prefix));

	}

}
