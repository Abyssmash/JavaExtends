package zooUnit;

import java.util.ArrayList;

public class Zooplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<zooInfo> zlist = new ArrayList<>();
		zooInfo z = new Ti();
		z.name="호돌이";
		z.age=1;
		zlist.add(z);
		z = new Ti();
		z.name="호순이";
		z.age=2;
		zlist.add(z);
		z=new Mon();
		z.name="숭이";
		z.age=3;
		zlist.add(z);
		for(zooInfo zz: zlist) {
			zz.eat();
		}
		for(zooInfo zz: zlist) {
			System.out.println(zz.toString());
		}
	}
}
