// super class
package unit;


public class StarUnit {
	public int hp=100;
	public int attack=10;
	public String unitName=null;	// 초기값 설정
	
	public void attack() {
		System.out.println(Messages.getString("StarUnit.0")); //$NON-NLS-1$
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
