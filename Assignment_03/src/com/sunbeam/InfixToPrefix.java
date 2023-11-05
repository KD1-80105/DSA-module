package com.sunbeam;

import java.util.Stack;

public class InfixToPrefix {
	public static String infixToPrefix(String infixExpression) {
		StringBuilder postfix = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for (int i = infixExpression.length() - 1; i >= 0; i--) {
			char ch = infixExpression.charAt(i);

			if (Character.isDigit(ch)) {
				postfix.insert(0, ch);
			} else if (ch == ')') {
				stack.push(ch);
			} else if (ch == '(') {
				while (!stack.isEmpty() && stack.peek() != ')') {
					postfix.insert(0, stack.pop());
				}
				stack.pop(); // Pop ')'
			} else { // Operator
				while (!stack.isEmpty() && getPrecedence(stack.peek()) > getPrecedence(ch)) {
					postfix.insert(0, stack.pop());
				}
				stack.push(ch);
			}
		}

		while (!stack.isEmpty()) {
			postfix.insert(0, stack.pop());
		}

		return postfix.toString();
	}

	private static int getPrecedence(char operator) {
		if (operator == '+' || operator == '-') {
			return 1;
		} else if (operator == '*' || operator == '/') {
			return 2;
		}
		return 0; // for '(' and ')'
	}

	public static void main(String[] args) {
		String infixExpression = "2 + 3 * 4";
		String prefixExpression = infixToPrefix(infixExpression);
		System.out.println("Infix: " + infixExpression);
		System.out.println("Prefix: " + prefixExpression);
	}
}
