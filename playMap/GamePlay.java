package playMap;

import java.util.ArrayList;

import unit.Seok;
import unit.StarUnit;
import unit.ZZan;

public class GamePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바의 다형성
		ArrayList<StarUnit> seokList = new ArrayList<>();
		
		// 부모로부터 접근
		StarUnit s1 = new Seok();
		s1.unitName = "석진";
		s1.hp=6000;
		s1.attack=100;
		seokList.add(s1);
		
		// 자식으로부터 접근
		Seok s2 = new Seok();
		s2.unitName = "홍길";
		s2.hp=5500;
		s2.attack=80;
		seokList.add(s2);
		
		StarUnit z1 = new ZZan();
		z1.unitName="짜장";
		z1.hp=7000;
		z1.attack=120;
		seokList.add(z1);
		
		for(StarUnit s : seokList) {
			//System.out.println(s.toString());	
			s.attack();
		}
	}

}
