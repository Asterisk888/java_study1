package if_test;
import java.util.Scanner;
public class go_to_school {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("나이를 입력하시오.");
		int age= input.nextInt();
		int fee;
		if(age<13){
			fee=3000;
			System.out.println("초등학생입니다.");		
			System.out.println("입장료는 "+fee+"입니다.");
		}
		else if(age<19) {
			fee=4500;
			System.out.println("중,고등학생입니다.");		
			System.out.println("입장료는 "+fee+"입니다.");			
		}
		else {
			fee=6000;
			System.out.println("성인입니다.");		
			System.out.println("입장료는 "+fee+"입니다.");			
		}
	}
}
