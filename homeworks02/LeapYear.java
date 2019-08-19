/*
 * To. �����ڴ�
������ ������ �������� �ƴ����� �Ǵ��ϴ� ���α׷��� �ʿ��մϴ�.
�Է�â�� 2000 �̶�� ������ 2000���� �����Դϴ�. �̷��� ����ϴ� ���� ���Դϴ�.
������ �Ʒ��� ���ٰ� �ϴ� �����Ͻñ���. ��Ź�帳�ϴ�.

������ 4�� �������� 0 �̶�� ������ �� �ִ�.
�׷��� �ش� ������ 100���� ������ �������� ����̴�.
2000���� 4�� �������� 0 �̶� ������ �� �ִµ�..
�ٽ� �� ���� 100���� ���� �������� ����̴�.
����̶� �ص� �ٽ� 400���� ���� �������� ������ �����̴�.
����) 2000�� �� 2016 ���� �Է��ϸ� �������� ����
 */
package homeworks02;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Ǵ� ���α׷�");
		System.out.println("������ �Է����ּ���.");
		int year = scan.nextInt();
		String eval = "";

		if(year%4==0){
			eval = "����";
			 if(year%100==0) {
				eval = "���";
				if(year%400==0){
					eval = "����";
			} else { 
				eval = "���";}
				
			}
		} 
		System.out.println(year +"����" + eval +"�Դϴ�.");
		}
		
	}
