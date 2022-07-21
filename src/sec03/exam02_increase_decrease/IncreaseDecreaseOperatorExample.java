package sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x =10;
		int y =10;
		int z;
		
		System.out.println("------------");
		x++;
		++x;
		System.out.println("x="+ x);
		
		System.out.println("------------");
		y--;
		--y;
		System.out.println("y="+y);
		
		System.out.println("------------");
		z = x++; //x를 z에 먼저 대입후 그 후 x값 증가
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("------------");
		z = ++x; // x를 먼저 1 증가 후에 그 값을 z값에 대입
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("------------");
		z = ++x + y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("x="+y);
	}

}
