package if_test;
import java.util.Scanner;
public class go_to_school {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("���̸� �Է��Ͻÿ�.");
		int age= input.nextInt();
		int fee;
		if(age<13){
			fee=3000;
			System.out.println("�ʵ��л��Դϴ�.");		
			System.out.println("������ "+fee+"�Դϴ�.");
		}
		else if(age<19) {
			fee=4500;
			System.out.println("��,����л��Դϴ�.");		
			System.out.println("������ "+fee+"�Դϴ�.");			
		}
		else {
			fee=6000;
			System.out.println("�����Դϴ�.");		
			System.out.println("������ "+fee+"�Դϴ�.");			
		}
	}
}
