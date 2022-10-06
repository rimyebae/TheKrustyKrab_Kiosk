package com.deepocean.kurstykrab;

import java.util.ArrayList;

import com.deepocean.krustykrab.data.Goods;
import com.deepocean.krustykrab.data.MealsDeals;

public class ProcMealsDeals {
Display disp = new Display();
	
	
	public void run(ArrayList<Goods> cart) {
		loop:
		while(true) {
		Command cmd = new Command();
	    String c = cmd.getCommand("어떤 세트를 구매하시겠습니까? "+"\n"
	    		+ ">=[1.KRABBY MEAL / 2.DOUBLE MEAL /3.TRIPLE MEAL / c.취소 / b.뒤로]=<");
	    
	    switch(c) {
	    
	    case "1":
	    	System.out.println("SINGLE 세트가 선택되었습니다");
	    	cart.add(new MealsDeals(3.50,"KRABBY MEAL"));
	    	break;
	    	
	    case "2":
	    	System.out.println("DOUBLE 세트가 선택되었습니다");
	    	cart.add(new MealsDeals(3.75,"DOUBLE KRABBY MEAL"));
	    	break;
	    	
	    case "3":
	    	System.out.println("TRIPLE 세트가 선택되었습니다");
	    	cart.add(new MealsDeals(4.00,"TRIPLE KRABBY MEAL"));
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
