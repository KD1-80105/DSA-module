package com.sunbeam;

import java.util.Stack;

public class InfixToPostfix {
	public static String infixToPostfix(String infixExpression) {
		StringBuilder postfix = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for (char ch : infixExpression.toCharArray()) {
			if (Character.isDigit(ch)) {
				postfix.append(ch);
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfix.append(stack.pop());
				}
				stack.pop(); // Pop '('
			} else { // Operator
				while (!stack.isEmpty() && getPrecedence(stack.peek()) >= getPrecedence(ch)) {
					postfix.append(stack.pop());
				}
				stack.push(ch);
			}
		}

		while (!stack.isEmpty()) {
			postfix.append(stack.pop());
		}

		return postfix.toString();
	}

	private static int getPrecedence(char operator) {
		if (operator == '+' || operator == '-') {
			return 1;
		} else if (operator == '*' || operator == '/') {
			return 2;
		}
		return 0; // for '('
	}

	public static void main(String[] args) {
		String infixExpression = "2 + 3 * 4";
		String postfixExpression = infixToPostfix(infixExpression);
		System.out.println("Infix: " + infixExpression);
		System.out.println("Postfix: " + postfixExpression);
	}
}
