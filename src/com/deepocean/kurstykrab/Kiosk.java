package com.deepocean.kurstykrab;

import java.util.ArrayList;

import com.deepocean.krustykrab.data.Food;
import com.deepocean.krustykrab.data.Goods;

public class Kiosk {
	
	ArrayList<Goods> cart = new ArrayList<>();
	Display disp = new Display();
	
	public void run() {
		
		disp.showTitle();
		loop: //라벨 => while문 탈출!
		while(true) {
		
		Command cmd = new Command();
	    String c = cmd.getCommand("메뉴를 선택해주세요."+"\n"
	    		+ "[1.단품게살버거/2.사이드/3.음료/4.세트/c.계산/e.종료]");
		
		switch(c) {
		//단품버거메뉴
		case"1":
			disp.showChosen("단품게살버거");
			ProcKrabbyKrab pk = new ProcKrabbyKrab();
			pk.run(cart);
			break;
		//사이드메뉴	
		case"2":
			disp.showChosen("사이드");
			ProcSides ps = new ProcSides();
			ps.run(cart);
			break;
		//음료메뉴	
		case"3":
			disp.showChosen("음료");
			ProcDrinks pd = new ProcDrinks();
			pd.run(cart);
			break;
		//세트메뉴	
		case"4":
			disp.showChosen("세트메뉴");
			ProcMealsDeals pmd = new ProcMealsDeals();
			pmd.run(cart);
			break;
			
			
		//계산
		case"c":
			
//			System.out.println("장바구니:"+ cart.get(0));
//			for(int i = 0 ; i < cart.size();i++) {
//			    System.out.println(cart.get(i));
//			}
//			for(Goods g : cart) {
//				System.out.println(g.name + "");
//			}
//			
			System.out.println("==========================");
			//카트확인
			System.out.println("         [ORDER]        ");
			System.out.println("==========================");
			for(int i = 0 ; i < cart.size();i++) {
			    System.out.println(cart.get(i).name);
			    
//			    System.out.println(cart.get(i).name+" " + "until"
//			    		+((Food)cart.get(i)).expiryDate);
			}
			//계산
			double sum = 0;
			for(Goods g : cart) {
				sum = sum + g.price;
			}
			System.out.println("==========================");
			System.out.println("     [TOTAL] :$"+sum);
			System.out.println("==========================");
			//대기번호출력
			WaitingNumber wn = new WaitingNumber();
			wn.getWaitingNum();
			break;
			
		//나가기	
		case"e":
			System.out.println("방문해주셔서 감사합니다. BYE~!");
			break loop;
			
		}
		
		}
		
	}

}
