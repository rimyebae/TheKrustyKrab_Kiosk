package com.deepocean.kurstykrab;

public class Display {
	
	public static final String INPUT_RESULT
    = "=<%s>=가 선택되었습니다.";
	
	void showTitle() {
		System.out.println("================< 집게리아에 오신 걸 환영합니다! >================");
	}
	
	    void showChosen(String str) {
		String s = String.format(INPUT_RESULT,str );
		System.out.println(s);
	}
	    
	    
	    
	    
	    
}
