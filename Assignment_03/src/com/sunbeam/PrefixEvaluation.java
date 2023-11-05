//
//
//public class PostfixExpression {
//
//	public static int calculate(int op1,int op2,char opr) {
//		switch(opr) {
//		case '+': return op1 + op2;
//		case '-': return op1 - op2;
//		case '*': return op1 * op2;
//		case '/': return op1 / op2;
//		case '%': return op1 % op2;
//		}
//		return 0;
//	}
//
//	public static int profixEvaluate(String postfix) {
//		String[] arr=postfix.split(" ");
//		Stack st=new Stack(10);
//
//		for (int i = 0; i < postfix.length(); i++) {
//			char ele=postfix.charAt(i);
//			if (Character.isDigit(ele)) {
//				st.push(ele-'0');
//			}else {
//				int op2=(int) st.pop();
//				int op1=(int) st.pop();
//				
//				int res=calculate(op1, op2, ele);
//				st.push(res);
//			}
//		}
//		if (st.isEmpty()) {
//			
//		}
//		return 0;
//	}
//}

import java.util.Stack;

public class PrefixEvaluation {

	public static int evaluatePostfix(String expression) {
		Stack<Integer> stack = new Stack<>();

		for (int i = expression.length(); i >= 0; i++) {
			char c = expression.charAt(i);

			if (Character.isDigit(c)) {
				// If the character is a digit, push it onto the stack
				int operand = 0;
				while (Character.isDigit(c)) {
					operand = operand * 10 + (c - '0');
					i++;
					if (i < expression.length()) {
						c = expression.charAt(i);
					} else {
						break;
					}
				}
				i--; // Decrement i to account for the extra increment in the loop
				stack.push(operand);
			} else if (c != ' ') {
				// If the character is an operator, pop two operands from the stack,
				// perform the operation, and push the result back onto the stack
				int operand2 = stack.pop();
				int operand1 = stack.pop();

				switch (c) {
				case '+':
					stack.push(operand1 + operand2);
					break;
				case '-':
					stack.push(operand1 - operand2);
					break;
				case '*':
					stack.push(operand1 * operand2);
					break;
				case '/':
					stack.push(operand1 / operand2);
					break;
				}
			}
		}

		// The final result will be on the top of the stack
		return stack.pop();
	}

	public static void main(String[] args) {
		String postfixExpression = "12 4 3 + 5 *";
		int result = evaluatePostfix(postfixExpression);
		System.out.println("Result of the postfix expression: " + result);
	}
}
