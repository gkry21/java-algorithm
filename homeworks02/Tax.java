/*
 * To �����ڴ�

Ŭ���̾�Ʈ���� ���α׷� ���� ��û�� �Խ��ϴ�.
�̸��� ������ �Է¹޾Ƽ�
���� ***������ �����ô� XXX�Բ��� ������ ������ ???�����Դϴ�.
�� ����ϴ� ���α׷��� ����� �ּ���.
��) ������ ��å�� �ٲ� �� ���� ���ϴ�,
�����ڰ� ���� ���밡���ϵ��� ����� �ּ���.
����� ������ 9.7���ζ�� �մϴ�.
 */
package HomeWorks02;

import java.util.Scanner;

public class Tax {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.println("������ �Է����ּ���");
	float taxrate = scan.nextFloat();
	System.out.println("������ �Է����ּ���");
	String name = scan.next();
	System.out.println("������ �Է����ּ��� (���� : ����)");
	int pay = scan.nextInt();
	float tax = pay * taxrate/100 ;
System.out.println("����" + pay +  "������ �����ô�" + name +"�Բ��� ������ ������" + tax + "�����Դϴ�.");
}


}
