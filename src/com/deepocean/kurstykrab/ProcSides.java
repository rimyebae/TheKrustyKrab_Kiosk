package com.deepocean.kurstykrab;

import java.util.ArrayList;

import com.deepocean.krustykrab.data.Goods;
import com.deepocean.krustykrab.data.KrabbyPatty;
import com.deepocean.krustykrab.data.SeaSides;

public class ProcSides {
Display disp = new Display();
	
	
	public void run(ArrayList<Goods> cart) {
		
		loop:
		while(true) {
			
		Command cmd = new Command();
	    String c = cmd.getCommand("어떤 사이드를 구매하시겠습니까? "+"\n"
	    		+ ">=[1.CORAL BITS /2.KELP RINGS/ c.취소 / b.뒤로]=<");
	    
	    switch(c) {
	    
	    case "1":
	    	System.out.println("CORAL BITs가 선택되었습니다.");
	    	String size = cmd.getCommand("사이즈를 선택해주세요. 1.small / 2.Medium / 3.Large ");
	    	if(size.equals("1")) {
	    		System.out.println("Small 사이즈가 선택되었습니다.");
	    		cart.add(new SeaSides(1.00,"CORAL BITS_Small"));
	    	}else if(size.equals("2")) {
	    		System.out.println("Medium 사이즈가 선택되었습니다.");
	    		cart.add(new SeaSides(1.25,"CORAL BITS_Medium"));
	    	}else if(size.equals("3")) {
	    		System.out.println("Large 사이즈가 선택되었습니다.");
	    		cart.add(new SeaSides(1.50,"CORAL BITS_Large"));
	    	}
	    	break;
	    	
	    case "2":
	    	System.out.println("KELP RINGS가 선택되었습니다");
	    	cart.add(new KrabbyPatty(1.50,"KELP RINGS"));
	    	String salt = cmd.getCommand("솔티소스를 추가하시겠습니까? 1.YES 2.NO");
	    	if(salt.equals("1")) {
	    		cart.add(new KrabbyPatty(0.50,"    + w/ SALTY SAUCE"));
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
