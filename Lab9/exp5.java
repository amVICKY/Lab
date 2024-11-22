package com.gsv.lab9;

import java.util.Stack;

class PostfixToInfix1{
	public static String convert(String postfix)
	{
		Stack<String>stack=new Stack<>();
		for(int i=0;i<postfix.length();i++)
		{
			char ch=postfix.charAt(i);
			
		
		if(Character.isLetterOrDigit(ch)) {
			stack.push(String.valueOf(ch));
		}
		else
		{
			String operand2=stack.pop();
			String operand1=stack.pop();
			String expression="("+operand1+ch+operand2+")";
			stack.push(expression);
		}
	}
		return stack.pop();
}
}

public class exp5
{
	public static void main(String[] args) {
		String postfix="AB*CD/+";
		// Create and start threads for evaluation
		Thread thread1=new Thread(new Runnable() {
		@Override
		public void run()
		{
			System.out.println("Thread 1 started");
			String infixPart1=PostfixToInfix1.convert(postfix.substring(0,4));
			
		}
		}
		);
		Thread thread2=new Thread(new Runnable() {
			@Override
			public void run()
			{
				System.out.println("Thread 2 started");
				String infixPart2=PostfixToInfix1.convert(postfix.substring(4));
				System.out.println("Thread 2:"+infixPart2);
			}
		}
		);
		thread1.start();
		thread2.start();
		// Wait for both threads to complete
		try {
			thread1.join();
			thread2.join();
			
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		// Print the final infix expression
		String infixExpression ="(A+B)(C/D)";
	
	System.out.println("Final Infix Expression:"+infixExpression);

}
}
