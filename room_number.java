package if_test;
import java.util.Scanner;
public class room_number {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("��ȣ�� �����Ͻÿ�.(1~20)");
		int choose_num=num.nextInt();
		int room_num;
		switch(choose_num){
			case 1,2,3,4->
				room_num=101;
			case 5,6,7,8->
				room_num=102;
			case 9,10,11,12->
				room_num=103;
			case 13,14,15,16->
				room_num=104;
			case 17,18,19,20->
				room_num=105;
			default->{
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				room_num=0;
			}
		}
			System.out.println("����� �� ��ȣ�� "+room_num+"�Դϴ�.");
		}
	}


