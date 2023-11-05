
public class PostfixExpression {

	public static int calculate(int op1, int op2, char opr) {
		switch (opr) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '*':
			return op1 * op2;
		case '/':
			return op1 / op2;
		case '%':
			return op1 % op2;
		}
		return 0;
	}

	public static int profixEvaluate(String postfix) {
		String[] arr = postfix.split(" ");
		Stack st = new Stack(10);

		for (int i = 0; i < postfix.length(); i++) {
			char ele = postfix.charAt(i);
			if (Character.isDigit(ele)) {
				st.push(ele - '0');
			} else {
				int op2 = (int) st.pop();
				int op1 = (int) st.pop();

				int res = calculate(op1, op2, ele);
				st.push(res);
			}
		}
		if (st.isEmpty()) {
			return st.pop();
		}
		return 0;
	}

	public static void main(String[] args) {
		String postfix = "456*3/+9+7-";

		System.out.println("Postfix: " + postfix);
		int result = profixEvaluate(postfix);
		System.out.println("Result: " + result);
	}
}
