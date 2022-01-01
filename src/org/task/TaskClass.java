package org.task;

import java.util.Scanner;

public class TaskClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner E = new Scanner(System.in);
		String address = E.nextLine();
		System.out.println("employee address is " + address);

		short id = E.nextShort();
		System.out.println("employee id is" + id);
		
		

	}

}
