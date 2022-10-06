package com.deepocean.kurstykrab;

import java.util.ArrayList;

import com.deepocean.krustykrab.data.Drinks;
import com.deepocean.krustykrab.data.Goods;
import com.deepocean.krustykrab.data.KrabbyPatty;

public class ProcDrinks {
	
Display disp = new Display();
	
	
	public void run(ArrayList<Goods> cart) {
		
		loop:
		while(true) {
		Command cmd = new Command();
	    String c = cmd.getCommand("어떤 음료를 구매하시겠습니까? "+"\n"
	    		+ ">=[1.KELB SHAKE /2.SEAFOAM SODA / c.취소 / b.뒤로]=<");
	    
	    switch(c) {
	    
	    case "1":
	    	System.out.println("KELB SHAKE가 선택되었습니다");
	    	cart.add(new KrabbyPatty(2.00,"KELB SHAKE"));
	    	break;
	    	
	    case "2":
	    	System.out.println("SEAFORM가 선택되었습니다.");
	    	String size = cmd.getCommand("사이즈를 선택해주세요. 1.small / 2.Medium / 3.Large ");
	    	if(size.equals("1")) {
	    		System.out.println("Small 사이즈가 선택되었습니다.");
	    		cart.add(new Drinks(1.00,"SEAFORAM SODA_Small"));
	    	}else if(size.equals("2")) {
	    		System.out.println("Medium 사이즈가 선택되었습니다.");
	    		cart.add(new Drinks(1.25,"SEAFORAM SODA_Medium"));
	    	}else if(size.equals("3")) {
	    		System.out.println("Large 사이즈가 선택되었습니다.");
	    		cart.add(new Drinks(1.50,"SEAFORAM SODA_Large"));
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
