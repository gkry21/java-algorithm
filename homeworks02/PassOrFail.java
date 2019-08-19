package homeworks02;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("�л��̸��� ����, ����, ���� ������ ���ʴ�� �Է����ּ���");
		String name = scan.next();
		int kor = scan.nextInt(), math =scan.nextInt() , eng = scan.nextInt();
		int sum = kor + math + eng;
		int avg =  sum / 3;

			if(avg>=70){
				System.out.println("�л�           ����        ����        ����        ����        ���        �հݿ���");
				System.out.println(" =======================================================");
				System.out.println(name    +    kor     +  math    + eng       + sum     + avg        + "(�հ�)");
			}
			else if(avg<=69) {
				System.out.println("�л�           ����        ����        ����        ����        ���        �հݿ���");
				System.out.println(" =======================================================");
				System.out.println(name    +     kor     +  math    + eng       + sum     + avg        + "(���հ�)");
			} 
		}	
}