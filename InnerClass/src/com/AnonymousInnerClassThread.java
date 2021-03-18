package com;

/**
 * In this example we will see how to start Thread using
 * Anonymous Inner Class.
 * @author Mayar
 */
public class AnonymousInnerClassThread {

	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("Inside AnonymousInnerClass run method");
			}
		};
		
		t1.start();
	}
}
