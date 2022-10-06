package com.deepocean.kurstykrab;

import java.util.Scanner;

public class Command {
	
	public Scanner sc = new Scanner(System.in);
	
	
	public String getCommand(String guide) {
		System.out.print(guide);
		String cmd = sc.next();
		return cmd;
		
		
	}
	

}
