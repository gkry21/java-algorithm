/*
 * To. �����ڴ�
���� �Է��ϸ� �ش� ���� ���ϱ�������
�˷��ִ� ���α׷��� �ۼ��� �ּ���.
��) 2���� ������ ������ �ʰ� ������ 29���Դϴ�.
��¹��� : "??���� **�� ���� �Դϴ�."

 */
package homeworks02;

import java.util.Scanner;

public class MonthEndDay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.println("�ñ��� ���� �Է����ּ���");
	int month = scan.nextInt();
	int eval = 0;
	switch(month){
		case 1 : eval = 31; break;
		case 2 : eval = 29; break;
		case 3 : eval = 31; break;
		case 4 : eval = 30; break;
		case 5 : eval = 31; break;
		case 6 : eval = 30; break;
		case 7 : eval = 31; break;
		case 8 : eval = 31; break;
		case 9 : eval = 30; break;
		case 10 : eval = 31; break;
		case 11 : eval = 30; break;
		case 12 : eval = 31; break;
	}
	System.out.println(month + "����" + eval +"�� ���� �Դϴ�.");
	}	
	}