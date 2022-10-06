package com.deepocean.kurstykrab;

import java.util.ArrayList;

import com.deepocean.krustykrab.data.Goods;
import com.deepocean.krustykrab.data.KrabbyPatty;

public class ProcKrabbyKrab {
	
	Display disp = new Display();
	
	
	public void run(ArrayList<Goods> cart) {
		
		loop:
		while(true) {
			
		Command cmd = new Command();
	    String c = cmd.getCommand("어떤 버거를 구매하시겠습니까? "+"\n"
	    		+ ">=[1.Single/2.Double/3.Triple/ c.취소 / b.뒤로]=<");
	    
	    switch(c) {
	    
	    
	    case "1":
	    	System.out.println("SINGLE 버거가 선택되었습니다");
	    	cart.add(new KrabbyPatty(1.25,"SINGLE KrabbyPatty"));
	    	
	    	//유통기한 넣기
//	    	KrabbyPatty kp = new KrabbyPatty();
//	    	kp.name = "SINGLE KrabbyPatty";
//	    	kp.price = 1.25;
//	    	kp.expiryDate = "20220725";
	    	
//	    	cart.add(kp);
	    	
	    	String cheese = cmd.getCommand("치즈를 추가하시겠습니까? 1.YES 2.NO");
	    	if(cheese.equals("1")) {
	    		cart.add(new KrabbyPatty(0.25,"    + w/ SEA CHEESE"));
	    	}
	    	break;
	    	
	    case "2":
	    	System.out.println("DOUBLE 버거가 선택되었습니다");
	    	cart.add(new KrabbyPatty(2.00,"DOUBLE KrabbyPatty"));
	    	String cheese1 = cmd.getCommand("치즈를 추가하시겠습니까? 1.YES 2.NO");
	    	if(cheese1.equals("1")) {
	    		cart.add(new KrabbyPatty(0.25,"    + w/ SEA CHEESE"));
	    	}
	    	break;
	    	
	    case "3":
	    	System.out.println("TRIPLE 버거가 선택되었습니다");
	    	cart.add(new KrabbyPatty(3.00,"TRIPLE KrabbyPatty"));
	    	String cheese2 = cmd.getCommand("치즈를 추가하시겠습니까? 1.YES 2.NO");
	    	if(cheese2.equals("1")) {
	    		cart.add(new KrabbyPatty(0.25,"    + w/ SEA CHEESE"));
	    	}
	    	break;
	    case "c":
	    	System.out.println("메뉴취소");
	    	break loop;
	    case "b":
	    	System.out.println("뒤로 가기");
	    	break loop;
	    }
		}	    
		
	}

}
