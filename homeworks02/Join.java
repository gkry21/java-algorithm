/*
 * to. �����ڴ�
����� ��Ʈ�ｺ �Դϴ�.
�Է¹��� ������ �Ʒ��� �����ϴ�.
���� �Է¹��� �Ŀ� �ٽ� �Է¹��� ���� �״�� �����ִ�
���α׷��� �����ּ���

=== ȸ������ ===
���̵� : 
��й�ȣ : 
�̸� : 
�������(��) 1980-01-01 : 
���ο���(����true,�̼���false) : 
Ű(�Ҽ��� ù°�ڸ�����) :
������(�Ҽ��� ù°�ڸ�����) : 
������(A) : 

�Է��� ����Ǹ� ...�Ʒ�ó�� ���̰� ���ּ���

=== ȸ������ ===
���̵� : hong
��й�ȣ : 1234
�̸� : ȫ�浿
�������(��) 1990-05-05 : 
���ο���(����true,�̼���false) : ����
Ű(�Ҽ��� ù°�ڸ�����) : 178.5 cm
������(�Ҽ��� ù°�ڸ�����) : 75kg
������(A) : B��

 */

package homeworks02;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է����ֽʽÿ�.");
		System.out.println("���̵� :");
		String id = scan.next();
		System.out.println("��й�ȣ :");
		String pass = scan.next();
		System.out.println("�̸� :");
		String name = scan.next();
		System.out.println("�������(�� : 1990-05-05) :");
		String bd = scan.next();
		System.out.println("���ο���(����true,�̼���false) : ");
		String grow = scan.next();
		System.out.println("Ű(�Ҽ��� ù°�ڸ�����) :");
		Float height = scan.nextFloat();
		System.out.println("������(�Ҽ��� ù°�ڸ�����) :");
		Float weight = scan.nextFloat();
		System.out.println("������(A) :");
		String blood = scan.next();

		System.out.println("=== ȸ������ ===");
		System.out.println("���̵� :" + id);
		System.out.println("��й�ȣ :" + pass);
		System.out.println("�̸� :" + name);
		System.out.println("�������(�� : 1990-05-05) :" + bd);
		System.out.println("���ο���(����true,�̼���false) : " + grow );
		System.out.println("Ű(�Ҽ��� ù°�ڸ�����) :" + height +"cm");
		System.out.println("������(�Ҽ��� ù°�ڸ�����) :" + weight + "kg");
		System.out.println("������(A) :" + blood);
		
	}

}
