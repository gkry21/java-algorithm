
/*

 * To. �����ڴ�

 

�츮�� �Ҹ������ε��� �ֹ��� �޴� Ű����ũ (�Ʒ� �׸�����)�� ��ġ�߾��.

 

 

���� ���⿡ ���α׷��� ��ġ�Ϸ��� �մϴ�.

�ϴ� ȭ�鿡 ���̴� ������ �Ʒ��� ���� ���� �Ǿ����� �ؿ�.

���� ���忡 �ִ� ���Դ� ���ϱ� ����ִ� ��ɵ� ž��Ǿ� �ؿ�.

�Ʒ� ������ ĥ�� �κ��� �ֿܼ����� �Է°��Դϴ�.

�������� ���� ȭ�鿡 �������� �κ��Դϴ�.���α׷��� ����� �ּ���.

�׸��� ������ ������ �� ������ �����帱����.

 

"�󸶿���?

> ��ĳ���Է°� > 100

100�� �Դϴ�.

� �帱���?

> ��ĳ���Է°� > 5

5�� �ּ���

�� �ݾ��� 500�� �Դϴ�

��ο�, 10% ����ּ���.

�׷� 450���� �ּ���"

 

[����] ����ִ� ����

int dc = total / 10;

total = total - dc;

 

 */
package HomeWorks02;
import java.util.Scanner;

public class HowMuch {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("�󸶿���?");

		int money = scan.nextInt();

		System.out.println(money + "�� �Դϴ�.");

		System.out.println("�� �� �帱���?");

		int num = scan.nextInt();

		System.out.println(num + "�� �ּ���");

		int total = money * num;

		System.out.println("�� �ݾ���" + total + "�� �Դϴ�.");

		System.out.println("��ο�. 10% ����ּ���");

		int dc = total / 10;

		int totaldc = total - dc;

		System.out.println("�׷�" + totaldc + "���� �ּ���."  );

	}

}