package WhileForTest;

public class Threeup {

	public static void main(String[] args) {
		int num=0;
		for(;num<=100;num++) {
			if((num % 3)!=0) continue;	
			System.out.println(num);
		}
	}
}
